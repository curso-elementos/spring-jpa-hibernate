package org.unitec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHibernateJpaApplication implements CommandLineRunner{
@Autowired DAODepartamento daodep;
@Autowired DAOEmpleado daoemp;
	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateJpaApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
      System.out.println("Antes de hacer el insert en la entidad Departamento");
      
      //Paso 1. CReamos un objeto de tipo Departamento
     // Departamento depa=new Departamento("VENTAS");
      //Verificar que tengas la anotacion d inyeccion de dependencias en esta clase
      //Guadar el departamento
    // daodep.save(depa);
    //Tenemos que buscar el departamanto al que vamos a asignar al nuevo
    //Empleaado
   // Departamento dep=daodep.findOne(1L);
   // Empleado x=new Empleado(dep, "Juan");
    //daoemp.save(x);
    //Pregunta del pizarron
    /*
    Hacer un query donde se musestre el usuario cuyo id es 2 y que
    se muestre su nombre y el nombre del departamento donde esta asignado
 */ 
    //  Empleado emp= daoemp.findOne(2L);
    
    
   //System.out.println("CUERI: id:"+emp.getId()+" empleado:"+emp.getNombre()+" depto:"+emp.getDepa().getNombre());
      
    }
}
