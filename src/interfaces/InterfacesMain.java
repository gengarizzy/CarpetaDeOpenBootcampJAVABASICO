package interfaces;

import com.company.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        //Utilizacion de las interfaces

// ClaseService serviceNombre = new ClaseServiceImpl();

        //Podemos crear instancias de ese tipo a partir de las clases implementadas


        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2 = new CocheServiceSportImpl();


        Coche coche1 = service1.crearCocheDemo();
        Coche coche2 = service2.crearCocheDemo();

    }
}
