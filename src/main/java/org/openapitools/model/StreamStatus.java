package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.StreamStatusSubject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StreamStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T15:10:11.030458Z[Etc/UTC]")
public class StreamStatus {

  /**
   * REQUIRED. The status of the stream. Values can be one of:  enabled:   The Transmitter MUST transmit events over the stream,   according to the stream’s configured delivery method.  paused:   The Transmitter MUST NOT transmit events over the stream.   The transmitter will hold any events it would have transmitted while paused,   and SHOULD transmit them when the stream’s status becomes enabled.   If a Transmitter holds successive events that affect the same Subject Principal,   then the Transmitter MUST make sure that those events are transmitted in   the order of time that they were generated OR the Transmitter MUST send   only the last events that do not require the previous events affecting   the same Subject Principal to be processed by the Receiver,   because the previous events are either cancelled by the later events or   the previous events are outdated.  disabled:   The Transmitter MUST NOT transmit events over the stream,   and will not hold any events for later transmission.
   */
  public enum StatusEnum {
    ENABLED("enabled"),
    
    PAUSED("paused"),
    
    DISABLED("disabled");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private StreamStatusSubject subject;

  public StreamStatus() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StreamStatus(StatusEnum status) {
    this.status = status;
  }

  public StreamStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * REQUIRED. The status of the stream. Values can be one of:  enabled:   The Transmitter MUST transmit events over the stream,   according to the stream’s configured delivery method.  paused:   The Transmitter MUST NOT transmit events over the stream.   The transmitter will hold any events it would have transmitted while paused,   and SHOULD transmit them when the stream’s status becomes enabled.   If a Transmitter holds successive events that affect the same Subject Principal,   then the Transmitter MUST make sure that those events are transmitted in   the order of time that they were generated OR the Transmitter MUST send   only the last events that do not require the previous events affecting   the same Subject Principal to be processed by the Receiver,   because the previous events are either cancelled by the later events or   the previous events are outdated.  disabled:   The Transmitter MUST NOT transmit events over the stream,   and will not hold any events for later transmission.
   * @return status
  */
  @NotNull 
  @Schema(name = "status", example = "disabled", description = "REQUIRED. The status of the stream. Values can be one of:  enabled:   The Transmitter MUST transmit events over the stream,   according to the stream’s configured delivery method.  paused:   The Transmitter MUST NOT transmit events over the stream.   The transmitter will hold any events it would have transmitted while paused,   and SHOULD transmit them when the stream’s status becomes enabled.   If a Transmitter holds successive events that affect the same Subject Principal,   then the Transmitter MUST make sure that those events are transmitted in   the order of time that they were generated OR the Transmitter MUST send   only the last events that do not require the previous events affecting   the same Subject Principal to be processed by the Receiver,   because the previous events are either cancelled by the later events or   the previous events are outdated.  disabled:   The Transmitter MUST NOT transmit events over the stream,   and will not hold any events for later transmission.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public StreamStatus subject(StreamStatusSubject subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  */
  @Valid 
  @Schema(name = "subject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subject")
  public StreamStatusSubject getSubject() {
    return subject;
  }

  public void setSubject(StreamStatusSubject subject) {
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
    StreamStatus streamStatus = (StreamStatus) o;
    return Objects.equals(this.status, streamStatus.status) &&
        Objects.equals(this.subject, streamStatus.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

