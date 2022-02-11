package gallego.morales.entrega

import retrofit2.http.GET

interface DataApiService {

    @GET("films")
    suspend fun getProperties(): List<MyProperty>

}