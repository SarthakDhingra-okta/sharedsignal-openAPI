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
 * [Spec](https://openid.net/specs/openid-sse-framework-1_0.html#rfc.section.3.4.2)  The \&quot;SAML Assertion ID\&quot; Subject Identifier Format specifies a SAML 2.0 [OASIS.saml-core-2.0-os](https://openid.net/specs/openid-sse-framework-1_0.html#OASIS.saml-core-2.0-os) assertion identifier.
 */

@Schema(name = "SamlAssertionID", description = "[Spec](https://openid.net/specs/openid-sse-framework-1_0.html#rfc.section.3.4.2)  The \"SAML Assertion ID\" Subject Identifier Format specifies a SAML 2.0 [OASIS.saml-core-2.0-os](https://openid.net/specs/openid-sse-framework-1_0.html#OASIS.saml-core-2.0-os) assertion identifier.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T15:10:11.030458Z[Etc/UTC]")
public class SamlAssertionID implements SimpleSubject {

  /**
   * Gets or Sets format
   */
  public enum FormatEnum {
    SAML_ASSERTION_ID("saml_assertion_id");

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

  private FormatEnum format = FormatEnum.SAML_ASSERTION_ID;

  private String issuer;

  private String assertionId;

  public SamlAssertionID() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SamlAssertionID(FormatEnum format, String issuer, String assertionId) {
    this.format = format;
    this.issuer = issuer;
    this.assertionId = assertionId;
  }

  public SamlAssertionID format(FormatEnum format) {
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

  public SamlAssertionID issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * The \"Issuer\" value of the SAML assertion being identified, defined in [OASIS.saml-core-2.0-os](https://openid.net/specs/openid-sse-framework-1_0.html#OASIS.saml-core-2.0-os)
   * @return issuer
  */
  @NotNull 
  @Schema(name = "issuer", example = "https://most-secure.com", description = "The \"Issuer\" value of the SAML assertion being identified, defined in [OASIS.saml-core-2.0-os](https://openid.net/specs/openid-sse-framework-1_0.html#OASIS.saml-core-2.0-os)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issuer")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public SamlAssertionID assertionId(String assertionId) {
    this.assertionId = assertionId;
    return this;
  }

  /**
   * The \"ID\" value of the SAML assertion being identified, defined in [OASIS.saml-core-2.0-os](https://openid.net/specs/openid-sse-framework-1_0.html#OASIS.saml-core-2.0-os)
   * @return assertionId
  */
  @NotNull 
  @Schema(name = "assertion_id", example = "_8e8dc5f69a98cc4c1ff3427e5ce34606fd672f91e6", description = "The \"ID\" value of the SAML assertion being identified, defined in [OASIS.saml-core-2.0-os](https://openid.net/specs/openid-sse-framework-1_0.html#OASIS.saml-core-2.0-os)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assertion_id")
  public String getAssertionId() {
    return assertionId;
  }

  public void setAssertionId(String assertionId) {
    this.assertionId = assertionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlAssertionID samlAssertionID = (SamlAssertionID) o;
    return Objects.equals(this.format, samlAssertionID.format) &&
        Objects.equals(this.issuer, samlAssertionID.issuer) &&
        Objects.equals(this.assertionId, samlAssertionID.assertionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, issuer, assertionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlAssertionID {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    assertionId: ").append(toIndentedString(assertionId)).append("\n");
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

