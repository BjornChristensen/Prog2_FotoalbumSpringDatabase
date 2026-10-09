package org.example.fotoalbumspringdatabase;

import org.example.fotoalbumspringdatabase.model.Bridge;
import org.example.fotoalbumspringdatabase.repository.BridgeRepositoryDatabase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BridgeRepositoryDatabase_IntegrationTest_F26A {
  @Autowired
  BridgeRepositoryDatabase bridgeRepositoryDatabase;

  @Test
  @DisplayName("getBridgeHappyFlow()")
  public void getBridgeHappyFlow(){
    // Precondition
    String bridgeName="Tower";

    // Execution
    Bridge bridge=bridgeRepositoryDatabase.getBridge(bridgeName);

    // Postcondition
    assertNotNull(bridge);
    assertEquals(bridge.getName(), bridgeName);
  }

  @Test
  @DisplayName("getBridgeExceptionFlow()")
  public void getBridgeExceptionFlow(){
    // Precondition
    String bridgeName="blabla";

    // Execution
    Bridge bridge=bridgeRepositoryDatabase.getBridge(bridgeName);

    // Postcondition
    assertNull(bridge);
  }
}
