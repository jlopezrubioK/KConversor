package ieee754;


public class Binario {
 public String Hexa(char caracter){
     String linea;
     linea=new String ();
     switch(caracter){
        case '0':linea = "0000"; break;
        case '1':linea = "0001"; break;
        case '2':linea = "0010"; break;
        case '3':linea = "0011"; break;
        case '4':linea = "0100"; break;
        case '5':linea = "0101"; break;
        case '6':linea = "0110"; break;
        case '7':linea = "0111"; break;
        case '8':linea = "1000"; break;
        case '9':linea = "1001"; break;            
        case 'A':linea = "1010"; break;
        case 'B':linea = "1011"; break;
        case 'C':linea = "1100"; break;
        case 'D':linea = "1101"; break;
        case 'E':linea = "1110"; break;
        case 'F':linea = "1119"; break;
        default: break;
     }
     return linea;

 }  
 public int sacarSigno(String cadena){
     int signo=Integer.parseInt(""+cadena.charAt(0));
     return signo;
 }
  
}
