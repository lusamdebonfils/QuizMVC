$(function(){
    $("div#loader").hide();

    $(document).ajaxStart(function(){
        $("div#loader").show();
    }).ajaxStop(function(){
        $("div#loader").hide();
    });

    $('#btnHello').click(function () {
        let fullName = $('#fullname').val();
        $.ajax('loginservlet',{
            type: 'post',
            data : {
                fullName: fullName,
                action: 'demo1'
            }
        }).done(
            function (result) {
                $('div#result1').append($('<p>'),{
                    text : 'result'
                });
            }
        ).fail(function () {
            alert("Failed to fetch!!!");
        });
    });

});