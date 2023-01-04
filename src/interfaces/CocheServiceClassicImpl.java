package interfaces;


import com.company.Coche;
import com.company.CocheElectrico;
import interfaces.CocheService;

// public class ClaseServiceImplement implements ClaseService{}  y exige proporcionar el cuerpo a los métodos (implementación)
public class CocheServiceClassicImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando un Coche Clásico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {

    }
}
