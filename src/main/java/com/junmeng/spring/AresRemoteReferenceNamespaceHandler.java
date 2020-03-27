package com.junmeng.spring;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author james
 * @date 2020/3/27
 */
public class AresRemoteReferenceNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("reference", new RevokerFactoryBeanDefinitionParser());
    }
}
