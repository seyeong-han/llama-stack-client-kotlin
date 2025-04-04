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
import com.llama.llamastack.models.DatasetListParams
import com.llama.llamastack.models.DatasetRegisterParams
import com.llama.llamastack.models.DatasetRetrieveParams
import com.llama.llamastack.models.DatasetRetrieveResponse
import com.llama.llamastack.models.DatasetUnregisterParams
import com.llama.llamastack.models.ListDatasetsResponse

class DatasetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasetService {

    private val withRawResponse: DatasetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DatasetService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions,
    ): DatasetRetrieveResponse? =
        // get /v1/datasets/{dataset_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions,
    ): List<ListDatasetsResponse.Data> =
        // get /v1/datasets
        withRawResponse().list(params, requestOptions).parse()

    override fun register(params: DatasetRegisterParams, requestOptions: RequestOptions) {
        // post /v1/datasets
        withRawResponse().register(params, requestOptions)
    }

    override fun unregister(params: DatasetUnregisterParams, requestOptions: RequestOptions) {
        // delete /v1/datasets/{dataset_id}
        withRawResponse().unregister(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatasetService.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<DatasetRetrieveResponse?> =
            jsonHandler<DatasetRetrieveResponse?>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: DatasetRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveResponse?> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "datasets", params.getPathParam(0))
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

        private val listHandler: Handler<DataEnvelope<List<ListDatasetsResponse.Data>>> =
            jsonHandler<DataEnvelope<List<ListDatasetsResponse.Data>>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DatasetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ListDatasetsResponse.Data>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "datasets")
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

        private val registerHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun register(
            params: DatasetRegisterParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "datasets")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { registerHandler.handle(it) } }
        }

        private val unregisterHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun unregister(
            params: DatasetUnregisterParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "datasets", params.getPathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { unregisterHandler.handle(it) } }
        }
    }
}
