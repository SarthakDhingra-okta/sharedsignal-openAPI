package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ComplexSubjectApplication;
import org.openapitools.model.ComplexSubjectDevice;
import org.openapitools.model.ComplexSubjectGroup;
import org.openapitools.model.ComplexSubjectOrgUnit;
import org.openapitools.model.ComplexSubjectSession;
import org.openapitools.model.ComplexSubjectTenant;
import org.openapitools.model.ComplexSubjectUser;
import org.openapitools.model.SimpleSubject;
import org.openapitools.model.Subject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OPTIONAL. The Subject to which the status applies.
 */

@Schema(name = "StreamStatus_subject", description = "OPTIONAL. The Subject to which the status applies.")

@JsonTypeName("StreamStatus_subject")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T15:10:11.030458Z[Etc/UTC]")
public class StreamStatusSubject extends Subject {

  public StreamStatusSubject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StreamStatusSubject(FormatEnum format, String uri, String url, String email, String iss, String sub, String jti, String id, String phoneNumber, String issuer, String assertionId, List<@Valid SimpleSubject> identifiers) {
    super(format, identifiers);
  }

  public StreamStatusSubject format(FormatEnum format) {
    super.setFormat(format);
    return this;
  }

  public StreamStatusSubject identifiers(List<@Valid SimpleSubject> identifiers) {
    super.setIdentifiers(identifiers);
    return this;
  }

  public StreamStatusSubject addIdentifiersItem(SimpleSubject identifiersItem) {
    super.addIdentifiersItem(identifiersItem);
    return this;
  }

  public StreamStatusSubject application(ComplexSubjectApplication application) {
    super.setApplication(application);
    return this;
  }

  public StreamStatusSubject device(ComplexSubjectDevice device) {
    super.setDevice(device);
    return this;
  }

  public StreamStatusSubject group(ComplexSubjectGroup group) {
    super.setGroup(group);
    return this;
  }

  public StreamStatusSubject orgUnit(ComplexSubjectOrgUnit orgUnit) {
    super.setOrgUnit(orgUnit);
    return this;
  }

  public StreamStatusSubject session(ComplexSubjectSession session) {
    super.setSession(session);
    return this;
  }

  public StreamStatusSubject tenant(ComplexSubjectTenant tenant) {
    super.setTenant(tenant);
    return this;
  }

  public StreamStatusSubject user(ComplexSubjectUser user) {
    super.setUser(user);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamStatusSubject {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

