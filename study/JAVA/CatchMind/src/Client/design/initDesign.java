package Client.design;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Client.design.initdesigncomponents.*;

public class initDesign {

    private JFrame frame;
    private ipLabel iplabel;
    private ipTextField iptextfield;
    private idLabel idlabel;
    private idTextField idtextfield;
    private Connectbtn connectbtn;
    private String ip=null;
    private String id=null;

    public void makeFrame() {
        drawFrame();
        drawIpSection();
        drawIdSection();
        drawConnectBtn();
        frame.repaint();
        Event();
    }

    private void drawFrame() {
        frame = new JFrame();
        frame.setTitle("로그인");
        frame.setSize(500, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    private void drawIpSection() {
        drawipLabel();
        drawipTextField();
    }

    private void drawipLabel() {
        iplabel = new ipLabel();
        frame.add(iplabel);
    }

    private void drawipTextField() {
        iptextfield = new ipTextField();
        frame.add(iptextfield);
    }

    private void drawIdSection() {
        drawidLabel();
        drawidTextField();
    }

    private void drawidLabel() {
        idlabel = new idLabel();
        frame.add(idlabel);
    }

    private void drawidTextField() {
        idtextfield = new idTextField();
        frame.add(idtextfield);
    }

    private void drawConnectBtn() {
        connectbtn = new Connectbtn();
        frame.add(connectbtn);
    }

    private void Event() {
        connectbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ip=iptextfield.getText();
                id=idtextfield.getText();
                frame.dispose();
            }
        });
    }

    public String getID() {
        return this.id;
    }

    public String getIP() {
        return this.ip;
    }
}