package payme.makingPayments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class Repo {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public Repo setJdbcTemplate(DataSource postgres, JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = new JdbcTemplate(postgres);
        return this;
    }

    public void getDataFromTable(){
        String sql = "select * from cities";
        jdbcTemplate.query(sql, new RowMapper<Object>() {

            @Override
            public Object mapRow(ResultSet resultSet, int i)throws SQLException{
                return null;
            }
        });
    }

    public List<UserData2> getUserData(){
        String sql = "select * from user_data";
        List<UserData2> list = new ArrayList<>();
        jdbcTemplate.query(sql, (resultSet, i) -> {
            list.add(
                    new UserData2().setUsername(resultSet.getString("username"))
                            .setName(resultSet.getString("name"))
                    .setPassword(resultSet.getString("password"))
                    .setEmail(resultSet.getString("email"))
            );
            return null;
        });
      return list;
    }


    public void insertIntoTable(UserData2 data2) {
        String sql = "insert into user_data(email,name,password,username) values("+data2.getEmail()+
                ","
                +data2.getName()+","
                +data2.getPassword()+","
                +data2.getUsername()+")";
        jdbcTemplate.execute(sql);
    }

    public static void main(String[] args) {

        String x = "a" + 1 +"," + 2 +"," + 3;

    }
}
