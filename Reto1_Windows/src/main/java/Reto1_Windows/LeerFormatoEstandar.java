package Reto1_Windows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerFormatoEstandar {

	public static void main(String[] args) {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        System.out.println("Introduzca un texto");

        String texto = "";
		try {
			texto = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

        System.out.println(texto);   

	}

}
