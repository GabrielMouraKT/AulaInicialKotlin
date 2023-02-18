fun aula01() {


    println("Digite seu nome:")
    var nome: String = readln()
    println("Seja bem vindo $nome")//.uppercase()} Deixar todas as letras maiusculas.$nomedavariavel Concatena o texto
    //mais a variavel.
    println("Digite sua idade:")
    val idade: Int = readln().toInt()  // Sempre que precisar aparecer uma string tem que fazer a conversao no caso Int.
    println("Idade $idade")

    //val  variaveis imutaveis.

    //  *Exemplos de Variaveis imutaveis
    //  *Data de nascimento
    //  *CPF
    println("Digite um numero: ")
    var nula : Int? = readln().toIntOrNull() ?:30 //Elvis operator ?:valor definido ( se o valor for nulo ele seta o valor escolhido no elvis operator.
    println(nula)

    // ? no tipo de Variavel quer dizer que pode aceitar nulo.
    // Colocar o ? na hora de tipar a variavel permite que seja nula a variavel.toIntOrNull() tenta transformar em inteiro
    // se nao coloca nulo.
    // ?: "Elvis operator" Seta um valor padrão na variavel caso nao consiga fazer a conversão.


    //sintaxe sempre inicia com //fun nomedaclasse(){}.
    //(fun) palavra reservada para criar funcoes.

    //  var nome: String = "Gabriel"
    //variavel mutavel, pode ser atribuido outro valor.
    //val cpf: String = "000.000.000-00"
    //variavel imutavel, nao pode ser atribuido outro valor.
    //  println()
    //printa algo na tela.
//}
}
