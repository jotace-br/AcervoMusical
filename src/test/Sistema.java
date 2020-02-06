package test;

import java.util.InputMismatchException;
import controlador.ControladorMenu;
import modelagem.Menu;

public class Sistema {
	public static void main(String[] args) {
		int opcaoSelecionadaMenuPrincipal = 0;
		int opcaoSelecionadaMenuDeAlbuns = 0;
		int opcaoSelecionadaMenuDeArtistas = 0;
		int opcaoSelecionadaMenuDeMusicas = 0;
		int opcaoSairDoPrograma = 4;

		ControladorMenu controladorMenu = new ControladorMenu();
		Menu menuPrincipal = new Menu();

		try {
			do {
				opcaoSelecionadaMenuPrincipal = controladorMenu.exibirMenuPrincipal();
				switch (opcaoSelecionadaMenuPrincipal) {
				case 1:
					opcaoSelecionadaMenuDeAlbuns = controladorMenu.exibirMenuAlbum();
					switch (opcaoSelecionadaMenuDeAlbuns) {
					case 1:
						try {
							menuPrincipal.adicionarAlbuns();
							break;
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					case 2:
						try {
							menuPrincipal.editarAlbuns();
							break;
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					case 3:
						try {
							menuPrincipal.removerAlbuns();
							break;
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					case 4:
						try {
							menuPrincipal.buscarAlbuns();
							break;
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					case 5:
						try {
							menuPrincipal.listarAlbuns();
							break;
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					case 6:
						try {
							menuPrincipal.voltarAoMenuPrincipal();
							break;
						} catch (InputMismatchException e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					default:
						opcaoSelecionadaMenuDeAlbuns = 0;
						break;
					}
					break;
				case 2:
					opcaoSelecionadaMenuDeArtistas = controladorMenu.exibirMenuArtistas();
					switch (opcaoSelecionadaMenuDeArtistas) {
					case 1:
						try {
							menuPrincipal.adicionarArtistas();
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					case 2:
						try {
							menuPrincipal.editarArtista();
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					case 3:
						try {
							menuPrincipal.removerArtista();
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					case 4:
						try {
							menuPrincipal.buscarArtistas();
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					case 5:
						try {
							menuPrincipal.listarArtistas();
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					case 6:
						try {
							menuPrincipal.voltarAoMenuPrincipal();
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					default:
						opcaoSelecionadaMenuDeArtistas = 0;
						System.out.println();
						break;
					}
					break;

					//aqui parou
				case 3:
					opcaoSelecionadaMenuDeMusicas = controladorMenu.exibirMenuMusica();
					switch (opcaoSelecionadaMenuDeMusicas) {
					case 1:
						try {
							menuPrincipal.adicionarMusicas();
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					case 2:
						try {
							menuPrincipal.editarMusica();
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					case 3:
						try {
							menuPrincipal.removerMusica();
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					case 4:
						try {
							menuPrincipal.buscarMusica();
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					case 5:
						try {
							menuPrincipal.listarMusicas();
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					case 6:
						try {
							menuPrincipal.voltarAoMenuPrincipal();
						} catch (Exception e) {
							System.err.println("Um erro inesperado aconteceu.");
						}
						break;
					default:
						opcaoSelecionadaMenuDeMusicas = 0;
						System.out.println();
						break;
					}
					break;
				case 4:
					menuPrincipal.sairDoPrograma();
					opcaoSelecionadaMenuPrincipal = 0;
					break;
				default:
					break;
				}
			} while(opcaoSelecionadaMenuPrincipal != opcaoSairDoPrograma);
		} catch (InputMismatchException e) {
			System.out.println("Opção inválida.");
		} finally {
			System.out.println();
			System.out.println("Obrigado por usar o programa!");
		}
	}
}
