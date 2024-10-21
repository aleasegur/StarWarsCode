/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwarscode;
//ALEJANDRO ASENCIO GURAU

import java.util.Scanner;

public class StarWarsCode {
    public static void main(String[] args) {
        //Declaro la variable suma para el sumatorio de S1 a S2
        int suma = 0;
        //Declaro el product, para el productoria entre P1 y P2
        int product = 1;
        //Declaro fact, factorial de N
        int fact = 1;
        //Declaro result, para calcular si es primo o no P
        int result = 1;
        //Declaro sumaproduct, como el sumatorio entre M y S
        int sumaproduct = 1;
        //Declaro respuesta, para que el resultado sea aceptado.
        int respuesta = 0;

        //Número entero aleatorio entre 1 y 10.
        int s1 = (int) (Math.random() * (10 + 1));
        //Número entero aleatorio entre 20 y 30.
        int s2 = (int) (20 + Math.random() * (30 - 20 + 1));
        //Numero entero aleatorio entre 1 y 7
        int p1 = (int) (Math.random() * (7 + 1));
        //Numero entero aleatorio entre 8 y 12
        int p2 = (int) (8 + Math.random() * (12 - 8 + 1));
        //Numero entero aleatorio entre 50 y 100
        int n = (int) (50 + Math.random() * (100 - 50 + 1));
        //Calcular el cociente de N entre 10 y redondearlo hacia abajo
        int cociente = n / 10;
        //Numero entero aleatorio entre 10 y 100
        int p = (int) (10 + Math.random() * (100 - 10 + 1));
        //Numero entero aleatorio entre 5 y 10
        int m = (int) (5 + Math.random() * (10 - 5 + 1));
        //Numero entero aleatorio entre 5 y 10
        int s = (int) (5 + Math.random() * (10 - 5 + 1));

        //Declaro user como objeto scanner 
        Scanner user = new Scanner(System.in);

        //INTRODUCCION
        System.out.println("=== STAR WARS CODIGOS SECRETOS ===\n" +
                "Hace mucho tiempo, en una galaxia muy, muy lejana La Princesa Leia, Luke\n" +
                "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n" +
                "en una mision secreta para infiltrarse en otra estrella de la muerte que el imperio\n" +
                "esta construyendo para destruirla. (Presiona Intro para continuar)");
        //Salto de linea con el objeto scanner
        user.nextLine();

        //NIVEL1
        System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n" +
                "sistema " + s1 + " en el sector " + s2 + " , pero el sistema de navegacion esta estropeado y el\n" +
                "computador tiene problemas para calcular parte de las coordenadas de salto.\n" +
                "Chewbacca, piloto experto, se da cuenta que falta el cuarto numero de la serie.\n" +
                "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n" +
                "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n" +
                "¿Que debe introducir?");

        // Utilizo un bucle for para sumar los números entre S1 y S2
        for (int i = s1; i <= s2; i++) {
            suma = suma + i;
        }
        //Introducimos por el objeto scanner de respuesto
        System.out.println(suma);
        respuesta = user.nextInt();
        
        /*Si respuesta es igual al resultado de suma, pasas de nivel, 
        si no saltara un print de perder y finaliza el programa*/
        if (respuesta == suma) {
            //NIVEL2
            System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n" +
                    "de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n" +
                    "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí\n" +
                    "agente de espaciopuerto " + p1 + " contactando con nave imperial " + p2 + " . No están destinados\n" +
                    "en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa.\n" +
                    "“Eh… tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso\n" +
                    "para atracar y reparar la nave”. El agente, que no se anda con tonterías, responde\n" +
                    "“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el\n" +
                    "manual del piloto que estaba en la guantera y da con la página correcta. El código\n" +
                    "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n" +
                    "¿Cuál es el código?");

            // Utilizo un bucle for para multiplicar los números entre P1 y P2
            for (int i = p1; i <= p2; i++) {
                product = product * i;
            }
            System.out.println(product);
            respuesta = user.nextInt();
        /*Si respuesta es igual al resultado de product, pasas de nivel, 
        si no saltara un print de perder y finaliza el programa*/
            if (respuesta == product) {
                //NIVEL3
                System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se\n" +
                        "equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n" +
                        "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los " + n + " existentes se\n" +
                        "encuentra el reactor principal. Se dirigen al primer panel computerizado que\n" +
                        "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n" +
                        "introducir una clave de acceso. Entonces recuerda la información que le proporcionó\n" +
                        "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10\n" +
                        "(redondeando N hacia abajo), donde N es el nº de niveles”.\n" +
                        "¿Cual es el nivel cSorrecto?");

                // Utilizo un bucle for para calcular el factorial de cociente
                for (int i = 1; i <= cociente; i++) {
                    fact = fact * i;
                }
                System.out.println(fact);
                respuesta = user.nextInt();
        /*Si respuesta es igual al resultado de fact, pasas de nivel, 
        si no saltara un print de perder y finaliza el programa*/
                if (respuesta == fact) {
                    //NIVEL4
                    System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n" +
                            "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n" +
                            "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n" +
                            "verificar si el número " + p + " es primo o no. Si es primo introduce un 1, si no lo es\n" +
                            "introduce un 0");
                    // Uso un bucle for para comprobar si P es divisible por algún número entre 2 y P
                    for (int i = 2; i < p; i++) {
                        // Si P es divisible por i, entonces P no es primo y se cambia el resultado a 0
                        if (p % i == 0) {
                            result = 0;
                        }
                    }
                    System.out.println(respuesta);
                    respuesta = user.nextInt();
          /*Si respuesta es igual al resultado de result, pasas de nivel, 
        si no saltara un print de perder y finaliza el programa*/
                    if (respuesta == result) {
                        //Nivel5
                        System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n" +
                                "programe el temporizador y salir de allí corriendo. Necesita programarlo para que\n" +
                                "explote en exactamente " + m + " minutos y " + s + " segundos, el tiempo suficiente para escapar\n" +
                                "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n" +
                                "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n" +
                                "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar\n" +
                                "el factorial de M y el factorial de S. ¿Qué valor debe introducir?");
                        // Uso dos bucles for anidados para calcular el producto de los números entre 1 y M y entre 1 y S
                        for (int i = 1; i <= m; i++) {
                            for (int j = 1; j <= s; j++) {
                                product = product * j;
                            }
                            sumaproduct = sumaproduct + product;
                        }
                        System.out.println(sumaproduct);
                        respuesta = user.nextInt();
             /*Si respuesta es igual al resultado de sumaproduct, saltaria el print ganar, 
             si no saltara un print de perder y finaliza el programa*/
                        if (respuesta == sumaproduct) {
                            System.out.println("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a\n" +
                                    "sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se\n" +
                                    "convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea\n" +
                                    "consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan\n" +
                                    "observan por la ventana la imagen de la colosal estrella de la muerte explotando en\n" +
                                    "el silencio del espacio, desapareciendo para siempre junto a los restos del malvado\n" +
                                    "imperio.\n" +
                                    "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");

                            //PERDER
                        } else {
                            System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                                    "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
                        }
                    } else {
                        System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                                "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
                    }
                } else {
                    System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                            "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
                }
            } else {
                System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                        "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
            }
        } else {
            System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                    "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
        }
        System.out.println("Gracias por jugar :D");
    }
}

