/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.PollParameters;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-24T15:10:11.030458Z[Etc/UTC]")
@Validated
@Tag(name = "Transmitter", description = "Additional endpoints provided by an Event Transmitter. These are not needed during Stream Managment, but are used
by Event Receivers for event processing.")
public interface PollApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /poll : Request for queued events to be returned.
     * [Spec](https://www.rfc-editor.org/rfc/rfc8936.html#name-polling-http-request)
     *
     * @param pollParameters Optional request parameters (optional)
     * @return [Spec](https://www.rfc-editor.org/rfc/rfc8936.html#name-polling-http-response) (status code 200)
     */
    @Operation(
        operationId = "pollEvents",
        summary = "Request for queued events to be returned.",
        description = "[Spec](https://www.rfc-editor.org/rfc/rfc8936.html#name-polling-http-request)",
        tags = { "Transmitter" },
        responses = {
            @ApiResponse(responseCode = "200", description = "[Spec](https://www.rfc-editor.org/rfc/rfc8936.html#name-polling-http-response)", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        },
        security = {
            @SecurityRequirement(name = "BearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/poll",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Object> pollEvents(
        @Parameter(name = "PollParameters", description = "Optional request parameters") @Valid @RequestBody(required = false) PollParameters pollParameters
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
