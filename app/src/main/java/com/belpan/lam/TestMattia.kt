package com.belpan.lam

//Open = parola chiave per poter ereditare da questa classe
//La classe List di default è immutabile, per poter aggiungere e rimuovere elementi si usa la
// MutableList.
//listOf => per costruire una lista; mutableListOf => crea lista mutabile
//String, Int, Long ...
//void non esiste, si chiama Unit ed è implicito. Unit è un oggetto, e ce n'è uno solo.
//Se lo assegni a una variabile non si lamente, è la morte nera
//Esiste il tipo Any, da cui ereditano tutti gli altri (tipo object in C#)
//Esiste il tipo Never che eredita da tutti i tipi, una variabile Never può essere assegnata
//a qualunque cosa.
//Static non esiste,
open class TestMattia(val name: String, val age: Int) {
    init {
        //Body del costruttore
    }

    fun printName() {
        println(name)

        for (x in 0 until 3) {

        }

        val schifo = "Mattia"
        val jack = TestGiacomo(schifo, 30, MattiaC)
        jack.ciao {
            val x = if (3 > 2) true else false // If in linea
            val agg: String = when (age) {
                10 -> "Giovane"
                20 -> "Anzianotto"
                else -> "Morto"
            }

            agg
        }
    }

    companion object {
        fun ciao(): String {
            return "Ciao a tutti"
        }
    }
}

class TestGiacomo(nameGiacomo: String, age: Int, var mattiaC: MattiaC) :
    TestMattia(nameGiacomo, age) {
    fun ciao(mattia: () -> String) {
        println(mattia())
    }
}

//Classe statica, dopo di ché dentro è tutto statico (se uso object)
object MattiaC {
    fun ciaoATutti() {
        println(TestMattia.ciao())
    }
}