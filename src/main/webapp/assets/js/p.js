/*if(navigator.userAgent.toLowerCase().indexOf('chrome/') == -1){
	alert("不支持非谷歌浏览器");
	var bgObj=document.createElement("div");
	bgObj.style.position="absolute";
	bgObj.style.top="0";
	bgObj.style.background="#E8E8E8";
	bgObj.style.filter="progid:DXImageTransform.Microsoft.Alpha(style=3,opacity=25,finishOpacity=75";
	bgObj.style.opacity="0.6";
	bgObj.style.left="0";
	bgObj.style.width = "100%";
	bgObj.style.height = "100%";
	bgObj.style.zIndex = "10000";
	document.body.appendChild(bgObj);
}*/

Date.prototype.format = function(a) {
	a || (a = "yyyy-MM-dd hh:mm:ss");
	var c = {
		"M+": this.getMonth() + 1,
		"d+": this.getDate(),
		"h+": this.getHours(),
		"m+": this.getMinutes(),
		"s+": this.getSeconds(),
		"q+": Math.floor((this.getMonth() + 3) / 3),
		S: this.getMilliseconds()
	};
	/(y+)/.test(a) && (a = a.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length)));
	for (var b in c)(new RegExp("(" + b + ")")).test(a) && (a = a.replace(RegExp.$1, 1 == RegExp.$1.length ? c[b] : ("00" + c[b]).substr(("" + c[b]).length)));
	return a
};

function isEmpty(a) {
	if ("string" === typeof a) return a = a.replace(/(^\s*)|(\s*$)/g, ""), "" == a || null == a || "null" == a || void 0 == a || "undefined" == a ? !0 : !1;
	if ("object" == typeof a) return $.isEmptyObject(a) ? !0 : !1
}
console.log("%c\u4f60\u662f\u8c01\u5440\uff1f\u4e0d\u8981\u4e71\u641e\u5662!!!"," text-shadow: 0 1px 0 #ccc,0 2px 0 #c9c9c9,0 3px 0 #bbb,0 4px 0 #b9b9b9,0 5px 0 #aaa,0 6px 1px rgba(0,0,0,.1),0 0 5px rgba(0,0,0,.1),0 1px 3px rgba(0,0,0,.3),0 3px 5px rgba(0,0,0,.2),0 5px 10px rgba(0,0,0,.25),0 10px 10px rgba(0,0,0,.2),0 20px 20px rgba(0,0,0,.15);font-size:5em");