
package Dominio;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Empleado {
    private String nombre;
    private Fecha fechaN;
    private Fecha fechaI;

    public Empleado(String nombre, Fecha fechaN, Fecha fechaI) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.fechaI = fechaI;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaN() {
        return fechaN;
    }

    public Fecha getFechaI() {
        return fechaI;
    }
    
    public void verDatos(){
        System.out.println("Los datos ingresados son: ");
        System.out.println("Nombre: "+this.nombre);
        //Fecha de Nacimiento
        System.out.println("Fecha de nacimiento: "+fechaN.getDia()+"/"+fechaN.getMes()+
                "/"+fechaN.getAnio());
        //Fecha de Igreso
        System.out.println("Fecha de ingreso: "+fechaI.getDia()+"/"+fechaI.getMes()+
                "/"+fechaI.getAnio());
    }
    ////
     public void numeroAnios(int dia, int mes, int anio) {
        GregorianCalendar fecha = new GregorianCalendar(anio, mes - 1, dia);
        int Cont = 0;
        int Aniototal = 0;
        GregorianCalendar fechaActual = new GregorianCalendar();
        while ((fecha.get(Calendar.YEAR) != fechaActual.get(Calendar.YEAR))) {
            fecha.add(Calendar.YEAR, 1);
            Cont++;
        }
        Aniototal = Cont;
        System.out.print(Aniototal +" años, ");
     }

    public void numeroMeses(int dia, int mes, int anio) {
        GregorianCalendar fecha = new GregorianCalendar(anio, mes - 1, dia);
        int Cont = 0;
        int Mestot = 0;
        GregorianCalendar fechaActual = new GregorianCalendar();
        while (true) {
            if ((fecha.get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH))&& (fecha.get(Calendar.YEAR) == fechaActual.get(Calendar.YEAR))) {
                break;
            }
            fecha.add(Calendar.MONTH, 1);
            Cont++;
        }
        Mestot = Cont % 12;
        System.out.print(Mestot + " meses, ");
    }
    
    public void numeroDias(int dia, int mes, int anio) {
        GregorianCalendar fecha = new GregorianCalendar(anio, mes - 1, dia);
        int Cont = 0;
        int Diatot = 0;
        GregorianCalendar fechaActual = new GregorianCalendar();
        while (true) {
            if ((fecha.get(Calendar.DAY_OF_MONTH) == fechaActual.get(Calendar.DAY_OF_MONTH)) && (fecha.get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH)) && (fecha.get(Calendar.YEAR) == fechaActual.get(Calendar.YEAR))) {
                break;
            }
            fecha.add(Calendar.DAY_OF_MONTH, 1);
            Cont++;
        }
        Diatot = Cont % 365;
        System.out.print(Diatot + " días\n");
    }
    ////
    @Override
    public String toString(){
        return this.nombre+"\n"+this.getFechaN()+"\n"+this.fechaI;
    }
    
    
}
