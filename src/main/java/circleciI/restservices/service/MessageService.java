package circleciI.restservices.service;

import circleciI.restservices.model.MessageDTO;

import java.util.List;

public interface MessageService {

    MessageDTO createMessage(String message);
    List<MessageDTO> getAllMessages();

}
