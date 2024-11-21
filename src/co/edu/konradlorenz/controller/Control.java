package co.edu.konradlorenz.controller;

import java.util.ArrayList;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.*;

public class Control {

	protected Funcion objFuncion = new Funcion();
	
	protected ArrayList<Usuario> clientes = new ArrayList<>();
	
	public Usuario usuarioSeleccionado;

	public void run() {
		
		try {
		
			datosDePrueba();
			
			//Frames
			vntMenuPrincipal ventanaPrincipal = new vntMenuPrincipal();
			//vtnRegistrar registrar = new vtnRegistrar();
			
			//vtnInicioSesion inicioSesion = new vtnInicioSesion();
			ventanaPrincipal.setVisible(true);
		} catch (Exception e) {
	        System.err.println("Error al iniciar la aplicación: " + e.getMessage());   
	        e.printStackTrace();
	    }
	}
	
	//Metodo para validar el inicio de sesion
	public boolean validarCredenciales(String correo, String contraseña, TipoMembresia membresia) {
		try {
	        usuarioSeleccionado = null;

	        // Verificar si la lista de clientes es válida
	        if (clientes == null || clientes.isEmpty()) {
	            System.err.println("La lista de clientes está vacía o no inicializada.");
	            return false;
	        }

	        for (int i = 0; i < clientes.size(); i++) {
	            Usuario usuario = clientes.get(i);
	            if (usuario.getCorreoElectronico().equals(correo)) {
	                usuarioSeleccionado = usuario;
	                break;
	            }
	        }

	        if (usuarioSeleccionado == null) {
	            System.err.println("Usuario no encontrado con el correo: " + correo);
	            return false;
	        }

	        return usuarioSeleccionado.getContrasena().equals(contraseña);

	    } catch (Exception e) {
	        System.err.println("[Control.validarCredenciales] Error al validar credenciales: " + e.getMessage());
	        e.printStackTrace();
	        return false;
	    }
	}//*//Cierre validarCredenciales
	
	// Metodo para usuarios ya guardados en el programa
	public void datosDePrueba() {

		try {
				// Variables globales
				String nombreUsuario;
				String correoElectronico;
				String contraseña;
				long celular;
				TipoMembresia tipoMembresia;
		
				// Ejemplo 1
				nombreUsuario = "Darly Diaz";
				correoElectronico = "darlydiaz@gmail.com";
				contraseña = "louis2024";
				celular = 339295373;
				tipoMembresia = TipoMembresia.GOLD;
				nuevoCliente(nombreUsuario, correoElectronico, contraseña, celular, tipoMembresia);
		
				// Ejemplo 2
				nombreUsuario = "Zoe Henao";
				correoElectronico = "henaozoe@gmail.com";
				contraseña = "santiago2023";
				celular = 334353562;
				tipoMembresia = TipoMembresia.PRO;
				nuevoCliente(nombreUsuario, correoElectronico, contraseña, celular, tipoMembresia);
		
				// Ejemplo 3
				nombreUsuario = "Camilo Prieto";
				correoElectronico = "prietocamilo21@gmail.com";
				contraseña = "gojosatoru";
				celular = 312466982;
				tipoMembresia = TipoMembresia.REGULAR;
				nuevoCliente(nombreUsuario, correoElectronico, contraseña, celular, tipoMembresia);
				
		 } catch (IllegalArgumentException e) {
		        System.err.println("Error al cargar datos de prueba: " + e.getMessage());
		 } catch (Exception e) {
		        System.err.println("[Control.datosDePrueba] Error desconocido: " + e.getMessage());
		        e.printStackTrace();
		 }

	}// Cierre datos Prueba
	
	//Metodo para crear y agregar usuarios al sistema
	public void nuevoCliente(String nombreUsuario, String correoElectronico, String contraseña, long celular, TipoMembresia membresia) {
	    try {
	        // Validación de campos
	        if (nombreUsuario == null || nombreUsuario.isEmpty()) {
	            throw new IllegalArgumentException("El nombre del usuario no puede estar vacío.");
	        }
	        if (correoElectronico == null || !correoElectronico.contains("@")) {
	            throw new IllegalArgumentException("El correo electrónico es inválido.");
	        }
	        if (contraseña == null || contraseña.length() < 6) {
	            throw new IllegalArgumentException("La contraseña debe tener al menos 6 caracteres.");
	        }
	        if (celular <= 0) {
	            throw new IllegalArgumentException("El número de celular es inválido.");
	        }

	        // Validación del tipo de membresía y creación del cliente
	        if (TipoMembresia.GOLD.equals(membresia)) {
	            clientes.add(new ClienteGold(nombreUsuario, correoElectronico, contraseña, celular, membresia));
	        } else if (TipoMembresia.PRO.equals(membresia)) {
	            clientes.add(new ClientePro(nombreUsuario, correoElectronico, contraseña, celular, membresia));
	        } else if (TipoMembresia.REGULAR.equals(membresia)) {
	            clientes.add(new ClienteRegular(nombreUsuario, correoElectronico, contraseña, celular, membresia));
	        } else {
	            throw new IllegalArgumentException("Tipo de membresía no reconocido.");
	        }

	    } catch (IllegalArgumentException e) {
	        System.err.println("[Control.nuevoCliente] Error al registrar un nuevo cliente: " + e.getMessage());
	        e.printStackTrace();
	    } catch (Exception e) {
	        System.err.println("[Control.nuevoCliente] Error desconocido: " + e.getMessage());
	        e.printStackTrace();
	    }
	}//Cierre nuevoCliente
}//Cierre Control
