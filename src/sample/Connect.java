package sample;

import sample.model.db.AbstractDatabase;
import sample.model.db.MySQLConnector;

public class Connect {
    public static AbstractDatabase connect() {
        return new MySQLConnector("d0345762", "5AHEL2021", "rathgeb.at", 3306, "d0345762");
    }
}
