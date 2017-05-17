package webhook.acxelense.wootric.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import webhook.acxelense.wootric.model.Response;

@Repository
public interface ResponseRepository extends CrudRepository<Response, Integer> {

}
