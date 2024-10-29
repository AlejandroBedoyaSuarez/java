import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //instrucción para mostrar algo en pantalla al usuario
        byte age = 15;
        int bigNumber = 1000;
        //Aquí se tiene que terminar el dato con una F
        float decimalAge= 5.5F;
        System.out.println(decimalAge);
        //Boolean
        boolean isActive = true;
        System.out.println(isActive);
        //si se escribe "Sout" se hara el system out print de manera de atajo
        //char se hacen como respuesta de comillas simples
        char curse = 'A';
        System.out.println(curse);

        //--------------------------------------------------------------
        //Strings: nos ayuda a crear texto dentro de nuestras aplicaciones
        String text = new String("Hola Mundo!");
        //Una acortación a este mismo es hacerlo sin el new string, se lo conoce como string literal
        //Estos tienen varios métodos útiles
        String text2 = "Hola Mundote!";
        //Nos dice el largo de la cadena de texto
        //variable.length();
        int large= text2.length();
        System.out.println(large);

        //Reemplaza el Hola por el Chao, es igual a la de arriba
        //String nuevaVariable= variable.replace("texto a cambiar" , "texto cambiado");
        String textReplace= text2.replace("Hola", "Chao");
        System.out.println(textReplace);

        //Métodos
        //endswith es para poder visualizar en true o false si el final de mi variable es correcta
        //sout (variable.endsWith("texto a verificar"));
        System.out.println(textReplace.endsWith("undote!"));
        //en caso que se cambie cualquier cosa del final, se podrá visualizar el falso
        System.out.println(textReplace.endsWith("undote"));

        //startsWith
        //es para poder visualizar en true o false si el comienzo de mi variable es correcta
        System.out.println(textReplace.startsWith("Ch"));
        //Sale false porque recuerda que cambiamos el texto con el method replace
        System.out.println(textReplace.startsWith("Hol"));

        //Contains
        //Sirve para poder visualizar en true o false si mi cadena de texto tiene algo en específico
        System.out.println(textReplace.contains("und"));
        System.out.println(textReplace.contains("Goku"));

        //IndexOf
        // Sirve para poder localizar ese texto requerido en nuestra línea de texto
        // Sale la línea de código en número (en este caso es 5)
        System.out.println(textReplace.indexOf("Mund"));

        //toUpperCase - LowerCase
        //convierte  el texto a mayúsculas
        System.out.println(textReplace.toUpperCase());
        System.out.println(textReplace.toLowerCase());

        //Method Trim
        //Sirve para eliminar los espacios de más del usuario
        String malo = "   sapito feliz   ";
        System.out.println(malo.trim());
        //diferencia si lo escribes normalmente
        System.out.println(malo);

        //-------------------------------------------------------------------------------------
        //Secuencias de Escape
        // el \ sirve para separar el texto dentro de un string
        String scape= "C:\\Hola \"mundo\">";
        System.out.println(scape);
        //la n minúscula dentro del \ sirve para tomar el texto de la derecha y lo lleva hacia otra línea
        String nMinuscula= "Hola \nmundo";
        System.out.println(nMinuscula);

        //--------------------------------------------------------------------------------------
        //ARRAYS
        // tipo de dato [] variable = new array [longuitud del array]
        int [] numeros= new int[5];
        //se agregan valores con: variable [lugar del array] = valor a cambiar del array;
        numeros [0]= 5;
        numeros [3] = 10;
        //se añade una clase "Arrays" haciendo que se importe una biblioteca llamada "import java.util.Arrays;"
        // sout (Clase Arrays.toString(variable));
        System.out.println(Arrays.toString(numeros));
        //nos muestra cuantos elementos están dentro de un array
        System.out.println(numeros.length);
        //Arrays.sort(variable); sirve  ordenar los arrays
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        //Los Arrays se pueden crear de manera más sencilla
        int[] maneraSencilla = {0,1,2,3,4,5,6,12,7};
        System.out.println(Arrays.toString(maneraSencilla));
        Arrays.sort(maneraSencilla);
        //solo se ordena con esta orden
        System.out.println(Arrays.toString(maneraSencilla));

        //Múltiples Dimensiones, cada [] crea una dimensión ej: [][][] tiene 3 dimensiones [][][][] 4 dimensiones
        //Haremos un array dentro de un array
        // tipo de dato [] [] variable= { {valor,valor2} , {valor3, valor4} }
        int[] [] numerosEnteros={{0,1}, {2,3}};
        //utilizamos otro method llamado deeptoString
        System.out.println(Arrays.deepToString(numerosEnteros));

        //En caso de no saber cuantas habrán, se usa el siguiente method
        int [] [] numerosEnteros2= new int[3][2];
        //para colocar los datos se hace
        numerosEnteros2[0] [0] = 5;
        System.out.println(Arrays.deepToString(numerosEnteros2));

        //Array de 3 dimensiones por los dos method
        int [] [] [] arrayDimensiones= {{{0,1},{2,3}}};
        System.out.println(Arrays.deepToString(arrayDimensiones));

        int [] [] [] arrayDimensiones2= new int[3][3][1];
        arrayDimensiones2 [2] [2] [0] = 7;
        System.out.println(Arrays.deepToString(arrayDimensiones2));

        //Constantes
        //se hace constante cuando se coloca "final"
        final String company = "Hola Mundito";
        System.out.println(company);

        //Operadores Lógicos
        //Suma
        int suma= 2+2;
        System.out.println(suma);
        //Resta
        int resta= 10-2;
        System.out.println(resta);
        //Multiplicación
        int multiplicacion=2*2;
        System.out.println(multiplicacion);
        //División
        int division=4/2;
        System.out.println(division);
        //Módulo
        int modulo= 4%3;
        System.out.println(modulo);
        //División con decimales
        //con double se tiene que hacer con entero,decimal ej: 4,0/2,0
        double divisionDecimal= 10.0/3.0;
        System.out.println(divisionDecimal);
        //En caso de ser float, solo se pone la f al lado del entero
        float divisionDecimal2= 10f/3f;
        System.out.println(divisionDecimal2);

        //Incrementadores
        int valor1= 5;
        //Incrementamos el valor en 1 con ++variable o variable++;
        //también se puede hacer dentro del sout pero tiene que ser obligatoriamente y unicamente con ++variable
        //++valor1;
        System.out.println(valor1);

        int valor2= valor1++;
        System.out.println(valor2);
    }
}