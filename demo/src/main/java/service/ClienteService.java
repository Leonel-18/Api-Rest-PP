package service;
import java.util.List;
import java.util.Optional;


import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import entidades.Cliente;
import repository.ClienteRepository;
@Service
public class ClienteService implements BaseService<Cliente> {
	@SuppressWarnings("unused")
	private ClienteRepository clienteRepository;
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	@Override
	@Transactional
	public List<Cliente> finalAll() throws Exception {
		try {
			List<Cliente> entities = clienteRepository.findAll();
			return entities;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}

	@Override
	@Transactional
	public Cliente finalAll(Long id) throws Exception {
		try {
			Optional<Cliente> entityOptional=clienteRepository.findById(id);
			return entityOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}

	@Override
	@Transactional
	public Cliente save(Cliente entity) throws Exception {
		try {
			entity = clienteRepository.save(entity);
			return entity;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Cliente update(Long id, Cliente entity) throws Exception {
		try {
			Optional<Cliente> entityOptional = clienteRepository.findById(id);
			Cliente cliente = entityOptional.get();
			cliente=clienteRepository.save(cliente);
			return cliente;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public boolean delete(Long id) throws Exception {
		try {
			if(clienteRepository.existsById(id)) {
				clienteRepository.deleteById(id);
				return true;
			}else {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public Object findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
