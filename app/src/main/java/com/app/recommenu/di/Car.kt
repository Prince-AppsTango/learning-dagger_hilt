package com.app.recommenu.di

import android.util.Log
// created instance of engine and wheel in the constructor of Car

// manually di injection
class Car constructor(private val engine: Engine, private val wheel: Wheel) {
    fun getCar(){
        engine.getEngineStatus()
        wheel.getWheelStatus()
        Log.d("Car", "car is running")
    }
}

class Engine{
    fun getEngineStatus(){
        Log.d("Car", "Engine started...")
    }
}

class Wheel{
    fun getWheelStatus(){
        Log.d("Car", "Wheel rotated: ")
    }
}

