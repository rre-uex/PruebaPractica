package es.unex.asee.pruebapractica.data.api

import com.google.gson.annotations.SerializedName


data class SubmitRecords (

  @SerializedName("rule_name" ) var ruleName : String?           = null,
  @SerializedName("status"    ) var status   : String?           = null,
  @SerializedName("labels"    ) var labels   : ArrayList<Labels> = arrayListOf()

)