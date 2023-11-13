package service;
import java.util.List;

public interface BaseService <E>{
	//TRAR CUALQUIER
	public List<E> finalAll() throws Exception;
	//BUSCAR ID Y LO TRAE
	public E finalAll(Long id) throws Exception;
	//GUARDAR
	public E save(E entity) throws Exception;
	//ACTUALIZAR
	public E update (Long id, E entity) throws Exception;
	//ELIMINAR
	public boolean delete(Long id) throws Exception;
}
