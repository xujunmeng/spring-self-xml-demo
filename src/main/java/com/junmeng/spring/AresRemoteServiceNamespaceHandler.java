package com.junmeng.spring;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author james
 * @date 2020/3/27
 */
public class AresRemoteServiceNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("service", new ProviderFactoryBeanDefinitionParser());
    }
}
