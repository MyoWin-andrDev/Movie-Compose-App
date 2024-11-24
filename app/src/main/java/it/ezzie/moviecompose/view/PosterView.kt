package it.ezzie.moviecompose.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import it.ezzie.moviecompose.R
import it.ezzie.moviecompose.model.MovieData

@Composable
fun PosterView(movie : MovieData){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp)
    ){
        Image(
            painter = painterResource(R.drawable.wide),
            contentDescription = null ,
            modifier = Modifier.fillMaxWidth().height(225.dp).clip(RoundedCornerShape(30.dp))
                .align(Alignment.Center)
            )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun Preview(){

}