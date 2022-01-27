package desafio;

public class Curso extends Conteudo{
	private int cargaHoraria;
	
	public Curso(String titulo, String descricao, int cargaHoraria){
		this.setTitulo(titulo);
		this.setDescricao(descricao);
		this.cargaHoraria = cargaHoraria;
	}
	

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}


	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", calcularXp()="
				+ calcularXp() + ", getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode();
	}
}
