/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.SNMPExceptions;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;




/**
 *
 * @author carlo
 */
public class GenerarReporte {
    
 public  void verProducto(LinkedList<Producto> productos) throws JRException, IOException {
    
     
     try { 
         File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/Producto.jasper"));
         byte[] bytes= JasperRunManager.runReportToPdf(jasper.getPath(), null,new JRBeanCollectionDataSource(productos, false));
         //JasperPrint jp = JasperFillManager.fillReport(jasper.getPath(), null , new JRBeanCollectionDataSource(productos));
         
         HttpServletResponse response = (HttpServletResponse)FacesContext.getCurrentInstance().getExternalContext().getResponse();
         //response.addHeader("Content-disposition","attachment; filename: Producto.pdf");
         response.setContentType("application/pdf");
         response.setContentLength(bytes.length);
         ServletOutputStream stream = response.getOutputStream();
         stream.write(bytes, 0, bytes.length);
         //JasperExportManager.exportReportToPdfStream(jp, stream);
         stream.flush();
         stream.close();
         FacesContext.getCurrentInstance().responseComplete();
     } catch (JRException ex) {
        throw  ex;
      } catch (IOException i) {
        throw  i;   
     }
     
     
     
     
 }
    
}
