package circleci.restservices.service;

import circleci.restservices.model.MessageDTO;
import circleci.restservices.repository.MessageRepository;
import circleci.restservices.repository.dao.MessageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public MessageDTO createMessage(String message) {

        if (message == null || message.trim().equals("")) {
            throw new IllegalArgumentException("Invalid Message");
        } else {
            MessageDAO messageDAO = MessageDAO.builder()
                    .message(message)
                    .verified(false)
                    .build();
            messageRepository.save(messageDAO);

            return MessageDTO.builder()
                    .id(messageDAO.getId())
                    .message(messageDAO.getMessage())
                    .validated(messageDAO.getVerified())
                    .build();
        }
    }

    @Override
    public List<MessageDTO> getAllMessages() {

        List<MessageDTO> messages = new ArrayList<>();

        List<MessageDAO> listMessages = messageRepository.findAll();

        listMessages.forEach(message ->
                messages.add(MessageDTO.builder()
                        .id(message.getId())
                        .message(message.getMessage())
                        .validated(message.getVerified())
                        .build()));

        return messages;
    }
}
