import interfaces.ICategory
import model.Category
import model.Product

class Menu():ICategory{



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
        val options: List<Category> = listOf(Category(1,"Frutas"),Category(2,"Cereal"),
                Category(3,"Liquidos"),Category(4,"Proteinas"))

        for (option in options){
            println(" ${option.toString()}")
        }
        val response:String? = readLine()
        val recipe:Category = options[response?.toInt()!!]
        viewRecipe(recipe)


    }
    fun viewRecipe(category: Category){
        var products:List<Product> = createProductsForCategory(category)
                for (product in products){
                    println("${product.toString()}")
                }

    }

    fun viewRecipe(){


    }
}
