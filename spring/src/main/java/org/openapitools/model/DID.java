package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * [Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.3)  The Decentralized Identifier Format identifies a subject using a Decentralized Identifier (DID) URL as defined in [DID](https://www.w3.org/TR/did-core/). Subject Identifiers in this format MUST contain a \&quot;url\&quot; member whose value is a DID URL for the DID Subject being identified.  The value of the \&quot;url\&quot; member MUST be a valid DID URL and MAY be a bare DID.  The \&quot;url\&quot; member is REQUIRED and MUST NOT be null or empty.  The Decentralized Identifier Format is identified by the name \&quot;did\&quot;.
 */

@Schema(name = "DID", description = "[Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.3)  The Decentralized Identifier Format identifies a subject using a Decentralized Identifier (DID) URL as defined in [DID](https://www.w3.org/TR/did-core/). Subject Identifiers in this format MUST contain a \"url\" member whose value is a DID URL for the DID Subject being identified.  The value of the \"url\" member MUST be a valid DID URL and MAY be a bare DID.  The \"url\" member is REQUIRED and MUST NOT be null or empty.  The Decentralized Identifier Format is identified by the name \"did\".")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T15:10:11.030458Z[Etc/UTC]")
public class DID implements SimpleSubject {

  /**
   * Gets or Sets format
   */
  public enum FormatEnum {
    DID("did");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FormatEnum format = FormatEnum.DID;

  private String url;

  public DID() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DID(FormatEnum format, String url) {
    this.format = format;
    this.url = url;
  }

  public DID format(FormatEnum format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
  */
  @NotNull 
  @Schema(name = "format", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("format")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public DID url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  @NotNull @Pattern(regexp = "^did:[^\\s]+$") 
  @Schema(name = "url", example = "did:example:123456/did/url/path?versionId=1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DID DID = (DID) o;
    return Objects.equals(this.format, DID.format) &&
        Objects.equals(this.url, DID.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DID {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

