package com.example.bhailog

data class Emp (var emp_name:String,var emp_fathername:String,var emp_age:Int){
    var id:Int=0
    constructor(id:Int,emp_name: String,emp_fathername: String,emp_age: Int):this(emp_name,emp_fathername,emp_age)
    {
        this.id=id
    }
}