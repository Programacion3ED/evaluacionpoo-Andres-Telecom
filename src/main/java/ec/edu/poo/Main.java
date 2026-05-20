package ec.edu.poo;

public class Main {
    public static void main(String[] args) {
        GestorActivos gestor = new GestorActivos();

        // Crear activos
        Servidor servidor = new Servidor("SRV001", "Servidor Web", 5, true, "Linux");
        Firewall firewall = new Firewall("FW001", "Firewall", 9, false, 150);

        // Registrar
        gestor.registrarActivo(servidor);
        gestor.registrarActivo(firewall);

        // Mostrar resultados
        System.out.println("Activos registrados: " + gestor.obtenerCantidadActivos());
        System.out.println("Activos críticos: " + gestor.contarActivosCriticos());
        System.out.println("Promedio riesgo: " + gestor.calcularPromedioRiesgo());
    }
}