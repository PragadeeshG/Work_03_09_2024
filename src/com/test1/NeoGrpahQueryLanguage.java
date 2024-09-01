package com.test1;

public class NeoGrpahQueryLanguage {
	private long dataLineageId;
	private String cypherQueryLanguage;
	private String matchComponent;
	private String optonalMatchComponent;
	private String whereComponent;
	private String createFunction;
	private String mergeFunction;
	private String stringAggregation;
	private String csvImportNormal;
	private String csvImportWithCypher;
	private String loadCsvNormal;
	private String loadCsvWithCypher;
	private String startAndSetGoals;
	private String forEachSyntax;

	public NeoGrpahQueryLanguage() {

	}

	public NeoGrpahQueryLanguage(long dataLineageId, String cypherQueryLanguage, String matchComponent,
			String optonalMatchComponent, String whereComponent, String createFunction, String mergeFunction,
			String stringAggregation, String csvImportNormal, String csvImportWithCypher, String loadCsvNormal,
			String loadCsvWithCypher, String startAndSetGoals, String forEachSyntax) {
		super();
		this.dataLineageId = dataLineageId;
		this.cypherQueryLanguage = cypherQueryLanguage;
		this.matchComponent = matchComponent;
		this.optonalMatchComponent = optonalMatchComponent;
		this.whereComponent = whereComponent;
		this.createFunction = createFunction;
		this.mergeFunction = mergeFunction;
		this.stringAggregation = stringAggregation;
		this.csvImportNormal = csvImportNormal;
		this.csvImportWithCypher = csvImportWithCypher;
		this.loadCsvNormal = loadCsvNormal;
		this.loadCsvWithCypher = loadCsvWithCypher;
		this.startAndSetGoals = startAndSetGoals;
		this.forEachSyntax = forEachSyntax;
	}

	public long getDataLineageId() {
		return dataLineageId;
	}

	public void setDataLineageId(long dataLineageId) {
		this.dataLineageId = dataLineageId;
	}

	public String getCypherQueryLanguage() {
		return cypherQueryLanguage;
	}

	public void setCypherQueryLanguage(String cypherQueryLanguage) {
		this.cypherQueryLanguage = cypherQueryLanguage;
	}

	public String getMatchComponent() {
		return matchComponent;
	}

	public void setMatchComponent(String matchComponent) {
		this.matchComponent = matchComponent;
	}

	public String getOptonalMatchComponent() {
		return optonalMatchComponent;
	}

	public void setOptonalMatchComponent(String optonalMatchComponent) {
		this.optonalMatchComponent = optonalMatchComponent;
	}

	public String getWhereComponent() {
		return whereComponent;
	}

	public void setWhereComponent(String whereComponent) {
		this.whereComponent = whereComponent;
	}

	public String getCreateFunction() {
		return createFunction;
	}

	public void setCreateFunction(String createFunction) {
		this.createFunction = createFunction;
	}

	public String getMergeFunction() {
		return mergeFunction;
	}

	public void setMergeFunction(String mergeFunction) {
		this.mergeFunction = mergeFunction;
	}

	public String getStringAggregation() {
		return stringAggregation;
	}

	public void setStringAggregation(String stringAggregation) {
		this.stringAggregation = stringAggregation;
	}

	public String getCsvImportNormal() {
		return csvImportNormal;
	}

	public void setCsvImportNormal(String csvImportNormal) {
		this.csvImportNormal = csvImportNormal;
	}

	public String getCsvImportWithCypher() {
		return csvImportWithCypher;
	}

	public void setCsvImportWithCypher(String csvImportWithCypher) {
		this.csvImportWithCypher = csvImportWithCypher;
	}

	public String getLoadCsvNormal() {
		return loadCsvNormal;
	}

	public void setLoadCsvNormal(String loadCsvNormal) {
		this.loadCsvNormal = loadCsvNormal;
	}

	public String getLoadCsvWithCypher() {
		return loadCsvWithCypher;
	}

	public void setLoadCsvWithCypher(String loadCsvWithCypher) {
		this.loadCsvWithCypher = loadCsvWithCypher;
	}

	public String getStartAndSetGoals() {
		return startAndSetGoals;
	}

	public void setStartAndSetGoals(String startAndSetGoals) {
		this.startAndSetGoals = startAndSetGoals;
	}

	public String getForEachSyntax() {
		return forEachSyntax;
	}

	public void setForEachSyntax(String forEachSyntax) {
		this.forEachSyntax = forEachSyntax;
	}

}
