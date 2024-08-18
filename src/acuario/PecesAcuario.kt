package acuario

abstract class Pez {
    abstract val color: String
}

class Tiburon : Pez(), AccionPez {
    override val color = "gris"
    override fun comer() {
        println("El tiburón está cazando y comiendo peces")
    }
}

class PezPayaso : Pez(), AccionPez {
    override val color = "dorado"
    override fun comer() {
        println("El pez payaso está comiendo algas")
    }
}

interface AccionPez {
    fun comer()
}
