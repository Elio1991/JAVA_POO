/*
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el examen final. 
La escuela nos ha pedido que calculemos el promedio de notas final de todos sus alumnos
y saber qué alumnos han recibido una nota por encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante,
sus atributos van a ser nombre y nota (representando la nota obtenida en el final). 
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante,
usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.
Calcular y mostrar el promedio de notas de todo el curso
Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
 */
package Entidades;

import java.util.Arrays;

/**
 *
 * @author Elio
 */
public class Estudiante {

    private float nota;
    private String nombre;
 
    public Estudiante() {
    }

    public Estudiante(float nota, String nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nota: " + nota + ", nombre: " + nombre ;
    }

    
    
    
    
}