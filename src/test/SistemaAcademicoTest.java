package test;

import app.sisacademico.IArtista;
import app.sisacademico.Artista;
import app.sisacademico.SistemaAcademico;


public class SistemaAcademicoTest {

	public static void main(String[] args) {
		System.out.println("Qnt de artistas instanciados: " + Artista.getQntArtistas());
		
		Artista pessoa = new Artista("Pedro", "111.231.213-67", "02/08/2001", "2019.1", "petro");

		System.out.println("Qnt de artistas instanciados: " + Artista.getQntArtistas());
		
		Artista aluno = new Artista("Pyhton Boy", "122.231.213-67", "01/09/1998", "2019.1", "pyhton");
		
		System.out.println("Qnt de artistas instanciados: " + Artista.getQntArtistas());
		
		Artista alunoTec = new Artista("Júlio Cesar", "777.231.213-88", "02/04/2001", "2019.1", "julio");
		
		System.out.println("Qnt de artistas instanciados: " + Artista.getQntArtistas());
		
		Artista prof = new Artista("Walker", "757.555.333-22", "08/05/1989", "wk", "1234");

		SistemaAcademico sigaa = new SistemaAcademico();
		
		System.out.println("Qnt de artistas instanciados: " + Artista.getQntArtistas());
		
		sigaa.adicionarMusica(pessoa);
		sigaa.adicionarMusica(aluno);
		sigaa.adicionarMusica(alunoTec);
		sigaa.adicionarMusica(prof);
		
		sigaa.listarMusicas();
		
		IArtista usrBuscado = sigaa.buscarMusica("pyhton");
		
		System.out.println("Usuário buscado" + usrBuscado);
		
		sigaa.removerMusica(usrBuscado);
		
		sigaa.listarMusicas();
		
	}

}
