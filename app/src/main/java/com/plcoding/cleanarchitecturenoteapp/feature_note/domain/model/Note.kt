package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model

import android.os.Message
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.cleanarchitecturenoteapp.ui.theme.*
import java.lang.Exception

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, RedPink, BabyBlue, Violet, LightGreen)
    }
}

class InvalidNoteException(message: String):Exception(message)
