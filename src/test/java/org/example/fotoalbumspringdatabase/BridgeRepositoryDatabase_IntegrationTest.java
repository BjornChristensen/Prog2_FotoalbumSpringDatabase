package org.example.fotoalbumspringdatabase;

import org.example.fotoalbumspringdatabase.model.Bridge;
import org.example.fotoalbumspringdatabase.repository.BridgeRepositoryDatabase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BridgeRepositoryDatabase_IntegrationTest {
    @Autowired
    BridgeRepositoryDatabase bridgeRepositoryDatabase;

    @Test
    @DisplayName("getBridgeHappyFlow()")
    public void getBridgeHappyFlow() {
        // Assumptions
        String bridgeName = "Tower";

        // Execution
        Bridge bridge=bridgeRepositoryDatabase.getBridge(bridgeName);

        // Validations
        assertNotNull(bridge, "Bridge not found");
        assertEquals(bridgeName, bridge.getName());
    }
}
