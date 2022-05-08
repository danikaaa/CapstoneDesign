import	java.util.HashMap;
import	java.util.Map;

public class Dijkstra{
    private int length; // 그래프의 길이
    private Map<String, Integer> map = new HashMap<String, Integer>(); // 그래프

    public Dijkstra(int length) {
        this.length = length;
    }

    public void insert(int from, int to, int value) {
        map.put(from + "-" + to, value); // key: "2-1", value: 5
    }

    public void run(int start) {
        printHeader(start);

        int distance[] = new int[length + 1];
        boolean[] check = new boolean[length + 1];
        String path[] = new String[length + 1];

        String checked = ""+start;

        for(int i = 0; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
            path[i] = "-";
        }

        distance[start] = 0;
        check[start] = true;

        System.out.printf("| 1  \t| %-18s\t|", "{" + start + "}");

        for(int i = 1; i < length + 1; i++) {
            String key = start+"-"+i;
            if(!check[i] && map.containsKey(key)) {
                distance[i] = map.get(key);
                path[i] = key;
            }

            if(i != start) {
                String label = "";

                if(distance[i] < Integer.MAX_VALUE) {
                    label = "" + distance[i];
                } else {
                    label = "무한대";
                }

                System.out.printf(" %-4s\t| %-7s\t|", label, path[i]);
            }
        }
        System.out.println();

        for(int i = 1; i < length; i++) {
            int min = Integer.MAX_VALUE;
            int minPoint = -1;

            for(int j = 1; j < length + 1; j++) {
                if(!check[j] && j != start) {
                    if(min > distance[j]) {
                        min = distance[j];
                        minPoint = j;
                    }
                }
            }

            check[minPoint] = true;
            checked += " " + minPoint;
            System.out.printf("| %-3d\t| %-18s\t|", i + 1, "{" + checked + "}");

            for(int j = 1; j < length + 1; j++) {
                String key = minPoint+"-"+j;
                if(!check[j] && map.containsKey(key)) {
                    int newLength = distance[minPoint] + map.get(key);

                    if(newLength < distance[j]) {
                        distance[j] = newLength;
                        path[j] = path[minPoint] + "-" + j;
                    }
                }

                if(j != start) {
                    String label = "";

                    if(distance[j] < Integer.MAX_VALUE) {
                        label = "" + distance[j];
                    } else {
                        label = "무한대";
                    }

                    System.out.printf(" %-4s\t| %-7s\t|", label, path[j]);
                }
            }
            System.out.println();
        }
    }

    private void printHeader(int start) {
        System.out.printf("| Itr\t| %-18s\t|", "T");

        for(int i = 0; i < length; i++) {
            if(i == start) {
                continue;
            }

            System.out.printf(" L(%d)\t| Path(%d)\t|", i + 1, i + 1);
        }

        System.out.println();
    }
}