/**
 * 
 */
package br.com.carvalho.venda.online.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.carvalho.venda.online.domain.Cliente;

/**
 * @author manoel.carvalho
 *
 */
@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String>{

	Optional<Cliente> findByCpf(Long cpf);
}
