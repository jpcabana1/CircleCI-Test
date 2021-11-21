package circleci.restservices.repository;

import circleci.restservices.repository.dao.MessageDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<MessageDAO, Long> {

}
