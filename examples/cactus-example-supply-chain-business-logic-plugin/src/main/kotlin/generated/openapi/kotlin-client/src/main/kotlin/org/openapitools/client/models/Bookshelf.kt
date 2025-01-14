/**
 * Hyperledger Cactus Example - Supply Chain App
 *
 * Demonstrates how a business use case can be satisfied with Cactus when multiple distinct ledgers are involved.
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
 * 
 *
 * @param id 
 * @param shelfCount The number of shelves the bookshelf comes with.
 * @param bambooHarvestId The foreign key ID referencing the bamboo harvest that yielded the wood material for the construction of the bookshelf.
 */

data class Bookshelf (

    @Json(name = "id")
    val id: kotlin.String,

    /* The number of shelves the bookshelf comes with. */
    @Json(name = "shelfCount")
    val shelfCount: java.math.BigDecimal,

    /* The foreign key ID referencing the bamboo harvest that yielded the wood material for the construction of the bookshelf. */
    @Json(name = "bambooHarvestId")
    val bambooHarvestId: kotlin.String

)

