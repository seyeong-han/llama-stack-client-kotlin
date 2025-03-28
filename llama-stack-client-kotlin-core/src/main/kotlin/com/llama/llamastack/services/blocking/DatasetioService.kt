// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.DatasetioAppendRowsParams
import com.llama.llamastack.models.DatasetioGetRowsPaginatedParams
import com.llama.llamastack.models.PaginatedRowsResult

interface DatasetioService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun appendRows(
        params: DatasetioAppendRowsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get a paginated list of rows from a dataset. */
    fun getRowsPaginated(
        params: DatasetioGetRowsPaginatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaginatedRowsResult

    /** A view of [DatasetioService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/datasetio/rows`, but is otherwise the same as
         * [DatasetioService.appendRows].
         */
        @MustBeClosed
        fun appendRows(
            params: DatasetioAppendRowsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/datasetio/rows`, but is otherwise the same as
         * [DatasetioService.getRowsPaginated].
         */
        @MustBeClosed
        fun getRowsPaginated(
            params: DatasetioGetRowsPaginatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaginatedRowsResult>
    }
}
