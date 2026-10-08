package com.example.console

class MinhaClasse {
}

fun main(){
 /*   println("Hello Word!! Bem vindo!")

    val nome = "  Vinicius  "
    val pontos = 21
    println("Jogador: $nome")
    println("Pontos: $pontos")
    println("Dobro: ${pontos * 2}")
    println("Letras no nome: ${nome.length}")
    println("Letras Maiusculas: ${nome.uppercase()}")
    println("Letras Minusculas: ${nome.lowercase()}")
    println("Retira os espaços: ${nome.trim()}")
    println("Letras no nome: ${nome.length}")
    println("Letras no nome: ${nome.trim().length}")



    var pontos = 10
    pontos += 5 // igual a: pontos = pontos + 5 (agora vale 15)
    pontos -= 3 // agora vale 12
    pontos++ // soma 1 (agora vale 13)
    println("Pontos: $pontos"
            */

    print("Qual é o seu nome? ")
    val nome = readln()
    print("Quantos anos você tem? ")
    val idade = readln().toInt()
    println("$nome terá ${idade + 1} anos no ano que vem.")

}