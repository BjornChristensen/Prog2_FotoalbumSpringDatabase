package org.example.fotoalbumspringdatabase.repository;

import org.example.fotoalbumspringdatabase.model.Bridge;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BridgeRepository {
    private List<Bridge> bridgeList = new ArrayList<Bridge>();

    public BridgeRepository() {
        bridgeList.add(new Bridge("Brooklyn_Bridge", "img/Brooklyn_Bridge.jpg",
                "  Brooklyn Bridge er en af tre broer,\n" +
                        "  som binder bydelene Manhattan og Brooklyn i New York sammen.\n" +
                        "  Den strækker sig 1834 meter over East River.\n" +
                        "  Hovedspændet over selve vandet er 486 meter,\n" +
                        "  noget som gjorde den til verdens længste hængebro,\n" +
                        "  da den stod færdig i 1883.\n" +
                        "  Wikipedia"));

        bridgeList.add(new Bridge("GoldenGate", "img/GoldenGate.jpg",
                "  Golden Gate-broen er en hængebro, der spænder over Golden\n" +
                        "  Gate-udmundingen af San Francisco-bugten i Stillehavet.\n" +
                        "  Den forbinder San Francisco på den nordlige spids af\n" +
                        "  San Francisco-halvøen med Marin County, som en del af\n" +
                        "  U.S. Highway 101 og California State Highway 1.\n" +
                        "  Wikipedia"));
        bridgeList.add(new Bridge("Rialto", "img/Rialto.jpg",
                "  Rialtobroen er den ældste af de fire broer over Canal Grande i Venedig i Italien.\n" +
                        "  Wikipedia"));
        bridgeList.add(new Bridge("Tower", "img/Tower.jpg",
                "  Den blev åbnet i 1894. Broen er en dobbelt klapbro, hvis hejseværk\n" +
                        "  oprindeligt var drevet af dampmaskiner, men nu er elektriske.\n" +
                        "  Broen har et sydtårn og et nordtårn, der er udformet i stil med\n" +
                        "  Tower of London, som ligger lige ved siden af.\n" +
                        "  Wikipedia"));
    }

    public List<Bridge> getAllBridges(){
        return bridgeList;
    }

    public Bridge getBridge(String name){
        for(Bridge bridge: bridgeList){
            if(bridge.getName().equals(name)){
                return bridge;
            }
        }
        return null;
    }
}
