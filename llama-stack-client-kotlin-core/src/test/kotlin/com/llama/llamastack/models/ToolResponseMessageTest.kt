// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolResponseMessageTest {

    @Test
    fun createToolResponseMessage() {
        val toolResponseMessage =
            ToolResponseMessage.builder().callId("call_id").content("string").build()
        assertThat(toolResponseMessage).isNotNull
        assertThat(toolResponseMessage.callId()).isEqualTo("call_id")
        assertThat(toolResponseMessage.content()).isEqualTo(InterleavedContent.ofString("string"))
    }
}
