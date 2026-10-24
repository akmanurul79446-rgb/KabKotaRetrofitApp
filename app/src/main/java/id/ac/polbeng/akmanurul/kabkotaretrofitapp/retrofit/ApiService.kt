package id.ac.polbeng.akmanurul.kabkotaretrofitapp.retrofit

import id.ac.polbeng.akmanurul.kabkotaretrofitapp.response.KabKotaResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("api/read_kabkota.php")
    fun getListUsers(): Call<KabKotaResponse>
}