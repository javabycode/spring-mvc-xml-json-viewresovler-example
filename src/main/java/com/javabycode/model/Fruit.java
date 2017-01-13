package com.javabycode.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Fruit {

    private Integer id;
    private String name;
    private String produceBy;

    public Fruit() {
    }

    public Fruit(Integer id, String name, String produceBy){
    	this.id = id;
    	this.name = name;
    	this.produceBy = produceBy;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProduceBy() {
		return produceBy;
	}
    
}