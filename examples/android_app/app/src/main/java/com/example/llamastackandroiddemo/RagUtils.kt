package com.example.llamastackandroiddemo

import android.content.Context
import com.llama.llamastack.client.LlamaStackClientClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.AgentConfig
import com.llama.llamastack.models.Document
import com.llama.llamastack.models.ToolRuntimeRagToolInsertParams
import java.util.UUID
import android.util.Base64
import android.net.Uri
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object RagUtils {
    /**
     * Creates a RAG knowledge search toolgroup with the specified vector database ID
     * @param vectorDbId The ID of the vector database to search
     * @return A configured Toolgroup for RAG knowledge search
     */
    fun createRagKnowledgeSearchToolgroup(vectorDbId: String): AgentConfig.Toolgroup {
        // Create the args object with vector_db_ids
        val args = AgentConfig.Toolgroup.AgentToolGroupWithArgs.Args.builder()
            .putAdditionalProperty("vector_db_ids", JsonValue.from(listOf(vectorDbId)))
            .build()

        // Create the AgentToolGroupWithArgs object
        val toolGroupWithArgs = AgentConfig.Toolgroup.AgentToolGroupWithArgs.builder()
            .name("builtin::rag/knowledge_search")
            .args(args)
            .build()

        // Create and return the Toolgroup
        return AgentConfig.Toolgroup.ofAgentToolGroupWithArgs(toolGroupWithArgs)
    }

    fun setupRagVectorDatabase(client: LlamaStackClientClient, context: Context): String {
        // Define documents to be used for RAG
        // Enable access to assets folder with context
        val urlContent = dataUrlFromUrl("chats_text.txt", context)
        val document = Document.builder()
            .documentId("num1")
            .content(urlContent)
            .mimeType("text/plain")
            .build()

        return "test-vector-db-${UUID.randomUUID().toString().replace("-", "")}"
    }

    private fun dataUrlFromUrl(path: String, context: Context): String {
        val bytes: ByteArray
        val mimeType: String

        // Read from assets
        context.assets.open(path).use { inputStream ->
            bytes = inputStream.readBytes()
        }
        mimeType = when {
            path.endsWith(".txt") -> "text/plain"
            path.endsWith(".pdf") -> "application/pdf"
            path.endsWith(".json") -> "application/json"
            else -> "application/octet-stream"
        }

        val base64 = Base64.encodeToString(bytes, Base64.NO_WRAP)
        return "data:$mimeType;base64,$base64"
    }
}
