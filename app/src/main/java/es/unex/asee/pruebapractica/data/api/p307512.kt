package es.unex.asee.pruebapractica.data.api

import com.google.gson.annotations.SerializedName


data class p307512 (

  @SerializedName("account"        ) var account       : Account?       = Account(),
  @SerializedName("last_update"    ) var lastUpdate    : String?        = null,
  @SerializedName("reason"         ) var reason        : String?        = null,
  @SerializedName("reason_account" ) var reasonAccount : ReasonAccount? = ReasonAccount()

)