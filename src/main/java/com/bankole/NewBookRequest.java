package com.bankole;

record NewBookRequest (
        String author,
        String title,
        String genre,
        Integer price
){
}
