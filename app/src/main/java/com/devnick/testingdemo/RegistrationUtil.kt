package com.devnick.testingdemo

object RegistrationUtil {

    fun checkValidDetail(student: Student): Boolean {
        //age is valid then do some stuff
        return student.age > 18
    }
}