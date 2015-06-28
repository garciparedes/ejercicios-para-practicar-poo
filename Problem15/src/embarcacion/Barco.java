package embarcacion;

import java.util.Calendar;

public class Barco {
	
	private String matricula;
	private int eslora;
	private int fabricacionYear;
	
	public Barco(String matricula, int eslora, int fabricacionYear){
		assert(matricula.length()>0);
		this.matricula = matricula;
		
		assert(eslora > 0);
		this.eslora = eslora;
		
		assert(fabricacionYear <= Calendar.getInstance().get(Calendar.YEAR));
		this.fabricacionYear = fabricacionYear;
	}
	
	public void setMatricula(String matricula){
		assert(matricula.length()>0);
		this.matricula = matricula;
	}
	
	public void setEslora(int eslora){
		assert(eslora > 0);
		this.eslora = eslora;
	}
	
	public void setFabricacionYear(int fabricacionYear){
		assert(fabricacionYear <= Calendar.getInstance().get(Calendar.YEAR));
		this.fabricacionYear = fabricacionYear;
	}
	
	public String getMatricula(){
		return matricula;
	}
	
	public int getEslora(){
		return eslora;
	}
	
	public int getFabricacionYear(){
		return fabricacionYear;
	}

	public double getPrecioAlquiler() {
		// TODO Auto-generated method stub
		return 0;
	}

}
