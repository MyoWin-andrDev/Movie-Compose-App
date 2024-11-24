package it.ezzie.moviecompose.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.ezzie.moviecompose.model.ActorData
import it.ezzie.moviecompose.ui.theme.white

@Composable
fun ActorListView(actor : ActorData){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp, bottom = 16.dp)
    ){
        Column (
            modifier = Modifier
        ){
            Image(
                painter = painterResource(actor.image),
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .align(Alignment.CenterHorizontally),
                contentScale = ContentScale.Crop
            )
            Text(
                text = actor.name,
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(top = 5.dp),
                color = white
            )
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ActorListPreview(){
    
}