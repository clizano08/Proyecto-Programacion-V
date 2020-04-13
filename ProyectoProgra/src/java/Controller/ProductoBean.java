package Controller;


import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


@Named(value = "producto")
@SessionScoped
public class ProductoBean implements Serializable {
   
    public ProductoBean() {
    }
 
}
