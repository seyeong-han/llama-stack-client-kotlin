// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

/** A benchmark configuration for evaluation. */
@NoAutoDetect
class BenchmarkConfig
@JsonCreator
private constructor(
    @JsonProperty("eval_candidate")
    @ExcludeMissing
    private val evalCandidate: JsonField<EvalCandidate> = JsonMissing.of(),
    @JsonProperty("scoring_params")
    @ExcludeMissing
    private val scoringParams: JsonField<ScoringParams> = JsonMissing.of(),
    @JsonProperty("num_examples")
    @ExcludeMissing
    private val numExamples: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The candidate to evaluate.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun evalCandidate(): EvalCandidate = evalCandidate.getRequired("eval_candidate")

    /**
     * Map between scoring function id and parameters for each scoring function you want to run
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scoringParams(): ScoringParams = scoringParams.getRequired("scoring_params")

    /**
     * (Optional) The number of examples to evaluate. If not provided, all examples in the dataset
     * will be evaluated
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numExamples(): Long? = numExamples.getNullable("num_examples")

    /**
     * Returns the raw JSON value of [evalCandidate].
     *
     * Unlike [evalCandidate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eval_candidate")
    @ExcludeMissing
    fun _evalCandidate(): JsonField<EvalCandidate> = evalCandidate

    /**
     * Returns the raw JSON value of [scoringParams].
     *
     * Unlike [scoringParams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scoring_params")
    @ExcludeMissing
    fun _scoringParams(): JsonField<ScoringParams> = scoringParams

    /**
     * Returns the raw JSON value of [numExamples].
     *
     * Unlike [numExamples], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_examples") @ExcludeMissing fun _numExamples(): JsonField<Long> = numExamples

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BenchmarkConfig = apply {
        if (validated) {
            return@apply
        }

        evalCandidate().validate()
        scoringParams().validate()
        numExamples()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BenchmarkConfig].
         *
         * The following fields are required:
         * ```kotlin
         * .evalCandidate()
         * .scoringParams()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BenchmarkConfig]. */
    class Builder internal constructor() {

        private var evalCandidate: JsonField<EvalCandidate>? = null
        private var scoringParams: JsonField<ScoringParams>? = null
        private var numExamples: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(benchmarkConfig: BenchmarkConfig) = apply {
            evalCandidate = benchmarkConfig.evalCandidate
            scoringParams = benchmarkConfig.scoringParams
            numExamples = benchmarkConfig.numExamples
            additionalProperties = benchmarkConfig.additionalProperties.toMutableMap()
        }

        /** The candidate to evaluate. */
        fun evalCandidate(evalCandidate: EvalCandidate) = evalCandidate(JsonField.of(evalCandidate))

        /**
         * Sets [Builder.evalCandidate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evalCandidate] with a well-typed [EvalCandidate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evalCandidate(evalCandidate: JsonField<EvalCandidate>) = apply {
            this.evalCandidate = evalCandidate
        }

        /** Alias for calling [evalCandidate] with `EvalCandidate.ofModel(model)`. */
        fun evalCandidate(model: EvalCandidate.ModelCandidate) =
            evalCandidate(EvalCandidate.ofModel(model))

        /** Alias for calling [evalCandidate] with `EvalCandidate.ofAgent(agent)`. */
        fun evalCandidate(agent: EvalCandidate.AgentCandidate) =
            evalCandidate(EvalCandidate.ofAgent(agent))

        /**
         * Alias for calling [evalCandidate] with the following:
         * ```kotlin
         * EvalCandidate.AgentCandidate.builder()
         *     .config(config)
         *     .build()
         * ```
         */
        fun agentEvalCandidate(config: AgentConfig) =
            evalCandidate(EvalCandidate.AgentCandidate.builder().config(config).build())

        /**
         * Map between scoring function id and parameters for each scoring function you want to run
         */
        fun scoringParams(scoringParams: ScoringParams) = scoringParams(JsonField.of(scoringParams))

        /**
         * Sets [Builder.scoringParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scoringParams] with a well-typed [ScoringParams] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scoringParams(scoringParams: JsonField<ScoringParams>) = apply {
            this.scoringParams = scoringParams
        }

        /**
         * (Optional) The number of examples to evaluate. If not provided, all examples in the
         * dataset will be evaluated
         */
        fun numExamples(numExamples: Long) = numExamples(JsonField.of(numExamples))

        /**
         * Sets [Builder.numExamples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numExamples] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numExamples(numExamples: JsonField<Long>) = apply { this.numExamples = numExamples }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): BenchmarkConfig =
            BenchmarkConfig(
                checkRequired("evalCandidate", evalCandidate),
                checkRequired("scoringParams", scoringParams),
                numExamples,
                additionalProperties.toImmutable(),
            )
    }

    /** Map between scoring function id and parameters for each scoring function you want to run */
    @NoAutoDetect
    class ScoringParams
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ScoringParams = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ScoringParams]. */
            fun builder() = Builder()
        }

        /** A builder for [ScoringParams]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(scoringParams: ScoringParams) = apply {
                additionalProperties = scoringParams.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): ScoringParams = ScoringParams(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScoringParams && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ScoringParams{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BenchmarkConfig && evalCandidate == other.evalCandidate && scoringParams == other.scoringParams && numExamples == other.numExamples && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(evalCandidate, scoringParams, numExamples, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BenchmarkConfig{evalCandidate=$evalCandidate, scoringParams=$scoringParams, numExamples=$numExamples, additionalProperties=$additionalProperties}"
}
