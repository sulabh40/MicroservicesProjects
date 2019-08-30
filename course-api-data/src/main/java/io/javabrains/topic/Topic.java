package io.javabrains.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@JsonIgnoreProperties({"msg"})
@JsonInclude(value = Include.NON_EMPTY)
public class Topic {
@Id
@JsonProperty(value="Topic_id",access = Access.WRITE_ONLY)
	private String id;
	private String name;
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	private String author;
	@JsonProperty(access = Access.READ_ONLY )
	private String Description;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		Description = description;
	}

	public Topic() {
		
	}
	
}
