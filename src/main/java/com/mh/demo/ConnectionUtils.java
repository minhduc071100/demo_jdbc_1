package com.mh.demo;


import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.codegen.GenerationTool;
import org.jooq.impl.DSL;

import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    String userName = "user";
    String password = "pass";
    String url = "jdbc:mysql://localost:3306/website1";

    public void getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, userName, password);
            DSLContext context = DSL.using(conn, SQLDialect.MYSQL);
            //
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            GenerationTool.generate(
                    Files.readString(
                            Path.of("jooq-config.xml")
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
