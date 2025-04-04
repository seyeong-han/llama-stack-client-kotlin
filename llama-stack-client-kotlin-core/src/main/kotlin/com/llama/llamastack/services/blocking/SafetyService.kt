// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.RunShieldResponse
import com.llama.llamastack.models.SafetyRunShieldParams

interface SafetyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun runShield(
        params: SafetyRunShieldParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunShieldResponse

    /** A view of [SafetyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/safety/run-shield`, but is otherwise the same
         * as [SafetyService.runShield].
         */
        @MustBeClosed
        fun runShield(
            params: SafetyRunShieldParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunShieldResponse>
    }
}
