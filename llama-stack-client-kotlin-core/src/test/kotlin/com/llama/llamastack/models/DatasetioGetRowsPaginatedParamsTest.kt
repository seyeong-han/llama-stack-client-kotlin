// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetioGetRowsPaginatedParamsTest {

    @Test
    fun create() {
        DatasetioGetRowsPaginatedParams.builder()
            .datasetId("dataset_id")
            .rowsInPage(0L)
            .filterCondition("filter_condition")
            .pageToken("page_token")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DatasetioGetRowsPaginatedParams.builder()
                .datasetId("dataset_id")
                .rowsInPage(0L)
                .filterCondition("filter_condition")
                .pageToken("page_token")
                .build()
        val expected = QueryParams.builder()
        expected.put("dataset_id", "dataset_id")
        expected.put("rows_in_page", "0")
        expected.put("filter_condition", "filter_condition")
        expected.put("page_token", "page_token")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            DatasetioGetRowsPaginatedParams.builder().datasetId("dataset_id").rowsInPage(0L).build()
        val expected = QueryParams.builder()
        expected.put("dataset_id", "dataset_id")
        expected.put("rows_in_page", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
