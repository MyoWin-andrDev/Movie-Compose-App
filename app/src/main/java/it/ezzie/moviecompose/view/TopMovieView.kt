@file:Suppress("CAST_NEVER_SUCCEEDS")

package it.ezzie.moviecompose.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.ezzie.moviecompose.R
import it.ezzie.moviecompose.model.MovieDetailData
import it.ezzie.moviecompose.ui.theme.darkBlue
import it.ezzie.moviecompose.ui.theme.grey
import it.ezzie.moviecompose.ui.theme.linkColor
import it.ezzie.moviecompose.ui.theme.mainColor
import it.ezzie.moviecompose.ui.theme.orange
import it.ezzie.moviecompose.ui.theme.white
import it.ezzie.moviecompose.ui.theme.yellow

@Composable
fun TopMovieView(movieDetail : MovieDetailData){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(color = darkBlue)
    ){
        Row{
            //Img
            Image(
                painter = painterResource(id = movieDetail.image),
                contentDescription = null,
                modifier = Modifier
                    .width(100.dp)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Spacer(modifier = Modifier.height(8.dp))
            //Detail
            Column (
                modifier = Modifier.padding(top = 16.dp)
            ){
                //Title
                Text(
                    text = movieDetail.name,
                    color = yellow,
                    fontSize = 16.sp,
                )
                Spacer(modifier = Modifier.height(8.dp))
                //Second Line
                Row {
                    //Year
                    Text(
                        text = movieDetail.year.toString(),
                        color = grey,
                        fontSize = 14.sp,
                    )
                    //Duration
                    Text(
                        text = movieDetail.duration,
                        color = grey,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                    //Year
                    Text(
                        text = movieDetail.age,
                        color = grey,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                //Third Line
                Row{
                    //Star
                    Image(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = null,
                        modifier = Modifier
                            .size(12.dp)
                            .align(Alignment.CenterVertically)
                    )
                    //Rating
                    Text(
                        text = movieDetail.imdbScore,
                        color = grey,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(start = 2.dp)
                    )
                    //Rate Click
                    Image(
                        painter = painterResource(id = R.drawable.star_rating),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .size(16.dp)
                            .align(Alignment.CenterVertically)
                    )
                    //Rate Text
                    Text(
                        text = "Rate",
                        fontSize = 14.sp,
                        color = linkColor,
                        modifier = Modifier
                            .padding(start = 2.dp)
                    )
                    //MetaScore
                    Text(
                        text = movieDetail.metaScore.toString(),
                        color = white,
                        modifier = Modifier

                            .padding(start = 16.dp, end = 8.dp)
                            .width(24.dp)
                            .clip(RoundedCornerShape(3.dp))
                            .background(color = orange),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun DetailPreview(){
}