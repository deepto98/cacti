/**
 * Hyperledger Cactus Example - Carbon Accounting App
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
 * @param account The address of the account holding the funds
 * @param spender The address of the account spending the funds
 */

data class DaoTokenGetAllowanceRequest (

    /* The address of the account holding the funds */
    @Json(name = "account")
    val account: kotlin.String,

    /* The address of the account spending the funds */
    @Json(name = "spender")
    val spender: kotlin.String

)

