// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.BaseDeserializer
import com.llama.llamastack.core.BaseSerializer
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(using = ToolCallOrString.Deserializer::class)
@JsonSerialize(using = ToolCallOrString.Serializer::class)
class ToolCallOrString
private constructor(
    private val string: String? = null,
    private val toolCall: ToolCall? = null,
    private val _json: JsonValue? = null,
) {

    fun string(): String? = string

    fun toolCall(): ToolCall? = toolCall

    fun isString(): Boolean = string != null

    fun isToolCall(): Boolean = toolCall != null

    fun asString(): String = string.getOrThrow("string")

    fun asToolCall(): ToolCall = toolCall.getOrThrow("toolCall")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            string != null -> visitor.visitString(string)
            toolCall != null -> visitor.visitToolCall(toolCall)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): ToolCallOrString = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitString(string: String) {}

                override fun visitToolCall(toolCall: ToolCall) {
                    toolCall.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolCallOrString && string == other.string && toolCall == other.toolCall /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, toolCall) /* spotless:on */

    override fun toString(): String =
        when {
            string != null -> "ToolCallOrString{string=$string}"
            toolCall != null -> "ToolCallOrString{toolCall=$toolCall}"
            _json != null -> "ToolCallOrString{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ToolCallOrString")
        }

    companion object {

        fun ofString(string: String) = ToolCallOrString(string = string)

        fun ofToolCall(toolCall: ToolCall) = ToolCallOrString(toolCall = toolCall)
    }

    /**
     * An interface that defines how to map each variant of [ToolCallOrString] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitString(string: String): T

        fun visitToolCall(toolCall: ToolCall): T

        /**
         * Maps an unknown variant of [ToolCallOrString] to a value of type [T].
         *
         * An instance of [ToolCallOrString] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LlamaStackClientInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown ToolCallOrString: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ToolCallOrString>(ToolCallOrString::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ToolCallOrString {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                return ToolCallOrString(string = it, _json = json)
            }
            tryDeserialize(node, jacksonTypeRef<ToolCall>()) { it.validate() }
                ?.let {
                    return ToolCallOrString(toolCall = it, _json = json)
                }

            return ToolCallOrString(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<ToolCallOrString>(ToolCallOrString::class) {

        override fun serialize(
            value: ToolCallOrString,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.string != null -> generator.writeObject(value.string)
                value.toolCall != null -> generator.writeObject(value.toolCall)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ToolCallOrString")
            }
        }
    }
}
