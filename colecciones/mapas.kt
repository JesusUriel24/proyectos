//trabajando con mapas
fun main() {
    //mapa inmutable
    val ladas : Map<Int, String> = mapOf(
        1 to "USA",
        34 to "España",
        52 to  "Mexico",
        233 to "Ghana"
    );
    //imprimiendo el conjunto de pares clave-valor
    println(ladas);
    //imprimiendo el mapa usando un for
    for((key, value) in ladas){
        println("la clave ladas de $value es $key");
    }
    //recupera un solo elemento del mapa
    println(ladas.get(52));
    println(ladas[52]);

    //recuperar su tamaño, cuantos pares hay en el mapa
    println("Tamaño: {ladas.size}"); 
    //recuperar solo las claves
    println("claves del mapa: {ladas.keys}");
    //recuperar solo los valores
    println("valores del mapa: {ladas.values}");
    //recuperar las entradas 
    println("Entradas del mapa: {ladas.entries}");
    //recuperar un valor si existe, sino envia el default 
    println("Valores de la lada 48: {ladas.getOrDefault(48,"pais desconocido")}");
    //comprobar si el mapa esta vacio
    println("Mapa vacio: {ladas.isEmpty}");
    //comprobar si existe una clave especifica en el mapa 
    println("Existe la clave lada 86: {86 in ladas}");
    //comprobar si existe un valor en el mapa 
    println("Existe el valor Mexico en el mapa: ${"Mexico" in ladas.values}"); 
    
    //mapa mutable
    var nums = mutableMapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
    );

    println ("Mapa de numeros: $nums");
    //eliminar valores del mapa
    nums.remove("two");
    //agregando por el mapa
    nums["six"]= 6;
    println("Mapa nuevo de numeros: $nums");

    var sortedNums = nums.toSortedMap();
    println("Mapa ordenado: $sortedNums");

    //Reto:
    //Crear un diccionario español - ingles usando un mapa 
    //1. Funcion para crear o cargar el diccinario
    //2. Funcion para consulta, reciba una palabra en español
    // y regresa una traduccion, sino existe traduccion, un valor por default
    //3. Imprimir todo el diccionario

    println("---------------------------------------------------------------------");
    val diccionario=mutableMapOf(
        "Abeja" to "Bee",
        "Aguila" to "Eagle",
        "Araña" to "Spider",
        "Ardilla" to "Squirrel",
        "Ballena" to "Whale",
        "Caballo" to "Horse",
        "Caracol" to "Snail",
        "Cocodrilo" to "Crocodile",
        "Delfín" to "Dolphin",
        "Gato" to "Cat"
    );

    //agregar mas datos
    diccionario["Búho"]= "Owl";
    print("Diccionario nuevo: $diccionario");
}

 
}

