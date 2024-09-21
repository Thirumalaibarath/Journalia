package com.example.journalia

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ClubPage(navController: NavHostController) {
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
    ) {
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

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Transparent)
        )
        {
            LazyColumn(modifier = Modifier
                .padding(0.dp, 60.dp, 0.dp, 0.dp)
                .fillMaxSize()
                .background(color = Color.Black.copy(0.8f))
                .padding(20.dp,0.dp,20.dp,0.dp)
                ,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            )
            {
                items(1){
                    Text(text = "The Products Folks",color = Color.White, fontSize = 20.sp,fontWeight = FontWeight.Bold ,modifier = Modifier.padding(0.dp,15.dp), fontStyle = FontStyle.Italic)
                    Text(text = "Ahh it’s the worst place you can be at, Firstly the climate here is horrible and don’t even get me started at the mess food. The minute you take a bite in, you will feel like puking..."
                        ,color = Color.White, fontSize = 15.sp , textAlign = TextAlign.Center, fontStyle = FontStyle.Italic )
                    Text(text = "Heads",color = Color.White, fontSize = 20.sp,fontWeight = FontWeight.Bold ,modifier = Modifier.padding(0.dp,15.dp), fontStyle = FontStyle.Italic)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        for (i in 0..2)
                        {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.face),
                                    contentDescription = "image description",
                                    modifier = Modifier.size(40.dp)
                                )
                                Text(text = "Krishna",color = Color.White, fontSize = 15.sp,fontWeight = FontWeight.Bold ,modifier = Modifier.padding(0.dp,10.dp), fontStyle = FontStyle.Italic)
                            }
                        }
                    }
                    Text(text = "Projects",color = Color.White, fontSize = 20.sp,fontWeight = FontWeight.Bold ,modifier = Modifier.padding(0.dp,5.dp,0.dp,0.dp))
                    for(i in 0..1)
                    {
                        Box(modifier = Modifier
                            .padding(20.dp,15.dp)
                            .fillMaxWidth()
                            .height(200.dp)
                            .background(color = Color.White.copy(0.2f), shape = RoundedCornerShape(12.dp)),
                            contentAlignment = Alignment.BottomStart
                        )
                        {
                            Box(
                                modifier = Modifier
                                    .padding(10.dp)
                                    .background(shape = CircleShape, color = Color.White)
                                    .size(20.dp)
                                ,
                                contentAlignment = Alignment.Center
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.forwardarrow),
                                    contentDescription = "image description",
                                    modifier = Modifier.size(15.dp)
                                )
                            }
                        }
                    }
                    Text(text = "Social Media",color = Color.White, fontSize = 20.sp,fontWeight = FontWeight.Bold ,fontStyle = FontStyle.Italic)

                    Row(
                        modifier = Modifier.padding(20.dp).fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = Alignment.CenterVertically
                    )
                    {
                        for(i in 0..3)
                        {
                            Image(
                                painter = painterResource(id = R.drawable.insta),
                                contentDescription = "image description",
                                modifier = Modifier.size(25.dp),
                                colorFilter = ColorFilter.tint(Color.Yellow)
                            )
                        }
                    }

                }


            }

            Row(
                modifier = Modifier
                    .padding(20.dp, 10.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.tpf),
                    contentDescription = "image description",
                    modifier = Modifier.size(100.dp)
                )

                Row(
                    modifier = Modifier
                        .background(color = Color.White, shape = RoundedCornerShape(8.dp))
                        .padding(0.dp, 5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                )
                {
                    Text(text = "Follow", color = Color.Black, fontSize = 15.sp,fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(5.dp,0.dp), fontStyle = FontStyle.Italic)
                    Image(
                        painter = painterResource(id = R.drawable.add2),
                        contentDescription = "image description",
                        modifier = Modifier.padding(0.dp,0.dp,5.dp,0.dp).size(10.dp)
                    )
                }

            }

        }
    }
}