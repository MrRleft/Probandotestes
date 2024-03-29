package Money;

public class Divisa {
	
	private String nombre;
	private Double rate;
	
	/**
	 * 
	 * El valor de rate corresponde al valor de la divisa en una divisa universal.
	 * @param nombre nombre de la Divisa
	 * @param rate cambio de la divisa
	 */
	public Divisa (String nombre, Double rate) {
		this.nombre = nombre;
		this.rate = rate;
	}

	/** Convierte una cantidad al importe correspondiente en la divisa universal

	 * @param cantidad Cantidad en la divisa actual.
	 * @return valor en la divisa universal
	 */
	public int valorUniversal(int cantidad) {
		return (int) (this.rate * cantidad);
		
	}

	/** Nombre de la divisa
	 * @return nombre de la divisa
	 */
	public String getName() {
		return this.nombre;
	}
	
	/** Rate de la divisa
	 * 
	 * @return rate de la divisa
	 */
	public Double getRate() {
		return this.rate;
	}
	
	/** Actualiza rate de la divisa
	 * 
	 * @param rate  Nuevo rate de la divisa
	 */
	public void setRate(Double rate) {
		this.rate = rate;
	}
	
	/** Convierte una cantidad de una divisa a el importe correspondiente en la divisa actual
	 * 
	 * @param cantidad importe a convertir
	 * @param othercurrency divisa origen
	*/
	public int valorEnEstaDivisa(int cantidad, Divisa otraDivisa) {
		return (int) (cantidad*otraDivisa.rate / this.rate); 
					
	}
}
