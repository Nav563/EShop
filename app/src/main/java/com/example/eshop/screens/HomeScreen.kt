package com.example.eshop.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight.Companion.W400
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.font.FontWeight.Companion.W700
import androidx.compose.ui.text.font.FontWeight.Companion.W900
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.eshop.R
import com.example.eshop.components.SpacerHeight
import com.example.eshop.components.SpacerWidth
import com.example.eshop.data.Product
import com.example.eshop.data.Shoes
import com.example.eshop.data.productList
import com.example.eshop.data.shoesList
import com.example.eshop.navigation.SignIn
import com.example.eshop.ui.theme.Backgorund
import com.example.eshop.ui.theme.Primary

@Composable
fun HomeScreen(navHostController: NavHostController) {

    val searchList: List<String> = listOf()

    val email = remember {
        mutableStateOf("")
    }
    val searchQuery = remember {
        mutableStateOf(TextFieldValue())
    }
    var filteredList = remember {
        mutableStateOf(searchList)
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Backgorund)
    ) {
        Column {
            HomeHeader(onClick = {
                navHostController.navigate(com.example.eshop.navigation.ShoesDetails)
            }
            )
            SearchBarHome(searchQuery = searchQuery.value, onQueryChange = { newQuery ->
                searchQuery.value = newQuery
                filteredList = if (newQuery.text.isEmpty()) {
                    mutableStateOf(searchList)
                } else {
                    mutableStateOf(searchList.filter {
                        it.contains(
                            newQuery.text,
                            ignoreCase = true
                        )
                    })
                }
            })
            SpacerHeight()
            //FilteredList(filteredItems = filteredList.value)
            ProductBrandsRow()
            SpacerHeight(10.dp)
            CommonTitle(title = stringResource(id = R.string.popular_shoes)) {
                navHostController.navigate(SignIn)
            }
            SpacerHeight(5.dp)
            ShoesRow()
            SpacerHeight()
            CommonTitle(title = stringResource(id = R.string.new_arrivals)) {
                navHostController.navigate(SignIn)
            }
            NewArrivalsView()
        }

    }
}

@Composable
fun HomeHeader(onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = onClick,
            modifier = Modifier
                .size(25.dp)
                .background(Color.White, RoundedCornerShape(30.dp))
        ) {
            Icon(painter = painterResource(id = R.drawable.combo_shape), contentDescription = "")
        }
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.store_location),
                fontSize = 12.sp,
                fontWeight = W400,
                color = colorResource(id = R.color.subtitle_color)
            )
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painter = painterResource(id = R.drawable.location), contentDescription = "")

                SpacerWidth(5.dp)

                Text(
                    text = stringResource(id = R.string.mondolibug_sylhet),
                    fontSize = 14.sp,
                    fontWeight = W500,
                    color = colorResource(id = R.color.title_color)
                )
            }
        }
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(Color.White, RoundedCornerShape(30.dp))
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(id = R.drawable.bag), contentDescription = "")
            }

            Image(
                painter = painterResource(id = R.drawable.red_dot), contentDescription = "",
                modifier = Modifier
                    .align(Alignment.TopEnd)
            )
        }

    }
}

@Composable
fun SearchBarHome(
    searchQuery: TextFieldValue,
    onQueryChange: (TextFieldValue) -> Unit
) {
    TextField(
        value = searchQuery, onValueChange = onQueryChange,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            disabledContainerColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
        ),
        placeholder = {
            androidx.compose.material3.Text(
                text = stringResource(id = R.string.looking_for_shoes),
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = W400,
                    color = Color.LightGray
                )
            )
        },
        shape = RoundedCornerShape(8.dp),
        leadingIcon = {
            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Search, contentDescription = "search",
                tint = Color.LightGray
            )
        },
        modifier = Modifier
            .padding(top = 30.dp)
            .fillMaxWidth()
            .size(width = 0.dp, height = 50.dp)
            .border(1.dp, Color.LightGray, RoundedCornerShape(26.dp))
            .clip(RoundedCornerShape(26.dp)),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done)
    )
}

@Composable
fun FilteredList(filteredItems: List<String>) {
    Column(modifier = Modifier.fillMaxSize()) {
        for (item in filteredItems) {
            Text(
                text = item,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.Start),
                color = Color.Black
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun NewArrivalsView() {
    //val pageState = androidx.compose.foundation.pager.rememberPagerState(initialPage = 0)
//    val shoesViewModel: ShoesViewModel = hiltViewModel()
//    LaunchedEffect(shoesViewModel) {
//        shoesViewModel.fetchShoes()
//    }
//    val dataState = shoesViewModel.shoesState.collectAsState()


//    Column(modifier = Modifier.padding(top = 10.dp)) {
//        Modifier
//            .fillMaxWidth()
//            .size(200.dp, 120.dp)
//            .clip(RoundedCornerShape(10.dp))
//            .background(Color.White)
//        PaddingValues(0.dp)
//        PagerDefaults.flingBehavior(
//            state = state,
//            endContentPadding = contentPadding.calculateEndPadding(LayoutDirection.Ltr),
//        )
//        fun PagerScope.(page: Int) {
//            NewArrivalsUi(shoes = dataState.value[page])
//        }
//        HorizontalPagerIndicator(
//            pagerState = pageState,
//            modifier = Modifier
//                .align(Alignment.CenterHorizontally)
//                .padding(20.dp),
//            activeColor = colorResource(id = R.color.primary)
//        )
//    }
}

@Composable
fun NewArrivalsUi(shoes: Shoes) {
//    val shoesViewModel: ShoesViewModel = hiltViewModel()
//    LaunchedEffect(shoesViewModel) {
//        shoesViewModel.fetchShoes()
//    }
//    val dataState = shoesViewModel.shoesState.collectAsState()
//
//    val painter = rememberAsyncImagePainter(
//        ImageRequest.Builder(LocalContext.current).data(data = shoesViewModel.fetchShoes())
//            .apply(block = fun ImageRequest.Builder.() {
//                crossfade(true)
//                placeholder(R.drawable.nike_prev_ui)
//            }).build()
//    )
//    val painterState by rememberUpdatedState(painter)

    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Column(
                modifier = Modifier
                    .padding(start = 10.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = shoes.status, style = TextStyle(
                        fontSize = 16.sp, fontWeight = W400, color = Primary
                    )
                )
                SpacerHeight(5.dp)
                Text(
                    text = shoes.name, style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = W500,
                        color = colorResource(id = R.color.title_color)
                    )
                )
                SpacerHeight(5.dp)
                Text(
                    text = "${"Rs." + shoes.mrp}", style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = W900,
                        color = colorResource(id = R.color.title_color)
                    )
                )
            }
            Image(
                painter = painterResource(id = shoes.image),
                contentDescription = shoes.name,
                modifier = Modifier
                    .padding(end = 20.dp)
                    .size(width = 140.dp, height = 100.dp),
                contentScale = ContentScale.FillBounds
            )
        }
    }

}

@Composable
fun ShoesRow() {
//    val shoesViewModel: ShoesViewModel = hiltViewModel()
//    LaunchedEffect(shoesViewModel) {
//        shoesViewModel.fetchShoes()
//    }
    //val dataState by shoesViewModel.shoesState.collectAsState()

    LazyRow {
        items(shoesList.size) { index ->
            ShoesItem(shoesList[index])
        }
    }
}

@Composable
fun ShoesItem(shoes: Shoes) {


    Box(
        modifier = Modifier
            .padding(end = 15.dp)
            .fillMaxWidth(1F)
            .background(Color.White, RoundedCornerShape(16.dp))
            .height(200.dp)
            .width(165.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = shoes.image), contentDescription = "",
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
                    .size(width = 120.dp, height = 80.dp)
                    .background(Color.White, RoundedCornerShape(26.dp))
            )

            SpacerHeight()
            Box {
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = shoes.status, style = TextStyle(
                            fontSize = 16.sp, fontWeight = W400, color = Primary
                        )
                    )
                    SpacerHeight(5.dp)
                    Text(
                        text = shoes.name, style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = W500,
                            color = colorResource(id = R.color.title_color)
                        )
                    )
                    SpacerHeight(5.dp)
                    Text(
                        text = "${"Rs." + shoes.mrp}", style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = W900,
                            color = colorResource(id = R.color.title_color)
                        )
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.add_to_cart_icon),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(top = 45.dp)
                        .size(width = 34.dp, height = 35.5.dp)
                        .align(Alignment.BottomEnd)
                        .clickable { }
                )
            }
        }
    }
}

@Composable
fun ProductBrandsRow() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        items(productList, key = { it.id }) {
            ProductItem(product = it)
        }
    }
}

@Composable
fun ProductItem(
    product: Product
) {
    Box(
        modifier = Modifier
            .padding(top = 15.dp, end = 10.dp)
            .background(product.color, RoundedCornerShape(36.dp))
            .height(50.dp)
            .width(130.dp)
    ) {
        Image(
            painter = painterResource(id = product.image), contentDescription = "",
            modifier = Modifier
                .padding(5.dp)
                .size(40.dp)
                .align(Alignment.CenterStart)
                .background(Color.White, RoundedCornerShape(26.dp))
        )
        SpacerWidth(5.dp)
        Text(
            text = product.title, style = TextStyle(
                fontWeight = W500,
                fontSize = 14.sp,
                color = Color.White,
            ), maxLines = 2,
            modifier = Modifier
                .padding(start = 5.dp, end = 5.dp)
                .align(Alignment.CenterEnd)
                .width(70.dp)
        )
    }

}

@Composable
fun CommonTitle(
    title: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = title, style = TextStyle(
                fontSize = 18.sp,
                fontWeight = W700,
                color = Color.Black
            )
        )
        TextButton(onClick) {
            Text(
                text = stringResource(id = R.string.see_all), style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = W400,
                    color = colorResource(id = R.color.primary)
                )
            )
        }

    }
}