package id.buaja.notesapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.buaja.notesapp.model.Notes

/**
 * https://developer.android.com/jetpack/compose/text
 */

@Composable
fun NoteItems(
    item: Notes
) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(5.dp),
        backgroundColor = Color.White,
        content = {
            Column(
                modifier = Modifier
                    .padding(
                        top = 16.dp,
                        start = 16.dp,
                        end = 8.dp,
                        bottom = 6.dp
                    )
            ) {
                Text(
                    text = item.title
                )

                Text(
                    text = item.description
                )

                Spacer(modifier = Modifier.padding(top = 8.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        modifier = Modifier
                            .weight(1f),
                        text = item.createDate
                    )

                    Box(
                        modifier = Modifier
                            .size(32.dp)
                            .background(Color.Black),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_baseline_delete_forever_24),
                            contentDescription = null,
                            tint = Color.Gray
                        )
                    }
                }
            }
        }
    )
}

@Preview
@Composable
private fun NoteItemsPreview() {
    NoteItems(
        Notes(
            id = 0,
            title = "Hello",
            description = "I am Android Developer\nI learning",
            createDate = "17 Mei 2022, 21:21 AM"
        )
    )
}