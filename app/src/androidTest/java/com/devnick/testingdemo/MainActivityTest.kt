package com.devnick.testingdemo

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest{

    @get:Rule
    var activityRule= ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkDisplayText(){

        onView(withText(R.string.app_name)).check(matches(isDisplayed()))

        onView(withId(R.id.firstname)).check(matches(withText("Gayatri")))

        onView(withId(R.id.lastname)).check(matches(withText("Patel")))
    }

}