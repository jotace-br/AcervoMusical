package modelagem;

import java.util.Scanner;
import controlador.*;

public class Menu {
	private Scanner entradaDeDados = new Scanner(System.in);
	private Scanner opcaoSair = new Scanner(System.in);
	private String opcaoFazerNovamente;

	private ControladorMenu controladorMenu = new ControladorMenu();

	public void adicionarAlbuns() {
		do {
			if(controladorMenu.adicionarAlbum()) {
				System.out.format("Album adicionado!\n");
				System.out.print("Deseja adicionar outro álbum? [S/N]: ");
				opcaoFazerNovamente = entradaDeDados.next();
			} else {
				opcaoFazerNovamente = "N";
			}
		} while(opcaoFazerNovamente.equalsIgnoreCase("S"));
	}

	public void editarAlbuns() {
		if(controladorMenu.editarAlbum()){
			System.out.println("Álbum editado com sucesso!");
		} else {
			System.out.println("Não foi possível editar o álbum.");
		}
	}

	public void removerAlbuns() {
		if(controladorMenu.removerAlbum()){
			System.out.println("Álbum removido com sucesso!");
		} else {
			System.out.println("Não foi possível remover o álbum.");
		}
	}

	public void buscarAlbuns() {
		if(controladorMenu.buscarAlbum()) {
			System.out.println("Álbum(ns) encontrado(s).");
		} else {
			System.out.println("Nenhum álbum encontrado.");
		}
	}

	public void listarAlbuns() {
		controladorMenu.listarAlbum();
	}

	public void adicionarArtistas() {
		do {
			if(controladorMenu.adicionarArtista()) {
				System.out.format("Artista adicionado!\n");
				System.out.print("Deseja adicionar outro artista? [S/N]: ");
				opcaoFazerNovamente = entradaDeDados.next();
			} else {
				opcaoFazerNovamente = "N";
			}
		} while(opcaoFazerNovamente.equalsIgnoreCase("S"));
	}

	public void editarArtista() {
		if(controladorMenu.editarArtista()) {
			System.out.println("Artista editado com sucesso!");
		} else {
			System.out.println("Não foi possível editar o artista.");
		}
	}

	public void removerArtista() {
		if(controladorMenu.removerArtista()) {
			System.out.println("Artista removido com sucesso!");
		} else {
			System.out.println("Não foi possível remover o artista.");
		}
	}

	public void buscarArtistas() {
		if(controladorMenu.buscarArtista()) {
			System.out.println("Artista(s) encontrado(s).");
		} else {
			System.out.println("Nenhum artista encontrado.");
		}
	}

	public void listarArtistas() {
		controladorMenu.listarArtista();
	}

	public void adicionarMusicas() {
		do {
			if(controladorMenu.adicionarMusica()) {
				System.out.format("Música adicionada!\n");
				System.out.print("Deseja adicionar outra música? [S/N]: ");
				opcaoFazerNovamente = entradaDeDados.next();
			} else {
				opcaoFazerNovamente = "N";
			}
		} while(opcaoFazerNovamente.equalsIgnoreCase("S"));
	}

	public void editarMusica() {
		if(controladorMenu.editarMusica()) {
			System.out.println("Música editada com sucesso!");
		} else {
			System.out.println("Não foi possível editar a música.");
		}
	}

	public void removerMusica() {
		if(controladorMenu.removerMusica()) {
			System.out.println("Música removida com sucesso!");
		} else {
			System.out.println("Não foi possível remover a música.");
		}
	}


	public void buscarMusica() {
		if(controladorMenu.buscarMusica()) {
			System.out.println("Música(s) encontrado(s).");
		} else {
			System.out.println("Nenhuma música encontrada.");
		}
	}

	public void listarMusicas() {
		controladorMenu.listarMusica();
	}

	public String voltarAoMenuPrincipal() {
		return "Voltando para o menu principal...";
	}

	public void sairDoPrograma() {
		System.out.print("Você deseja realmente sair do programa? [S/N]: ");
		String sairdoProgramaDecisao = opcaoSair.next();
		if (sairdoProgramaDecisao.equalsIgnoreCase("S")) {
			System.out.println("Fechando o programa...");
			System.exit(0);
		} else if (sairdoProgramaDecisao.equalsIgnoreCase("N")){
			sairdoProgramaDecisao = "N";
			System.out.println();
			controladorMenu.exibirMenuPrincipal();
		} else {
			System.out.println("Opção inválida! Fechando o programa...");
			System.exit(0);
		}
	}
}
