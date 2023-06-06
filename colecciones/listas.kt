// Listas
fun main() {
    
    // Lista inmutable
    val readOnly : List <String> = listOf("Lunes","Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");
    
    println(readOnly);
    println("Tamaño de la lista: ${readOnly.size}"); 
    println("ELemento en la posicion 3: ${readOnly.get(3)}");
    println("Primer elemento de la lista: ${readOnly.first()}");
    println("Ultimo elemento de la lista: ${readOnly.last()}");

    println("-------------------------------------------------");
    //Mostrar los elementos de la lista usando estrutura for
    println("Elementos de readOnly: ");
    for ( elemento in readOnly){
        println(elemento);
    }

    println("-------------------------------------------------");
    //Mostrar ls elementos de la lista usando el metodo forEach
    println("Elementos de readOnly usando forEach: ");
    readOnly.forEach{println(it)}

    println("-------------------------------------------------");
    //Lista mutable
    var mutableList : MutableList<String> = mutableListOf("Lunes","Martes");
    println("Lista mutable: $mutableList");
    mutableList.add("Miercoles");
    println("Lista mutable: $mutableList");


    println("-------------------------------------------------");
    //Trabajando con listas mutables vacias
    var emptyList : MutableList<String> = mutableListOf();
    println("¿La lista esta vacia?: ${emptyList.none()}");
    println("Primer elemento de emptyList: ${emptyList.firstOrNull()}");
    println("Ultimo elemento de emptyList: ${emptyList.lastOrNull()}");
    println("Elemento en la posicion 2 de emptyList: ${emptyList.elementAtOrNull(2)}");

    println("-------------------------------------------------");
    //Agregando elementos a emptyList
    readOnly.forEach{
        emptyList.add(it);
    }
    println("La lista que estaba vacia: $emptyList");

    println("-------------------------------------------------");
    //Ordenar una lista
    val numerosDeLoteria = listOf(11, 2, 44, 33, 56, 78, 66);
    println("Numeros de la loteria: $numerosDeLoteria");
    val numerosOrdenados = numerosDeLoteria.sorted();
    println("Numeros ordenados: $numerosOrdenados");    
    val numerosDescendentes = numerosDeLoteria.sortedDescending();
    println("Numeros ordenados en forma descendente: $numerosDescendentes");
    val numerosPares = numerosDeLoteria.filter{num -> num % 2 ==0};
    println("Numeros pares: $ numerosPares");
}