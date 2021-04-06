String.prototype.toJadenCase = function () {
  var splitStr = this.toString().split(" ");
  for (var i = 0; i < splitStr.length; i++) {
    splitStr[i] = splitStr[i].charAt(0).toUpperCase() + splitStr[i].substring(1);
  }
  
  return splitStr.join(" ");
};