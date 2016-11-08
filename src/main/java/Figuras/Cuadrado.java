package Figuras;

import java.awt.*;
import java.util.Map;

/**
 * Created by blackwidow on 6/10/16.
 */

/**
 * Created by blackwidow on 6/10/16.
 * @author Xisco Cambil Reynes
 * Clase Cuadrado la cual hereda de la clase area. Esta clase es utilizada para obtener los datos
 * y pintar la forma en el lienzo. La clase Cuadrado implementa las dos interfazes PintarFormaGrafico y Relleno.
 */
public class Cuadrado extends Area {

    public Cuadrado(){};

    public Cuadrado(Punto punto, int radio, Color color, boolean respuesta){
        setColor(color);
        setWidth(radio);
        setHeight(radio);
        setRellenar(respuesta);
        setPunto(punto);
    }

    @Override
    public void fillAttributes(Map<String,Object> map) {
        super.fillAttributes(map);
        setWidth((Integer) map.get("radio"));
        setHeight((Integer) map.get("radio"));
        setRellenar((Boolean) map.get("rellenar"));
    }

    /**
     * @param g
     * metodo utilizado para pintar la forma grafica en el lienzo.
     */
    @Override
    public void pintarForma(Graphics g) {
        Rellenar(isRellenar(),g);
    }

    /**
     *
     * @param hayRelleno
     * @param g
     * Este metodo heredado de la interfaz Rellenar tiene un condicional para saber si el usuario
     * a decidio si la figura se debe de pintar por dentro o solo su contorno. Utilizacion de los metodos
     * fillRect para pintar relleno y drawRect para pintar el contorno.
     */

    public void Rellenar(boolean hayRelleno,Graphics g) {
        g.setColor(getColor());
        if(isRellenar()){
            g.fillRect(getPunto().getX(), getPunto().getY(), getWidth(), getHeight());
        }else {
            g.drawRect(getPunto().getX(), getPunto().getY(), getWidth(), getHeight());
        }
    }
}
