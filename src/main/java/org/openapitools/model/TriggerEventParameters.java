package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.TriggerEventParametersSubject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * JSON Object describing request to create a security event to test SSE receiver/transmitter  
 */

@Schema(name = "TriggerEventParameters", description = "JSON Object describing request to create a security event to test SSE receiver/transmitter  ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T15:10:11.030458Z[Etc/UTC]")
public class TriggerEventParameters {

  /**
   * Supports all [RISC](https://openid.net/specs/openid-risc-profile-specification-1_0-01.html) and [CAEP](https://openid.net/specs/openid-caep-specification-1_0-ID1.html) event types.
   */
  public enum EventTypeEnum {
    SESSION_REVOKED("session-revoked"),
    
    TOKEN_CLAIMS_CHANGE("token-claims-change"),
    
    CREDENTIAL_CHANGE("credential-change"),
    
    ASSURANCE_LEVEL_CHANGE("assurance-level-change"),
    
    DEVICE_COMPLIANCE_CHANGE("device-compliance-change"),
    
    ACCOUNT_PURGED("account-purged"),
    
    ACCOUNT_DISABLED("account-disabled"),
    
    ACCOUNT_ENABLED("account-enabled"),
    
    IDENTIFIER_CHANGED("identifier-changed"),
    
    IDENTIFIER_RECYCLED("identifier-recycled"),
    
    CREDENTIAL_COMPROMISE("credential-compromise"),
    
    OPT_IN("opt-in"),
    
    OPT_OUT_INITIATED("opt-out-initiated"),
    
    OPT_OUT_CANCELLED("opt-out-cancelled"),
    
    OPT_OUT_EFFECTIVE("opt-out-effective"),
    
    RECOVERY_ACTIVATED("recovery-activated"),
    
    RECOVERY_INFORMATION_CHANGED("recovery-information-changed");

    private String value;

    EventTypeEnum(String value) {
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
    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private EventTypeEnum eventType;

  private TriggerEventParametersSubject subject;

  public TriggerEventParameters() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TriggerEventParameters(EventTypeEnum eventType, TriggerEventParametersSubject subject) {
    this.eventType = eventType;
    this.subject = subject;
  }

  public TriggerEventParameters eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Supports all [RISC](https://openid.net/specs/openid-risc-profile-specification-1_0-01.html) and [CAEP](https://openid.net/specs/openid-caep-specification-1_0-ID1.html) event types.
   * @return eventType
  */
  @NotNull 
  @Schema(name = "event_type", example = "credential-compromise", description = "Supports all [RISC](https://openid.net/specs/openid-risc-profile-specification-1_0-01.html) and [CAEP](https://openid.net/specs/openid-caep-specification-1_0-ID1.html) event types.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_type")
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public TriggerEventParameters subject(TriggerEventParametersSubject subject) {
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
  public TriggerEventParametersSubject getSubject() {
    return subject;
  }

  public void setSubject(TriggerEventParametersSubject subject) {
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
    TriggerEventParameters triggerEventParameters = (TriggerEventParameters) o;
    return Objects.equals(this.eventType, triggerEventParameters.eventType) &&
        Objects.equals(this.subject, triggerEventParameters.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerEventParameters {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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

