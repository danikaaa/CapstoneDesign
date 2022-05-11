$(function (){
    $('.instance_insert').click(function(){
        $('.instance_layer').fadeIn();
    });

    $('.close').click(function (){
        $('.instance_layer').fadeOut();
    });

    $('.logOut_btn').click(function (){

        if(confirm("로그아웃 하시겠습니까?") == true){
            location.href="../index.html";
        }
        else{
            return ;
        }

    });

    $('li.user_info').click(function (){
        $('.content.list').hide();
        $('.content.info').show();


    });

    $('li.list').click(function (){
        $('.content.info').hide();
        $('.content.list').show();


    });



});