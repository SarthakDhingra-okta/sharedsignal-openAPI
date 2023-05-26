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
 * [Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.4)  The Email Identifier Format identifies a subject using an email address.  Subject Identifiers in this format MUST contain an \&quot;email\&quot; member whose value is a string containing the email address of the subject, formatted as an \&quot;addr-spec\&quot; as defined in Section 3.4.1 of [RFC5322](https://datatracker.ietf.org/doc/html/rfc5322). The \&quot;email\&quot; member is REQUIRED and MUST NOT be null or empty.  The value of the \&quot;email\&quot; member SHOULD identify a mailbox to which email may be delivered, in accordance with [RFC5321](https://datatracker.ietf.org/doc/html/rfc5321). The Email Identifier Format is identified by the name \&quot;email\&quot;.
 */

@Schema(name = "Email", description = "[Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.4)  The Email Identifier Format identifies a subject using an email address.  Subject Identifiers in this format MUST contain an \"email\" member whose value is a string containing the email address of the subject, formatted as an \"addr-spec\" as defined in Section 3.4.1 of [RFC5322](https://datatracker.ietf.org/doc/html/rfc5322). The \"email\" member is REQUIRED and MUST NOT be null or empty.  The value of the \"email\" member SHOULD identify a mailbox to which email may be delivered, in accordance with [RFC5321](https://datatracker.ietf.org/doc/html/rfc5321). The Email Identifier Format is identified by the name \"email\".")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T15:10:11.030458Z[Etc/UTC]")
public class Email implements SimpleSubject {

  /**
   * Gets or Sets format
   */
  public enum FormatEnum {
    EMAIL("email");

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

  private FormatEnum format = FormatEnum.EMAIL;

  private String email;

  public Email() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Email(FormatEnum format, String email) {
    this.format = format;
    this.email = email;
  }

  public Email format(FormatEnum format) {
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

  public Email email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull @Pattern(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])") 
  @Schema(name = "email", example = "reginold@popular-app.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Email email = (Email) o;
    return Objects.equals(this.format, email.format) &&
        Objects.equals(this.email, email.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

