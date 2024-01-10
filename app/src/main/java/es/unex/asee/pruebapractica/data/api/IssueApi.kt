package es.unex.asee.pruebapractica.data.api

import com.google.gson.annotations.SerializedName


data class IssueApi (

  @SerializedName("id"                       ) var id                     : String?                  = null,
  @SerializedName("project"                  ) var project                : String?                  = null,
  @SerializedName("branch"                   ) var branch                 : String?                  = null,
  @SerializedName("attention_set"            ) var attentionSet           : AttentionSet?            = AttentionSet(),
  @SerializedName("hashtags"                 ) var hashtags               : ArrayList<String>        = arrayListOf(),
  @SerializedName("change_id"                ) var changeId               : String?                  = null,
  @SerializedName("subject"                  ) var subject                : String?                  = null,
  @SerializedName("status"                   ) var status                 : String?                  = null,
  @SerializedName("created"                  ) var created                : String?                  = null,
  @SerializedName("updated"                  ) var updated                : String?                  = null,
  @SerializedName("submit_type"              ) var submitType             : String?                  = null,
  @SerializedName("insertions"               ) var insertions             : Int?                     = null,
  @SerializedName("deletions"                ) var deletions              : Int?                     = null,
  @SerializedName("total_comment_count"      ) var totalCommentCount      : Int?                     = null,
  @SerializedName("unresolved_comment_count" ) var unresolvedCommentCount : Int?                     = null,
  @SerializedName("work_in_progress"         ) var workInProgress         : Boolean?                 = null,
  @SerializedName("has_review_started"       ) var hasReviewStarted       : Boolean?                 = null,
  @SerializedName("meta_rev_id"              ) var metaRevId              : String?                  = null,
  @SerializedName("_number"                  ) var Number                 : Int?                     = null,
  @SerializedName("owner"                    ) var owner                  : Owner?                   = Owner(),
  @SerializedName("requirements"             ) var requirements           : ArrayList<String>        = arrayListOf(),
  @SerializedName("submit_records"           ) var submitRecords          : ArrayList<SubmitRecords> = arrayListOf()

)