package it.ezzie.moviecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
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
import it.ezzie.moviecompose.model.MovieDetailData
import it.ezzie.moviecompose.model.PosterData
import it.ezzie.moviecompose.ui.theme.mainColor
import it.ezzie.moviecompose.ui.theme.yellow
import it.ezzie.moviecompose.view.ActorListView
import it.ezzie.moviecompose.view.CategoryListView
import it.ezzie.moviecompose.view.MovieItemView
import it.ezzie.moviecompose.view.PosterView
import it.ezzie.moviecompose.model.MovieGenre
import it.ezzie.moviecompose.view.TopMovieView

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
            //Top Movie Details Column List
            val movieDetails = listOf(
                MovieDetailData(
                    R.drawable.dune, "1. Dune: Part Two", 2024, "2h 46m", "12A", "8.5 (548K)", 79
                ),

            MovieDetailData(
                R.drawable.all_we_imagine, "2. All We Imagine as Light", 2024, "2h 28m", "15", "7.5 (231K)", 79
            ),
            MovieDetailData(
                R.drawable.nowhere, "3. Nowhere Special", 2024, "1h 36m", "U", "7.6 (179K)", 73
            ),


            MovieDetailData(
                R.drawable.girls, "4. Girls Will Be Girls", 2024, "2h 21m", "18", "7.5 (142K)", 78
            ),

            MovieDetailData(
                R.drawable.laroy, "5. LaRoy, Texas", 2024, "3h 35m", "N/A", "8.1 (1.2K)", 88
            ),

            MovieDetailData(
                R.drawable.ghostlight, "6. Ghostlight", 2024, "1h 58m", "15", "6.9 (6.2K)", 72
            ),

            MovieDetailData(
                R.drawable.histhree, "7. His Three Daughter", 2024, "1h 55m", "R", "7.5 (3.7K)", 83
            ),

            MovieDetailData(
                R.drawable.thewildrobot, "8. The Wild Robot", 2024, "2h 9m", "PG", "7.6 (14K)", 62
            ),

            MovieDetailData(
                R.drawable.thelma, "9. Thelma", 2024, "2h 40m", "PG", "8.2 (13K)", 73
            ),

            MovieDetailData(
                R.drawable.sing, "10. Sing Sing", 2024, "2h 11m", "15", "7.1 (119K)", 82
            ))
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = mainColor)){
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState())
                        .padding(top = 8.dp)
                        .background(color = mainColor)
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

                    CustomListView(movieList = movieDetails)

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
                   CustomTopMovieList(movieDetailList = movieDetails)

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
fun CustomListView(movieList: List<MovieDetailData>){
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
fun CustomTopMovieList(movieDetailList : List<MovieDetailData>){
    Column(modifier = Modifier
        .height(600.dp)
        .verticalScroll(rememberScrollState())
    ) {
        movieDetailList.forEach { movieDetailData ->
            TopMovieView(movieDetail = movieDetailData)
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

