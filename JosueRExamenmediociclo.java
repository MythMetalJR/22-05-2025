/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.josuerexamenmediociclo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
/*programa basico de atencion al cliente en clinica veterinaria, cada mascota tiene nombre, edad en años y un tipo definido ya sea perro, gato y ave
ademas cada consulta debe registrar la fecha en la que se realizo, el motivo y el nombre de la mascota que fue atentida, en el caso de las mascotas la info que muestre en pantalla
debe omitir la edad del animal, tmb debe existir  un metodo que permita mediante un valor booleano recibido como parametro decidir si desea visualizar
la edad junto con el resto de datos , tmb debe implementarse una funcion que permita actualizar la edad de la mascota garazntizando
que el nuevo valor reemplaze al anterior.
caunto a las consultas veterinarias estas deben incluir 
*/
public class JosueRExamenmediociclo {
    public static void main(String[] args) {
        // Crear mascotas
        Mascota m1 = new Mascota("Firulais", 5, "perro");
        Mascota m2 = new Mascota("Michi", 3, "gato");
        Mascota m3 = new Mascota("Piolin", 2, "ave");

        // Mostrar información sin edad
        System.out.println(m1.mostrarInfo(false));
        System.out.println(m2.mostrarInfo(false));

        // Mostrar información con edad
        System.out.println(m3.mostrarInfo(true));

        // Actualizar edad
        m2.actualizarEdad(4);
        System.out.println(m2.mostrarInfo(true));

        // Crear consultas
        Consulta c1 = new Consulta(new Date(), "Vacunación", m1);
        Consulta c2 = new Consulta(new Date(), "Revisión general", m2);

        // Mostrar consultas
        System.out.println(c1.mostrarConsulta());
        System.out.println(c2.mostrarConsulta());
    }
}

class Mascota {
    private String nombre;
    private int edad;
    private String tipo;

    public Mascota(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    // Método para mostrar información, con opción para mostrar la edad
    public String mostrarInfo(boolean mostrarEdad) {
        String info = "Nombre: " + nombre + ", Tipo: " + tipo;
        if (mostrarEdad) {
            info += ", Edad: " + edad + " años";
        }
        return info;
    }

    // Actualizar la edad
    public void actualizarEdad(int nuevaEdad) {
        if (nuevaEdad >= 0) {
            this.edad = nuevaEdad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    public String getNombre() {
        return nombre;
    }
}

class Consulta {
    private Date fecha;
    private String motivo;
    private Mascota mascota;

    public Consulta(Date fecha, String motivo, Mascota mascota) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.mascota = mascota;
    }

    public String mostrarConsulta() {
        return "Fecha: " + fecha + ", Motivo: " + motivo + ", Mascota: " + mascota.getNombre();
    }
}
  
  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
