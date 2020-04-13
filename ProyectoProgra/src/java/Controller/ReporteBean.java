/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.SNMPExceptions;
import Model.Producto;
import Model.ProductoDB;
import Model.GenerarReporte;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.LinkedList;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author carlo
 */
@Named(value = "reporteBean")
@SessionScoped
public class ReporteBean implements Serializable {

    /**
     * Creates a new instance of ReporteBean
     */
    public ReporteBean() {
    }
    public void verProducto() throws SNMPExceptions, SQLException, JRException, IOException{
        LinkedList<Producto> productos= new  ProductoDB().SeleccionarTodosProducto();
        
        new GenerarReporte().verProducto(productos);
        
    }
    
}
