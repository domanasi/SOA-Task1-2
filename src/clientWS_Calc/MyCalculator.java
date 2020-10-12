package clientWS_Calc;


import java.math.BigInteger;

import com.soap.calc.client.Calculator;
import com.soap.calc.client.CalculatorSoap;
import com.soap.number.client.NumberConversion;
import com.soap.number.client.NumberConversionSoapType;

/*
 * author: domanasi
 * Class for a simple calculator using SOAP web service
 */
public class MyCalculator {
    public MyCalculator() {}
	
	public int addition(String inputA, String inputB) {
		int intA = Integer.parseInt(inputA);
		int intB = Integer.parseInt(inputB);
		Calculator Calc_service = new Calculator(); //created service object
        CalculatorSoap Calc_serviceSOAP = Calc_service.getCalculatorSoap(); //create SOAP object (a port of the service)
        int result = Calc_serviceSOAP.add(intA, intB);  
        return result;
	}
    
	public int substraction(String inputA, String inputB) {
		int intA = Integer.parseInt(inputA);
		int intB = Integer.parseInt(inputB); 
		Calculator Calc_service = new Calculator(); //created service object
        CalculatorSoap Calc_serviceSOAP = Calc_service.getCalculatorSoap(); //create SOAP object (a port of the service)
        int result = Calc_serviceSOAP.subtract(intA, intB);  
        return result;
	}
	
	public int multiplication(String inputA, String inputB) {
		int intA = Integer.parseInt(inputA);
		int intB = Integer.parseInt(inputB);
		Calculator Calc_service = new Calculator(); //created service object
        CalculatorSoap Calc_serviceSOAP = Calc_service.getCalculatorSoap(); //create SOAP object (a port of the service)
        int result = Calc_serviceSOAP.multiply(intA, intB);  
        return result;
	}
	
	public int division(String inputA, String inputB) {
		int intA = Integer.parseInt(inputA);
		int intB = Integer.parseInt(inputB);
		Calculator Calc_service = new Calculator(); //created service object
        CalculatorSoap Calc_serviceSOAP = Calc_service.getCalculatorSoap(); //create SOAP object (a port of the service)
        int result = Calc_serviceSOAP.divide(intA, intB); 
        return result;
	}
	
	public String convert2word(String inputStr) {
		BigInteger input_N = new BigInteger(inputStr);
		NumberConversion NC_service = new NumberConversion(); //created service object
        NumberConversionSoapType NC_serviceSOAP = NC_service.getNumberConversionSoap(); //create SOAP object (a port of the service)
        String result = NC_serviceSOAP.numberToWords(input_N);  
        return result;
	}
}
