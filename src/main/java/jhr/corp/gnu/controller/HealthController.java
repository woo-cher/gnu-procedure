package jhr.corp.gnu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.SQLException;

@RestController
@RequestMapping(value = "/")
public class HealthController {
    private static final Logger logger = LoggerFactory.getLogger(HealthController.class);

    @Autowired
    private DataSource dataSource;

    @RequestMapping(value = "/health")
    @PostConstruct
    public String health() throws SQLException {
        return "Ok! Good!";
    }

    @RequestMapping(value = "/status")
    @PostConstruct
    public boolean connection() throws SQLException {
        return dataSource.getConnection() != null;
    }
}
