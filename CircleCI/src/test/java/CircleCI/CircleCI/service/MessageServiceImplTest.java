package CircleCI.CircleCI.service;


import CircleCI.CircleCI.mocks.MessageMocks;
import CircleCI.CircleCI.repository.MessageRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MessageServiceImplTest {

    @InjectMocks
    private MessageServiceImpl messageService;
    @Mock
    private MessageRepository messageRepository;

    @Test(expected = IllegalArgumentException.class)
    public void createMessage_whenMessageIsNull_ThenThrowsException(){
        messageService.createMessage(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMessage_whenMessageIsEmptyString_ThenThrowsException(){
        messageService.createMessage("");
    }

    @Test
    public void createMessage_WhenMessageIsValid_ThenReturnsOK(){
        Assertions.assertDoesNotThrow(() -> messageService.createMessage(MessageMocks.MESSAGE));
    }

    @Test
    public void getAllMessages_WhenMessageRepositoryFindsNothing_ThenReturnsEmptyArrayList(){
        Assertions.assertDoesNotThrow(() -> messageService.getAllMessages());
    }

    @Test
    public void getAllMessages_WhenMessageRepositoryFindsData_ThenReturnsMessages(){

        Mockito.when(messageRepository.findAll()).thenReturn(MessageMocks.stubMessagesEntity());

        Assertions.assertDoesNotThrow(() -> messageService.getAllMessages());
    }

}
