// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolExecutionStepTest {

    @Test
    fun createToolExecutionStep() {
        val toolExecutionStep =
            ToolExecutionStep.builder()
                .stepId("step_id")
                .addToolCall(
                    ToolCall.builder()
                        .arguments(
                            ToolCall.Arguments.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .callId("call_id")
                        .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                        .build()
                )
                .addToolResponse(
                    ToolResponse.builder()
                        .callId("call_id")
                        .content("string")
                        .toolName(ToolResponse.ToolName.BRAVE_SEARCH)
                        .metadata(
                            ToolResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
                .turnId("turn_id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(toolExecutionStep).isNotNull
        assertThat(toolExecutionStep.stepId()).isEqualTo("step_id")
        assertThat(toolExecutionStep.toolCalls())
            .containsExactly(
                ToolCall.builder()
                    .arguments(
                        ToolCall.Arguments.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .callId("call_id")
                    .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                    .build()
            )
        assertThat(toolExecutionStep.toolResponses())
            .containsExactly(
                ToolResponse.builder()
                    .callId("call_id")
                    .content("string")
                    .toolName(ToolResponse.ToolName.BRAVE_SEARCH)
                    .metadata(
                        ToolResponse.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )
        assertThat(toolExecutionStep.turnId()).isEqualTo("turn_id")
        assertThat(toolExecutionStep.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(toolExecutionStep.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
