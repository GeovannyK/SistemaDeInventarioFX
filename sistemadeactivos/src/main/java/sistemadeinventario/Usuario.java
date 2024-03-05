package sistemadeinventario;

public class Usuario {
    private String Username;
    private String Password;
    private String Nombre;
    private String Rol;
    
    //Constructor
    public Usuario(String Username, String Password, String Nombre, String Rol){
        this.Username = Username;
        this.Password = Password;
        this.Nombre = Nombre;
        this.Rol = Rol;
    }

    //Getters and Setters
    public String getUsername(){
        return Username;
    }
    public void setUsername(String username){
        this.Username = Username;
    }

    public String getPassword(){
        return Password;
    }
    
    public void setPassword(){
        this.Password = Password;
    }

    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(){
        this.Nombre = Nombre;
    }

    public String getRol(){
        return Rol;
    }
    
    public void setRol(){
        this.Rol = Rol;
    }


}
