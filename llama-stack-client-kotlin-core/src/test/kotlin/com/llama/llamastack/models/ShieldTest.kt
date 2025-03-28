// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ShieldTest {

    @Test
    fun createShield() {
        val shield =
            Shield.builder()
                .identifier("identifier")
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .params(
                    Shield.Params.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()
        assertThat(shield).isNotNull
        assertThat(shield.identifier()).isEqualTo("identifier")
        assertThat(shield.providerId()).isEqualTo("provider_id")
        assertThat(shield.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(shield.params())
            .isEqualTo(
                Shield.Params.builder().putAdditionalProperty("foo", JsonValue.from(true)).build()
            )
    }
}
