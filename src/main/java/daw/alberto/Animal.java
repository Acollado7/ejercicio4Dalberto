package daw.alberto;

import java.time.LocalDate;

public class Animal {

    private LocalDate fechaNacimiento;
    private String nombre;
    private String tipo;
    private double peso;
    private String estado;

    public Animal() {

    }

    public Animal(LocalDate fechaNacimiento, String nombre, String tipo, double peso, String estado) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.estado = estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "fechaNacimiento=" + fechaNacimiento +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", peso=" + peso +
                ", estado='" + estado + '\'' +
                '}';
    }


    public void alimentar(double cantidadGramos) {
        this.peso += cantidadGramos;

    }

    public void dormir() {
        this.estado = "Dormido";
    }

    public void despertar() {
        this.estado = "Despierto";
    }

    public void descansar() {
        this.estado = "Descansando";
    }

    public void jugar() {

    }

    public void jugar(int cantidadMinutos) {
        if (cantidadMinutos > 180) {
            throw new IllegalArgumentException("No puedes jugar más de 180 minutos");
        }
        if ( cantidadMinutos >= 30) {
            this.peso -= cantidadMinutos / 30 * 20;
        } else {
            this.peso -= 10;
        }
        this.estado = "Jugando";
    }


    public static Animal clonar(Animal pet) {
        if (pet == null) {
            throw new NullPointerException("No puedes clonar un animal nulo");
        }
        return new Animal(pet.getFechaNacimiento(), pet.getNombre(), pet.getTipo(), pet.getPeso(), pet.getEstado());
    }

}
