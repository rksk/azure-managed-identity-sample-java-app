package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class Main {
    public static void main(String[] args) throws Exception {

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setServerName("<server-name>"); // Replace with your server name
        ds.setDatabaseName("<db-name>"); // Replace with your database name
        ds.setAuthentication("ActiveDirectoryManagedIdentity"); // ActiveDirectoryManagedIdentity for JDBC driver version v12.2.0+

        // Optional
        // ds.setUser("<client-id>"); // Replace with Client ID of User-Assigned Managed Identity to be used

        try (Connection connection = ds.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT SUSER_SNAME()")) {
            if (rs.next()) {
                System.out.println("You have successfully logged on as: " + rs.getString(1));
            }
        }
    }
}
