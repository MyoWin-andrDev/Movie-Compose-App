package it.ezzie.moviecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.ezzie.moviecompose.model.ActorData
import it.ezzie.moviecompose.model.MovieData
import it.ezzie.moviecompose.model.PosterData
import it.ezzie.moviecompose.ui.theme.mainColor
import it.ezzie.moviecompose.ui.theme.yellow
import it.ezzie.moviecompose.view.ActorListView
import it.ezzie.moviecompose.view.CategoryListView
import it.ezzie.moviecompose.view.MovieItemView
import it.ezzie.moviecompose.view.PosterView
import it.ezzie.moviecompose.model.MovieGenre

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //Poster Data
            val posters = listOf(
                PosterData(R.drawable.wide),
                PosterData(R.drawable.wide1),
                PosterData(R.drawable.wide3),
            )
            //MovieData
            val items = listOf(
                MovieData("Title1", "Description One", R.drawable.wide),
                MovieData("Title2", "Description Two", R.drawable.wide),
                MovieData("Title3", "Description Three", R.drawable.wide),
                MovieData("Title4", "Description Four", R.drawable.wide),
                MovieData("Title5", "Description Five", R.drawable.wide),
            )
            //Actor Data
            val actors = listOf(
                ActorData("Álvaro Morte", R.drawable.one),
                ActorData("Úrsula Corberó", R.drawable.two),
                ActorData("Pedro Alonso", R.drawable.three),
                ActorData("Itziar Ituño", R.drawable.four),
                ActorData("Najwa Nimri", R.drawable.five),
                ActorData("R. de la Serna", R.drawable.six),
                ActorData("Alba Flores", R.drawable.seven),
                ActorData("Miguel Herrán", R.drawable.eight),
                ActorData("Paco Tous", R.drawable.nine),
                ActorData("Jaime Lorente", R.drawable.ten),
            )
            //Movie Genres
            val genres = listOf(
                MovieGenre("Action"),
                MovieGenre("Comedy"),
                MovieGenre("Drama"),
                MovieGenre("Horror"),
                MovieGenre("Romance"),
                MovieGenre("Science Fiction"),
                MovieGenre("Documentary")
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .background(color = mainColor)){
                Column(
                    modifier = Modifier.padding(top = 8.dp)
                ){

                    CustomPosterView(movieList = items)
                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Upcoming",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(8.dp),
                        color = yellow
                    )

                    CustomListView(movieList = items)

                    Text(
                        text = "Genre",
                        fontSize = 20.sp,
                        modifier = Modifier.padding(8.dp),
                        color = yellow
                    )
                    CustomCategoryListView(genreList = genres)

                    Text(
                        text = "Top Movies",
                        fontSize = 20.sp,
                        modifier = Modifier.padding(8.dp),
                        color = yellow
                    )
                    CustomListView(movieList = items)

                    Text(
                        text = "Actor",
                        fontSize = 20.sp,
                        modifier = Modifier.padding(8.dp),
                        color = yellow
                    )
                    CustomActorList(actorList = actors)
                }
            }
        }
    }
}
@Composable
fun CustomPosterView(movieList: List<MovieData>){
    LazyRow {
        items(movieList){
            PosterView(movie = it)
        }
    }
}
@Composable
fun CustomListView(movieList: List<MovieData>){
    LazyRow {
        items(movieList){movie ->
            MovieItemView(movie = movie)
        }
    }
}
@Composable
fun CustomCategoryListView(genreList : List<MovieGenre>){
    LazyRow {
        items(genreList){
            CategoryListView(genre = it)
        }
    }
}

@Composable
fun CustomActorList(actorList : List<ActorData>){
    LazyRow {
        items(actorList){
            ActorListView(actor = it)
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun JetpackCompose(){

}

