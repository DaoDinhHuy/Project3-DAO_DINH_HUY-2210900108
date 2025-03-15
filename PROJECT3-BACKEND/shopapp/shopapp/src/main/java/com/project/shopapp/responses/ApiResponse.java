package com.project.shopapp.responses;

public class ApiResponse {
package com.yourpackage.shopapp.responses;

import lombok.Data;

    @Data
    public class ApiResponse<T> {
        private String message;
        private T data;

        public ApiResponse(String message, T data) {
            this.message = message;
            this.data = data;
        }
    }