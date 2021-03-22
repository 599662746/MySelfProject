//verify input is null ? change placeholder : nothing
function inputDataVerifyNull(id){
  if (id){
    var flag=true;
    if (Array.isArray(id)){
      id.forEach(function (e){
        var flags=changePlaceholder(e)
        if (!flags){
          flag=flags
        }
      })
    }else{
      flag=changePlaceholder(id)
    }
    return flag;
  }else{
    throw "id is null"
  }
}
//change placeholder text and color by id
function changePlaceholder(id){
  if (!$("#"+id).val()){
    //change placeholder text
    $("#"+id).attr("placeholder",$("#canNotNull").text())
    //change placeholder color
    $("#"+id).addClass('inputText change')
    return false
  }
  return true
}

// base64加密开始
var keyStr = "ABCDEFGHIJKLMNOP" + "QRSTUVWXYZabcdef" + "ghijklmnopqrstuv"+ "wxyz0123456789+/" + "=";
function encode64(input) {
  var output = "";
  var chr1, chr2, chr3 = "";
  var enc1, enc2, enc3, enc4 = "";
  var i = 0;
  do {
    chr1 = input.charCodeAt(i++);
    chr2 = input.charCodeAt(i++);
    chr3 = input.charCodeAt(i++);
    enc1 = chr1 >> 2;
    enc2 = ((chr1 & 3) << 4) | (chr2 >> 4);
    enc3 = ((chr2 & 15) << 2) | (chr3 >> 6);
    enc4 = chr3 & 63;
    if (isNaN(chr2)) {
      enc3 = enc4 = 64;
    } else if (isNaN(chr3)) {
      enc4 = 64;
    }
    output = output + keyStr.charAt(enc1) + keyStr.charAt(enc2)
      + keyStr.charAt(enc3) + keyStr.charAt(enc4);
    chr1 = chr2 = chr3 = "";
    enc1 = enc2 = enc3 = enc4 = "";
  } while (i < input.length);
  return output;
}
