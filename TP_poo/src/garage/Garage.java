package garage;
	import vehiculos.Vehiculo;
	import persona.persona;
public class Garage {

			private String nombreGarage;
			private double precioCambio; 
			private double cambioCubiertas;
			private double kMA;
			private double kMM;
			private int capacidad;
			private int ingAuto;
			private int ingMoto;
			private int vehiculos;
			private int cantidadDeClientes = 0;
			private int cantidadDeAutos = 0;
			private int cantidadDeMotos = 0;
			private Vehiculo[] Vehiculo;
			private persona[]persona;
	
			
			public Garage() {
			}

			public Garage(int vMax, int stock, double precioCambio) { 

			}


			public void nuevoClienteAuto(String n, String a, String tipoVe, String m, int cPuertas, int kilometraje,int cRuedas) { 

			}


			public void alertaVehiculos() {

			}


			public double getPrecioCambio() {
				return precioCambio;
			}

			public void setPrecioCambio(double precioCambio) {
				this.precioCambio = precioCambio;
			}

			public double getCambioCubiertas() {
				return cambioCubiertas;
			}

			public void setCambioCubiertas(double cambioCubiertas) {
				this.cambioCubiertas = cambioCubiertas;
			}

			public double getkMA() {
				return kMA;
			}

			public void setkMA(double kMA) {
				this.kMA = kMA;
			}

			public double getkMM() {
				return kMM;
			}

			public void setkMM(double kMM) {
				this.kMM = kMM;
			}


			public int getCapacidad() {
				return capacidad;
			}

			public void setCapacidad(int capacidad) {
				this.capacidad = capacidad;
			}

			public int getIngAuto() {
				return ingAuto;
			}

			public void setIngAuto(int ingAuto) {
				this.ingAuto = ingAuto;
			}

			public int getIngMoto() {
				return ingMoto;
			}

			public void setIngMoto(int ingMoto) {
				this.ingMoto = ingMoto;
			}

			public int getVehiculos() {
				return vehiculos;
			}

			public void setVehiculos(int vehiculos) {
				this.vehiculos = vehiculos;
			}

			public int getCantidadDeClientes() {
				return cantidadDeClientes;
			}

			public void setCantidadDeClientes(int cantidadDeClientes) {
				this.cantidadDeClientes = cantidadDeClientes;
			}

			public int getCantidadDeAutos() {
				return cantidadDeAutos;
			}

			public void setCantidadDeAutos(int cantidadDeAutos) {
				this.cantidadDeAutos = cantidadDeAutos;
			}

			public int getCantidadDeMotos() {
				return cantidadDeMotos;
			}

			public void setCantidadDeMotos(int cantidadDeMotos) {
				this.cantidadDeMotos = cantidadDeMotos;
			}

			public void setNombreGarage(String nombreGarage) {
				this.nombreGarage = nombreGarage;
			}

			public String getNombreGarage() {
				System.out.println("Bienvenido a "+nombreGarage+", ingrese su Nombre, Apellido y su vehiculo. Muchas Gracias");
				return nombreGarage;
			}



		}

