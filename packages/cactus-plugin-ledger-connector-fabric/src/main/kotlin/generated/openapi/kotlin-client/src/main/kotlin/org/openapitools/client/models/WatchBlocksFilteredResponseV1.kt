/**
 * Hyperledger Cactus Plugin - Connector Fabric
 *
 * Can perform basic tasks on a fabric ledger
 *
 * The version of the OpenAPI document: 0.0.1
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
 * Response that corresponds to Fabric SDK 'filtered' EventType.
 *
 * @param filteredBlock Filtered commited block.
 */

data class WatchBlocksFilteredResponseV1 (

    /* Filtered commited block. */
    @Json(name = "filteredBlock")
    val filteredBlock: kotlin.Any

)

