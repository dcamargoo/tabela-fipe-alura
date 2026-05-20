package dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosVeiculoDTO(
        @JsonAlias("Marca") String marca,
        @JsonAlias("Modelo") String modelo,
        @JsonAlias("AnoModelo") Integer anoModelo,
        @JsonAlias("Valor") String valor,
        @JsonAlias("Combustivel")String combustivel,
        @JsonAlias("CodigoFipe") String codigoFipe,
        @JsonAlias("MesReferencia") String mesReferencia,
        @JsonAlias("SiglaCombustivel") String siglaCombustivel
)
{
    @Override
    public String toString() {
        return String.format("""
                
                =================================
                VEÍCULO ENCONTRADO:
                =================================
                Marca: %s
                Modelo: %s
                Ano: %d
                Combustível: %s
                Preço: %s
                Código FIPE: %s
                Mês de Referência: %s
                =================================""",
                marca, modelo, anoModelo, combustivel, valor, codigoFipe, mesReferencia);
    }
}
