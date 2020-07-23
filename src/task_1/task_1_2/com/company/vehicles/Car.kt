package task_1.task_1_2.com.company.vehicles

import task_1.task_1_2.com.company.details.Engine
import java.sql.Driver

open class Car {
    open lateinit var marka: String
    open lateinit var carClass: String
    open lateinit var engine: Engine
    open lateinit var diver: Driver

    open fun start() {
        println("Поехали")
    }

    open fun stop() {
        println("Останавливаемся")
    }

    open fun turnRigth() {
        println("Поворот направо")
    }

    open fun turnLeft() {
        println("Поворот направо")
    }

    open fun printInfo() {

    }

}