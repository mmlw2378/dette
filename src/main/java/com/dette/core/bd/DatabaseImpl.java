package com.dette.core.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseImpl {
    private static final String URL = "jdbc:postgresql://localhost:5433/detteen_Java";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Marielouise03";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erreur de connexion à la base de données", e);
        }
    }
}