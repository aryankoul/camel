/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.translate;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class TranslateComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.aws.translate.TranslateConfiguration getOrCreateConfiguration(TranslateComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws.translate.TranslateConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        TranslateComponent target = (TranslateComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "autodetectsourcelanguage":
        case "autodetectSourceLanguage": getOrCreateConfiguration(target).setAutodetectSourceLanguage(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws.translate.TranslateConfiguration.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, org.apache.camel.component.aws.translate.TranslateOperations.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcelanguage":
        case "sourceLanguage": getOrCreateConfiguration(target).setSourceLanguage(property(camelContext, java.lang.String.class, value)); return true;
        case "targetlanguage":
        case "targetLanguage": getOrCreateConfiguration(target).setTargetLanguage(property(camelContext, java.lang.String.class, value)); return true;
        case "translateclient":
        case "translateClient": getOrCreateConfiguration(target).setTranslateClient(property(camelContext, com.amazonaws.services.translate.AmazonTranslate.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

