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

/** A safety shield resource that can be used to check content */
@NoAutoDetect
class Shield
@JsonCreator
private constructor(
    @JsonProperty("identifier")
    @ExcludeMissing
    private val identifier: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_id")
    @ExcludeMissing
    private val providerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    private val providerResourceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
    @JsonProperty("params")
    @ExcludeMissing
    private val params: JsonField<Params> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun identifier(): String = identifier.getRequired("identifier")

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
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("shield")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun params(): Params? = params.getNullable("params")

    /**
     * Returns the raw JSON value of [identifier].
     *
     * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identifier") @ExcludeMissing fun _identifier(): JsonField<String> = identifier

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
     * Returns the raw JSON value of [params].
     *
     * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Shield = apply {
        if (validated) {
            return@apply
        }

        identifier()
        providerId()
        providerResourceId()
        _type().let {
            if (it != JsonValue.from("shield")) {
                throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
            }
        }
        params()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Shield].
         *
         * The following fields are required:
         * ```kotlin
         * .identifier()
         * .providerId()
         * .providerResourceId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Shield]. */
    class Builder internal constructor() {

        private var identifier: JsonField<String>? = null
        private var providerId: JsonField<String>? = null
        private var providerResourceId: JsonField<String>? = null
        private var type: JsonValue = JsonValue.from("shield")
        private var params: JsonField<Params> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(shield: Shield) = apply {
            identifier = shield.identifier
            providerId = shield.providerId
            providerResourceId = shield.providerResourceId
            type = shield.type
            params = shield.params
            additionalProperties = shield.additionalProperties.toMutableMap()
        }

        fun identifier(identifier: String) = identifier(JsonField.of(identifier))

        /**
         * Sets [Builder.identifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identifier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

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

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("shield")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

        fun params(params: Params) = params(JsonField.of(params))

        /**
         * Sets [Builder.params] to an arbitrary JSON value.
         *
         * You should usually call [Builder.params] with a well-typed [Params] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun params(params: JsonField<Params>) = apply { this.params = params }

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

        fun build(): Shield =
            Shield(
                checkRequired("identifier", identifier),
                checkRequired("providerId", providerId),
                checkRequired("providerResourceId", providerResourceId),
                type,
                params,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Params
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Params = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Params]. */
            fun builder() = Builder()
        }

        /** A builder for [Params]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(params: Params) = apply {
                additionalProperties = params.additionalProperties.toMutableMap()
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

            fun build(): Params = Params(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Params && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Params{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Shield && identifier == other.identifier && providerId == other.providerId && providerResourceId == other.providerResourceId && type == other.type && params == other.params && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(identifier, providerId, providerResourceId, type, params, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Shield{identifier=$identifier, providerId=$providerId, providerResourceId=$providerResourceId, type=$type, params=$params, additionalProperties=$additionalProperties}"
}
