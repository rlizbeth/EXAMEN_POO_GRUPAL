/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.Administrador;
import ec.edu.intsuperior.vista.Login;
import ec.edu.intsuperior.vista.PFrDocente;
import ec.edu.intsuperior.vista.PFrEstudiante;
import ec.edu.intsuperior.vista.PFrIngresarDocente;

/**
 *
 * @author jorge
 */
public class Controlador {
    Administrador administrador= new Administrador(this);
    Login login=new Login(this);
    PFrEstudiante frEstudiante= new PFrEstudiante(this);
    PFrDocente frDocente= new PFrDocente(this);
    PFrIngresarDocente frIngresarDocente= new PFrIngresarDocente(this);
    
    public void showPFrIngresarDocecnte(){
        frIngresarDocente.setSize(1000, 1000);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(frIngresarDocente);
        frIngresarDocente.setVisible(true);
        administrador.escritorio.revalidate();
        frIngresarDocente.repaint();
    }
    
    public void showPFrEstudiante(){
        frEstudiante.setSize(1000, 1000);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(frEstudiante);
        frEstudiante.setVisible(true);
        administrador.escritorio.revalidate();
        frEstudiante.repaint();
    }
    
    public void showPFrDocente(){
        frDocente.setSize(1000, 1000);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(frDocente);
        frDocente.setVisible(true);
        administrador.escritorio.revalidate();
        frDocente.repaint();
    }
    
    
    
    public void showLogin(){
        login.setVisible(true);
    }
    public void showAdministrador(){
        administrador.setVisible(true);
    }
}

