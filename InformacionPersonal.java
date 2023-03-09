
package informacionpersonal;
// Código ejercutado por YORNE SANTOS
// Del grupo SC 
public class InformacionPersonal {
//Práctica #1 -- Manipular código para saber el uso de cadenas en Java
    String nombre = "Yorne Alejandrina",
           apellidoPaterno = "Santos",
           apellidoMaterno = "Bobadilla";
    int edad = 18;
    String fecha_nacimiento = "10/01/2003",
    		hobbies = "Leer",
    		numeroDeCuenta = "2271116",
    		semestre = "2° Semestre",
    		materia = "Programación",
    		horario = "Martes y Jueves / 10:00-12:00 ";
    
    
    public void Informacion(){        
        System.out.println("Nombre : " + nombre +" "+ apellidOPaterno +" "+ apellidoMaterno );
        System.out.println("Edad : " + edad +" años ");
        System.out.println("Fecha de nacimiento : " + fecha_nacimiento);
        System.out.println("Pasatiempo : " + hobbies);
    }
    public void informacionUniversitaria(){
        System.out.println("Número de cuenta : " + numeroDeCuenta );
        System.out.println("Semestre : " + semestre );
        System.out.println("Materia : " + materia ); 
        System.out.println("Horario : " + horario );
    }
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
        InformacionPersonal infoUni= new InformacionPersonal();
        infoUni. informacionUniversitaria();
                
    }
    
}
