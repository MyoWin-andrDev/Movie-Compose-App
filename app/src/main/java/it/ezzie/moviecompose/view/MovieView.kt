package it.ezzie.moviecompose.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.ezzie.moviecompose.R
import it.ezzie.moviecompose.model.MovieData
import it.ezzie.moviecompose.ui.theme.white

@Composable
fun MovieItemView(movie : MovieData) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ){
        Column {
            Image(
                painter = painterResource(R.drawable.wide),
                contentDescription = null,
                modifier = Modifier
                    .width(100.dp)
                    .height(170.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Title",
                modifier = Modifier.padding(top = 5.dp),
                fontSize = 16.sp,
                color = white
            )
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun showUI(){
}