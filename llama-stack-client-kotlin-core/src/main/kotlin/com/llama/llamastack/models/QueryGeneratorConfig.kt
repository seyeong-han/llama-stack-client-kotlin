// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.BaseDeserializer
import com.llama.llamastack.core.BaseSerializer
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(using = QueryGeneratorConfig.Deserializer::class)
@JsonSerialize(using = QueryGeneratorConfig.Serializer::class)
class QueryGeneratorConfig
private constructor(
    private val defaultRag: DefaultRagQueryGeneratorConfig? = null,
    private val llmrag: LlmragQueryGeneratorConfig? = null,
    private val _json: JsonValue? = null,
) {

    fun defaultRag(): DefaultRagQueryGeneratorConfig? = defaultRag

    fun llmrag(): LlmragQueryGeneratorConfig? = llmrag

    fun isDefaultRag(): Boolean = defaultRag != null

    fun isLlmrag(): Boolean = llmrag != null

    fun asDefaultRag(): DefaultRagQueryGeneratorConfig = defaultRag.getOrThrow("defaultRag")

    fun asLlmrag(): LlmragQueryGeneratorConfig = llmrag.getOrThrow("llmrag")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            defaultRag != null -> visitor.visitDefaultRag(defaultRag)
            llmrag != null -> visitor.visitLlmrag(llmrag)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): QueryGeneratorConfig = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitDefaultRag(defaultRag: DefaultRagQueryGeneratorConfig) {
                    defaultRag.validate()
                }

                override fun visitLlmrag(llmrag: LlmragQueryGeneratorConfig) {
                    llmrag.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is QueryGeneratorConfig && defaultRag == other.defaultRag && llmrag == other.llmrag /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(defaultRag, llmrag) /* spotless:on */

    override fun toString(): String =
        when {
            defaultRag != null -> "QueryGeneratorConfig{defaultRag=$defaultRag}"
            llmrag != null -> "QueryGeneratorConfig{llmrag=$llmrag}"
            _json != null -> "QueryGeneratorConfig{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid QueryGeneratorConfig")
        }

    companion object {

        fun ofDefaultRag(defaultRag: DefaultRagQueryGeneratorConfig) =
            QueryGeneratorConfig(defaultRag = defaultRag)

        fun ofLlmrag(llmrag: LlmragQueryGeneratorConfig) = QueryGeneratorConfig(llmrag = llmrag)
    }

    /**
     * An interface that defines how to map each variant of [QueryGeneratorConfig] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitDefaultRag(defaultRag: DefaultRagQueryGeneratorConfig): T

        fun visitLlmrag(llmrag: LlmragQueryGeneratorConfig): T

        /**
         * Maps an unknown variant of [QueryGeneratorConfig] to a value of type [T].
         *
         * An instance of [QueryGeneratorConfig] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LlamaStackClientInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown QueryGeneratorConfig: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<QueryGeneratorConfig>(QueryGeneratorConfig::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): QueryGeneratorConfig {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "default" -> {
                    tryDeserialize(node, jacksonTypeRef<DefaultRagQueryGeneratorConfig>()) {
                            it.validate()
                        }
                        ?.let {
                            return QueryGeneratorConfig(defaultRag = it, _json = json)
                        }
                }
                "llm" -> {
                    tryDeserialize(node, jacksonTypeRef<LlmragQueryGeneratorConfig>()) {
                            it.validate()
                        }
                        ?.let {
                            return QueryGeneratorConfig(llmrag = it, _json = json)
                        }
                }
            }

            return QueryGeneratorConfig(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<QueryGeneratorConfig>(QueryGeneratorConfig::class) {

        override fun serialize(
            value: QueryGeneratorConfig,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.defaultRag != null -> generator.writeObject(value.defaultRag)
                value.llmrag != null -> generator.writeObject(value.llmrag)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid QueryGeneratorConfig")
            }
        }
    }

    @NoAutoDetect
    class DefaultRagQueryGeneratorConfig
    @JsonCreator
    private constructor(
        @JsonProperty("separator")
        @ExcludeMissing
        private val separator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun separator(): String = separator.getRequired("separator")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("default")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [separator].
         *
         * Unlike [separator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("separator") @ExcludeMissing fun _separator(): JsonField<String> = separator

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DefaultRagQueryGeneratorConfig = apply {
            if (validated) {
                return@apply
            }

            separator()
            _type().let {
                if (it != JsonValue.from("default")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [DefaultRagQueryGeneratorConfig].
             *
             * The following fields are required:
             * ```kotlin
             * .separator()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [DefaultRagQueryGeneratorConfig]. */
        class Builder internal constructor() {

            private var separator: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("default")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(defaultRagQueryGeneratorConfig: DefaultRagQueryGeneratorConfig) =
                apply {
                    separator = defaultRagQueryGeneratorConfig.separator
                    type = defaultRagQueryGeneratorConfig.type
                    additionalProperties =
                        defaultRagQueryGeneratorConfig.additionalProperties.toMutableMap()
                }

            fun separator(separator: String) = separator(JsonField.of(separator))

            /**
             * Sets [Builder.separator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.separator] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun separator(separator: JsonField<String>) = apply { this.separator = separator }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("default")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun build(): DefaultRagQueryGeneratorConfig =
                DefaultRagQueryGeneratorConfig(
                    checkRequired("separator", separator),
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DefaultRagQueryGeneratorConfig && separator == other.separator && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(separator, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DefaultRagQueryGeneratorConfig{separator=$separator, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class LlmragQueryGeneratorConfig
    @JsonCreator
    private constructor(
        @JsonProperty("model")
        @ExcludeMissing
        private val model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("template")
        @ExcludeMissing
        private val template: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun template(): String = template.getRequired("template")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("llm")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [template].
         *
         * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<String> = template

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LlmragQueryGeneratorConfig = apply {
            if (validated) {
                return@apply
            }

            model()
            template()
            _type().let {
                if (it != JsonValue.from("llm")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [LlmragQueryGeneratorConfig].
             *
             * The following fields are required:
             * ```kotlin
             * .model()
             * .template()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LlmragQueryGeneratorConfig]. */
        class Builder internal constructor() {

            private var model: JsonField<String>? = null
            private var template: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("llm")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(llmragQueryGeneratorConfig: LlmragQueryGeneratorConfig) = apply {
                model = llmragQueryGeneratorConfig.model
                template = llmragQueryGeneratorConfig.template
                type = llmragQueryGeneratorConfig.type
                additionalProperties =
                    llmragQueryGeneratorConfig.additionalProperties.toMutableMap()
            }

            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun template(template: String) = template(JsonField.of(template))

            /**
             * Sets [Builder.template] to an arbitrary JSON value.
             *
             * You should usually call [Builder.template] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun template(template: JsonField<String>) = apply { this.template = template }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("llm")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun build(): LlmragQueryGeneratorConfig =
                LlmragQueryGeneratorConfig(
                    checkRequired("model", model),
                    checkRequired("template", template),
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LlmragQueryGeneratorConfig && model == other.model && template == other.template && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(model, template, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LlmragQueryGeneratorConfig{model=$model, template=$template, type=$type, additionalProperties=$additionalProperties}"
    }
}
