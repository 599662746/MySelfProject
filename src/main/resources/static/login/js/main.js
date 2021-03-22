//get ip
let cip=returnCitySN["cip"];
//get address
$.ajax({
  url: 'http://api.map.baidu.com/location/ip?ak=ia6HfFL660Bvh43exmH9LrI6',
  type: 'POST',
  dataType: 'jsonp',
  success:function(data) {
    cip=data.content.address_detail.province + "," + data.content.address_detail.city+"-----"+cip;
  }
})
$("#loginBtn").click(function loginBtn(){
  var flag=inputDataVerifyNull(["userName","password"]);
  $("#cip").val(cip)
  if (flag){
    $("#loginForm").submit();
  }
})
