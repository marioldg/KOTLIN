package almacenBebidas

class Almacen {
    // Matriz de 5x5 para almacenar las bebidas, inicializada con null
    val estanteria: Array<Array<Bebida?>> = Array(5) { Array(5) { null } }

    fun agregarBebida(bebida: Bebida) {
        // Comprobar si ya existe una bebida con el mismo ID
        for (i in estanteria.indices) {
            for (j in estanteria[i].indices) {
                if (estanteria[i][j]?.id == bebida.id) {
                    println("Error: El ID de la bebida ya está en el almacén.")
                    return
                }
            }
        }
        // Buscar espacio vacío en la estantería
        for (i in estanteria.indices) {
            for (j in estanteria[i].indices) {
                if (estanteria[i][j] == null) {
                    estanteria[i][j] = bebida
                    println("Bebida agregada en la posición [$i][$j].")
                    return
                }
            }
        }

        println("Error: No hay espacio disponible en el almacén.")
    }

    // Eliminar bebida por ID
    fun eliminarBebida(id: Int) {
        for (i in estanteria.indices) {
            for (j in estanteria[i].indices) {
                if (estanteria[i][j]?.id == id) {
                    estanteria[i][j] = null
                    println("Bebida con ID $id eliminada.")
                    return
                }
            }
        }
        println("Error: No se encontró la bebida con ID $id.")
    }

    // Mostrar todas las bebidas
    fun mostrarBebidas() {
        for (i in estanteria.indices) {
            for (j in estanteria[i].indices) {
                val bebida = estanteria[i][j]
                if (bebida != null) {
                    when (bebida) {
                        is BebidaAzucarada -> {
                            println("Posición [$i][$j]: Bebida Azucarada - ID: ${bebida.id}, Marca: ${bebida.marca}, Precio: ${bebida.precioConDescuento}, Azúcar: ${bebida.porcentajeAzucar}%")
                        }

                        is AguaMineral -> {
                            println("Posición [$i][$j]: Agua Mineral - ID: ${bebida.id}, Marca: ${bebida.marca}, Precio: ${bebida.precio}, Origen: ${bebida.origen}")
                        }

                        else -> {
                            println("Posición [$i][$j]: Bebida desconocida.")
                        }
                    }
                }
            }
        }
    }

    // Calcular el precio total de todas las bebidas
    fun calcularPrecio(): Double {
        var total = 0.0
        for (i in estanteria.indices) {
            for (j in estanteria[i].indices) {
                val bebida = estanteria[i][j]
                if (bebida != null) {
                    total += if (bebida is BebidaAzucarada) bebida.precioConDescuento else bebida.precio
                }
            }
        }
        return total
    }

    // Calcular el precio total de una marca específica
    fun calcularPrecioMarca(marca: String): Double {
        var total = 0.0
        for (i in estanteria.indices) {
            for (j in estanteria[i].indices) {
                val bebida = estanteria[i][j]
                if (bebida != null && bebida.marca == marca) {
                    total += if (bebida is BebidaAzucarada) bebida.precioConDescuento else bebida.precio
                }
            }
        }
        return total
    }

    // Calcular el precio total de una columna específica
    fun calcularPrecioColumna(columna: Int): Double {
        var total = 0.0
        if (columna in 0..4) {
            for (i in estanteria.indices) {
                val bebida = estanteria[i][columna]
                if (bebida != null) {
                    total += if (bebida is BebidaAzucarada) bebida.precioConDescuento else bebida.precio
                }
            }
        } else {
            println("Error: La columna $columna no existe.")
        }
        return total
    }
}


