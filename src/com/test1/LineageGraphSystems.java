package com.test1;

public class LineageGraphSystems {
	private long dataLineageId;
	private long costCentreCode;
	private String sourceSystem;
	private String counterPartyName;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public LineageGraphSystems() {

	}

	public LineageGraphSystems(long dataLineageId, long costCentreCode, String sourceSystem, String counterPartyName,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.dataLineageId = dataLineageId;
		this.costCentreCode = costCentreCode;
		this.sourceSystem = sourceSystem;
		this.counterPartyName = counterPartyName;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getDataLineageId() {
		return dataLineageId;
	}

	public void setDataLineageId(long dataLineageId) {
		this.dataLineageId = dataLineageId;
	}

	public long getCostCentreCode() {
		return costCentreCode;
	}

	public void setCostCentreCode(long costCentreCode) {
		this.costCentreCode = costCentreCode;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getCounterPartyName() {
		return counterPartyName;
	}

	public void setCounterPartyName(String counterPartyName) {
		this.counterPartyName = counterPartyName;
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
