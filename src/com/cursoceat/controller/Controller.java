package com.cursoceat.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	Scanner entrada = new Scanner(System.in);
	boolean programaActivo=true;
	
	do {
	System.out.println("¿Qué operación quiere hacer?");
	System.out.println("1- Alta alumno");
	System.out.println("2- Baja alumno");
	System.out.println("3- Modificar alumno");
	System.out.println("4- Consultar alumnos");
	System.out.println("5- Salir");
	
	int opcion = entrada.nextInt(); 

	if (opcion ==1) {
	System.out.println("Escriba el nombre");
	String nombre= new Scanner(System.in).nextLine();
	System.out.println("Escriba la edad");
	int edad= entrada.nextInt();
	
	Alumno alumnoNuevo = new Alumno();
	alumnoNuevo.setNombre(nombre);
	alumnoNuevo.setEdad(edad);
	alumnos.add(alumnoNuevo);
	
	}else if (opcion == 2) {
	System.out.println("Escriba el nombre del alumno que quiere eliminar");
	String nombre= new Scanner(System.in).nextLine();	
	Iterator<Alumno> it = alumnos.iterator();
		while(it.hasNext()) {
			Alumno a = it.next();
			if(a.getNombre().equals(nombre)) {
				it.remove();
			}
		}
		
	}else if (opcion == 3) {
	
	System.out.println("Escriba el nombre del alumno que quiere modificar");
	String nombre= new Scanner(System.in).nextLine();
	
	System.out.println("Escriba el nuevo nombre del alumno");
	String nombreNuevo= new Scanner(System.in).nextLine();
	
	System.out.println("Escriba la nueva edad del alumno");
	int nuevaEdad = entrada.nextInt();
	
	Iterator<Alumno> it = alumnos.iterator();
		while(it.hasNext()) {
			Alumno a = it.next();
			if(a.getNombre().equals(nombre)) {
			a.setNombre(nombreNuevo);
			a.setEdad(nuevaEdad);
				}
			}
		
	}else if (opcion == 4) {
		for(Alumno a : alumnos) {
			System.out.println("Nombre: " + a.getNombre()
			+ ", Edad: "+ a.getEdad());
		}
	
		
	}else if (opcion == 5) {
		programaActivo=false;
	}else {
		System.out.println("Opción no válida");
	}
	}
	while(programaActivo);
	
	
	
	
	}
}
