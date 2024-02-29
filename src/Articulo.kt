open class Articulo(val nombre:String, var precio: Double ) {
    companion object{
        private var contador = 0
    }
    private val id = obtenerId()

    private fun obtenerId(): Int{
        contador++
        return contador
    }

    /**
     * Recibe como parametro un descuento y se lo aplica al precio indicado
     *
     * @param descuento  Decuento a hacer
     * */
    open fun promocionNavidad(descuento:Int){
        precio = precio * descuento/100
    }

    override fun toString(): String {
        return "id: $id, $nombre -> %.2f".format(precio)
    }
}