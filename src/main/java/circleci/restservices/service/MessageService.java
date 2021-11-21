package circleci.restservices.service;

import circleci.restservices.model.MessageDTO;

import java.util.List;

public interface MessageService {

    MessageDTO createMessage(String message);
    List<MessageDTO> getAllMessages();

}
