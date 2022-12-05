	import vehiculos.Auto;
	import vehiculos.Moto;
public class Garage {

			private String tipoV;
			private String nombreGarage;
			private double precioCambio; 
			private double cambioCubiertas;
			private double kMA;
			private double kMM;
			private int vMax;
			private int capacidad;
			private int ingAuto;
			private int ingMoto;
			private int vehiculos;
			private int cantidadDeClientes = 0;
			private int cantidadDeAutos = 0;
			private int cantidadDeMotos = 0;
			private int kMoto;
			private int kAuto;
			private Moto[] motos;
			private Auto[] autos;
	
			
			public Garage() {
			}

			public Garage(int vMax, int stock, double precioCambio) { 

			}


			public void nuevoClienteAuto(String n, String a, String tipoVe, String m, int cPuertas, int kilometraje,int cRuedas) { 

			}


			public void alertaVehiculos() {

			}
			
			public String getTipoV() {
				return tipoV;
			}

			public void setTipoV(String tipoV) {
				this.tipoV = tipoV;
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


			public int getvMax() {
				return vMax;
			}

			public void setvMax(int vMax) {
				this.vMax = vMax;
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

			public int getkMoto() {
				return kMoto;
			}

			public void setkMoto(int kMoto) {
				this.kMoto = kMoto;
			}

			public int getkAuto() {
				return kAuto;
			}

			public void setkAuto(int kAuto) {
				this.kAuto = kAuto;
			}

			public Moto[] getMotos() {
				return motos;
			}

			public void setMotos(Moto[] motos) {
				this.motos = motos;
			}

			public Auto[] getAutos() {
				return autos;
			}

			public void setAutos(Auto[] autos) {
				this.autos = autos;
			}

			public void setNombreGarage(String nombreGarage) {
				this.nombreGarage = nombreGarage;
			}

			public String getNombreGarage() {
				System.out.println("Bienvenido a "+nombreGarage+", ingrese su Nombre, Apellido y su vehiculo. Muchas Gracias");
				return nombreGarage;
			}



		}

