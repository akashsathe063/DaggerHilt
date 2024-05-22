package com.example.daggerhilt.iterface

import android.util.Log
import javax.inject.Inject

interface DemoOne{
    fun demoOne()
}

class DemoOnEImpl @Inject constructor(): DemoOne{
    override fun demoOne() {
        Log.d("Computer","#ak inside a demoOne function")
        getDemoOneImpl()
    }
fun getDemoOneImpl(){
    Log.d("Computer","#ak inside a getDemoOneImpl function")
}
}



interface DemoTwo{
    fun demoTwo()
}

class DemoTwoImpl @Inject constructor() : DemoTwo{
    override fun demoTwo() {
        Log.d("Computer","#ak inside a demoOne function")
    }

}