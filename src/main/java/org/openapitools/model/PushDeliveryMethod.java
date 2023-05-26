package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PushDeliveryMethod
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T15:10:11.030458Z[Etc/UTC]")
public class PushDeliveryMethod implements StreamConfigurationDelivery {

  /**
   * Gets or Sets method
   */
  public enum MethodEnum {
    HTTPS_SCHEMAS_OPENID_NET_SECEVENT_RISC_DELIVERY_METHOD_PUSH("https://schemas.openid.net/secevent/risc/delivery-method/push");

    private String value;

    MethodEnum(String value) {
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
    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MethodEnum method = MethodEnum.HTTPS_SCHEMAS_OPENID_NET_SECEVENT_RISC_DELIVERY_METHOD_PUSH;

  private URI endpointUrl;

  private String authorizationHeader;

  public PushDeliveryMethod() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PushDeliveryMethod(MethodEnum method, URI endpointUrl) {
    this.method = method;
    this.endpointUrl = endpointUrl;
  }

  public PushDeliveryMethod method(MethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  */
  @NotNull 
  @Schema(name = "method", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public PushDeliveryMethod endpointUrl(URI endpointUrl) {
    this.endpointUrl = endpointUrl;
    return this;
  }

  /**
   * The URL where events are pushed through HTTP POST. This is set by the Receiver.
   * @return endpointUrl
  */
  @NotNull @Valid 
  @Schema(name = "endpoint_url", description = "The URL where events are pushed through HTTP POST. This is set by the Receiver.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endpoint_url")
  public URI getEndpointUrl() {
    return endpointUrl;
  }

  public void setEndpointUrl(URI endpointUrl) {
    this.endpointUrl = endpointUrl;
  }

  public PushDeliveryMethod authorizationHeader(String authorizationHeader) {
    this.authorizationHeader = authorizationHeader;
    return this;
  }

  /**
   * The HTTP Authorization header that the Transmitter MUST set with each event delivery, if the configuration is present. The value is optional and it is set by the Receiver.
   * @return authorizationHeader
  */
  
  @Schema(name = "authorization_header", description = "The HTTP Authorization header that the Transmitter MUST set with each event delivery, if the configuration is present. The value is optional and it is set by the Receiver.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorization_header")
  public String getAuthorizationHeader() {
    return authorizationHeader;
  }

  public void setAuthorizationHeader(String authorizationHeader) {
    this.authorizationHeader = authorizationHeader;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushDeliveryMethod pushDeliveryMethod = (PushDeliveryMethod) o;
    return Objects.equals(this.method, pushDeliveryMethod.method) &&
        Objects.equals(this.endpointUrl, pushDeliveryMethod.endpointUrl) &&
        Objects.equals(this.authorizationHeader, pushDeliveryMethod.authorizationHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, endpointUrl, authorizationHeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushDeliveryMethod {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    endpointUrl: ").append(toIndentedString(endpointUrl)).append("\n");
    sb.append("    authorizationHeader: ").append(toIndentedString(authorizationHeader)).append("\n");
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

