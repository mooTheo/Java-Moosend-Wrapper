/*
 * Moosend API
 * TODO: Add a description
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Paging76
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:06:19.511Z")
public class Paging76 {
  @SerializedName("CurrentPage")
  private Double currentPage = null;

  @SerializedName("PageSize")
  private Double pageSize = null;

  @SerializedName("SortIsAscending")
  private Boolean sortIsAscending = null;

  @SerializedName("TotalPageCount")
  private Double totalPageCount = null;

  @SerializedName("TotalResults")
  private Double totalResults = null;

  public Paging76 currentPage(Double currentPage) {
    this.currentPage = currentPage;
    return this;
  }

   /**
   * 
   * @return currentPage
  **/
  @ApiModelProperty(value = "")
  public Double getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Double currentPage) {
    this.currentPage = currentPage;
  }

  public Paging76 pageSize(Double pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 
   * @return pageSize
  **/
  @ApiModelProperty(value = "")
  public Double getPageSize() {
    return pageSize;
  }

  public void setPageSize(Double pageSize) {
    this.pageSize = pageSize;
  }

  public Paging76 sortIsAscending(Boolean sortIsAscending) {
    this.sortIsAscending = sortIsAscending;
    return this;
  }

   /**
   * 
   * @return sortIsAscending
  **/
  @ApiModelProperty(value = "")
  public Boolean getSortIsAscending() {
    return sortIsAscending;
  }

  public void setSortIsAscending(Boolean sortIsAscending) {
    this.sortIsAscending = sortIsAscending;
  }

  public Paging76 totalPageCount(Double totalPageCount) {
    this.totalPageCount = totalPageCount;
    return this;
  }

   /**
   * 
   * @return totalPageCount
  **/
  @ApiModelProperty(value = "")
  public Double getTotalPageCount() {
    return totalPageCount;
  }

  public void setTotalPageCount(Double totalPageCount) {
    this.totalPageCount = totalPageCount;
  }

  public Paging76 totalResults(Double totalResults) {
    this.totalResults = totalResults;
    return this;
  }

   /**
   * 
   * @return totalResults
  **/
  @ApiModelProperty(value = "")
  public Double getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Double totalResults) {
    this.totalResults = totalResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paging76 paging76 = (Paging76) o;
    return Objects.equals(this.currentPage, paging76.currentPage) &&
        Objects.equals(this.pageSize, paging76.pageSize) &&
        Objects.equals(this.sortIsAscending, paging76.sortIsAscending) &&
        Objects.equals(this.totalPageCount, paging76.totalPageCount) &&
        Objects.equals(this.totalResults, paging76.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, pageSize, sortIsAscending, totalPageCount, totalResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paging76 {\n");
    
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sortIsAscending: ").append(toIndentedString(sortIsAscending)).append("\n");
    sb.append("    totalPageCount: ").append(toIndentedString(totalPageCount)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

