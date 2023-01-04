package interfaces;


import com.company.Coche;

/* Una INTERFACE es un mecanismo de abstracción para desacoplar el código y hacerlo mas flexible y mantenible
*  Define métodos para trabajar con una Clase. En este caso, con la clase Coche
*  Estos métodos NO PUEDEN tener {cuerpo}
* public Clase nombreMetodo(parametro);
*
* Para implementarlo, debo usar una ClaseImplement (Impl
* */
public interface CocheService {

//Declara métodos que va a implementar una Clase. Indica que es lo que hay que hacer, y una Clase define como lo va a hacer

   public Coche crearCocheDemo();

   public void destruirCoche(Coche coche); /*Al crear un nuevo método, obligamos a las clases a que lo implementen*/


}
