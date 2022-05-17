package id.buaja.notesapp.model

/**
 * https://kotlinlang.org/docs/data-classes.html
 */
data class Notes(
    val id: Int,
    val title: String,
    val description: String,
    val createDate: String
)
