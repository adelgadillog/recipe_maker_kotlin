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
        2 -> seeRecipe()
        3 -> createMenu()
    }
}

fun makeRecipe(){

}
fun seeRecipe(){


}