
package us.kbase.mak;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: MAKInputData</p>
 * <pre>
 * MAK dataset source 
 *         string taxon - NCBI taxonomy id
 *         string genome_id - kbase id of genome
 *         genome_ws_ref genome_ref - ws genome object reference
 *         string id - kbase id
 *         string ws_id - reference to workspace id of FloatDataTable object for input data
 *         string data_type - type of data: "expression", "fitness"
 *         string description - description
 *         string dataPath - path to data
 *     int num_rows - number of rows
 *     int num_columns - number of columns
 *                   
 *     @optional id
 *     @optional dataPath
 *     @optional num_rows
 *     @optional num_cols
 *         @searchable ws_subset taxon id description
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "taxon",
    "genome_id",
    "genome_ref",
    "id",
    "data_type",
    "description",
    "dataPath",
    "num_rows",
    "num_cols"
})
public class MAKInputData {

    @JsonProperty("taxon")
    private String taxon;
    @JsonProperty("genome_id")
    private String genomeId;
    @JsonProperty("genome_ref")
    private String genomeRef;
    @JsonProperty("id")
    private String id;
    @JsonProperty("data_type")
    private String dataType;
    @JsonProperty("description")
    private String description;
    @JsonProperty("dataPath")
    private String dataPath;
    @JsonProperty("num_rows")
    private Long numRows;
    @JsonProperty("num_cols")
    private Long numCols;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("taxon")
    public String getTaxon() {
        return taxon;
    }

    @JsonProperty("taxon")
    public void setTaxon(String taxon) {
        this.taxon = taxon;
    }

    public MAKInputData withTaxon(String taxon) {
        this.taxon = taxon;
        return this;
    }

    @JsonProperty("genome_id")
    public String getGenomeId() {
        return genomeId;
    }

    @JsonProperty("genome_id")
    public void setGenomeId(String genomeId) {
        this.genomeId = genomeId;
    }

    public MAKInputData withGenomeId(String genomeId) {
        this.genomeId = genomeId;
        return this;
    }

    @JsonProperty("genome_ref")
    public String getGenomeRef() {
        return genomeRef;
    }

    @JsonProperty("genome_ref")
    public void setGenomeRef(String genomeRef) {
        this.genomeRef = genomeRef;
    }

    public MAKInputData withGenomeRef(String genomeRef) {
        this.genomeRef = genomeRef;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public MAKInputData withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("data_type")
    public String getDataType() {
        return dataType;
    }

    @JsonProperty("data_type")
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public MAKInputData withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public MAKInputData withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("dataPath")
    public String getDataPath() {
        return dataPath;
    }

    @JsonProperty("dataPath")
    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }

    public MAKInputData withDataPath(String dataPath) {
        this.dataPath = dataPath;
        return this;
    }

    @JsonProperty("num_rows")
    public Long getNumRows() {
        return numRows;
    }

    @JsonProperty("num_rows")
    public void setNumRows(Long numRows) {
        this.numRows = numRows;
    }

    public MAKInputData withNumRows(Long numRows) {
        this.numRows = numRows;
        return this;
    }

    @JsonProperty("num_cols")
    public Long getNumCols() {
        return numCols;
    }

    @JsonProperty("num_cols")
    public void setNumCols(Long numCols) {
        this.numCols = numCols;
    }

    public MAKInputData withNumCols(Long numCols) {
        this.numCols = numCols;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((("MAKInputData"+" [taxon=")+ taxon)+", genomeId=")+ genomeId)+", genomeRef=")+ genomeRef)+", id=")+ id)+", dataType=")+ dataType)+", description=")+ description)+", dataPath=")+ dataPath)+", numRows=")+ numRows)+", numCols=")+ numCols)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
