package interfaces;

import com.company.Coche;
import com.company.CocheElectrico;
import interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando un coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {

    }
}
