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
 * ComplexSubjectGroup
 */


@JsonTypeName("ComplexSubject_group")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T15:10:11.030458Z[Etc/UTC]")
public class ComplexSubjectGroup extends SimpleSubject {

  public ComplexSubjectGroup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ComplexSubjectGroup(FormatEnum format, String uri, String url, String email, String iss, String sub, String jti, String id, String phoneNumber, String issuer, String assertionId) {
    super(format, uri, url, email, iss, sub, jti, id, phoneNumber, issuer, assertionId);
  }

  public ComplexSubjectGroup format(FormatEnum format) {
    super.setFormat(format);
    return this;
  }

  public ComplexSubjectGroup uri(String uri) {
    super.setUri(uri);
    return this;
  }

  public ComplexSubjectGroup url(String url) {
    super.setUrl(url);
    return this;
  }

  public ComplexSubjectGroup email(String email) {
    super.setEmail(email);
    return this;
  }

  public ComplexSubjectGroup iss(String iss) {
    super.setIss(iss);
    return this;
  }

  public ComplexSubjectGroup sub(String sub) {
    super.setSub(sub);
    return this;
  }

  public ComplexSubjectGroup jti(String jti) {
    super.setJti(jti);
    return this;
  }

  public ComplexSubjectGroup id(String id) {
    super.setId(id);
    return this;
  }

  public ComplexSubjectGroup phoneNumber(String phoneNumber) {
    super.setPhoneNumber(phoneNumber);
    return this;
  }

  public ComplexSubjectGroup issuer(String issuer) {
    super.setIssuer(issuer);
    return this;
  }

  public ComplexSubjectGroup assertionId(String assertionId) {
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
    sb.append("class ComplexSubjectGroup {\n");
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

