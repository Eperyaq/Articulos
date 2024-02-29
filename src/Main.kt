fun main() {

    val coche = Articulo("coche", 25.00)
    coche.promocionNavidad(50)
    println(coche)

    val papa = Articulo("papa", 45.00)
    papa.promocionNavidad(50)
    println(papa)

    val pc1 = Ordenador("PC1", 1299.99, TIPOORDENADOR.GAMING)
    pc1.promocionNavidad(50)
    println(pc1)

    val pc2 = Ordenador("PC2", 399.99, TIPOORDENADOR.BASICO)
    pc2.promocionNavidad(50)
    println(pc2)

    val listaDeArticulos = listOf(coche, papa, pc1, pc2)
    println(listaDeArticulos)
}