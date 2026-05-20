package service;

import dto.*;
import java.util.List;
import java.util.Scanner;

public class Principal {

    // método com a lógica do programa
    public static void executar(){

        String URL_BASE = "https://parallelum.com.br/fipe/api/v1";
        ConverteJson conversor = new ConverteJson();

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                #-------------#
                 Bem Vindo(a)!
                #-------------#
                
                Insira o tipo de veículo: """);
        String opcaoTipo = scanner.nextLine().toLowerCase();
        String URL_MARCAS;

        if(opcaoTipo.contains("car")) URL_MARCAS = URL_BASE + "/carros/marcas";
        else if(opcaoTipo.contains("mot")) URL_MARCAS = URL_BASE + "/motos/marcas";
        else URL_MARCAS = URL_BASE + "/caminhoes/marcas";

        // MOSTRAR A LISTA DE MARCAS
        String jsonMarcas = ConsumoApi.obterDados(URL_MARCAS);
        List<DadosMarcaDTO> listaMarcas = conversor.obterLista(jsonMarcas, DadosMarcaDTO.class);

        System.out.println("\nLista de Marcas:\n");

        listaMarcas.forEach(m -> System.out.println("Código: " + m.codigo() + " | Marca: " + m.nome()));

        System.out.println("\nAgora insira o código da marca do veículo: ");
        String opcaoMarca = scanner.nextLine();

        String URL_MODELOS = URL_MARCAS + "/" + opcaoMarca + "/modelos";

        // MOSTRAR A LISTA DE MODELOS
        String jsonModelos = ConsumoApi.obterDados(URL_MODELOS);
        RespostaModelo resp = conversor.obterObjeto(jsonModelos, RespostaModelo.class);
        List<DadosModeloDTO> listaModelos = resp.modelos();

        System.out.println("\nLista de Modelos:\n");

        listaModelos.forEach(m -> System.out.println("Código: " + m.codigo() + " | Modelo: " + m.nome()));

        System.out.println("\nAgora insira o código do modelo do veículo: ");
        String opcaoModelo = scanner.nextLine();

        String URL_ANOS = URL_MODELOS + "/" + opcaoModelo + "/anos";

        // MOSTRAR A LISTA DE ANOS
        String jsonAnos = ConsumoApi.obterDados(URL_ANOS);
        List<DadosAnoDTO> listaAnos = conversor.obterLista(jsonAnos, DadosAnoDTO.class);

        System.out.println("\nLista de Anos:\n");

        listaAnos.forEach(a -> System.out.println("Código: " + a.codigo() + " | Ano: " + a.nome()));

        System.out.println("\nAgora insira a data desejada: ");
        String opcaoAnos = scanner.nextLine();

        String URL_FINAL = URL_ANOS + "/" + opcaoAnos;

        // MOSTRAR OS DADOS DO VEÍCULO PARA AQUELE ANO
        String jsonVeiculo = ConsumoApi.obterDados(URL_FINAL);
        DadosVeiculoDTO dadosVeiculo = conversor.obterObjeto(jsonVeiculo, DadosVeiculoDTO.class);

        System.out.println(dadosVeiculo.toString());

        scanner.close();

    }
}
