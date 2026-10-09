package org.example.fotoalbumspringdatabase;

import org.example.fotoalbumspringdatabase.controller.BridgeController;
import org.example.fotoalbumspringdatabase.model.Bridge;
import org.example.fotoalbumspringdatabase.repository.BridgeRepositoryDatabase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
public class BridgeController_ShowBridge_UnitTest_F26A {
  @Mock
  private Model model;

  @Mock
  private BridgeRepositoryDatabase bridgeRepositoryDatabase;

  @InjectMocks
  private BridgeController bridgeController;

  @Test
  @DisplayName("showBridgeHappyFlow()")
  public void showBridgeHappyFlow(){
    // Preconditions
    String bridgeName="testName";
    Bridge bridge=new Bridge(bridgeName, null, null );
    given(bridgeRepositoryDatabase.getBridge(bridgeName)).willReturn(bridge);

    // Execution
    String result=bridgeController.showBridge(bridgeName, model);

    // Postconditions
    assertEquals(result, "bridge");
    verify(model).addAttribute("bridge", bridge);
  }

  @Test
  @DisplayName("showBridgeExceptionFlow()")
  public void showBridgeExceptionFlow(){
    // Preconditions
    String bridgeName="testName";
    Bridge bridge=new Bridge(bridgeName, null, null );
    given(bridgeRepositoryDatabase.getBridge(bridgeName)).willReturn(null);

    // Execution
    String result=bridgeController.showBridge(bridgeName, model);

    // Postcondition
    assertEquals("error", result);
    assertTrue(model.asMap().isEmpty());
  }
}
