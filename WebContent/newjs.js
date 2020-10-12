/*
 * author: domanasi
 * javascript functions for online calculator
 */

function doAddition() {
    var val1=document.getElementById('value1');
    var val2=document.getElementById('value2');
    var query= "type=add&intA="+val1.value+"&intB="+val2.value;
    doAjax('MyCalc_Servlet',query,'showResult','post',0);

}

function doSubstraction() {
    var val1=document.getElementById('value1');
    var val2=document.getElementById('value2');
    var query= "type=sub&intA="+val1.value+"&intB="+val2.value;
    doAjax('MyCalc_Servlet',query,'showResult','post',0);

}

function doMultiplication() {
    var val1=document.getElementById('value1');
    var val2=document.getElementById('value2');
    var query= "type=times&intA="+val1.value+"&intB="+val2.value;
    doAjax('MyCalc_Servlet',query,'showResult','post',0);

}

function doDivision() {
    var val1=document.getElementById('value1');
    var val2=document.getElementById('value2');
    var query= "type=div&intA="+val1.value+"&intB="+val2.value;
    doAjax('MyCalc_Servlet',query,'showResult','post',0);

}

function showResult(result) {
	if (result.substring(0,5)=='error'){
		console.log(result);
	}else{
		console.log(result);
    var resultbox = document.getElementById('tResult');
    resultbox.value = ""+result;
	}
}

function convertToText() {
	var numValue = document.getElementById('tResult');
	var q_str = 'type=number&value='+numValue.value;
	doAjax('MyCalc_Servlet',q_str,'showText','post',0);
}

function showText(result) {
	console.log(result);
	var resultField = document.getElementById('tResultText');
	resultField.value= ""+result;
	   
}