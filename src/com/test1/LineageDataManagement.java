package com.test1;

public class LineageDataManagement {
	private long systemCode;
	private String graphDatabase;
	private String graphSchema;
	private String grpahQueryLanguage;
	private String resolver;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public LineageDataManagement() {

	}

	public LineageDataManagement(long systemCode, String graphDatabase, String graphSchema, String grpahQueryLanguage,
			String resolver, String creationDate, String modifiedDate, String entityState) {
		super();
		this.systemCode = systemCode;
		this.graphDatabase = graphDatabase;
		this.graphSchema = graphSchema;
		this.grpahQueryLanguage = grpahQueryLanguage;
		this.resolver = resolver;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(long systemCode) {
		this.systemCode = systemCode;
	}

	public String getGraphDatabase() {
		return graphDatabase;
	}

	public void setGraphDatabase(String graphDatabase) {
		this.graphDatabase = graphDatabase;
	}

	public String getGraphSchema() {
		return graphSchema;
	}

	public void setGraphSchema(String graphSchema) {
		this.graphSchema = graphSchema;
	}

	public String getGrpahQueryLanguage() {
		return grpahQueryLanguage;
	}

	public void setGrpahQueryLanguage(String grpahQueryLanguage) {
		this.grpahQueryLanguage = grpahQueryLanguage;
	}

	public String getResolver() {
		return resolver;
	}

	public void setResolver(String resolver) {
		this.resolver = resolver;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
