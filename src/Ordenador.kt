class Ordenador(nombre: String, precio: Double, val tipoOrdenador: TIPOORDENADOR = TIPOORDENADOR.BASICO) : Articulo(nombre, precio) {
    override fun promocionNavidad(descuento: Int) {
        if (precio > 500.00){
            return super.promocionNavidad(descuento)
        }
    }


}