package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RegisterParameters
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T15:10:11.030458Z[Etc/UTC]")
public class RegisterParameters {

  private URI audience;

  public RegisterParameters audience(URI audience) {
    this.audience = audience;
    return this;
  }

  /**
   * The audience claim to be used for all events on this stream.
   * @return audience
  */
  @Valid 
  @Schema(name = "audience", example = "https://popular-app.com", description = "The audience claim to be used for all events on this stream.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audience")
  public URI getAudience() {
    return audience;
  }

  public void setAudience(URI audience) {
    this.audience = audience;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterParameters registerParameters = (RegisterParameters) o;
    return Objects.equals(this.audience, registerParameters.audience);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audience);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterParameters {\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
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

