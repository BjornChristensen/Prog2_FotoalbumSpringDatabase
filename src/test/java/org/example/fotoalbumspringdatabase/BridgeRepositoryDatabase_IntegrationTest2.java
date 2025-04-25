package org.example.fotoalbumspringdatabase;

import org.example.fotoalbumspringdatabase.model.Bridge;
import org.example.fotoalbumspringdatabase.repository.BridgeRepository;
import org.example.fotoalbumspringdatabase.repository.BridgeRepositoryDatabase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BridgeRepositoryDatabase_IntegrationTest2 {
    @Autowired
    private BridgeRepositoryDatabase bridgeRepositoryDatabase;


    @Test
    public void getBridgeHappyFlow() {
        // Assumptions
        String bridgeName = "Tower";

        // Execution
        Bridge bridge=bridgeRepositoryDatabase.getBridge(bridgeName);

        // Validation
        assertNotNull(bridge);
        assertEquals(bridgeName, bridge.getName());
    }
}
