fun Menu(){
    createMenu()
}

fun createMenu(){
    val options : List<String>  = listOf("","Hacer una receta","Ver mis recetas","Salir")
    println("Selecciona la opcion deseada \n")
    for ((index,option) in options.withIndex()){
        if(index != 0)  println("$index: $option ")
    }
    val response:String? = readLine()
    when(response?.toInt()){
        1 -> makeRecipe()
        2 -> viewRecipe()
        3 -> createMenu()
    }
}

fun makeRecipe(){
    println("Hacer receta\n" +
            "Selecciona por categoría el ingrediente que buscas")
    val options: List<String> = listOf("","Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceites")
    for ((index,option) in options.withIndex()){
        if(index != 0)  println("$index: $option ")
    }
    val response:String? = readLine()
    val recipe = options[response?.toInt()!!]
    viewRecipe(recipe.toString())


}
fun viewRecipe(recipe:String){

    println("Ver mis recetas con: $recipe")

}

fun viewRecipe(){


}