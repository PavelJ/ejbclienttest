/*
 * Copyright (c) 2019 Banking Software Company s.r.o.
 */

package database;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "connection")
public class DbConnectionProps {
    String url;
    String username;
    String password;
    String driverClassName;
    String jndiName;

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(final String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getJndiName() {
        return jndiName;
    }

    public void setJndiName(final String jndiName) {
        this.jndiName = jndiName;
    }
}
