package Figuras;

import java.awt.*;
import java.util.Map;

/**
 *
 * Created by blackwidow on 6/10/16.
 * @author Xisco Cambil Reynes
 * Clase abstracte que servira de plantilla para todas la formas que se pretenden pintar.
 * se definen las variables usadas en todos los tipos de formas. Implementa la interfaz
 * PintarFormaGrafica para que cada forma este obligada a implementarla.
 */
public abstract class Forma implements PintarFormaGrafica,Cloneable {

    private Color color = Color.black;
    private Punto punto;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    /**
     *
     * @param g Lienzo grafico donde se va a pintar las figuras;
     *  Este metorodo se utilizara para pintar en el graphico la forma que se neceste.
     */
    public void pintarForma(Graphics g){

    }

    public Forma clone() throws CloneNotSupportedException {
        return (Forma) super.clone();
    }

    public void fillAttributes(Map<String,Object> map){
        setColor((Color) map.get("color"));
        setPunto(new Punto((Integer) map.get("x"),(Integer) map.get("y")));
    }

    public void pintarClase(){
        System.out.println("name class: " + getClass().getName());
    }


}



