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
 * [Spec](https://openid.net/specs/openid-sse-framework-1_0.html#rfc.section.3.4.1)  The \&quot;JWT ID\&quot; Subject Identifier Format specifies a JSON Web Token (JWT) identifier, defined in [RFC7519](https://datatracker.ietf.org/doc/html/rfc7519).
 */

@Schema(name = "JwtID", description = "[Spec](https://openid.net/specs/openid-sse-framework-1_0.html#rfc.section.3.4.1)  The \"JWT ID\" Subject Identifier Format specifies a JSON Web Token (JWT) identifier, defined in [RFC7519](https://datatracker.ietf.org/doc/html/rfc7519).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T15:10:11.030458Z[Etc/UTC]")
public class JwtID implements SimpleSubject {

  /**
   * Gets or Sets format
   */
  public enum FormatEnum {
    JWT_ID("jwt_id");

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

  private FormatEnum format = FormatEnum.JWT_ID;

  private String iss;

  private String jti;

  public JwtID() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JwtID(FormatEnum format, String iss, String jti) {
    this.format = format;
    this.iss = iss;
    this.jti = jti;
  }

  public JwtID format(FormatEnum format) {
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

  public JwtID iss(String iss) {
    this.iss = iss;
    return this;
  }

  /**
   * The \"iss\" (issuer) claim of the JWT being identified, defined in [RFC7519](https://datatracker.ietf.org/doc/html/rfc7519)
   * @return iss
  */
  @NotNull 
  @Schema(name = "iss", example = "https://most-secure.com", description = "The \"iss\" (issuer) claim of the JWT being identified, defined in [RFC7519](https://datatracker.ietf.org/doc/html/rfc7519)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("iss")
  public String getIss() {
    return iss;
  }

  public void setIss(String iss) {
    this.iss = iss;
  }

  public JwtID jti(String jti) {
    this.jti = jti;
    return this;
  }

  /**
   * The \"jti\" (JWT token ID) claim of the JWT being identified, defined in [RFC7519](https://datatracker.ietf.org/doc/html/rfc7519)
   * @return jti
  */
  @NotNull 
  @Schema(name = "jti", example = "B70BA622-9515-4353-A866-823539EECBC8", description = "The \"jti\" (JWT token ID) claim of the JWT being identified, defined in [RFC7519](https://datatracker.ietf.org/doc/html/rfc7519)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("jti")
  public String getJti() {
    return jti;
  }

  public void setJti(String jti) {
    this.jti = jti;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JwtID jwtID = (JwtID) o;
    return Objects.equals(this.format, jwtID.format) &&
        Objects.equals(this.iss, jwtID.iss) &&
        Objects.equals(this.jti, jwtID.jti);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, iss, jti);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JwtID {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    jti: ").append(toIndentedString(jti)).append("\n");
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

