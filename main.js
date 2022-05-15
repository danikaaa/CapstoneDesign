
$(function (){
    $('.instance_insert').click(function(){
        $('.instance_layer').fadeIn();
    });

    $('.close').click(function (){
        $('.instance_layer').fadeOut();
        $('.pw_layer').fadeOut();
    });

    $('.pw_change').click(function(){
        $('.pw_layer').fadeIn();
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

    $('.cancel_btn').on('click', function(event){
        $('.box_info').parent().find("input").val("");
    });

    $('.next_btn').on('click',function (event){
       $('.menu_info').removeClass('on');
       $('.menu_os').addClass('on');
       $('.box_os').show();
       $('.box_info').hide();
       $('.cancel_btn').hide();
       $('.next_btn').hide();

       $('.back_btn_1').show();
       $('.next_btn_1').show();

    });

    $('.back_btn_1').on('click', function (event){
       $('.menu_info').addClass('on');
       $('.menu_os').removeClass('on');

        $('.box_info').show();
        $('.box_os').hide();


        $('.next_btn').show();
        $('.cancel_btn').show();

        $('.next_btn_1').hide();
        $('.back_btn_1').hide();

    });

    $('.next_btn_1').on('click', function(event){
       $('.menu_flavors').addClass('on');
       $('.menu_os').removeClass('on');

       $('.box_os').hide();
       $('.box_flavors').show();

       $('.next_btn_1').hide();
       $('.create_btn').show();

       $('.back_btn_1').hide();
       $('.back_btn_2').show();

    });

    $('.back_btn_2').on('click', function(event){
        $('.menu_flavors').removeClass('on');
        $('.menu_os').addClass('on');

        $('.box_os').show();
        $('.box_flavors').hide();

        $('.next_btn_1').show();
        $('.create_btn').hide();

        $('.back_btn_1').show();
        $('.back_btn_2').hide();

    });


});
