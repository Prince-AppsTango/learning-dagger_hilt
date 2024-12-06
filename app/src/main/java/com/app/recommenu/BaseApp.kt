package com.app.recommenu

import android.app.Application
import com.app.recommenu.di.Car
import com.app.recommenu.di.Engine
import com.app.recommenu.di.Wheel

// external resource
// Application class means, this is parent class
class BaseApp:Application() {
    var engine=Engine()
    var wheel = Wheel()
    var car = Car(engine,wheel)
}