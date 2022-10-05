package by.trucking.repository;

import by.trucking.model.*;
import by.trucking.utils.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientRepositoryDBImpl implements ClientRepository{

    @Override
    public Client save(Client client) {
        return null;
    }

    @Override
    public Client edit(Client client) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Client> getClients() {
        List<Client> clientList = new ArrayList<>();
        try (Connection connection = ConnectionDB.getConnect();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("SELECT * FROM clients")) {
            while (rs.next()) {
                Client c = new Client(rs.getInt("id"),
                        rs.getString("contact"),
                        rs.getString("title"),
                        new User(rs.getInt("user_id")));
                clientList.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientList;
    }





    @Override
    public Client getById(int id) throws SQLException {
        return null;
    }


    @Override
    public Client getByTitle(String title) {
        return null;
    }
}
