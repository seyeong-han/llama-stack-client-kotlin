// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.agents

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.AgentSessionCreateParams
import com.llama.llamastack.models.AgentSessionCreateResponse
import com.llama.llamastack.models.AgentSessionDeleteParams
import com.llama.llamastack.models.AgentSessionRetrieveParams
import com.llama.llamastack.models.Session

interface SessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new session for an agent. */
    suspend fun create(
        params: AgentSessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentSessionCreateResponse

    /** Retrieve an agent session by its ID. */
    suspend fun retrieve(
        params: AgentSessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Session

    /** Delete an agent session by its ID. */
    suspend fun delete(
        params: AgentSessionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [SessionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/agents/{agent_id}/session`, but is otherwise
         * the same as [SessionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AgentSessionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentSessionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/agents/{agent_id}/session/{session_id}`, but is
         * otherwise the same as [SessionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: AgentSessionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Session>

        /**
         * Returns a raw HTTP response for `delete /v1/agents/{agent_id}/session/{session_id}`, but
         * is otherwise the same as [SessionServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: AgentSessionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
