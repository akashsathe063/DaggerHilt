package com.example.daggerhilt

import android.util.Log
import com.example.daggerhilt.iterface.DemoOne
import com.example.daggerhilt.iterface.DemoTwo
import javax.inject.Inject

class Computer  @Inject constructor(val ram: Ram,val demoOne: DemoOne,val demoTwo: DemoTwo) {
    fun getComputer(){
        demoOne.demoOne()
        demoTwo.demoTwo()
        ram.getRam()
        Log.d("Computer","#ak inside a getComputer function")
    }
}

class Ram @Inject constructor() {
    fun getRam(){
        Log.d("Computer","#ak inside a getRam function")
    }
}