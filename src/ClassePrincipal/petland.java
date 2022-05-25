package ClassePrincipal;

import Conexoes.MySQL;
import Telas.Jflogin;
import java.sql.Connection;
import java.sql.SQLException;

public class petland {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;

        Jflogin login = new Jflogin();
        login.setVisible(true);

        /*MySQL novacon = new MySQL();
        novacon.conectaBanco();*/

    }

}
