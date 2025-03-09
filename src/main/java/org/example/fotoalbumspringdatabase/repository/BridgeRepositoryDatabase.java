package org.example.fotoalbumspringdatabase.repository;

import org.example.fotoalbumspringdatabase.model.Bridge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Repository
public class BridgeRepositoryDatabase {

  @Autowired
  private DataSource dataSource;

  public ArrayList<Bridge> getAllBridges() {
    ArrayList<Bridge> bridges = new ArrayList<>();
    String sql = "SELECT * FROM foto";
    try (Connection connection = dataSource.getConnection();
         PreparedStatement statement = connection.prepareStatement(sql);
         ResultSet resultSet = statement.executeQuery()) {
      while (resultSet.next()) {
        Bridge bridge = new Bridge();
        bridge.setName(resultSet.getString("name"));
        bridge.setDescription(resultSet.getString("description"));
        bridge.setImageFileName(resultSet.getString("imageFileName"));
        bridges.add(bridge);
      }
    } catch (SQLException e) { e.printStackTrace(); }
    return bridges;
  }

  public Bridge getBridge(String name){
    Bridge bridge=null;
    try (Connection conn = dataSource.getConnection()) {
      String query = "SELECT * FROM foto WHERE name = ?";
      PreparedStatement statement = conn.prepareStatement(query);
      statement.setString(1, name);
      ResultSet resultSet = statement.executeQuery();
      if (resultSet.next()) {
        bridge=new Bridge();
        bridge.setName(resultSet.getString("name"));
        bridge.setDescription(resultSet.getString("description"));
        bridge.setImageFileName(resultSet.getString("imageFileName"));
      }
    } catch (SQLException e) { e.printStackTrace(); }
    return bridge;
  }
}
