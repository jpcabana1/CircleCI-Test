package circleciI.restservices.repository;

import circleciI.restservices.repository.dao.MessageDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<MessageDAO, Long> {

}
