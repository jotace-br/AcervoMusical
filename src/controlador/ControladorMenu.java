package controlador;
import java.util.ArrayList;
import java.util.Scanner;

import controlador.ControladorAlbum;
import controlador.ControladorArtista;
import controlador.ControladorMusica;
import modelagem.Album;
import modelagem.Artista;
import modelagem.Musica;

public class ControladorMenu {
	private Scanner inputOpcao = new Scanner(System.in);
	private Scanner input = new Scanner(System.in);
	private ControladorAlbum controladorAlbum = new ControladorAlbum();
	private ControladorArtista controladorArtista = new ControladorArtista();
	private ControladorMusica controladorMusica = new ControladorMusica();

	private Album album;
	private Artista artista;
	private Musica musica;
	private ArrayList<String> musicas;

	public ControladorMenu() {
		musicas = new ArrayList<>();
	}

	public int exibirMenuPrincipal() {
		System.out.println("-- Menu principal --");
		System.out.println("1º Opção: Opções de Álbum.");
		System.out.println("2º Opção: Opções de Artista.");
		System.out.println("3º Opção: Opções de Musica.");
		System.out.println("4º Opção: Sair do programa.");
		System.out.println();
		System.out.print("Digite a opção desejada: ");
		return inputOpcao.nextInt();
	}

	public int exibirMenuAlbum() {
		System.out.println("-- Opções de Álbum --");
		System.out.println("1º Opção: Adicionar um novo álbum.");
		System.out.println("2º Opção: Editar um álbum existente.");
		System.out.println("3º Opção: Remover um álbum existente.");
		System.out.println("4º Opção: Buscar um álbum existente.");
		System.out.println("5º Opção: Listar todos os álbuns.");
		System.out.println("6º Opção: Sair.");
		System.out.println();
		System.out.print("Digite a opção desejada: ");
		return inputOpcao.nextInt();
	}

	public boolean adicionarAlbum() {
		int opcaoCriarAlbum;
		String nomeAlbum;
		int anoAlbum;
		String nomeMusica;
		String fazerNovamente;
		try {
			System.out.println("Deseja adicionar um álbum:");
			System.out.println("1º Opção: Álbum completo.");
			System.out.println("2º Opção: Apenas o nome e o ano do álbum.");
			System.out.println("3º Opção: Apenas o nome do álbum.");
			System.out.print("Digite a opção desejada: ");
			opcaoCriarAlbum = inputOpcao.nextInt();

			switch (opcaoCriarAlbum) {
			case 1:
				input.nextLine();
				System.out.print("Digite o nome do álbum: ");
				nomeAlbum = input.nextLine();

				System.out.print("Digite o ano do álbum: ");
				anoAlbum = input.nextInt();
				input.nextLine();
				do {
					input.nextLine();
					System.out.print("Digite o nome da música: ");
					nomeMusica = input.nextLine();

					System.out.println("Deseja adicionar novamente? [S/N]: ");
					fazerNovamente = input.next();

					musicas.add(nomeMusica);
					musica = new Musica(nomeMusica);
				} while(fazerNovamente.equalsIgnoreCase("S"));

				album = new Album(nomeAlbum, anoAlbum);
				controladorAlbum.adicionarAlbum(album, musicas);
				break;
			case 2:
				input.nextLine();
				System.out.print("Digite o nome do álbum: ");
				nomeAlbum = input.nextLine();

				System.out.print("Digite o ano do álbum: ");
				anoAlbum = input.nextInt();

				input.nextLine();
				album = new Album(nomeAlbum, anoAlbum);
				controladorAlbum.adicionarAlbum(album);
				break;
			case 3:
				input.nextLine();
				System.out.print("Digite o nome do álbum: ");
				nomeAlbum = input.nextLine();

				input.nextLine();
				album = new Album(nomeAlbum);
				controladorAlbum.adicionarAlbum(album);
				break;
			default:
				input.nextLine();
				opcaoCriarAlbum = 0;
				break;
			}
			return true;
		} catch (NullPointerException e) {
			System.out.println("Não foi possível adicionar o álbum.");
			input.nextLine();
			return false;
		}
	}

	public boolean editarAlbum() {
		String buscarNomeAlbum;
		String novoNomeAlbum;
		int novoAnoAlbum;

		if(!controladorAlbum.existeAlbum()){
			System.out.println("Não há álbuns disponí­veis para editar.");
		}
		else {
			input.nextLine();
			try {
				System.out.println("-- Álbuns disponíveis --");
				controladorAlbum.listarAlbuns();
				System.out.println("------------------------");

				System.out.println("Limpando o buffer...");
				System.out.print("Digite o Nome do álbum que deseja editar: ");
				buscarNomeAlbum = input.nextLine();

				System.out.print("Edite o novo nome do álbum: ");
				novoNomeAlbum = input.nextLine();

				System.out.print("Edite o ano do álbum:");
				novoAnoAlbum = input.nextInt();

				input.nextLine();
				controladorAlbum.alterarAlbum(buscarNomeAlbum, novoNomeAlbum, Integer.toString(novoAnoAlbum)); 
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		return false;
	}

	public boolean removerAlbum() {
		try {
			input.nextLine();
			System.out.print("Digite o nome do álbum que deseja remover: ");
			String albumNome = input.nextLine();

			input.nextLine();
			controladorAlbum.removerAlbum(album, albumNome);
			return true;
		} catch (Exception e) {
			System.out.println("Não foi possível remover o álbum.");
			return false;
		}
	}

	public boolean buscarAlbum() {
		try {
			input.nextLine();
			System.out.print("Digite o nome do álbum para buscá-lo: ");
			String buscarAlbum = input.nextLine();

			input.nextLine();
			controladorAlbum.buscarAlbum(buscarAlbum);
			return true;
		} catch (Exception e) {
			System.out.println("Não foi possível achar o álbum.");
		}
		return false;
	}

	public void listarAlbum() {
		controladorAlbum.listarAlbuns();
	}

	public int exibirMenuArtistas() {
		System.out.println("-- Opções de Artista --");
		System.out.println("1º Opção: Adicionar um novo artista.");
		System.out.println("2º Opção: Editar um artista existente.");
		System.out.println("3º Opção: Remover um artista existente.");
		System.out.println("4º Opção: Buscar um artista existente.");
		System.out.println("5º Opção: Listar todos os artistas.");
		System.out.println("6º Opção: Sair.");
		System.out.println();
		System.out.print("Digite a opção desejada: ");
		return inputOpcao.nextInt();
	}

	public boolean adicionarArtista() {
		int opcaoCriarArtista;
		String nome;
		String nomeArtista;
		String idadeArtista;
		String generoArtista;
		String artistaDescricao;
		String albumArtista;
		String fazerNovamente;

		try {
			System.out.println("Deseja adicionar um artista:");
			System.out.println("1º Opção: Artista completo.");
			System.out.println("2º Opção: Apenas o nome, idade e descrição do artista.");
			System.out.println("3º Opção: Apenas o nome do artista.");
			opcaoCriarArtista = input.nextInt();

			switch (opcaoCriarArtista) {
			case 1:
				input.nextLine();
				System.out.print("Digite o nome do artista: ");
				nome = input.nextLine();
				nomeArtista = nome;

				System.out.print("Digite a idade do artista: ");
				idadeArtista = input.nextLine();

				System.out.print("Digite a descrição do artista: ");
				artistaDescricao = input.nextLine();

				System.out.print("Digite o gênero do artista: ");
				generoArtista = input.nextLine();

				input.nextLine();
				do {
					System.out.print("Digite o nome do álbum do artista: ");
					albumArtista = input.nextLine();

					System.out.print("Deseja adicionar outro álbum? [S/N]: ");
					fazerNovamente = input.nextLine();

					album = new Album(albumArtista);
					controladorAlbum.adicionarAlbum(album);
				} while(fazerNovamente.equalsIgnoreCase("S"));

				artista = new Artista(nome, idadeArtista, nomeArtista, artistaDescricao, generoArtista);
				controladorArtista.adicionarArtista(artista);
				break;
			case 2:
				input.nextLine();
				System.out.print("Digite o nome do artista: ");
				nome = input.nextLine();
				nomeArtista = nome;

				System.out.print("Digite a idade do artista: ");
				idadeArtista = input.nextLine();

				System.out.print("Digite a descrição do artista: ");
				artistaDescricao = input.nextLine();

				input.nextLine();
				artista = new Artista(nome, idadeArtista, nomeArtista, artistaDescricao);
				controladorArtista.adicionarArtista(artista);
				break;
			case 3:
				input.nextLine();
				System.out.print("Digite o nome do artista: ");
				nome = input.nextLine();
				nomeArtista = nome;

				artista = new Artista(nomeArtista);
				controladorArtista.adicionarArtista(artista);
				break;
			default:
				break;
			}
			return true;
		} catch (NullPointerException e) {
			System.out.println("Não foi possível adicionar o artista.");
			return false;
		}
	}

	public boolean editarArtista() {
		String buscarNomeArtista;
		String novoNomeArtista;
		String novaIdadeArtista;
		String nomeArtistaConstrutor;
		String novaDescricaoArtista;
		String novoGeneroArtista;

		if(!controladorArtista.existeArtista()){
			System.out.println("Não há músicas disponí­veis para editar.");
		} else {
			input.nextLine();
			try {
				System.out.println("-- Artistas disponíveis --");
				controladorArtista.listarArtistas();
				System.out.println("------------------------");

				input.nextLine();
				System.out.print("Digite o nome do artista que deseja editar: ");
				buscarNomeArtista = input.nextLine();

				System.out.print("Edite o novo nome do artista: ");
				novoNomeArtista = input.nextLine();
				nomeArtistaConstrutor = novoNomeArtista;

				System.out.print("Edite a idade do artista:");
				novaIdadeArtista = input.nextLine();

				System.out.print("Edite a descrição do artista: ");
				novaDescricaoArtista = input.nextLine();

				System.out.print("Edite o gênero do artista: ");
				novoGeneroArtista = input.nextLine();

				input.nextLine();
				controladorArtista.alterarArtista(buscarNomeArtista, novoNomeArtista, novaIdadeArtista, 
						nomeArtistaConstrutor, novaDescricaoArtista, novoGeneroArtista);
				return true;
			} catch (Exception e) {
				System.out.println("Não foi possível editar o nome do artista.");
				return false;
			}
		}
		return false;
	}

	public boolean removerArtista() {
		try {
			input.nextLine();
			System.out.print("Digite o nome do artista que deseja remover: ");
			String artistaNome = input.nextLine();

			input.nextLine();
			controladorArtista.removerArtista(artista, artistaNome);
			return true;
		} catch (Exception e) {
			System.out.println("Não foi possível remover o artista.");
			return false;
		}
	}

	public boolean buscarArtista() {
		try {
			input.nextLine();
			System.out.print("Digite o nome do artista para buscá-lo: ");
			String buscarArtista = input.nextLine();

			input.nextLine();
			controladorArtista.buscarArtista(buscarArtista);
			return true;
		} catch (Exception e) {
			System.out.println("Não foi possível achar o artista.");
		}
		return false;
	}

	public void listarArtista() {
		controladorArtista.listarArtistas();
	}

	public int exibirMenuMusica() {
		System.out.println("-- Opções de Música --");
		System.out.println("1º Opção: Adicionar uma ou mais músicas.");
		System.out.println("2º Opção: Editar uma música existente.");
		System.out.println("3º Opção: Remover uma música existente.");
		System.out.println("4º Opção: Buscar uma música existente.");
		System.out.println("5º Opção: Listar todas as músicas.");
		System.out.println("6º Opção: Sair.");
		System.out.println();
		System.out.print("Digite a opção desejada: ");
		return inputOpcao.nextInt();
	}

	public boolean adicionarMusica() {
		int opcaoCriarMusica;
		String nomeMusica;
		String nomeAlbum;
		String nomeMusicaArtista;
		try {
			System.out.println("Deseja adicionar um álbum:");
			System.out.println("1º Opção: Música com álbum e artista.");
			System.out.println("2º Opção: Apenas a música e o álbum.");
			System.out.println("3º Opção: Apenas a música.");
			opcaoCriarMusica = input.nextInt();

			switch (opcaoCriarMusica) {
			case 1:
				input.nextLine();

				System.out.print("Digite o nome da música: ");
				nomeMusica = input.nextLine();

				System.out.print("Digite o nome do álbum: ");
				nomeAlbum = input.nextLine();

				System.out.print("Digite o nome do artista: ");
				nomeMusicaArtista = input.nextLine();

				input.nextLine();
				artista = new Artista(nomeMusicaArtista);
				album = new Album(nomeAlbum);
				musica = new Musica(nomeMusica, album, artista);
				controladorMusica.adicionarMusica(musica);
				break;
			case 2:
				input.nextLine();

				System.out.print("Digite o nome da música: ");
				nomeMusica = input.nextLine();

				System.out.print("Digite o nome do álbum: ");
				nomeAlbum = input.nextLine();

				input.nextLine();
				album = new Album(nomeAlbum);
				musica = new Musica(nomeMusica, album);
				controladorMusica.adicionarMusica(musica);
				break;
			case 3:
				input.nextLine();
				System.out.print("Digite o nome da música: ");
				nomeMusica = input.nextLine();

				input.nextLine();
				musica = new Musica(nomeMusica);
				controladorMusica.adicionarMusica(musica);
				break;
			default:
				break;
			}
			return true;
		} catch (NullPointerException e) {
			System.out.println("Não foi possível adicionar a música.");
			return false;
		}
	}

	public boolean editarMusica() {
		String buscarNomeMusica;
		String novoNomeMusica;
		String novoNomeAlbum;
		String novoAnoAlbum;
		String novoNomeArtista;
		String novaIdadeArtista;
		String novaDescricaoArtista;
		String novoGeneroArtista;

		if(!controladorMusica.existeMusica()){
			System.out.println("Não há músicas disponí­veis para editar.");
		} else {
			input.nextLine();
			try {
				System.out.println("-- Músicas disponíveis --");
				controladorMusica.listarMusica();
				System.out.println("------------------------");

				input.nextLine();
				System.out.print("Digite o Nome da música que deseja editar: ");
				buscarNomeMusica = input.nextLine();

				System.out.print("Digite o novo nome da música: ");
				novoNomeMusica = input.nextLine();

				System.out.print("Edite o nome do álbum: ");
				novoNomeAlbum = input.nextLine();

				System.out.print("Digite o ano do álbum: ");
				novoAnoAlbum = input.nextLine();
				input.nextLine();

				System.out.print("Edite o nome do artista: ");
				novoNomeArtista = input.nextLine();

				System.out.print("Edite a idade do artista:");
				novaIdadeArtista = input.nextLine();

				System.out.print("Edite a descrição do artista: ");
				novaDescricaoArtista = input.nextLine();

				System.out.print("Edite o gênero do artista: ");
				novoGeneroArtista = input.nextLine();

				input.nextLine();
				controladorMusica.alterarMusica(buscarNomeMusica, novoNomeMusica, novoNomeAlbum, novoAnoAlbum, 
						novoNomeArtista, novaIdadeArtista, novaDescricaoArtista, novoGeneroArtista);
				return true;
			} catch (Exception e) {
				System.out.println("Não foi possível editar a música.");
				return false;
			}
		}
		return false;
	}

	public boolean removerMusica() {
		try {
			input.nextLine();
			System.out.print("Digite o nome da música que deseja remover: ");
			String musicaNome = input.nextLine();
			controladorMusica.removerMusica(musica, musicaNome);
			input.nextLine();
			return true;
		} catch (Exception e) {
			System.out.println("Não foi possível remover o álbum.");
			return false;
		}
	}

	public boolean buscarMusica() {
		try {
			input.nextLine();
			System.out.print("Digite o nome da música para buscá-la: ");
			String buscarMusica = input.nextLine();
			controladorMusica.buscarMusica(buscarMusica);
			input.nextLine();
			return true;
		} catch (Exception e) {
			System.out.println("Não foi possível achar a música.");
		}
		return false;
	}

	public void listarMusica() {
		controladorMusica.listarMusica();
	}



}
