/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

import javax.swing.JOptionPane;


public class Ejercicio {
final double precio = 4200;
private final int numKilo;
private double totalPagar;

    public Ejercicio(int numKilo) {
        this.numKilo = numKilo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumKilo() {
        return numKilo;
    }

    public double getTotalPagar() {
        return totalPagar;
    }
  public double  calcularTotal(int numKilo){
      double valor1;
      double valor2;
      if(numKilo>0 && numKilo<=2){
          totalPagar=precio*numKilo;
      }else if (numKilo>2 && numKilo<=5){
          valor1=(precio*numKilo)*10/100;
          totalPagar=precio*numKilo-valor1;
      }else if (numKilo>5 && numKilo<=10){
          valor1=(precio*numKilo)*15/100;
          totalPagar=precio*numKilo-valor1;
      }else{
          valor1=(precio*numKilo)*20/100;
          totalPagar=precio*numKilo-valor1;      
      }            
      return totalPagar;
      }  

    public static void main(String[] args) {
       String numStrg = JOptionPane.showInputDialog("ingresar kilos ");
       int numInt = Integer.parseInt(numStrg);
       Ejercicio cliente = new Ejercicio(numInt);
       JOptionPane.showMessageDialog(null, "La compra de "+ numInt + " kilos tiene un valor de "+cliente.precio*cliente.numKilo
               +" \n pero usted tiene un descuento por valor de "+cliente.valor1
               +"n por lo tanto usted debe pagar "+cliente.calcularTotal(numInt));
    }
    
}
