package circleciI.restservices.controller;

import circleciI.restservices.api.MessageApi;
import circleciI.restservices.model.MessageDTO;
import circleciI.restservices.model.StatusDTO;
import circleciI.restservices.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController implements MessageApi {

    @Autowired
    private MessageService messageService;

    @Override
    public ResponseEntity<StatusDTO> createMessage(String message) {
        messageService.createMessage(message);
        StatusDTO statusDTO = StatusDTO.builder().code(201).message("Created").build();
        return new ResponseEntity<>(statusDTO, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<MessageDTO>> getAllMessages() {
        return new ResponseEntity<>(messageService.getAllMessages(), HttpStatus.OK);
    }

}
