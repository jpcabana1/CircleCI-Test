package CircleCI.restservices.controller;

import circleci.restservices.controller.MessageController;
import circleci.restservices.service.MessageServiceImpl;
import CircleCI.restservices.mocks.MessageMocks;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MessageControllerTest {

    @InjectMocks
    private MessageController controller;

    @Mock
    private MessageServiceImpl messageService;

    @Test
    public void createMessage_WhenServiceSavesMessage_ThenReturn200() {
        Assertions.assertDoesNotThrow(() -> controller.createMessage(MessageMocks.MESSAGE));
    }

    @Test
    public void createMessage_WhenServiceReturnsOK_ThenReturn200() {
        Mockito.when(messageService.getAllMessages()).thenReturn(MessageMocks.stubMessagesDTOs());
        Assertions.assertDoesNotThrow(() -> controller.getAllMessages());
    }
}
