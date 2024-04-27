package com.calculos;
import com.models.Pelicula;
import com.models.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public void incluye(Titulo p){
        this.tiempoTotal += p.getDuracionEnMinutos();
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
