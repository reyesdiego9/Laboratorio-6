package vehiculo;

import javax.swing.JOptionPane;
import java.util.Scanner;

class vehiculo{
    private String placa;
    private double velocidad;
    private boolean estado;
    private int gasolina;
    private int aceite;
    
    vehiculo(){
        this.placa = "HDG56";
        this.velocidad = 0;
        this.estado = false;
        this.gasolina = 0;
        this.aceite = 0;
    }
    // Set//modifica
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    public void setGasolina(int gasolina){
        this.gasolina = gasolina;
    }
    public void setAceite(int aceite){
        this.aceite = aceite;
    }
    
    //Get//mostrar
    public String getPlaca(){
        return placa;
    }
    public double getVelocidad(){
        return velocidad;
    }
    public boolean getEstado(){
        return estado;
    }
    public int getGasolina(){
        return gasolina;
    }
    public int getAceite(){
        return aceite;
    }
    
    public void encender(){
        setEstado(true);
    }
    public void apagar(){
        setEstado(false);
    }
    
    public void gaso(){
        Scanner td = new Scanner(System.in);
        int gs;
        do{
        System.out.println("El estado de la gasolina es: "+getGasolina());
        System.out.println("Ingrese la cantidad de gasolina que usted desea");
        gs = td.nextInt();
            if(gs>400){
                System.out.println("Usted esta arrebasando el limite del carro");
            }
        }while(gs>400);
        int mn = getGasolina()+gs;
        if(mn > 400) JOptionPane.showMessageDialog(null, "TANQUE LLENO");
        else setGasolina(getGasolina()+gs);
    }
    
    public void ace(){
        Scanner td = new Scanner(System.in);
        int ac;
        do{
        System.out.println("El estado del aceite es: "+getAceite());
        System.out.println("Ingrese la cantidad de gasolina que usted desea en LT");
        ac = td.nextInt();
            if(ac>10){
                System.out.println("Usted esta arrebasando el limite de aceite");
            }
        }while(ac>10);
        int mn = getAceite()+ac;
        if(mn > 10) JOptionPane.showMessageDialog(null, "ACEITE LLENO");
        else setAceite(getAceite()+ac);
    }
    
    public void datos(){
        System.out.println("Placa: "+getPlaca());
        System.out.println("Estado: "+getEstado());
        System.out.println("Velocidad: "+getVelocidad());
        System.out.println("Estado Gasolina: "+getGasolina());
        System.out.println("Estado Aceite: "+getAceite());
    }
    
    public void acel(){
        Scanner td = new Scanner(System.in);
        int acd;
        if(getGasolina() >= 10 && getEstado() == true){
                do{
                    System.out.println("La velocidad del carro es: "+getVelocidad()+"Km/h");
                    System.out.println("Acelerar: ");
                    acd = td.nextInt();
                     if(acd>215){
                        System.out.println("Usted llego al limite de la velocidad");
                    }
                }while(acd>215);
                    double mn = getVelocidad()+acd;
                    if(mn > 215) JOptionPane.showMessageDialog(null, "CARRO ASU MAXIMA VELOCIDAD");   
                        setVelocidad(getVelocidad()+acd);
                        setGasolina(getGasolina() - 10);
        }else{
             System.out.println("EL CARRO ESTA APAGADO O NO TIENE GASOLINA");
        }
    }
}

 class Auto{
    vehiculo a1;
    public static void main(String[] args){
        Auto a = new Auto();
        a.menu();
    }
    
    public void menu(){
        vehiculo v = new vehiculo();
        Scanner td = new Scanner(System.in);
        
        int opc;
        do{
         System.out.println("\t.:Menu.:"
                 + "\n1) Encender Carro"
                 + "\n2) Apagar Carro"
                 + "\n3) Acelerar"
                 + "\n4) Desacelerar"
                 + "\n5) Llenar Tanque"
                 + "\n6) Poner Aceite"
                 + "\n7) Mostrar Informacion del Carro");
         opc = td.nextInt();
         switch(opc){
             case 1: v.encender(); break;
             case 2: v.apagar(); break;
             case 3: v.acel(); break;
             case 5: v.gaso(); break;
             case 6: v.ace(); break;
             case 7: v.datos(); break;
             
         }
        }while(opc !=8);
    }
    public void datos(){
        System.out.println("Placa: "+a1.getPlaca());
        System.out.println("Estado: "+a1.getEstado());
        System.out.println("Velocidad: "+a1.getVelocidad());
        System.out.println("Estado Gasolina: "+a1.getGasolina());
        System.out.println("Estado Aceite: "+a1.getAceite());
    }
}
