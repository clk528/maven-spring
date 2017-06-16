package com.clk.core.dict;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.xml.bind.PropertyException;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class Configurer extends PropertyPlaceholderConfigurer{
	private static Map<String,String> propertyMap = new HashMap<String, String>();
	
	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException{
		super.processProperties(beanFactoryToProcess, props);
        for (Object key : props.keySet()) {
            String keyStr = key.toString();
            String value = props.getProperty(keyStr);
            //System.out.println(keyStr+" = " + value);
            propertyMap.put(keyStr, value);
        }
	}
	
	public static String getProperty(String name) throws PropertyException{
		String value = propertyMap.get(name);
		return value != null ? value : null;
	}
}
