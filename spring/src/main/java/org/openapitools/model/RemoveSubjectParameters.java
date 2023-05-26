package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.RemoveSubjectParametersSubject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RemoveSubjectParameters
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T15:10:11.030458Z[Etc/UTC]")
public class RemoveSubjectParameters {

  private RemoveSubjectParametersSubject subject;

  public RemoveSubjectParameters() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RemoveSubjectParameters(RemoveSubjectParametersSubject subject) {
    this.subject = subject;
  }

  public RemoveSubjectParameters subject(RemoveSubjectParametersSubject subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  */
  @NotNull @Valid 
  @Schema(name = "subject", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subject")
  public RemoveSubjectParametersSubject getSubject() {
    return subject;
  }

  public void setSubject(RemoveSubjectParametersSubject subject) {
    this.subject = subject;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveSubjectParameters removeSubjectParameters = (RemoveSubjectParameters) o;
    return Objects.equals(this.subject, removeSubjectParameters.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveSubjectParameters {\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

