package desafio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate datafinal = dataInicial.plusDays(45);
	private Set<Dev> desvInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	public Bootcamp(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Set<Dev> getDesvInscritos() {
		return desvInscritos;
	}
	
	public void setDesvInscritos(Set<Dev> desvInscritos) {
		this.desvInscritos = desvInscritos;
	}
	
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	
	public LocalDate getDatafinal() {
		return datafinal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataInicial, datafinal, descricao, desvInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataInicial, other.dataInicial)
				&& Objects.equals(datafinal, other.datafinal) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(desvInscritos, other.desvInscritos) && Objects.equals(nome, other.nome);
	}
	
}
