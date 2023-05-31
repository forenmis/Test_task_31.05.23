package com.example.testplaytini.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PlaneItem(
    val title: String,
    val year: Long,
    val image: String,
    val imageDescription: String,
    val description: String
) : Parcelable

fun createPLaneList(): List<PlaneItem> {
    val items = mutableListOf<PlaneItem>()
    for (i in 0..4) {
        items.add(
            PlaneItem(
                "PLane Name",
                2023,
                "https://www.aeroflap.com.br/wp-content/uploads/2022/11/Approved-737-10-In-Flight-1200x800.jpg",
                "Airliner proposal",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
            )
        )
    }
    return items
}
