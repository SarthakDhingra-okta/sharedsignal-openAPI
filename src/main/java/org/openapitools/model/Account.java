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
 * [Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.1)  The Account Identifier Format identifies a subject using an account at a service provider, identified with an \&quot;acct\&quot; URI as defined in [RFC7565](https://datatracker.ietf.org/doc/html/rfc7565). Subject Identifiers in this format MUST contain a \&quot;uri\&quot; member whose value is the \&quot;acct\&quot; URI for the subject.  The \&quot;uri\&quot; member is REQUIRED and MUST NOT be null or empty.  The Account Identifier Format is identified by the name \&quot;account\&quot;.
 */

@Schema(name = "Account", description = "[Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.1)  The Account Identifier Format identifies a subject using an account at a service provider, identified with an \"acct\" URI as defined in [RFC7565](https://datatracker.ietf.org/doc/html/rfc7565). Subject Identifiers in this format MUST contain a \"uri\" member whose value is the \"acct\" URI for the subject.  The \"uri\" member is REQUIRED and MUST NOT be null or empty.  The Account Identifier Format is identified by the name \"account\".")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T15:10:11.030458Z[Etc/UTC]")
public class Account implements SimpleSubject {

  /**
   * Gets or Sets format
   */
  public enum FormatEnum {
    ACCOUNT("account");

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

  private FormatEnum format = FormatEnum.ACCOUNT;

  private String uri;

  public Account() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Account(FormatEnum format, String uri) {
    this.format = format;
    this.uri = uri;
  }

  public Account format(FormatEnum format) {
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

  public Account uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Get uri
   * @return uri
  */
  @NotNull @Pattern(regexp = "^acct:[^\\s]+$") 
  @Schema(name = "uri", example = "acct:reginold@popular-app.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.format, account.format) &&
        Objects.equals(this.uri, account.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

