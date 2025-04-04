// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.emptyHandler
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.json
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepare
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.DataEnvelope
import com.llama.llamastack.models.ListVectorDbsResponse
import com.llama.llamastack.models.VectorDbListParams
import com.llama.llamastack.models.VectorDbRegisterParams
import com.llama.llamastack.models.VectorDbRegisterResponse
import com.llama.llamastack.models.VectorDbRetrieveParams
import com.llama.llamastack.models.VectorDbRetrieveResponse
import com.llama.llamastack.models.VectorDbUnregisterParams

class VectorDbServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VectorDbService {

    private val withRawResponse: VectorDbService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VectorDbService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: VectorDbRetrieveParams,
        requestOptions: RequestOptions,
    ): VectorDbRetrieveResponse? =
        // get /v1/vector-dbs/{vector_db_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: VectorDbListParams,
        requestOptions: RequestOptions,
    ): List<ListVectorDbsResponse.Data> =
        // get /v1/vector-dbs
        withRawResponse().list(params, requestOptions).parse()

    override fun register(
        params: VectorDbRegisterParams,
        requestOptions: RequestOptions,
    ): VectorDbRegisterResponse =
        // post /v1/vector-dbs
        withRawResponse().register(params, requestOptions).parse()

    override fun unregister(params: VectorDbUnregisterParams, requestOptions: RequestOptions) {
        // delete /v1/vector-dbs/{vector_db_id}
        withRawResponse().unregister(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VectorDbService.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<VectorDbRetrieveResponse?> =
            jsonHandler<VectorDbRetrieveResponse?>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: VectorDbRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VectorDbRetrieveResponse?> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "vector-dbs", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it?.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DataEnvelope<List<ListVectorDbsResponse.Data>>> =
            jsonHandler<DataEnvelope<List<ListVectorDbsResponse.Data>>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: VectorDbListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ListVectorDbsResponse.Data>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "vector-dbs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .data()
            }
        }

        private val registerHandler: Handler<VectorDbRegisterResponse> =
            jsonHandler<VectorDbRegisterResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun register(
            params: VectorDbRegisterParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VectorDbRegisterResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "vector-dbs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { registerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unregisterHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun unregister(
            params: VectorDbUnregisterParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "vector-dbs", params.getPathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { unregisterHandler.handle(it) } }
        }
    }
}
