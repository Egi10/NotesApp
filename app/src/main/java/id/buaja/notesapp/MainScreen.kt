package id.buaja.notesapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.buaja.notesapp.model.Notes

@Composable
fun MainScreen() {
    val list = listOf(
        Notes(
            id = 0,
            title = "Hello",
            description = "I am Android Developer\nI learning",
            createDate = "17 Mei 2022, 21:21 AM"
        ),
        Notes(
            id = 1,
            title = "Spent",
            description = "Mart\nI learning",
            createDate = "17 Mei 2022, 21:22 AM"
        )
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.Gray
            ),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(
            all = 16.dp
        ),
        content = {
            items(
                items = list,
                key = { key ->
                    key.id
                },
                itemContent = { item ->
                    NoteItems(
                        item = item
                    )
                }
            )
        }
    )
}

@Preview(
    device = Devices.PIXEL_2
)
@Composable
private fun MainScreenPreview() {
    MainScreen()
}