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
 * [Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.7)  The Phone Number Identifier Format identifies a subject using a telephone number.  Subject Identifiers in this format MUST contain a \&quot;phone_number\&quot; member whose value is a string containing the full telephone number of the subject, including international dialing prefix, formatted according to E.164 [E164](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#ref-E164). The \&quot;phone_number\&quot; member is REQUIRED and MUST NOT be null or empty. The Phone Number Identifier Format is identified by the name \&quot;phone_number\&quot;.
 */

@Schema(name = "PhoneNumber", description = "[Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.7)  The Phone Number Identifier Format identifies a subject using a telephone number.  Subject Identifiers in this format MUST contain a \"phone_number\" member whose value is a string containing the full telephone number of the subject, including international dialing prefix, formatted according to E.164 [E164](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#ref-E164). The \"phone_number\" member is REQUIRED and MUST NOT be null or empty. The Phone Number Identifier Format is identified by the name \"phone_number\".")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T15:10:11.030458Z[Etc/UTC]")
public class PhoneNumber implements SimpleSubject {

  /**
   * Gets or Sets format
   */
  public enum FormatEnum {
    PHONE_NUMBER("phone_number");

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

  private FormatEnum format = FormatEnum.PHONE_NUMBER;

  private String phoneNumber;

  public PhoneNumber() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PhoneNumber(FormatEnum format, String phoneNumber) {
    this.format = format;
    this.phoneNumber = phoneNumber;
  }

  public PhoneNumber format(FormatEnum format) {
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

  public PhoneNumber phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  @NotNull 
  @Schema(name = "phone_number", example = "+12065550100", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("phone_number")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumber phoneNumber = (PhoneNumber) o;
    return Objects.equals(this.format, phoneNumber.format) &&
        Objects.equals(this.phoneNumber, phoneNumber.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumber {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

