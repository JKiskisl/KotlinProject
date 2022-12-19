package com.jk.kotlinproj.feature_note.presentation.notes

import com.jk.kotlinproj.feature_note.domain.model.Note
import com.jk.kotlinproj.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNode(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
