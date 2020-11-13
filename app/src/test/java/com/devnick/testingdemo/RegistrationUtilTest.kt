package com.devnick.testingdemo

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun checkValidDetail_correctDetail_returnsTrue(){

        var student=Student("Gayatri",21)
        var result= RegistrationUtil.checkValidDetail(student)

        assertThat(result).isTrue()
    }

    @Test
    fun `check valid detail incorrect values return false`(){

        var student=Student("Gayatri",15)
        var result= RegistrationUtil.checkValidDetail(student)

        assertThat(result).isFalse()
    }
}