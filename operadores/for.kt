fun main (){
    println("Valores de i:");
    for (i in 1..10){
        println(i);
    }

    
    var suma = for (i in 1..10){
        suma += i;
    }
    println("Valor de suma: $suma");
    println();

    println("Letras");
    for(caracter in 'a'..'g' step 2){
        println(caracter);
    }
    println();
    println("Letras en reversa:");
    for(caracter in 'g' downTo 'a'){
        println(caracter);
    }

    // recorriendo for com un arreglo
    val mascotas =  arrayOf("Ginger", "Blackie", "Nicky", "Moka", "Moji");
    println();
    println("Mascotas");
    for (i in mascotas.indices) {
        println("[$i, ${mascotas[i]}]");
    }

    println();
    println("Dividiendo un String en caracteres:");
    for (letra in "------ Hola mundo Kotlin ------"){
        println(letra);
    }

}