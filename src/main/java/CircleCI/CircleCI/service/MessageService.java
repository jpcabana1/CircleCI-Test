package CircleCI.CircleCI.service;

import CircleCI.CircleCI.model.MessageDTO;

import java.util.List;

public interface MessageService {

    MessageDTO createMessage(String message);
    List<MessageDTO> getAllMessages();

}
