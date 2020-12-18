package interfaces

import model.Category
import model.Product

interface ICategory {

    fun createProductsForCategory(category: Category): List<Product>{
            var products:List<Product> = listOf()
            when(category.id){


                1-> {
                    products = listOf(
                            Product(1,"Fresa",4),
                            Product(2,"Plátano",3),
                            Product(3,"Uvas",6),
                            Product(4,"Manzana",2),
                            Product(5,"Naranja",6),
                            Product(6,"Pera",7),
                            Product(7,"Cereza",1))
                    return products
                }

                2-> {
                    products = listOf(
                            Product(1,"Avena",4),
                            Product(2,"Trigo",3),
                            Product(3,"Arroz",6),
                            Product(4,"Maiz",2))
                    return products
                }
                3-> {
                    products = listOf(
                            Product(1,"Agua",4),
                            Product(2,"Leche",3),
                            Product(3,"Aceites",6))
                    return products

                }
                4-> {
                    products = listOf(
                            Product(1,"Carne",4),
                            Product(2,"Huevos",3),
                            Product(3,"Verduras",6))
                    return products

                }
            }
            return products

    }
}