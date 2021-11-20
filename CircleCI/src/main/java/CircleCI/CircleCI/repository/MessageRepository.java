package CircleCI.CircleCI.repository;

import CircleCI.CircleCI.repository.dao.MessageDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<MessageDAO, Long> {

}
