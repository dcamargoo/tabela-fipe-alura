package contract;

import java.util.List;

public interface IConverteDados {

    <T> T obterObjeto(String json, Class<T> classe);

    <T> List<T> obterLista(String json, Class<T> classe);
}
