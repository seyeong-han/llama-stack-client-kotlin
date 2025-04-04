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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class Benchmark
@JsonCreator
private constructor(
    @JsonProperty("dataset_id")
    @ExcludeMissing
    private val datasetId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("identifier")
    @ExcludeMissing
    private val identifier: JsonField<String> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("provider_id")
    @ExcludeMissing
    private val providerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    private val providerResourceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("scoring_functions")
    @ExcludeMissing
    private val scoringFunctions: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasetId(): String = datasetId.getRequired("dataset_id")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun identifier(): String = identifier.getRequired("identifier")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerId(): String = providerId.getRequired("provider_id")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scoringFunctions(): List<String> = scoringFunctions.getRequired("scoring_functions")

    /**
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("benchmark")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

    /**
     * Returns the raw JSON value of [identifier].
     *
     * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identifier") @ExcludeMissing fun _identifier(): JsonField<String> = identifier

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [providerId].
     *
     * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    /**
     * Returns the raw JSON value of [providerResourceId].
     *
     * Unlike [providerResourceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    fun _providerResourceId(): JsonField<String> = providerResourceId

    /**
     * Returns the raw JSON value of [scoringFunctions].
     *
     * Unlike [scoringFunctions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("scoring_functions")
    @ExcludeMissing
    fun _scoringFunctions(): JsonField<List<String>> = scoringFunctions

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Benchmark = apply {
        if (validated) {
            return@apply
        }

        datasetId()
        identifier()
        metadata().validate()
        providerId()
        providerResourceId()
        scoringFunctions()
        _type().let {
            if (it != JsonValue.from("benchmark")) {
                throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
            }
        }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Benchmark].
         *
         * The following fields are required:
         * ```kotlin
         * .datasetId()
         * .identifier()
         * .metadata()
         * .providerId()
         * .providerResourceId()
         * .scoringFunctions()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Benchmark]. */
    class Builder internal constructor() {

        private var datasetId: JsonField<String>? = null
        private var identifier: JsonField<String>? = null
        private var metadata: JsonField<Metadata>? = null
        private var providerId: JsonField<String>? = null
        private var providerResourceId: JsonField<String>? = null
        private var scoringFunctions: JsonField<MutableList<String>>? = null
        private var type: JsonValue = JsonValue.from("benchmark")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(benchmark: Benchmark) = apply {
            datasetId = benchmark.datasetId
            identifier = benchmark.identifier
            metadata = benchmark.metadata
            providerId = benchmark.providerId
            providerResourceId = benchmark.providerResourceId
            scoringFunctions = benchmark.scoringFunctions.map { it.toMutableList() }
            type = benchmark.type
            additionalProperties = benchmark.additionalProperties.toMutableMap()
        }

        fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

        fun identifier(identifier: String) = identifier(JsonField.of(identifier))

        /**
         * Sets [Builder.identifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identifier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /**
         * Sets [Builder.providerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun providerResourceId(providerResourceId: String) =
            providerResourceId(JsonField.of(providerResourceId))

        /**
         * Sets [Builder.providerResourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerResourceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerResourceId(providerResourceId: JsonField<String>) = apply {
            this.providerResourceId = providerResourceId
        }

        fun scoringFunctions(scoringFunctions: List<String>) =
            scoringFunctions(JsonField.of(scoringFunctions))

        /**
         * Sets [Builder.scoringFunctions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scoringFunctions] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scoringFunctions(scoringFunctions: JsonField<List<String>>) = apply {
            this.scoringFunctions = scoringFunctions.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [scoringFunctions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScoringFunction(scoringFunction: String) = apply {
            scoringFunctions =
                (scoringFunctions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scoringFunctions", it).add(scoringFunction)
                }
        }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("benchmark")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

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

        fun build(): Benchmark =
            Benchmark(
                checkRequired("datasetId", datasetId),
                checkRequired("identifier", identifier),
                checkRequired("metadata", metadata),
                checkRequired("providerId", providerId),
                checkRequired("providerResourceId", providerResourceId),
                checkRequired("scoringFunctions", scoringFunctions).map { it.toImmutable() },
                type,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Benchmark && datasetId == other.datasetId && identifier == other.identifier && metadata == other.metadata && providerId == other.providerId && providerResourceId == other.providerResourceId && scoringFunctions == other.scoringFunctions && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(datasetId, identifier, metadata, providerId, providerResourceId, scoringFunctions, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Benchmark{datasetId=$datasetId, identifier=$identifier, metadata=$metadata, providerId=$providerId, providerResourceId=$providerResourceId, scoringFunctions=$scoringFunctions, type=$type, additionalProperties=$additionalProperties}"
}
