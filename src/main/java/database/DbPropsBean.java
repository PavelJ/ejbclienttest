/*
 * Copyright (c) 2019 Banking Software Company s.r.o.
 */

package database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO description.
 *
 * @author <a href="mailto:pavel.jira@bsc-ideas.com">Pavel Jira</a>
 */
@Configuration
public class DbPropsBean {

    @Bean
    public DbConnectionProps dbConnectionProps() {
        return new DbConnectionProps();
    }

}
