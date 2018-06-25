package org.quwb.utils.threads.local;

import java.sql.Connection;

public class ConnectionManager {
    private static Connection connect = null;

    private static ThreadLocal<Connection> tConnect = new ThreadLocal<Connection>() {
        @Override
        protected Connection initialValue() {
            return null;
        }
    };
}
