package com.example.journalia

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

val ClubArray = arrayOf(
    listOf(listOf("tpf","Business and Management"), listOf("tpf","Products Management")),
    listOf(listOf("tpf","Products Management"), listOf("tpf","Products Management")),
    listOf(listOf("tpf","Products Management"), listOf("tpf","Products Management")),
    listOf(listOf("tpf","Products Management"), listOf("tpf","Products Management")),
    listOf(listOf("tpf","Products Management"), listOf("tpf","Products Management")),
    listOf(listOf("tpf","Products Management"), listOf("tpf","Products Management")),
    listOf(listOf("tpf","Products Management"), listOf("tpf","Products Management")),
    listOf(listOf("tpf","Products Management"), listOf("tpf","Products Management")),
)

@Composable
fun ClubSubPage(navController: NavHostController)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = gradient(
                    isVerticalGradient = true,
                    colors = gradientColorlist
                )
            )
            .padding(WindowInsets.systemBars.asPaddingValues())
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp,10.dp)
//                .border(2.dp,Color.White)
            ,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Image(
                painter = painterResource(id = R.drawable.face),
                contentDescription = "image description",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(25.dp)

            )
            Text(
                text = "Journalia",
                style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Center,
                )
            )

            Column(
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.spacedBy(5.dp, Alignment.CenterVertically)
            )
            {
                Box(
                    Modifier
                        .padding(0.dp)
                        .width(10.dp)
                        .height(2.dp)
                        .background(color = Color(0xFFFFFFFF))
                )
                Box(
                    Modifier
                        .padding(0.dp)
                        .width(20.dp)
                        .height(2.dp)
                        .background(color = Color(0xFFFFFFFF))
                )
                Box(
                    Modifier
                        .padding(0.dp)
                        .width(30.dp)
                        .height(2.dp)
                        .background(color = Color(0xFFFFFFFF))
                )
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp, 0.dp)
                .background(color = Color(0xFFD9D9D9), shape = RoundedCornerShape(size = 9.dp)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Text(text = "Search", modifier = Modifier.padding(20.dp,5.dp,0.dp,5.dp),fontSize = 16.sp,color = Color.Black, fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Row(
                Modifier
                    .background(color = Color(0xFF2D2D2D), shape = RoundedCornerShape(0.dp,9.dp,9.dp,0.dp))

                    .width(100.dp)
                ,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            )
            {
                Text(text = "Filter", modifier = Modifier.padding(0.dp,5.dp),fontSize = 16.sp,color = Color.White, fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
                Image(
                    painter = painterResource(id = R.drawable.downarrow),
                    contentDescription = "image description",
                    modifier = Modifier.size(5.dp)
                )
            }

        }

        LazyColumn(
            modifier = Modifier.fillMaxHeight()
        )
        {
            items(ClubArray){clubs ->
                Row(
                    modifier = Modifier.fillMaxWidth().padding(20.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                )
                {
                    for(i in clubs)
                    {
                        Column(modifier = Modifier
                            .width(150.dp)
                            .background(color = Color.Black.copy(0.8f), shape = RoundedCornerShape(12.dp,12.dp,0.dp,12.dp)).clickable { navController.navigate("C")
                            },
                            horizontalAlignment = Alignment.Start,
                            verticalArrangement = Arrangement.SpaceBetween
                            )
                        {
                            val context = LocalContext.current
                            val resourceId = context.resources.getIdentifier(i[0], "drawable", context.packageName)
                            Image(
                                modifier = Modifier.padding(5.dp,0.dp,0.dp,0.dp).size(70.dp),
                                painter = painterResource(id = resourceId),
                                contentDescription = "image description",
                            )
                            Row(modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            )
                            {
                                Box(
                                    modifier = Modifier
                                        .padding(10.dp)
                                        .background(shape = CircleShape, color = Color.White)
                                    ,
                                    contentAlignment = Alignment.Center
                                )
                                {
                                    Image(
                                        painter = painterResource(id = R.drawable.forwardarrow),
                                        contentDescription = "image description",
                                        modifier = Modifier.padding(2.dp).size(15.dp)
                                    )
                                }

                                Box(
                                    Modifier
                                        .fillMaxHeight()
                                        .background(
                                            color = Color(0xFFD9D9D9),
                                            shape = RoundedCornerShape(15.dp,0.dp,0.dp,0.dp)
                                        ),
                                    contentAlignment = Alignment.Center
                                )
                                {
                                    Text(text = i[1], fontSize = 15.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center, fontStyle = FontStyle.Italic)
                                }

                            }
                        }
                    }

                }
            }
        }
    }
}