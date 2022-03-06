import kotlin.random.Random

fun main(args: Array<String>) {
    exercicio1()
}

fun exercicio1(): Unit {
    println("Digite o tamanho do primeiro lado do triângulo:")
    val lado1 = readLine()!!.toFloat()
    println("Digite o tamanho do segundo lado do triângulo:")
    val lado2 = readLine()!!.toFloat()
    println("Digite o tamanho do terceiro lado do triângulo:")
    val lado3 = readLine()!!.toFloat()
    if (lado1 == lado2 && lado2 == lado3) {
        println("O tamanho dos lados é respectivamente: ($lado1), ($lado2) e ($lado3), então, o triângulo é equilátero, ou seja, todos os lados são iguais!!")
    } else if
                   (lado1 == lado3 && lado2 != lado1)
        println("O tamanho dos lados é respectivamente:($lado1), ($lado2) e ($lado3), então, o triângulo é isósceles, ou seja, um dos lados é desigual aos outros!")
    else {
        (lado1 != lado2 || lado2 != lado3)
        println("O tamanho dos lados é respectivamente:($lado1), ($lado2) e ($lado3), então, o triângulo é escaleno, ou seja, todos os lados são diferentes!")
    }

}


fun exercicio2(): Unit {
    println("Digite um ano que seja maior que 2004, e descubra se ele é ou não bissexto:")
    val anoEscolhido = readLine()!!.toFloat()
    for (numero in 0..3000 step 4) {
        println("O ano escolhido é bissexto")
    }
}

fun exercicio3(): Unit {
    println("Cada resposta positiva corresponde ao número 1. Some todas as respostas,digite o resultado e descubra se você é inocente,suspeito, cúmplice ou assassino.")
    println("Você telefonou para a vitima?")
    println("Você esteve no local do crime?")
    println("Você mora perto da vitima?")
    println("Você devia para a vitima?")
    println("Você já trabalhou com a vitima?")
    val questoes = readLine()!!.toInt()
    if (questoes <= 1) {
        println("Você não é inocente.")
    } else if (questoes == 2) {
        println("Você é suspeito.")
    } else if (questoes == 3 || questoes == 4) {
        println("Você é cúmplice!")
    } else if (questoes == 5) {
        println(" Você é o assassino!!")
    } else (questoes <= 1 || questoes >= 6)
    println("Resposta não aceita, número válido de 1 a 5.")
}

fun exercicio4(): Unit {
    println("Digite o total de litros :")
    val totalDelitros = readLine()!!.toFloat()
    println("Escolha o tipo de combustível:\nalcool -  Álcool\ngasolina- Gasolina")
    val tipoCombustivel = readLine()!!.toString()
    when (totalDelitros <= 20) {
        alcool -> println("total a pagar ${totalDelitros - totalDelitros * 0.3}")
        else(totalDeLitros >=20){ alcool ->
            println("total a pagar ${totalDelitros - totalDelitros * 0.5}")
        }
        when (totalDelitros <= 20) {
            gasolina -> println("total a pagar ${totalDelitros - totalDelitros * 0.4}")
        else(totalDeLitros >=20){ gasolina ->
                println("total a pagar ${totalDelitros - totalDelitros * 0.6}")
            }
        }
    }
}