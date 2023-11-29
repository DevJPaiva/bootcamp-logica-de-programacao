fun main() {
    println()
    println("Classificador Nivél do Heró")
    println()

    var continuar: String

    do {
        println("Digite o nome do herói: ")
        val nome = readlnOrNull()

        println("Digite a XP do Herói: ")
        val xp = readlnOrNull()?.toIntOrNull()

        val nivel = when {
            xp!! <= 1000 -> "Ferro"
            xp <= 2000 -> "Bronze"
            xp <= 5000 -> "Prata"
            xp <= 7000 -> "Ouro"
            xp <= 8000 -> "Platina"
            xp <= 9000 -> "Ascendente"
            xp <= 10000 -> "Imortal"
            else -> "Radiante"
        }

        println("O herói $nome, tem $xp de experiência e esta no nível $nivel ")
        println()

        println("Classificar outro Herói ? digite 1 ou qualquer tecla para Sair")
        continuar = readlnOrNull()?.trim() ?: "0"
    } while (continuar == "1")
}
