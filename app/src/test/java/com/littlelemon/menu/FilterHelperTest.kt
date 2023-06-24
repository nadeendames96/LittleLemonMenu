package com.littlelemon.menu

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test
internal class FilterHelperTest{
    @Test
    fun filterProduct_filterType_Dessert_croissantReturnet(){
        val simpleProductsList = mutableListOf(
            ProductItem("Black tea", 3.00, "Drinks", R.drawable.black_tea),
            ProductItem("Bouillabaisse", 20.00, "Food", R.drawable.bouillabaisse),
            ProductItem("Croissant", 7.00, "Dessert", R.drawable.croissant),
        )
        var expected =
        FilterHelper().filterProducts(FilterType.Dessert,simpleProductsList)

        var actual =
            FilterHelper().filterProducts(FilterType.Dessert,simpleProductsList)
        assertEquals(expected,actual )
    }
}