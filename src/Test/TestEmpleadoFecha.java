
package Test;

import Dominio.Empleado;
import Dominio.Fecha;
import java.util.Scanner;

public class TestEmpleadoFecha {
   public static void main (String[] args)    {
        Scanner entrada= new Scanner(System.in);
       Fecha fNacimiento;
        Fecha fIngreso;
        Empleado empleado1;
        int N_anio,N_mes,N_dia;
        int i_anio,i_mes,i_dia;
        String nombre;
        System.out.println("Ingrese el nombre del empleado: ");
       nombre = entrada.nextLine();
       ///
       System.out.println("Fecha de nacimiento: ");
       System.out.print("Ingrese el Año: ");
      N_anio = entrada.nextInt();
       System.out.print("Ingrese el mes: ");
       N_mes = entrada.nextInt();
       System.out.print("Ingrese el dia: ");
       N_dia = entrada.nextInt();
       fNacimiento = new Fecha(N_anio,N_mes,N_dia);
       ///
        System.out.println("Fecha de ingreso a la empresa: ");
       System.out.print("Ingrese el Año: ");
       i_anio = entrada.nextInt();
       System.out.print("Ingrese el mes: ");
       i_mes = entrada.nextInt();
       System.out.print("Ingrese el dia: ");
       i_dia = entrada.nextInt();
       fIngreso = new Fecha(i_anio,i_mes,i_dia);
      empleado1 = new Empleado(nombre, fNacimiento, fIngreso);
       System.out.println(empleado1);
       empleado1.verDatos();
       ///
       System.out.println("Su edad que tiene ahora es: ");
       empleado1.numeroAnios(N_dia, N_mes, N_anio);
       empleado1.numeroDias(N_dia, N_mes, N_anio);
       empleado1.numeroMeses(N_dia, N_mes, N_anio);
       //
       System.out.println("El tiempo de trabajo desde que ingreso es: ");
       empleado1.numeroAnios(i_dia, i_mes, i_anio);
       empleado1.numeroMeses(i_dia, i_mes, i_anio);
       empleado1.numeroDias(i_dia, i_mes, i_anio);
   }
}
