/** Programa creado por Javier López Rubio para 
 * uso exclusivamente escolar o de investigación,
 * todos los derechos resevados.
 * Cualquier copia ilegal de este código o sin 
 * permiso tendrá consecuencias legales.
 * HAPPY CODING ;)
 **/




package ieee754;
import javax.swing.JOptionPane;
public class IEEE754 {
    
    public static void main(String[] args) {
          
        Binario binario;
        binario=new Binario();
        String cadena,cadena1,cadena2;
        cadena1=new String();
        do{
        cadena=( JOptionPane.showInputDialog(
            null,"Introduzca un numero hexadecimal válida",
            "Conversor de IEEE754 a decimal. Javier Lopez ©",
            JOptionPane.QUESTION_MESSAGE) );        
        }while(cadena.length()!=8);
        for (int i=0; i<8; i++) {
           cadena1=cadena1+binario.Hexa(cadena.charAt(i));
        }
        JOptionPane.showMessageDialog(
        null,"La correspondencia en binario es: " + cadena1,
        "Conversor de IEEE754 a decimal. Javier Lopez ©",
        JOptionPane.INFORMATION_MESSAGE); 
        System.out.println("La correspondencia en binario es: "+cadena1);
        int signo=binario.sacarSigno(cadena1);
        int cadena3[] = new int[8];
        int j=0;
        for (int i = 1; i < 9; i++) {
         cadena3[j]=cadena1.charAt(i);
         j++;
        }
            j=0;
        int exponente=0;
         for (int i = 7; i>=0; i--) {
         int eldos=(int)(Math.pow(2, j));
         int num=cadena3[i]-48;
         exponente=exponente+(num*eldos);
         j++;
        }
        exponente=exponente-127;
        JOptionPane.showMessageDialog(
        null,"El signo es (0 positivo, 1 negativo): " + signo,
        "Conversor de IEEE754 a decimal. Javier Lopez ©",
        JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(
        null,"El exponente es: " + exponente,
        "Conversor de IEEE754 a decimal. Javier Lopez ©",
        JOptionPane.INFORMATION_MESSAGE);
        int cadena4[]=new int[23];
        j=0;
        for (int i = 9; i < 32; i++) {
         cadena4[j]=cadena1.charAt(i);
         j++;
        }
        float salida=0;
        j=1;
         for (int i = 0; i<23; i++) {
         float eldos=(float)(Math.pow(2, -j));
         float num=cadena4[i]-48;
         salida=salida+(num*eldos);
         j++;
        }
         salida=salida+1;
         double elevadoa=Math.pow(2, exponente);
         float salidabuena=salida*(float)elevadoa;
         String simbolo=(signo==0?"+":"-");
         simbolo=simbolo+salidabuena;
         JOptionPane.showMessageDialog(
        null,"La salida decimal es: " +simbolo,
        "Conversor de IEEE754 a decimal. Javier Lopez ©",
        JOptionPane.INFORMATION_MESSAGE);
         System.out.println(simbolo);
    }
    
}
