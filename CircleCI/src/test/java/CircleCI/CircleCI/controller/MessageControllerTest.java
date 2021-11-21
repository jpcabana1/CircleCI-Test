package CircleCI.CircleCI.controller;

import CircleCI.CircleCI.mocks.MessageMocks;
import CircleCI.CircleCI.model.StatusDTO;
import CircleCI.CircleCI.service.MessageServiceImpl;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MessageControllerTest {

    @InjectMocks
    private MessageController controller;

    @Mock
    private MessageServiceImpl messageService;

    private static final String MESSAGE = "Hello World!";

    @Test
    public void createMessage_WhenServiceSavesMessage_ThenReturn200() {

        ResponseEntity<StatusDTO> statusDTO = controller.createMessage(MESSAGE);
        assertEquals(statusDTO.getBody().getMessage(), MESSAGE);
    }

    @Test
    public void createMessage_WhenServiceReturnsOK_ThenReturn200() {
        Mockito.when(messageService.getAllMessages()).thenReturn(MessageMocks.stubMessages());

        Assertions.assertDoesNotThrow(() -> controller.getAllMessages());
    }
}
