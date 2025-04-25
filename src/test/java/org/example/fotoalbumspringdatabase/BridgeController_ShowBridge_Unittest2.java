package org.example.fotoalbumspringdatabase;

import org.example.fotoalbumspringdatabase.controller.BridgeController;
import org.example.fotoalbumspringdatabase.model.Bridge;
import org.example.fotoalbumspringdatabase.repository.BridgeRepositoryDatabase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class BridgeController_ShowBridge_Unittest2 {
    @Mock
    BridgeRepositoryDatabase bridgeRepositoryDatabase;

    @Mock
    Model model;

    @InjectMocks
    BridgeController bridgeController;

    @Test
    public void showBridgeHappyFlow(){
        // Assumptions
        String bridgeName="testName";
        Bridge bridge=new Bridge(bridgeName, null, null);
        given(bridgeRepositoryDatabase.getBridge(bridgeName)).willReturn(bridge);

        // Execution
        String result=bridgeController.showBridge(bridgeName, model);

        // Validation
        assertEquals(result, "bridge");
        verify(model).addAttribute("bridge", bridge);
    }

    @Test
    public void showBridgeExceptionFlow(){
        // Assumptions
        String bridgeName="testName";
        Bridge bridge=new Bridge(bridgeName, null, null);
        given(bridgeRepositoryDatabase.getBridge(bridgeName)).willReturn(null);

        // Execution
        String result=bridgeController.showBridge(bridgeName, model);

        // Validation
        assertEquals(result, "bridge");
        assertTrue(model.asMap().isEmpty());
    }}
