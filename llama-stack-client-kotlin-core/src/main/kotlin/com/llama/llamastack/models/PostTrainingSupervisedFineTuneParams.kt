// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class PostTrainingSupervisedFineTuneParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hyperparamSearchConfig(): HyperparamSearchConfig = body.hyperparamSearchConfig()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun jobUuid(): String = body.jobUuid()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun loggerConfig(): LoggerConfig = body.loggerConfig()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = body.model()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trainingConfig(): TrainingConfig = body.trainingConfig()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun algorithmConfig(): AlgorithmConfig? = body.algorithmConfig()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun checkpointDir(): String? = body.checkpointDir()

    /**
     * Returns the raw JSON value of [hyperparamSearchConfig].
     *
     * Unlike [hyperparamSearchConfig], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _hyperparamSearchConfig(): JsonField<HyperparamSearchConfig> =
        body._hyperparamSearchConfig()

    /**
     * Returns the raw JSON value of [jobUuid].
     *
     * Unlike [jobUuid], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _jobUuid(): JsonField<String> = body._jobUuid()

    /**
     * Returns the raw JSON value of [loggerConfig].
     *
     * Unlike [loggerConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _loggerConfig(): JsonField<LoggerConfig> = body._loggerConfig()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [trainingConfig].
     *
     * Unlike [trainingConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trainingConfig(): JsonField<TrainingConfig> = body._trainingConfig()

    /**
     * Returns the raw JSON value of [algorithmConfig].
     *
     * Unlike [algorithmConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _algorithmConfig(): JsonField<AlgorithmConfig> = body._algorithmConfig()

    /**
     * Returns the raw JSON value of [checkpointDir].
     *
     * Unlike [checkpointDir], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _checkpointDir(): JsonField<String> = body._checkpointDir()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("hyperparam_search_config")
        @ExcludeMissing
        private val hyperparamSearchConfig: JsonField<HyperparamSearchConfig> = JsonMissing.of(),
        @JsonProperty("job_uuid")
        @ExcludeMissing
        private val jobUuid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logger_config")
        @ExcludeMissing
        private val loggerConfig: JsonField<LoggerConfig> = JsonMissing.of(),
        @JsonProperty("model")
        @ExcludeMissing
        private val model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("training_config")
        @ExcludeMissing
        private val trainingConfig: JsonField<TrainingConfig> = JsonMissing.of(),
        @JsonProperty("algorithm_config")
        @ExcludeMissing
        private val algorithmConfig: JsonField<AlgorithmConfig> = JsonMissing.of(),
        @JsonProperty("checkpoint_dir")
        @ExcludeMissing
        private val checkpointDir: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun hyperparamSearchConfig(): HyperparamSearchConfig =
            hyperparamSearchConfig.getRequired("hyperparam_search_config")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun jobUuid(): String = jobUuid.getRequired("job_uuid")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun loggerConfig(): LoggerConfig = loggerConfig.getRequired("logger_config")

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
        fun trainingConfig(): TrainingConfig = trainingConfig.getRequired("training_config")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun algorithmConfig(): AlgorithmConfig? = algorithmConfig.getNullable("algorithm_config")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun checkpointDir(): String? = checkpointDir.getNullable("checkpoint_dir")

        /**
         * Returns the raw JSON value of [hyperparamSearchConfig].
         *
         * Unlike [hyperparamSearchConfig], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hyperparam_search_config")
        @ExcludeMissing
        fun _hyperparamSearchConfig(): JsonField<HyperparamSearchConfig> = hyperparamSearchConfig

        /**
         * Returns the raw JSON value of [jobUuid].
         *
         * Unlike [jobUuid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("job_uuid") @ExcludeMissing fun _jobUuid(): JsonField<String> = jobUuid

        /**
         * Returns the raw JSON value of [loggerConfig].
         *
         * Unlike [loggerConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("logger_config")
        @ExcludeMissing
        fun _loggerConfig(): JsonField<LoggerConfig> = loggerConfig

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [trainingConfig].
         *
         * Unlike [trainingConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("training_config")
        @ExcludeMissing
        fun _trainingConfig(): JsonField<TrainingConfig> = trainingConfig

        /**
         * Returns the raw JSON value of [algorithmConfig].
         *
         * Unlike [algorithmConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("algorithm_config")
        @ExcludeMissing
        fun _algorithmConfig(): JsonField<AlgorithmConfig> = algorithmConfig

        /**
         * Returns the raw JSON value of [checkpointDir].
         *
         * Unlike [checkpointDir], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("checkpoint_dir")
        @ExcludeMissing
        fun _checkpointDir(): JsonField<String> = checkpointDir

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            hyperparamSearchConfig().validate()
            jobUuid()
            loggerConfig().validate()
            model()
            trainingConfig().validate()
            algorithmConfig()?.validate()
            checkpointDir()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .hyperparamSearchConfig()
             * .jobUuid()
             * .loggerConfig()
             * .model()
             * .trainingConfig()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var hyperparamSearchConfig: JsonField<HyperparamSearchConfig>? = null
            private var jobUuid: JsonField<String>? = null
            private var loggerConfig: JsonField<LoggerConfig>? = null
            private var model: JsonField<String>? = null
            private var trainingConfig: JsonField<TrainingConfig>? = null
            private var algorithmConfig: JsonField<AlgorithmConfig> = JsonMissing.of()
            private var checkpointDir: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                hyperparamSearchConfig = body.hyperparamSearchConfig
                jobUuid = body.jobUuid
                loggerConfig = body.loggerConfig
                model = body.model
                trainingConfig = body.trainingConfig
                algorithmConfig = body.algorithmConfig
                checkpointDir = body.checkpointDir
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun hyperparamSearchConfig(hyperparamSearchConfig: HyperparamSearchConfig) =
                hyperparamSearchConfig(JsonField.of(hyperparamSearchConfig))

            /**
             * Sets [Builder.hyperparamSearchConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hyperparamSearchConfig] with a well-typed
             * [HyperparamSearchConfig] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun hyperparamSearchConfig(hyperparamSearchConfig: JsonField<HyperparamSearchConfig>) =
                apply {
                    this.hyperparamSearchConfig = hyperparamSearchConfig
                }

            fun jobUuid(jobUuid: String) = jobUuid(JsonField.of(jobUuid))

            /**
             * Sets [Builder.jobUuid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jobUuid] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jobUuid(jobUuid: JsonField<String>) = apply { this.jobUuid = jobUuid }

            fun loggerConfig(loggerConfig: LoggerConfig) = loggerConfig(JsonField.of(loggerConfig))

            /**
             * Sets [Builder.loggerConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loggerConfig] with a well-typed [LoggerConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loggerConfig(loggerConfig: JsonField<LoggerConfig>) = apply {
                this.loggerConfig = loggerConfig
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

            fun trainingConfig(trainingConfig: TrainingConfig) =
                trainingConfig(JsonField.of(trainingConfig))

            /**
             * Sets [Builder.trainingConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trainingConfig] with a well-typed [TrainingConfig]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun trainingConfig(trainingConfig: JsonField<TrainingConfig>) = apply {
                this.trainingConfig = trainingConfig
            }

            fun algorithmConfig(algorithmConfig: AlgorithmConfig) =
                algorithmConfig(JsonField.of(algorithmConfig))

            /**
             * Sets [Builder.algorithmConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.algorithmConfig] with a well-typed [AlgorithmConfig]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun algorithmConfig(algorithmConfig: JsonField<AlgorithmConfig>) = apply {
                this.algorithmConfig = algorithmConfig
            }

            /**
             * Alias for calling [algorithmConfig] with
             * `AlgorithmConfig.ofLoraFinetuning(loraFinetuning)`.
             */
            fun algorithmConfig(loraFinetuning: AlgorithmConfig.LoraFinetuningConfig) =
                algorithmConfig(AlgorithmConfig.ofLoraFinetuning(loraFinetuning))

            /**
             * Alias for calling [algorithmConfig] with
             * `AlgorithmConfig.ofQatFinetuning(qatFinetuning)`.
             */
            fun algorithmConfig(qatFinetuning: AlgorithmConfig.QatFinetuningConfig) =
                algorithmConfig(AlgorithmConfig.ofQatFinetuning(qatFinetuning))

            fun checkpointDir(checkpointDir: String) = checkpointDir(JsonField.of(checkpointDir))

            /**
             * Sets [Builder.checkpointDir] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checkpointDir] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checkpointDir(checkpointDir: JsonField<String>) = apply {
                this.checkpointDir = checkpointDir
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

            fun build(): Body =
                Body(
                    checkRequired("hyperparamSearchConfig", hyperparamSearchConfig),
                    checkRequired("jobUuid", jobUuid),
                    checkRequired("loggerConfig", loggerConfig),
                    checkRequired("model", model),
                    checkRequired("trainingConfig", trainingConfig),
                    algorithmConfig,
                    checkpointDir,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && hyperparamSearchConfig == other.hyperparamSearchConfig && jobUuid == other.jobUuid && loggerConfig == other.loggerConfig && model == other.model && trainingConfig == other.trainingConfig && algorithmConfig == other.algorithmConfig && checkpointDir == other.checkpointDir && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(hyperparamSearchConfig, jobUuid, loggerConfig, model, trainingConfig, algorithmConfig, checkpointDir, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{hyperparamSearchConfig=$hyperparamSearchConfig, jobUuid=$jobUuid, loggerConfig=$loggerConfig, model=$model, trainingConfig=$trainingConfig, algorithmConfig=$algorithmConfig, checkpointDir=$checkpointDir, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PostTrainingSupervisedFineTuneParams].
         *
         * The following fields are required:
         * ```kotlin
         * .hyperparamSearchConfig()
         * .jobUuid()
         * .loggerConfig()
         * .model()
         * .trainingConfig()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PostTrainingSupervisedFineTuneParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            postTrainingSupervisedFineTuneParams: PostTrainingSupervisedFineTuneParams
        ) = apply {
            body = postTrainingSupervisedFineTuneParams.body.toBuilder()
            additionalHeaders = postTrainingSupervisedFineTuneParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                postTrainingSupervisedFineTuneParams.additionalQueryParams.toBuilder()
        }

        fun hyperparamSearchConfig(hyperparamSearchConfig: HyperparamSearchConfig) = apply {
            body.hyperparamSearchConfig(hyperparamSearchConfig)
        }

        /**
         * Sets [Builder.hyperparamSearchConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hyperparamSearchConfig] with a well-typed
         * [HyperparamSearchConfig] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun hyperparamSearchConfig(hyperparamSearchConfig: JsonField<HyperparamSearchConfig>) =
            apply {
                body.hyperparamSearchConfig(hyperparamSearchConfig)
            }

        fun jobUuid(jobUuid: String) = apply { body.jobUuid(jobUuid) }

        /**
         * Sets [Builder.jobUuid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobUuid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobUuid(jobUuid: JsonField<String>) = apply { body.jobUuid(jobUuid) }

        fun loggerConfig(loggerConfig: LoggerConfig) = apply { body.loggerConfig(loggerConfig) }

        /**
         * Sets [Builder.loggerConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loggerConfig] with a well-typed [LoggerConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun loggerConfig(loggerConfig: JsonField<LoggerConfig>) = apply {
            body.loggerConfig(loggerConfig)
        }

        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        fun trainingConfig(trainingConfig: TrainingConfig) = apply {
            body.trainingConfig(trainingConfig)
        }

        /**
         * Sets [Builder.trainingConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trainingConfig] with a well-typed [TrainingConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trainingConfig(trainingConfig: JsonField<TrainingConfig>) = apply {
            body.trainingConfig(trainingConfig)
        }

        fun algorithmConfig(algorithmConfig: AlgorithmConfig) = apply {
            body.algorithmConfig(algorithmConfig)
        }

        /**
         * Sets [Builder.algorithmConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.algorithmConfig] with a well-typed [AlgorithmConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun algorithmConfig(algorithmConfig: JsonField<AlgorithmConfig>) = apply {
            body.algorithmConfig(algorithmConfig)
        }

        /**
         * Alias for calling [algorithmConfig] with
         * `AlgorithmConfig.ofLoraFinetuning(loraFinetuning)`.
         */
        fun algorithmConfig(loraFinetuning: AlgorithmConfig.LoraFinetuningConfig) = apply {
            body.algorithmConfig(loraFinetuning)
        }

        /**
         * Alias for calling [algorithmConfig] with
         * `AlgorithmConfig.ofQatFinetuning(qatFinetuning)`.
         */
        fun algorithmConfig(qatFinetuning: AlgorithmConfig.QatFinetuningConfig) = apply {
            body.algorithmConfig(qatFinetuning)
        }

        fun checkpointDir(checkpointDir: String) = apply { body.checkpointDir(checkpointDir) }

        /**
         * Sets [Builder.checkpointDir] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checkpointDir] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun checkpointDir(checkpointDir: JsonField<String>) = apply {
            body.checkpointDir(checkpointDir)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): PostTrainingSupervisedFineTuneParams =
            PostTrainingSupervisedFineTuneParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class HyperparamSearchConfig
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): HyperparamSearchConfig = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [HyperparamSearchConfig].
             */
            fun builder() = Builder()
        }

        /** A builder for [HyperparamSearchConfig]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(hyperparamSearchConfig: HyperparamSearchConfig) = apply {
                additionalProperties = hyperparamSearchConfig.additionalProperties.toMutableMap()
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

            fun build(): HyperparamSearchConfig =
                HyperparamSearchConfig(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is HyperparamSearchConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "HyperparamSearchConfig{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class LoggerConfig
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LoggerConfig = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [LoggerConfig]. */
            fun builder() = Builder()
        }

        /** A builder for [LoggerConfig]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(loggerConfig: LoggerConfig) = apply {
                additionalProperties = loggerConfig.additionalProperties.toMutableMap()
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

            fun build(): LoggerConfig = LoggerConfig(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LoggerConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "LoggerConfig{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class TrainingConfig
    @JsonCreator
    private constructor(
        @JsonProperty("data_config")
        @ExcludeMissing
        private val dataConfig: JsonField<DataConfig> = JsonMissing.of(),
        @JsonProperty("gradient_accumulation_steps")
        @ExcludeMissing
        private val gradientAccumulationSteps: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_steps_per_epoch")
        @ExcludeMissing
        private val maxStepsPerEpoch: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_validation_steps")
        @ExcludeMissing
        private val maxValidationSteps: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("n_epochs")
        @ExcludeMissing
        private val nEpochs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("optimizer_config")
        @ExcludeMissing
        private val optimizerConfig: JsonField<OptimizerConfig> = JsonMissing.of(),
        @JsonProperty("dtype")
        @ExcludeMissing
        private val dtype: JsonField<String> = JsonMissing.of(),
        @JsonProperty("efficiency_config")
        @ExcludeMissing
        private val efficiencyConfig: JsonField<EfficiencyConfig> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataConfig(): DataConfig = dataConfig.getRequired("data_config")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun gradientAccumulationSteps(): Long =
            gradientAccumulationSteps.getRequired("gradient_accumulation_steps")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun maxStepsPerEpoch(): Long = maxStepsPerEpoch.getRequired("max_steps_per_epoch")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun maxValidationSteps(): Long = maxValidationSteps.getRequired("max_validation_steps")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun nEpochs(): Long = nEpochs.getRequired("n_epochs")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun optimizerConfig(): OptimizerConfig = optimizerConfig.getRequired("optimizer_config")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dtype(): String? = dtype.getNullable("dtype")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun efficiencyConfig(): EfficiencyConfig? =
            efficiencyConfig.getNullable("efficiency_config")

        /**
         * Returns the raw JSON value of [dataConfig].
         *
         * Unlike [dataConfig], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data_config")
        @ExcludeMissing
        fun _dataConfig(): JsonField<DataConfig> = dataConfig

        /**
         * Returns the raw JSON value of [gradientAccumulationSteps].
         *
         * Unlike [gradientAccumulationSteps], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("gradient_accumulation_steps")
        @ExcludeMissing
        fun _gradientAccumulationSteps(): JsonField<Long> = gradientAccumulationSteps

        /**
         * Returns the raw JSON value of [maxStepsPerEpoch].
         *
         * Unlike [maxStepsPerEpoch], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_steps_per_epoch")
        @ExcludeMissing
        fun _maxStepsPerEpoch(): JsonField<Long> = maxStepsPerEpoch

        /**
         * Returns the raw JSON value of [maxValidationSteps].
         *
         * Unlike [maxValidationSteps], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("max_validation_steps")
        @ExcludeMissing
        fun _maxValidationSteps(): JsonField<Long> = maxValidationSteps

        /**
         * Returns the raw JSON value of [nEpochs].
         *
         * Unlike [nEpochs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("n_epochs") @ExcludeMissing fun _nEpochs(): JsonField<Long> = nEpochs

        /**
         * Returns the raw JSON value of [optimizerConfig].
         *
         * Unlike [optimizerConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("optimizer_config")
        @ExcludeMissing
        fun _optimizerConfig(): JsonField<OptimizerConfig> = optimizerConfig

        /**
         * Returns the raw JSON value of [dtype].
         *
         * Unlike [dtype], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dtype") @ExcludeMissing fun _dtype(): JsonField<String> = dtype

        /**
         * Returns the raw JSON value of [efficiencyConfig].
         *
         * Unlike [efficiencyConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("efficiency_config")
        @ExcludeMissing
        fun _efficiencyConfig(): JsonField<EfficiencyConfig> = efficiencyConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TrainingConfig = apply {
            if (validated) {
                return@apply
            }

            dataConfig().validate()
            gradientAccumulationSteps()
            maxStepsPerEpoch()
            maxValidationSteps()
            nEpochs()
            optimizerConfig().validate()
            dtype()
            efficiencyConfig()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [TrainingConfig].
             *
             * The following fields are required:
             * ```kotlin
             * .dataConfig()
             * .gradientAccumulationSteps()
             * .maxStepsPerEpoch()
             * .maxValidationSteps()
             * .nEpochs()
             * .optimizerConfig()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [TrainingConfig]. */
        class Builder internal constructor() {

            private var dataConfig: JsonField<DataConfig>? = null
            private var gradientAccumulationSteps: JsonField<Long>? = null
            private var maxStepsPerEpoch: JsonField<Long>? = null
            private var maxValidationSteps: JsonField<Long>? = null
            private var nEpochs: JsonField<Long>? = null
            private var optimizerConfig: JsonField<OptimizerConfig>? = null
            private var dtype: JsonField<String> = JsonMissing.of()
            private var efficiencyConfig: JsonField<EfficiencyConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(trainingConfig: TrainingConfig) = apply {
                dataConfig = trainingConfig.dataConfig
                gradientAccumulationSteps = trainingConfig.gradientAccumulationSteps
                maxStepsPerEpoch = trainingConfig.maxStepsPerEpoch
                maxValidationSteps = trainingConfig.maxValidationSteps
                nEpochs = trainingConfig.nEpochs
                optimizerConfig = trainingConfig.optimizerConfig
                dtype = trainingConfig.dtype
                efficiencyConfig = trainingConfig.efficiencyConfig
                additionalProperties = trainingConfig.additionalProperties.toMutableMap()
            }

            fun dataConfig(dataConfig: DataConfig) = dataConfig(JsonField.of(dataConfig))

            /**
             * Sets [Builder.dataConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataConfig] with a well-typed [DataConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataConfig(dataConfig: JsonField<DataConfig>) = apply {
                this.dataConfig = dataConfig
            }

            fun gradientAccumulationSteps(gradientAccumulationSteps: Long) =
                gradientAccumulationSteps(JsonField.of(gradientAccumulationSteps))

            /**
             * Sets [Builder.gradientAccumulationSteps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gradientAccumulationSteps] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun gradientAccumulationSteps(gradientAccumulationSteps: JsonField<Long>) = apply {
                this.gradientAccumulationSteps = gradientAccumulationSteps
            }

            fun maxStepsPerEpoch(maxStepsPerEpoch: Long) =
                maxStepsPerEpoch(JsonField.of(maxStepsPerEpoch))

            /**
             * Sets [Builder.maxStepsPerEpoch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxStepsPerEpoch] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxStepsPerEpoch(maxStepsPerEpoch: JsonField<Long>) = apply {
                this.maxStepsPerEpoch = maxStepsPerEpoch
            }

            fun maxValidationSteps(maxValidationSteps: Long) =
                maxValidationSteps(JsonField.of(maxValidationSteps))

            /**
             * Sets [Builder.maxValidationSteps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxValidationSteps] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxValidationSteps(maxValidationSteps: JsonField<Long>) = apply {
                this.maxValidationSteps = maxValidationSteps
            }

            fun nEpochs(nEpochs: Long) = nEpochs(JsonField.of(nEpochs))

            /**
             * Sets [Builder.nEpochs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nEpochs] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nEpochs(nEpochs: JsonField<Long>) = apply { this.nEpochs = nEpochs }

            fun optimizerConfig(optimizerConfig: OptimizerConfig) =
                optimizerConfig(JsonField.of(optimizerConfig))

            /**
             * Sets [Builder.optimizerConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.optimizerConfig] with a well-typed [OptimizerConfig]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun optimizerConfig(optimizerConfig: JsonField<OptimizerConfig>) = apply {
                this.optimizerConfig = optimizerConfig
            }

            fun dtype(dtype: String) = dtype(JsonField.of(dtype))

            /**
             * Sets [Builder.dtype] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dtype] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dtype(dtype: JsonField<String>) = apply { this.dtype = dtype }

            fun efficiencyConfig(efficiencyConfig: EfficiencyConfig) =
                efficiencyConfig(JsonField.of(efficiencyConfig))

            /**
             * Sets [Builder.efficiencyConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.efficiencyConfig] with a well-typed
             * [EfficiencyConfig] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun efficiencyConfig(efficiencyConfig: JsonField<EfficiencyConfig>) = apply {
                this.efficiencyConfig = efficiencyConfig
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

            fun build(): TrainingConfig =
                TrainingConfig(
                    checkRequired("dataConfig", dataConfig),
                    checkRequired("gradientAccumulationSteps", gradientAccumulationSteps),
                    checkRequired("maxStepsPerEpoch", maxStepsPerEpoch),
                    checkRequired("maxValidationSteps", maxValidationSteps),
                    checkRequired("nEpochs", nEpochs),
                    checkRequired("optimizerConfig", optimizerConfig),
                    dtype,
                    efficiencyConfig,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class DataConfig
        @JsonCreator
        private constructor(
            @JsonProperty("batch_size")
            @ExcludeMissing
            private val batchSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("data_format")
            @ExcludeMissing
            private val dataFormat: JsonField<DataFormat> = JsonMissing.of(),
            @JsonProperty("dataset_id")
            @ExcludeMissing
            private val datasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("shuffle")
            @ExcludeMissing
            private val shuffle: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("packed")
            @ExcludeMissing
            private val packed: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("train_on_input")
            @ExcludeMissing
            private val trainOnInput: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("validation_dataset_id")
            @ExcludeMissing
            private val validationDatasetId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun batchSize(): Long = batchSize.getRequired("batch_size")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun dataFormat(): DataFormat = dataFormat.getRequired("data_format")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun datasetId(): String = datasetId.getRequired("dataset_id")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun shuffle(): Boolean = shuffle.getRequired("shuffle")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun packed(): Boolean? = packed.getNullable("packed")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun trainOnInput(): Boolean? = trainOnInput.getNullable("train_on_input")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun validationDatasetId(): String? =
                validationDatasetId.getNullable("validation_dataset_id")

            /**
             * Returns the raw JSON value of [batchSize].
             *
             * Unlike [batchSize], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("batch_size")
            @ExcludeMissing
            fun _batchSize(): JsonField<Long> = batchSize

            /**
             * Returns the raw JSON value of [dataFormat].
             *
             * Unlike [dataFormat], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("data_format")
            @ExcludeMissing
            fun _dataFormat(): JsonField<DataFormat> = dataFormat

            /**
             * Returns the raw JSON value of [datasetId].
             *
             * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dataset_id")
            @ExcludeMissing
            fun _datasetId(): JsonField<String> = datasetId

            /**
             * Returns the raw JSON value of [shuffle].
             *
             * Unlike [shuffle], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("shuffle") @ExcludeMissing fun _shuffle(): JsonField<Boolean> = shuffle

            /**
             * Returns the raw JSON value of [packed].
             *
             * Unlike [packed], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("packed") @ExcludeMissing fun _packed(): JsonField<Boolean> = packed

            /**
             * Returns the raw JSON value of [trainOnInput].
             *
             * Unlike [trainOnInput], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("train_on_input")
            @ExcludeMissing
            fun _trainOnInput(): JsonField<Boolean> = trainOnInput

            /**
             * Returns the raw JSON value of [validationDatasetId].
             *
             * Unlike [validationDatasetId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("validation_dataset_id")
            @ExcludeMissing
            fun _validationDatasetId(): JsonField<String> = validationDatasetId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): DataConfig = apply {
                if (validated) {
                    return@apply
                }

                batchSize()
                dataFormat()
                datasetId()
                shuffle()
                packed()
                trainOnInput()
                validationDatasetId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [DataConfig].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .batchSize()
                 * .dataFormat()
                 * .datasetId()
                 * .shuffle()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [DataConfig]. */
            class Builder internal constructor() {

                private var batchSize: JsonField<Long>? = null
                private var dataFormat: JsonField<DataFormat>? = null
                private var datasetId: JsonField<String>? = null
                private var shuffle: JsonField<Boolean>? = null
                private var packed: JsonField<Boolean> = JsonMissing.of()
                private var trainOnInput: JsonField<Boolean> = JsonMissing.of()
                private var validationDatasetId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(dataConfig: DataConfig) = apply {
                    batchSize = dataConfig.batchSize
                    dataFormat = dataConfig.dataFormat
                    datasetId = dataConfig.datasetId
                    shuffle = dataConfig.shuffle
                    packed = dataConfig.packed
                    trainOnInput = dataConfig.trainOnInput
                    validationDatasetId = dataConfig.validationDatasetId
                    additionalProperties = dataConfig.additionalProperties.toMutableMap()
                }

                fun batchSize(batchSize: Long) = batchSize(JsonField.of(batchSize))

                /**
                 * Sets [Builder.batchSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.batchSize] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun batchSize(batchSize: JsonField<Long>) = apply { this.batchSize = batchSize }

                fun dataFormat(dataFormat: DataFormat) = dataFormat(JsonField.of(dataFormat))

                /**
                 * Sets [Builder.dataFormat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dataFormat] with a well-typed [DataFormat] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dataFormat(dataFormat: JsonField<DataFormat>) = apply {
                    this.dataFormat = dataFormat
                }

                fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

                /**
                 * Sets [Builder.datasetId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.datasetId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

                fun shuffle(shuffle: Boolean) = shuffle(JsonField.of(shuffle))

                /**
                 * Sets [Builder.shuffle] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shuffle] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun shuffle(shuffle: JsonField<Boolean>) = apply { this.shuffle = shuffle }

                fun packed(packed: Boolean) = packed(JsonField.of(packed))

                /**
                 * Sets [Builder.packed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.packed] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun packed(packed: JsonField<Boolean>) = apply { this.packed = packed }

                fun trainOnInput(trainOnInput: Boolean) = trainOnInput(JsonField.of(trainOnInput))

                /**
                 * Sets [Builder.trainOnInput] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.trainOnInput] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun trainOnInput(trainOnInput: JsonField<Boolean>) = apply {
                    this.trainOnInput = trainOnInput
                }

                fun validationDatasetId(validationDatasetId: String) =
                    validationDatasetId(JsonField.of(validationDatasetId))

                /**
                 * Sets [Builder.validationDatasetId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.validationDatasetId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun validationDatasetId(validationDatasetId: JsonField<String>) = apply {
                    this.validationDatasetId = validationDatasetId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): DataConfig =
                    DataConfig(
                        checkRequired("batchSize", batchSize),
                        checkRequired("dataFormat", dataFormat),
                        checkRequired("datasetId", datasetId),
                        checkRequired("shuffle", shuffle),
                        packed,
                        trainOnInput,
                        validationDatasetId,
                        additionalProperties.toImmutable(),
                    )
            }

            class DataFormat
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val INSTRUCT = of("instruct")

                    val DIALOG = of("dialog")

                    fun of(value: String) = DataFormat(JsonField.of(value))
                }

                /** An enum containing [DataFormat]'s known values. */
                enum class Known {
                    INSTRUCT,
                    DIALOG,
                }

                /**
                 * An enum containing [DataFormat]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [DataFormat] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INSTRUCT,
                    DIALOG,
                    /**
                     * An enum member indicating that [DataFormat] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INSTRUCT -> Value.INSTRUCT
                        DIALOG -> Value.DIALOG
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaStackClientInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        INSTRUCT -> Known.INSTRUCT
                        DIALOG -> Known.DIALOG
                        else ->
                            throw LlamaStackClientInvalidDataException("Unknown DataFormat: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaStackClientInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw LlamaStackClientInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DataFormat && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DataConfig && batchSize == other.batchSize && dataFormat == other.dataFormat && datasetId == other.datasetId && shuffle == other.shuffle && packed == other.packed && trainOnInput == other.trainOnInput && validationDatasetId == other.validationDatasetId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(batchSize, dataFormat, datasetId, shuffle, packed, trainOnInput, validationDatasetId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DataConfig{batchSize=$batchSize, dataFormat=$dataFormat, datasetId=$datasetId, shuffle=$shuffle, packed=$packed, trainOnInput=$trainOnInput, validationDatasetId=$validationDatasetId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class OptimizerConfig
        @JsonCreator
        private constructor(
            @JsonProperty("lr")
            @ExcludeMissing
            private val lr: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("num_warmup_steps")
            @ExcludeMissing
            private val numWarmupSteps: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("optimizer_type")
            @ExcludeMissing
            private val optimizerType: JsonField<OptimizerType> = JsonMissing.of(),
            @JsonProperty("weight_decay")
            @ExcludeMissing
            private val weightDecay: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lr(): Double = lr.getRequired("lr")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun numWarmupSteps(): Long = numWarmupSteps.getRequired("num_warmup_steps")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun optimizerType(): OptimizerType = optimizerType.getRequired("optimizer_type")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun weightDecay(): Double = weightDecay.getRequired("weight_decay")

            /**
             * Returns the raw JSON value of [lr].
             *
             * Unlike [lr], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lr") @ExcludeMissing fun _lr(): JsonField<Double> = lr

            /**
             * Returns the raw JSON value of [numWarmupSteps].
             *
             * Unlike [numWarmupSteps], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("num_warmup_steps")
            @ExcludeMissing
            fun _numWarmupSteps(): JsonField<Long> = numWarmupSteps

            /**
             * Returns the raw JSON value of [optimizerType].
             *
             * Unlike [optimizerType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("optimizer_type")
            @ExcludeMissing
            fun _optimizerType(): JsonField<OptimizerType> = optimizerType

            /**
             * Returns the raw JSON value of [weightDecay].
             *
             * Unlike [weightDecay], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("weight_decay")
            @ExcludeMissing
            fun _weightDecay(): JsonField<Double> = weightDecay

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): OptimizerConfig = apply {
                if (validated) {
                    return@apply
                }

                lr()
                numWarmupSteps()
                optimizerType()
                weightDecay()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [OptimizerConfig].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .lr()
                 * .numWarmupSteps()
                 * .optimizerType()
                 * .weightDecay()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [OptimizerConfig]. */
            class Builder internal constructor() {

                private var lr: JsonField<Double>? = null
                private var numWarmupSteps: JsonField<Long>? = null
                private var optimizerType: JsonField<OptimizerType>? = null
                private var weightDecay: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(optimizerConfig: OptimizerConfig) = apply {
                    lr = optimizerConfig.lr
                    numWarmupSteps = optimizerConfig.numWarmupSteps
                    optimizerType = optimizerConfig.optimizerType
                    weightDecay = optimizerConfig.weightDecay
                    additionalProperties = optimizerConfig.additionalProperties.toMutableMap()
                }

                fun lr(lr: Double) = lr(JsonField.of(lr))

                /**
                 * Sets [Builder.lr] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lr] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lr(lr: JsonField<Double>) = apply { this.lr = lr }

                fun numWarmupSteps(numWarmupSteps: Long) =
                    numWarmupSteps(JsonField.of(numWarmupSteps))

                /**
                 * Sets [Builder.numWarmupSteps] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.numWarmupSteps] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun numWarmupSteps(numWarmupSteps: JsonField<Long>) = apply {
                    this.numWarmupSteps = numWarmupSteps
                }

                fun optimizerType(optimizerType: OptimizerType) =
                    optimizerType(JsonField.of(optimizerType))

                /**
                 * Sets [Builder.optimizerType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.optimizerType] with a well-typed [OptimizerType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun optimizerType(optimizerType: JsonField<OptimizerType>) = apply {
                    this.optimizerType = optimizerType
                }

                fun weightDecay(weightDecay: Double) = weightDecay(JsonField.of(weightDecay))

                /**
                 * Sets [Builder.weightDecay] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.weightDecay] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun weightDecay(weightDecay: JsonField<Double>) = apply {
                    this.weightDecay = weightDecay
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): OptimizerConfig =
                    OptimizerConfig(
                        checkRequired("lr", lr),
                        checkRequired("numWarmupSteps", numWarmupSteps),
                        checkRequired("optimizerType", optimizerType),
                        checkRequired("weightDecay", weightDecay),
                        additionalProperties.toImmutable(),
                    )
            }

            class OptimizerType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ADAM = of("adam")

                    val ADAMW = of("adamw")

                    val SGD = of("sgd")

                    fun of(value: String) = OptimizerType(JsonField.of(value))
                }

                /** An enum containing [OptimizerType]'s known values. */
                enum class Known {
                    ADAM,
                    ADAMW,
                    SGD,
                }

                /**
                 * An enum containing [OptimizerType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [OptimizerType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ADAM,
                    ADAMW,
                    SGD,
                    /**
                     * An enum member indicating that [OptimizerType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ADAM -> Value.ADAM
                        ADAMW -> Value.ADAMW
                        SGD -> Value.SGD
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaStackClientInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        ADAM -> Known.ADAM
                        ADAMW -> Known.ADAMW
                        SGD -> Known.SGD
                        else ->
                            throw LlamaStackClientInvalidDataException(
                                "Unknown OptimizerType: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaStackClientInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw LlamaStackClientInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is OptimizerType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OptimizerConfig && lr == other.lr && numWarmupSteps == other.numWarmupSteps && optimizerType == other.optimizerType && weightDecay == other.weightDecay && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(lr, numWarmupSteps, optimizerType, weightDecay, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OptimizerConfig{lr=$lr, numWarmupSteps=$numWarmupSteps, optimizerType=$optimizerType, weightDecay=$weightDecay, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class EfficiencyConfig
        @JsonCreator
        private constructor(
            @JsonProperty("enable_activation_checkpointing")
            @ExcludeMissing
            private val enableActivationCheckpointing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("enable_activation_offloading")
            @ExcludeMissing
            private val enableActivationOffloading: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("fsdp_cpu_offload")
            @ExcludeMissing
            private val fsdpCpuOffload: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("memory_efficient_fsdp_wrap")
            @ExcludeMissing
            private val memoryEfficientFsdpWrap: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun enableActivationCheckpointing(): Boolean? =
                enableActivationCheckpointing.getNullable("enable_activation_checkpointing")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun enableActivationOffloading(): Boolean? =
                enableActivationOffloading.getNullable("enable_activation_offloading")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun fsdpCpuOffload(): Boolean? = fsdpCpuOffload.getNullable("fsdp_cpu_offload")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun memoryEfficientFsdpWrap(): Boolean? =
                memoryEfficientFsdpWrap.getNullable("memory_efficient_fsdp_wrap")

            /**
             * Returns the raw JSON value of [enableActivationCheckpointing].
             *
             * Unlike [enableActivationCheckpointing], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("enable_activation_checkpointing")
            @ExcludeMissing
            fun _enableActivationCheckpointing(): JsonField<Boolean> = enableActivationCheckpointing

            /**
             * Returns the raw JSON value of [enableActivationOffloading].
             *
             * Unlike [enableActivationOffloading], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("enable_activation_offloading")
            @ExcludeMissing
            fun _enableActivationOffloading(): JsonField<Boolean> = enableActivationOffloading

            /**
             * Returns the raw JSON value of [fsdpCpuOffload].
             *
             * Unlike [fsdpCpuOffload], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fsdp_cpu_offload")
            @ExcludeMissing
            fun _fsdpCpuOffload(): JsonField<Boolean> = fsdpCpuOffload

            /**
             * Returns the raw JSON value of [memoryEfficientFsdpWrap].
             *
             * Unlike [memoryEfficientFsdpWrap], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("memory_efficient_fsdp_wrap")
            @ExcludeMissing
            fun _memoryEfficientFsdpWrap(): JsonField<Boolean> = memoryEfficientFsdpWrap

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): EfficiencyConfig = apply {
                if (validated) {
                    return@apply
                }

                enableActivationCheckpointing()
                enableActivationOffloading()
                fsdpCpuOffload()
                memoryEfficientFsdpWrap()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [EfficiencyConfig]. */
                fun builder() = Builder()
            }

            /** A builder for [EfficiencyConfig]. */
            class Builder internal constructor() {

                private var enableActivationCheckpointing: JsonField<Boolean> = JsonMissing.of()
                private var enableActivationOffloading: JsonField<Boolean> = JsonMissing.of()
                private var fsdpCpuOffload: JsonField<Boolean> = JsonMissing.of()
                private var memoryEfficientFsdpWrap: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(efficiencyConfig: EfficiencyConfig) = apply {
                    enableActivationCheckpointing = efficiencyConfig.enableActivationCheckpointing
                    enableActivationOffloading = efficiencyConfig.enableActivationOffloading
                    fsdpCpuOffload = efficiencyConfig.fsdpCpuOffload
                    memoryEfficientFsdpWrap = efficiencyConfig.memoryEfficientFsdpWrap
                    additionalProperties = efficiencyConfig.additionalProperties.toMutableMap()
                }

                fun enableActivationCheckpointing(enableActivationCheckpointing: Boolean) =
                    enableActivationCheckpointing(JsonField.of(enableActivationCheckpointing))

                /**
                 * Sets [Builder.enableActivationCheckpointing] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enableActivationCheckpointing] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun enableActivationCheckpointing(
                    enableActivationCheckpointing: JsonField<Boolean>
                ) = apply { this.enableActivationCheckpointing = enableActivationCheckpointing }

                fun enableActivationOffloading(enableActivationOffloading: Boolean) =
                    enableActivationOffloading(JsonField.of(enableActivationOffloading))

                /**
                 * Sets [Builder.enableActivationOffloading] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enableActivationOffloading] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun enableActivationOffloading(enableActivationOffloading: JsonField<Boolean>) =
                    apply {
                        this.enableActivationOffloading = enableActivationOffloading
                    }

                fun fsdpCpuOffload(fsdpCpuOffload: Boolean) =
                    fsdpCpuOffload(JsonField.of(fsdpCpuOffload))

                /**
                 * Sets [Builder.fsdpCpuOffload] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fsdpCpuOffload] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fsdpCpuOffload(fsdpCpuOffload: JsonField<Boolean>) = apply {
                    this.fsdpCpuOffload = fsdpCpuOffload
                }

                fun memoryEfficientFsdpWrap(memoryEfficientFsdpWrap: Boolean) =
                    memoryEfficientFsdpWrap(JsonField.of(memoryEfficientFsdpWrap))

                /**
                 * Sets [Builder.memoryEfficientFsdpWrap] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memoryEfficientFsdpWrap] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun memoryEfficientFsdpWrap(memoryEfficientFsdpWrap: JsonField<Boolean>) = apply {
                    this.memoryEfficientFsdpWrap = memoryEfficientFsdpWrap
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): EfficiencyConfig =
                    EfficiencyConfig(
                        enableActivationCheckpointing,
                        enableActivationOffloading,
                        fsdpCpuOffload,
                        memoryEfficientFsdpWrap,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EfficiencyConfig && enableActivationCheckpointing == other.enableActivationCheckpointing && enableActivationOffloading == other.enableActivationOffloading && fsdpCpuOffload == other.fsdpCpuOffload && memoryEfficientFsdpWrap == other.memoryEfficientFsdpWrap && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(enableActivationCheckpointing, enableActivationOffloading, fsdpCpuOffload, memoryEfficientFsdpWrap, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EfficiencyConfig{enableActivationCheckpointing=$enableActivationCheckpointing, enableActivationOffloading=$enableActivationOffloading, fsdpCpuOffload=$fsdpCpuOffload, memoryEfficientFsdpWrap=$memoryEfficientFsdpWrap, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrainingConfig && dataConfig == other.dataConfig && gradientAccumulationSteps == other.gradientAccumulationSteps && maxStepsPerEpoch == other.maxStepsPerEpoch && maxValidationSteps == other.maxValidationSteps && nEpochs == other.nEpochs && optimizerConfig == other.optimizerConfig && dtype == other.dtype && efficiencyConfig == other.efficiencyConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dataConfig, gradientAccumulationSteps, maxStepsPerEpoch, maxValidationSteps, nEpochs, optimizerConfig, dtype, efficiencyConfig, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrainingConfig{dataConfig=$dataConfig, gradientAccumulationSteps=$gradientAccumulationSteps, maxStepsPerEpoch=$maxStepsPerEpoch, maxValidationSteps=$maxValidationSteps, nEpochs=$nEpochs, optimizerConfig=$optimizerConfig, dtype=$dtype, efficiencyConfig=$efficiencyConfig, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PostTrainingSupervisedFineTuneParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PostTrainingSupervisedFineTuneParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
