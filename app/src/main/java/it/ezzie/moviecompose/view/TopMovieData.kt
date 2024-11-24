package it.ezzie.moviecompose.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import it.ezzie.moviecompose.R
import it.ezzie.moviecompose.model.MovieDetailData

@Composable
fun DetailData(movieDetail : MovieDetailData){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ){
        Row(){
            Image(
                painter = painterResource(id = movieDetail.image),
                contentDescription = null,
            )
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun DetailPreview(){

}