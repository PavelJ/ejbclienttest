/*
 * Copyright (c) 2019 Banking Software Company s.r.o.
 */

package configuration;

import java.util.logging.Logger;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean;

import ejb.remote.RemoteEJBTest;

/**
 * TODO description.
 *
 * @author <a href="mailto:pavel.jira@bsc-ideas.com">Pavel Jira</a>
 */
@Configuration
public class EJBConfiguration {

    private Logger logger = Logger.getLogger(EJBConfiguration.class.getName());

    private static final String TEST_EJB_JNDI_NAME = "java:jboss/exported/ejb-server-test/RemoteEJBTest!ejb.remote.RemoteEJBTest";

    @Bean
    public FactoryBean testEjbRemoteService() {
        final SimpleRemoteStatelessSessionProxyFactoryBean mchCertificationServiceProxy =
                new SimpleRemoteStatelessSessionProxyFactoryBean();

        mchCertificationServiceProxy.setBusinessInterface(RemoteEJBTest.class);
        mchCertificationServiceProxy.setJndiName(TEST_EJB_JNDI_NAME);
        mchCertificationServiceProxy.setResourceRef(Boolean.TRUE);
        mchCertificationServiceProxy.setRefreshHomeOnConnectFailure(Boolean.TRUE);
        mchCertificationServiceProxy.setLookupHomeOnStartup(Boolean.TRUE);

        return mchCertificationServiceProxy;
    }

}
