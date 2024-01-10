package es.unex.asee.pruebapractica.data.api

import com.google.gson.annotations.SerializedName


data class Labels (

  @SerializedName("label"  ) var label  : String? = null,
  @SerializedName("status" ) var status : String? = null

)