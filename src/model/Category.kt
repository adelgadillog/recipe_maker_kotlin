package model

import interfaces.ICategory

class Category(id:Int,name:String) {



    var id:Int = id


    var name:String = name




    override fun toString(): String {
        return "$id. $name"
    }
}