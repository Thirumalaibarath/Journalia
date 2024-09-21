package com.example.journalia

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

val calender = listOf(listOf("01","02","03","04","05","06","07"),listOf("08","09",10,11,12,13,14),listOf(15,16,17,18,19,20,21),listOf(22,23,24,25,26,27,28),listOf(29,30,31,0,0,0,0)
)
val days = listOf("SUN","MON","TUE","WED","THU","FRI","SAT")

@Composable
fun Calender(navController: NavHostController)
{

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .background(
                brush = gradient(
                    isVerticalGradient = true,
                    colors = gradientColorlist
                )
            )
            .padding(WindowInsets.systemBars.asPaddingValues()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    )
    {
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


        Text(
            text = "July",
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ), fontStyle = FontStyle.Italic
        )



        Column(
            modifier = Modifier.fillMaxHeight().padding(20.dp,20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        )
        {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
            )
            {
                for (i in days)
                {
                    Box(
                        modifier = Modifier
                            .padding(0.dp,2.dp)
                            .size(45.dp)
                            .background(
                                color = Color.Black.copy(0.7f),
                                shape = RoundedCornerShape(2.dp)
                            ),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Text(text = i,color = Color.White, fontSize = 12.sp,fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
                    }
                }
            }
            for(i in calender)
            {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround,
                )
                {
                    for(j in i)
                    {
                        if(j != 0)
                        {
                            Box(
                                modifier = Modifier
                                    .padding(0.dp,2.dp)
                                    .size(45.dp)
                                    .background(
                                        color = Color.White.copy(0.7f),
                                        shape = RoundedCornerShape(2.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            )
                            {
                                Text(text = j.toString(),color = Color.Black, fontSize = 15.sp,fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
                            }
                        }
                        else
                        {
                            Box(
                                modifier = Modifier
                                    .size(45.dp)
                                    .padding(2.dp)
                                    .background(
                                        color = Color.Transparent,
                                        shape = RoundedCornerShape(2.dp)
                                    ),
                            )
                        }

                    }
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            )
            {
                Box(modifier = Modifier.fillMaxWidth(0.5f).height(40.dp).padding(0.dp,5.dp,0.dp,0.dp).background(color = Color.White, shape = RoundedCornerShape(3.dp)),
                    contentAlignment = Alignment.Center
                )
                {
                    Text("3rd July Fee Payment Reminder",overflow = TextOverflow.Ellipsis, modifier = Modifier.padding(5.dp,0.dp,0.dp,0.dp), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
                }

                Box(modifier = Modifier.fillMaxWidth(0.7f).height(40.dp).padding(0.dp,5.dp,0.dp,0.dp).background(color = Color.White, shape = RoundedCornerShape(3.dp)),
                    contentAlignment = Alignment.Center
                )
                {
                    Text("View Post",overflow = TextOverflow.Ellipsis, modifier = Modifier.padding(5.dp,0.dp,0.dp,0.dp), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
                }
                Box(
                    modifier = Modifier.height(40.dp).padding(0.dp,5.dp,5.dp,0.dp).background(color = Color.Black, shape = RoundedCornerShape(3.dp)),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.reminder),
                        contentDescription = "image description",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .padding(5.dp)
                            .size(20.dp)
                        ,
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                }
            }
        }

    }




}
