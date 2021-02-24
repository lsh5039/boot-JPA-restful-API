var main = {

    init : function (){
        var _this = this;
        $('#reg-btn').click(function (){
            _this.regist();
        });
    },

    regist : function (){
        var data = {
            title : $("#title").val(),
            content : $("#content").val()
        };

        $.ajax({
            url : "/board/api",
            type : 'post',
            contentType : 'application/json; charset=utf-8',
            data : JSON.stringify(data),
            success : function (){
                alert('작성에 성공했습니다.');
                window.location.href = '/';
            },
            error : function (result){
                alert('error!');
                console.log(JSON.stringify(result));
            }
        })
    }


}
    main.init();