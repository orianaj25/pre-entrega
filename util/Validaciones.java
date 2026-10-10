package validaciones;

public class Validaciones {

    public static void validarNombre (String nombre){
        if (nombre == null || nombre.trim().isEmpty()){
            throw new InvalidDataException("El nombre es obligatorio");
        }
    }
    public static void validarApellido (String apellido){
        if (apellido == null || apellido.trim().isEmpty()){
            throw new InvalidDataException("El apellido es obligatorio");
        }
    }
    public static void validarEmail (String email){
       for  (int i = 0; i < email.length(); i++){
           if (email.charAt(i) == '@'&& mail.charAt(i + 1) == '.'){
               throw new EmailInvalido("El Email es invalido");
           }
       }
    }

}