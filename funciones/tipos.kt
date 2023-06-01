//Usando funciones que regresan valores
// y funciones que no rehresan valores

fun main () {

    val numero1 = 12;
    val numero2 = 40;

    borde("=", 20);
    var resultado =  suma (numero1, numero2);
    println(resultado);
    borde("*", 35);

    //Ejemplo 1 de funcion anonima
    val slogan = {r : Int -> println("Tu puedes con $r problemas y mas")};

    //Invocar funcion anonima - forma 1
    slogan(resultado);

    val resta = {n1: Int, n2 : Int -> n1 - n2};
    println("Resta: ${resta(12,18)}");

    //Funcion anonima que encunetre el mayor de tres numeros
    val max = {n1: Int, n2: Int, n3: Int -> if (n1 >= n2 && n1 >= n3){ n1 } else if (n2 >= n1 && n2 >= n3) { n2} else {n3}};
    println("Valor maximo: ${max(21,13,9)}");

    //Funcion anonima que calcule el promedio de tres numeros
    val promedio = {n1: Int, n2: Int, n3: Int -> (n1 + n2 + n3)/3};
    println("Promedio: ${promedio(10,5,7)}");
    

}

fun borde(caracter : String, veces : Int){
    for (i in 1..veces){
        print(caracter);
    }
    println();
}

fun suma(n1:Int, n2:Int):Int{
    return n1 + n2;
}