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
    $("#"+id).attr("placeholder","Do not empty")
    //change placeholder color
    $("#"+id).addClass('inputText change')
    return false
  }
  return true
}