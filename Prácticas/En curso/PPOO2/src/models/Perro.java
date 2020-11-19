package models;

import java.util.Date;

public class Perro extends Animal {
	
	public enum RazaPerro {PASTOR_ALEMAN("Pastor alem�n"), HUSKY("Husky"), FOXT("FoxTerrier"), DALMATA("Dalmata"), SANB("San Bernardo");
		private String raza;
	
		RazaPerro(String raza) {
			this.raza = raza;
		}
		
		public String dameRaza() {
			return raza;
		}
	}
	
	private RazaPerro raza;
	private String chip;
	
	public Perro(String nombre, Date fechaNacimiento, double peso, RazaPerro raza, String chip) {
		super(nombre, fechaNacimiento, peso);
		this.raza = raza;
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Ficha Perro\n"
			 + "Nombre: " + this.nombre
			 + "\nRaza: " + this.raza.dameRaza()
			 + "\nFecha de nacimiento: " + this.fechaNacimiento
			 + "\nPeso: " + this.peso + "Kg"
			 + "\nMicrochip: " + this.chip
			 + "\nComentarios: " + this.comentarios;
	}
	
}
