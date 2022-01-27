package desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	LocalDate data;

	public Mentoria(String titulo, String descricao) {
		this.setTitulo(titulo);
		this.setDescricao(descricao);
	}
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	@Override
	public String toString() {
		return "Mentoria [data=" + data + ", getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode();
	}
}
