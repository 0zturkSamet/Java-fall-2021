package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class asd {

	public static void main(String[] args) {
		/*
	     * Problem tan�m�: Kullan�c�dan ald���n�z bir String'deki kelimeleri sondan ba�a
	     * do�ru yerle�tiren String parametreli return type li reverseWord isminde bir
	     * method yaz�n�z
	     * 
	     * input : ali ata bak
	     * output: bak ata ali
	     * Test DAta : �nput : Allah Javac� arkada�lara zihin a��kl��� versin Output :
	     * versin a��kl��� zihin arkada�lara Javac� Allah
	     */
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Lutfen bir cumle giriniz");
	    String str=scan.nextLine();
	    
	    System.out.println(terstenYazma(str)+str.substring(0,str.indexOf(" "))); //
	    scan.close();
	    
	    }
	    private static String terstenYazma(String str) {
	        String sonuc="";
	        
	        for (int i = str.length()-1; i >= 0; i=str.lastIndexOf(" ")) {
	            sonuc+=str.substring(str.lastIndexOf(" ")+1)+" ";
	            str=str.substring(0,str.lastIndexOf(" "));
	        }
	        return sonuc;
	    }
}