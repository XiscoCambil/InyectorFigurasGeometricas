
import Figuras.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 8/11/16.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext injector = new ClassPathXmlApplicationContext("/Main/spring-config.xml");

        Circulo circulo = (Circulo) injector.getBean("circulo");
        circulo.pintarClase();

        Cuadrado cuadrado = (Cuadrado) injector.getBean("cuadrado");
        cuadrado.pintarClase();

        Linea linea = (Linea) injector.getBean("linea");
        linea.pintarClase();

        Poligono poligono = (Poligono) injector.getBean("poligono");
        poligono.pintarClase();

        Punto punto = (Punto) injector.getBean("punto");
        punto.pintarClase();

        Rectangulo rectangulo = (Rectangulo) injector.getBean("rectangulo");
        rectangulo.pintarClase();

        Texto texto = (Texto) injector.getBean("texto");
        texto.pintarClase();


    }
}
