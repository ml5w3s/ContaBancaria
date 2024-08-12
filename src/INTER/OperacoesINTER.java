package INTER;

import java.util.List;

public interface OperacoesINTER<T> {
    void incluir(T objeto);
    void alterar(T objeto);
    void excluir(T objeto);
    T buscarPorId(int id);
    List<T> buscarTodos();
}
