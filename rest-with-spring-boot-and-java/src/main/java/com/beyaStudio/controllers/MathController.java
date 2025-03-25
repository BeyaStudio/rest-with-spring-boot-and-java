package com.beyaStudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
	
	
	//***************************SOMA***********************************
	
	// http://localhost:8080/math/sum/1/2
	@RequestMapping("/sum/{number1}/{number2}")
	public Double sum(
			@PathVariable("number1") String number1,
			@PathVariable("number2") String number2
		) throws Exception {
		
			if(!isNumeric(number1) || !isNumeric(number2))throw new UnsupportedOperationException("Please set a numeric value!");
			return convertToDouble(number1) + convertToDouble(number2);
		}
	
	
	//***************************SUBITRAÇÃO***********************************
	
	
	// http://localhost:8080/math/sub/4/2
	@RequestMapping("/sub/{number1}/{number2}")
	public Double sub(
			@PathVariable("number1") String number1,
			@PathVariable("number2") String number2
		) throws Exception {
		
			//Checando se os valores são numericos
			if(!isNumeric(number1) || !isNumeric(number2))throw new UnsupportedOperationException("Please set a numeric value!");
			//Subitrair os valores em si
			return convertToDouble(number1) - convertToDouble(number2);
		}
	
	
	//***************************MULTIPLICACAO***********************************
	
	// http://localhost:8080/math/mult/2/2
	@RequestMapping("/mult/{number1}/{number2}")
	public Double mult(
			@PathVariable("number1") String number1,
			@PathVariable("number2") String number2
		) throws Exception {
		
			//Checando se os valores são numericos
			if(!isNumeric(number1) || !isNumeric(number2))throw new UnsupportedOperationException("Please set a numeric value!");
			//multiplica os valores em si
			return convertToDouble(number1) * convertToDouble(number2);
		}
	
	
	
	//***************************DIVISAO***********************************
	
	// http://localhost:8080/math/div/2/2
	@RequestMapping("/div/{number1}/{number2}")
	public Double div(
			@PathVariable("number1") String number1,
			@PathVariable("number2") String number2
		) throws Exception {
		
			//Checando se os valores são numericos
			if(!isNumeric(number1) || !isNumeric(number2))throw new UnsupportedOperationException("Please set a numeric value!");
			//Divide os valores em si
			return convertToDouble(number1) / convertToDouble(number2);
		}
	
	
	//***************************Media***********************************
	
	// http://localhost:8080/math/media/2/2
	@RequestMapping("/media/{number1}/{number2}")
	public Double media(
			@PathVariable("number1") String number1,
			@PathVariable("number2") String number2
		) throws Exception {
		
			//Checando se os valores são numericos
			if(!isNumeric(number1) || !isNumeric(number2))throw new UnsupportedOperationException("Please set a numeric value!");
			//Media dos valores em si
			return (convertToDouble(number1) + convertToDouble(number2)) / 2;
		}
	
	
	//***************************Square_root***********************************
	
	// http://localhost:8080/math/sqrt/2/2
	@RequestMapping("/sqrt/{number1}")
	public Double sqrt(
			@PathVariable("number1") String number1
		) throws Exception {
		
			//Checando se os valores são numericos
			if(!isNumeric(number1))throw new UnsupportedOperationException("Please set a numeric value!");
			//Media dos valores em si
			return Math.sqrt(convertToDouble(number1));
		}
	
	
	
	//Conversão de String para Double com exeption caso não seja possivel
	private Double convertToDouble(String strNumber) throws Exception {
		
		if(strNumber == null || strNumber.isEmpty()) throw new UnsupportedOperationException("Please set a numeric value!");
		//Trocando o ponto pela virgula para doubles
		String number = strNumber.replace(",", ".");
		return Double.parseDouble(number);
	}
	
	//verificando se é um numero
	private boolean isNumeric(String strNumber) {
		if(strNumber == null || strNumber.isEmpty()) return false;
		
		//Trocando o ponto pela virgula para doubles
		String number = strNumber.replace(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
		
	}
	
	
	// http://localhost:8080/math/sub/4/2
	

}
