//package it.ezzie.moviecompose.scretch
//
//@Composable
//fun HomePage() {
//    val items = listOf(
//        "Item 1", "Item 2", "Item 3", "Item 4", "Item 5"
//    )
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .verticalScroll(rememberScrollState()) // Apply vertical scrolling to the Column
//    ) {
//        // First LazyRow
//        LazyRow(
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            items(items) { item ->
//                Text(text = item, modifier = Modifier.padding(16.dp))
//            }
//        }
//
//        // Spacer to add some vertical space between rows
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // LazyColumn (this will show your main list of movies)
//        LazyColumn(
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            items(items) { item ->
//                Text(text = item, modifier = Modifier.padding(16.dp))
//            }
//        }
//
//        // Spacer to add some vertical space between rows
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // Second LazyRow (you can replace it with any content)
//        LazyRow(
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            items(items) { item ->
//                Text(text = item, modifier = Modifier.padding(16.dp))
//            }
//        }
//    }
//}
