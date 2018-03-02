$("#Huifold1").Huifold({
	titCell:'.item h4',
	mainCell:'.item .info',
	type:1,
	trigger:'click',
	className:"selected",
	speed:"first",
});

$(document).ready(function(){
	//console.log("hello");
	/*$("#testid").click(function(){
		$("#content_div").html("hello world");
	});*/
	//getTypeList();
	
})
function getArticleInfo(id){
	//console.log(id);
	var url ="/help/article_info?id="+id;
	$.get(url,function (result) {
		if(result.success){
			initContent(result.data);
		}
    })
}
function initContent(obj){
	//console.log(obj);
    var content=obj.content;
    if(content){
        var str=$("#content_div").html(content).text();
        $("#content_div").html(str);
    }
}
/*
function search() {
    var keyword=$("#search_text").val();
    if(!keyword){
    	alert("请输入关键字")
    	return;
	}
	var url="/help/search?keyword="+keyword;
    $.get(url,function (result) {
		initSearchList(result);
    })
}
function initSearchList(result) {
	var p=$("#searchResult");
	p.show().find("span").html("("+result.msg+")");
	if(result.success){
		var ul=$("#searchList");
		var list=result.data;
		for(var i in list){
			var li=ul.find("li").clone().show();
			li.find("span").html(list[i].title);
			ul.appendTo(li);
		}
	}
}*/
