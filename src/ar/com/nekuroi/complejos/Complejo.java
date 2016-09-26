package ar.com.nekuroi.complejos;

public class Complejo {
	
	//Attribute
	private Double real;
	private Double imaginario;
	
	
	//Construct
	public Complejo(){
		setReal(0.0);
		setImaginario(0.0);
	}
	
	public Complejo(Double escalar, Double imaginario){
		setReal(escalar);
		setImaginario(imaginario);
	}
	
	public Complejo(Object obj){
		Complejo MiObjecto = ((Complejo)obj);
		setReal(MiObjecto.getReal());
		setImaginario(MiObjecto.getImaginario());
	}

	
	//Methods - GET SET
	public Double getReal() {
		return real;
	}
	
	public Double getImaginario() {
		return imaginario;
	}
	
	private void setImaginario(Double imaginario) {
		this.imaginario = imaginario;
	}

	private void setReal(Double escalar) {
		this.real = escalar;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imaginario == null) ? 0 : imaginario.hashCode());
		result = prime * result + ((real == null) ? 0 : real.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (imaginario == null) {
			if (other.imaginario != null)
				return false;
		} else if (!imaginario.equals(other.imaginario))
			return false;
		if (real == null) {
			if (other.real != null)
				return false;
		} else if (!real.equals(other.real))
			return false;
		return true;
	}

	public Object suma(Double escalar){
		Complejo SumaComplejo = new Complejo(this.getReal() + escalar,this.getImaginario());
		return SumaComplejo;
	}
	
	public Object suma(Object obj){
		Complejo SumandoComplejo = ((Complejo) obj);
		Complejo SumaComplejo = new Complejo(this.getReal() + SumandoComplejo.getReal(),this.getImaginario() + SumandoComplejo.getImaginario());
		return SumaComplejo;
	}
}
