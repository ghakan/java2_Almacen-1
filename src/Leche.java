public class Leche {

	//propiedades
	private String tipo;
	private String procedencia;
	private Double eurosLitro;
	private Distribuidor distribuidor;

	//métodos getter y setter
	public void setTipo (String tipo) {

		this.tipo = tipo;
	}

	public String getTipo () {

		return tipo;
	}

	public void setProcedencia (String procedencia) {

		this.procedencia = procedencia;
	}

	public String getProcedencia () {

		return procedencia;
	}

	public void setEurosLitro (Double eurolitros) {

		this.eurosLitro = eurolitros;
	}

	public Double getEurosKilo () {

		return eurosLitro;
	}

	public void setDistribuidor (Distribuidor distribuidor) {

		this.distribuidor = distribuidor;
	}

	public Distribuidor getDistribuidor () {

		return distribuidor;
	}
}
