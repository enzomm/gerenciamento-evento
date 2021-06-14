package interfaces;

import java.util.List;

/**
 * Interface ICRUD Generica.
 * <p>
 * Utilizada para padronizacao e implementacao de metodos CRUD com o banco de
 * dados 
 * @param <T>
 */
public interface ICRUD<T> {

	Integer create(T entidade);

	T get(Class<T> classeTabela, int id) throws Exception;

	boolean update(T objetoAtualizado);

	boolean delete(Class<T> classeTabela,int id);
	
	List<T> getAll(Class<T> classeTabela);
	
	boolean deleteAll(Class<T> classeTabela);

}