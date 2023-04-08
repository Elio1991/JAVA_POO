/*
 Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: 
nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura.
    Si desea añadir algún otro atributo, puede hacerlo. 
    Agregar constructores, getters y setters.
    En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario
y después se le asignan a sus respectivos atributos para llenar el objeto Persona.
    Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
    Si no es correcto se deberá mostrar un mensaje.
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
    Si esta fórmula da por resultado un valor menor que 20, 
significa que la persona está por debajo de su peso ideal y la función devuelve un -1. 
    Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
significa que la persona está en su peso ideal y la función devuelve un 0. 
    Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1.
    A continuación, en la clase main hacer lo siguiente:
    Crear 4 objetos de tipo Persona con distintos valores, a continuación,
    llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto
si la persona es mayor de edad.
    Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima,
y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
Para esto, podemos crear unos métodos adicionales.
 */
package Personal;

import Entidades.Persona;
import Servicios.PersonaServicios;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class Personal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicios ps1 = new PersonaServicios();

        System.out.println("Bienvenido!");
        System.out.println("###############################");
        System.out.println("Ingrese los datos de la 1° Persona");
        System.out.println("----------------------------------");
        Persona p1 = ps1.crearPersona();
        switch (ps1.calcularIMC(p1)) {
            case -1:
                System.out.println("Esta por debajo de su peso");
                break;
            case 0:
                System.out.println("Esta en su peso ideal");
                break;
            default:
                System.out.println("Esta por encima de su peso");
                break;
        }
        if (ps1.esMayorDeEdad(p1)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.println("##################################");
        System.out.println("Ingrese los datos de la 2° Persona");
        System.out.println("----------------------------------");
        Persona p2 = ps1.crearPersona();
        switch (ps1.calcularIMC(p2)) {
            case -1:
                System.out.println("Esta por debajo de su peso");
                break;
            case 0:
                System.out.println("Esta en su peso ideal");
                break;
            default:
                System.out.println("Esta por encima de su peso");
                break;
        }
        if (ps1.esMayorDeEdad(p2)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("#################################");

        System.out.println("Ingrese los datos de la 3° Persona");
        System.out.println("----------------------------------");
        Persona p3 = ps1.crearPersona();
        switch (ps1.calcularIMC(p3)) {
            case -1:
                System.out.println("Esta por debajo de su peso");
                break;
            case 0:
                System.out.println("Esta en su peso ideal");
                break;
            default:
                System.out.println("Esta por encima de su peso");
                break;
        }
        if (ps1.esMayorDeEdad(p3)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("#################################");

        System.out.println("Ingrese los datos de la 4° Persona");
        System.out.println("----------------------------------");
        Persona p4 = ps1.crearPersona();
        switch (ps1.calcularIMC(p4)) {
            case -1:
                System.out.println("Esta por debajo de su peso");
                break;
            case 0:
                System.out.println("Esta en su peso ideal");
                break;
            default:
                System.out.println("Esta por encima de su peso");
                break;
        }
        if (ps1.esMayorDeEdad(p4)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("###############################");
        
        ps1.porcentajePeso(p1, p2, p3, p4);
        
        System.out.println("###############################");

        ps1.porcentajeEdad(p1, p2, p3, p4);
    }
}