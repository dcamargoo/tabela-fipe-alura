package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import contract.IConverteDados;

import java.util.List;

public class ConverteJson implements IConverteDados {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterObjeto(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> List<T> obterLista(String json, Class<T> classe) {
        try {
            CollectionType tipoLista = mapper.getTypeFactory()
                    .constructCollectionType(List.class, classe);

            return mapper.readValue(json, tipoLista);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Erro ao converter o JSON para lista: " + e.getMessage());
        }
    }
}