package payme.making_payments.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {


    @Bean("postgres")
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/uktam");
        dataSourceBuilder.username("postgres");
        dataSourceBuilder.password("uktam@1997");
        return dataSourceBuilder.build();
    }
}
