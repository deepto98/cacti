/**
 * Hyperledger Cactus Plugin - HTLC ETH BESU ERC20
 *
 * Allows Cactus nodes to interact with HTLC contracts with ERC-20 Tokens
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

import org.openapitools.client.models.Web3SigningCredentialType

import com.squareup.moshi.Json

/**
 * 
 *
 * @param type 
 * @param ethAccount The ethereum account (public key) that the credential  belongs to. Basically the username in the traditional  terminology of authentication.
 * @param keychainEntryKey The key to use when looking up the the keychain entry holding the secret pointed to by the  keychainEntryKey parameter.
 * @param keychainId The keychain ID to use when looking up the the keychain plugin instance that will be used to retrieve the secret pointed to by the keychainEntryKey parameter.
 */

data class Web3SigningCredentialCactusKeychainRef (

    @Json(name = "type")
    val type: Web3SigningCredentialType,

    /* The ethereum account (public key) that the credential  belongs to. Basically the username in the traditional  terminology of authentication. */
    @Json(name = "ethAccount")
    val ethAccount: kotlin.String,

    /* The key to use when looking up the the keychain entry holding the secret pointed to by the  keychainEntryKey parameter. */
    @Json(name = "keychainEntryKey")
    val keychainEntryKey: kotlin.String,

    /* The keychain ID to use when looking up the the keychain plugin instance that will be used to retrieve the secret pointed to by the keychainEntryKey parameter. */
    @Json(name = "keychainId")
    val keychainId: kotlin.String

)

