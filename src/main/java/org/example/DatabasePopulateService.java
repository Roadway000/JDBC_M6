package org.example;

import java.sql.Connection;
import java.util.List;

public class DatabasePopulateService {
    public static void main(String[] args) throws Exception {
        executeBatchedSQL(8);
    }
    public static void executeBatchedSQL(int batchSize) throws Exception {
        Connection databaseConnection = Database.getInstance().getConnection();
        List<String> sqlStatements = Database.parseSQLScript("src/main/SQL/populate_db.sql", true);
        Database.executeBatches(databaseConnection, sqlStatements, batchSize);
    }
}
