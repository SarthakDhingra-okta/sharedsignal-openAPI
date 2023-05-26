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
import org.openapitools.model.SimpleSubject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ComplexSubjectSession
 */


@JsonTypeName("ComplexSubject_session")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T15:10:11.030458Z[Etc/UTC]")
public class ComplexSubjectSession extends SimpleSubject {

  public ComplexSubjectSession() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ComplexSubjectSession(FormatEnum format, String uri, String url, String email, String iss, String sub, String jti, String id, String phoneNumber, String issuer, String assertionId) {
    super(format, uri, url, email, iss, sub, jti, id, phoneNumber, issuer, assertionId);
  }

  public ComplexSubjectSession format(FormatEnum format) {
    super.setFormat(format);
    return this;
  }

  public ComplexSubjectSession uri(String uri) {
    super.setUri(uri);
    return this;
  }

  public ComplexSubjectSession url(String url) {
    super.setUrl(url);
    return this;
  }

  public ComplexSubjectSession email(String email) {
    super.setEmail(email);
    return this;
  }

  public ComplexSubjectSession iss(String iss) {
    super.setIss(iss);
    return this;
  }

  public ComplexSubjectSession sub(String sub) {
    super.setSub(sub);
    return this;
  }

  public ComplexSubjectSession jti(String jti) {
    super.setJti(jti);
    return this;
  }

  public ComplexSubjectSession id(String id) {
    super.setId(id);
    return this;
  }

  public ComplexSubjectSession phoneNumber(String phoneNumber) {
    super.setPhoneNumber(phoneNumber);
    return this;
  }

  public ComplexSubjectSession issuer(String issuer) {
    super.setIssuer(issuer);
    return this;
  }

  public ComplexSubjectSession assertionId(String assertionId) {
    super.setAssertionId(assertionId);
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
    sb.append("class ComplexSubjectSession {\n");
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

