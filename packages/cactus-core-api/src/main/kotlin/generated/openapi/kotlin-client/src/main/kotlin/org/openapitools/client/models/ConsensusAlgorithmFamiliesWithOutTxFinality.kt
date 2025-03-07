/**
 * Hyperledger Core API
 *
 * Contains/describes the core API types for Cactus. Does not describe actual endpoints on its own as this is left to the implementing plugins who can import and re-use commonly needed type definitions from this specification. One example of said commonly used type definitions would be the types related to consortium management, cactus nodes, ledgers, etc..
 *
 * The version of the OpenAPI document: 0.2.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * Enumerates a list of consensus algorithm families that do not provide immediate finality
 *
 * Values: WORK
 */

enum class ConsensusAlgorithmFamiliesWithOutTxFinality(val value: kotlin.String) {

    @Json(name = "org.hyperledger.cactus.consensusalgorithm.PROOF_OF_WORK")
    WORK("org.hyperledger.cactus.consensusalgorithm.PROOF_OF_WORK");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: Any?): kotlin.String? = if (data is ConsensusAlgorithmFamiliesWithOutTxFinality) "$data" else null

        /**
         * Returns a valid [ConsensusAlgorithmFamiliesWithOutTxFinality] for [data], null otherwise.
         */
        fun decode(data: Any?): ConsensusAlgorithmFamiliesWithOutTxFinality? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

