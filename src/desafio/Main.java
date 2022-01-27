package desafio;

public class Main {
	public static void main(String[] args) {
		Curso curso = new Curso("Java", "Tudo sobre Java", 50);
		Curso curso2 = new Curso("JavaScript", "Aprenda a Linguagem mais usada do Mercado", 80);
		
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Bootcamp para iniciantes em java");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso2);
		
		Dev wesley = new Dev("Wesley");
		Dev joao = new Dev("Jo�o");
		
		wesley.inscreverBootcamp(bootcamp);
		wesley.progredir();
		wesley.progredir();
		
		joao.inscreverBootcamp(bootcamp);
		joao.progredir();
		
		System.out.println("Conte�dos Concluidos: " + wesley.getConteudosConcluidos());
		System.out.println("Conte�dos Inscritos: " + wesley.getConteudosInscritos());
		System.out.println("XP: " + wesley.calcularTotalXp());
		
		System.out.println("********************************************************");
		System.out.println("Conte�dos Inscritos: " + joao.getConteudosInscritos());
		System.out.println("Conte�dos Concluidos: " + joao.getConteudosConcluidos());
		System.out.println("XP: " + joao.calcularTotalXp());
	}
}
