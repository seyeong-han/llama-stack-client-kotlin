package com.example.llamastackandroiddemo

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

    // Test with url => X
    // private fun dataUrlFromUrl(url: String): String {
    //     val connection = java.net.URL(url).openConnection()
    //     val mimeType = connection.contentType ?: "application/octet-stream"
    //     val bytes = connection.getInputStream().use { it.readBytes() }
    //     val base64 = Base64.encodeToString(bytes, Base64.NO_WRAP)
    //     return "data:$mimeType;base64,$base64"
    // }

    // Test with file => X
    private fun dataUrlFromUrl(path: String): String {
        val bytes: ByteArray
        val mimeType: String

        // Handle local file
        val file = java.io.File(path)
        bytes = file.readBytes()
        mimeType = java.nio.file.Files.probeContentType(file.toPath()) ?: "application/octet-stream"

        val base64 = Base64.encodeToString(bytes, Base64.NO_WRAP)
        return "data:$mimeType;base64,$base64"
    }

    /**
     * Registers a vector database and inserts documents for RAG
     * @param client The LlamaStackClientClient instance
     * @return The ID of the registered vector database
     */
    fun setupRagVectorDatabase(client: LlamaStackClientClient): String {
        // Define documents to be used for RAG
        val urls = listOf("chat.rst", "llama3.rst", "memory_optimizations.rst", "lora_finetune.rst")

        // Tested on multiple files => X
//        val documents = urls.mapIndexed { i, url ->
//            Document.builder()
//                .documentId("num-$i")
//                .content("https://raw.githubusercontent.com/pytorch/torchtune/main/docs/source/tutorials/$url")
//                .mimeType("text/plain")
//                .build()
//        }

        // Tested on single file => X
//        val document = Document.builder()
//            .documentId("num1")
//            .content("https://raw.githubusercontent.com/pytorch/torchtune/main/docs/source/tutorials/chat.rst")
//            .mimeType("text/plain")
//            .build()

        // val urlContent = dataUrlFromUrl("https://raw.githubusercontent.com/pytorch/torchtune/main/docs/source/tutorials/chat.rst")
        val urlContent = dataUrlFromUrl("chats_text.txt")
        val document = Document.builder()
            .documentId("num1")
            .content(urlContent)
            .mimeType("text/plain")
            .build()

        // Get vector providers
//        val vectorProviders = client.providers().list().filter { it.api() == "vector_io" }
//        if (vectorProviders.isEmpty()) {
//            throw RuntimeException("No vector providers available")
//        }
//        val providerId = vectorProviders[0].providerId()

        // Register a vector database
        val vectorDbId = "test-vector-db-${UUID.randomUUID().toString().replace("-", "")}"
//        client.vectorDbs().register(
//            providerId = providerId,
//            vectorDbId = vectorDbId,
//            embeddingModel = "all-MiniLM-L6-v2",
//            embeddingDimension = 384
//        )
//
//        // Insert the documents into the vector database
//        client.toolRuntime().ragTool().insert(
//            ToolRuntimeRagToolInsertParams.builder()
//                .documents(documents)
//                .vectorDbId(vectorDbId)
//                .chunkSizeInTokens(512)
//                .build()
//        )

        return vectorDbId
    }
}
