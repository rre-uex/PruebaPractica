package es.unex.asee.pruebapractica.api

import com.google.gson.GsonBuilder
import es.unex.asee.pruebapractica.data.api.IssueApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


private val service: PruebaPracticaAPI by lazy {

    val gson = GsonBuilder().setLenient().create()

    val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor())
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl("https://git.eclipse.org/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    retrofit.create(PruebaPracticaAPI::class.java)

}

fun getNetworkService() = service

interface PruebaPracticaAPI {

    @GET("r/changes/?q=status:open")
    suspend fun getIssues(): List<IssueApi>

}

class APIError(message: String, cause: Throwable?) : Throwable(message, cause)