package oop_00000126968_lintangbalakosaardhana.week07

enum class AppState {
    LOADING,
    SUCCESS,
    ERROR
}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}