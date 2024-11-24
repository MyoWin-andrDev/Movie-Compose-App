package it.ezzie.moviecompose.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.ezzie.moviecompose.model.MovieGenre
import it.ezzie.moviecompose.ui.theme.darkBlue
import it.ezzie.moviecompose.ui.theme.white

@Composable
fun CategoryListView(genre : MovieGenre){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(color = darkBlue)

    ){
        Text(
            text = genre.genre,
            fontSize = 16.sp,
            color = white,
            modifier = Modifier.padding(12.dp)
        )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun CategoryPreview(){

}