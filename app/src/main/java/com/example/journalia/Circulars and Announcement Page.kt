package com.example.journalia

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

var chosen by mutableIntStateOf(-1)

val circulars = listOf(
    listOf("date","6th Sept","-"),
    listOf("content","Hostel Fees","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at "),
    listOf("content","Hostel Fees","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at "),
    listOf("content","Hostel Fees","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at "),
    listOf("content","Hostel Fees","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at "),
    listOf("content","Hostel Fees","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at "),
    listOf("date","7th Sept","-"),
    listOf("content","Hostel Fees","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at "),
    listOf("content","Hostel Fees","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at "),
    )

val announcements = listOf(
    listOf(
        "Hostel Fees",
        "7th Sept"
    ),
    listOf(
        "Hostel Fees",
        "6th Sept"
    ),
    listOf(
        "Hostel Fees",
        "15th Sept"
    ),
    listOf(
        "Hostel Fees",
        "29th Oct"
    ),
    listOf(
        "Hostel Fees",
        "7th Nov"
    ),
    listOf(
        "Hostel Fees",
        "17th Jan"
    ),
    listOf(
        "Hostel Fees",
        "12th Dec"
    )
)


@Composable
fun CircularPage(navController: NavHostController)
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
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Box(
                modifier = Modifier.background(color =
                if(chosen == 0)Color.Black else Color.White, shape = RoundedCornerShape(8.dp)
                ).clickable {
                    chosen = 0
                }
            )
            {
                Text(
                    text = "Circulars",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = if(chosen == 0)Color.White else Color.Black,
                        textAlign = TextAlign.Center,
                    ),
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier.fillMaxWidth(0.3f).padding(0.dp,5.dp)
                )
            }

            Box(
                modifier = Modifier.background(color = if(chosen == 1)Color.Black else Color.White, shape = RoundedCornerShape(8.dp)).clickable {
                    chosen = 1
                }
            )
            {
                Text(
                    text = "Announcements",
                    fontStyle = FontStyle.Italic,
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = if(chosen == 1)Color.White else Color.Black,
                        textAlign = TextAlign.Center,
                    ),
                    modifier = Modifier.fillMaxWidth(0.8f).padding(0.dp,5.dp)
                )
            }

        }
        // for announcements
        if(chosen == 1)
        {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp, 0.dp)
            )
            {
                items(announcements){
                        item->

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp, 10.dp)
                            .background(
                                shape = RoundedCornerShape(8.dp),
                                color = Color.White.copy(0.5f)
                            )
                    )
                    {
                        Text(text = item[0], modifier = Modifier.padding(10.dp,10.dp,10.dp,10.dp), fontSize = 20.sp, fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
                        Row()
                        {
                            Text(text = "Deadline:",fontSize = 15.sp,modifier = Modifier.padding(10.dp,0.dp,0.dp,10.dp),fontWeight = FontWeight.Bold,fontStyle = FontStyle.Italic)
                            Text(text = item[1],modifier = Modifier.padding(5.dp,0.dp,10.dp,10.dp),fontSize = 15.sp,fontWeight = FontWeight.Bold,fontStyle = FontStyle.Italic)
                        }
                        Box(
                            modifier = Modifier.padding(10.dp,0.dp,0.dp,10.dp).background(shape = RoundedCornerShape(9.dp),color = Color.Black).clickable { navController.navigate("B") }
                        )
                        {
                            Text(text = "Add to Calender",modifier = Modifier.padding(15.dp,5.dp),color = Color.White, fontSize = 15.sp,fontWeight = FontWeight.Bold,fontStyle = FontStyle.Italic)
                        }

                    }


                }

            }
        }
        else if(chosen == 0)
        {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp, 0.dp)
            )
            {
                items(circulars){
                        item->
                    if(item[0] == "date")
                    {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(20.dp,0.dp)
//                            .border(2.dp,Color.White)
                            ,
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        )
                        {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(0.2f)
                                    .background(color = Color.White.copy(0.5f))
                                    .height(3.dp)
                            )
                            Text(text = item[1], fontSize = 15.sp,color = Color.White, fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Italic)
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(0.6f)
                                    .background(color = Color.White.copy(0.7f))
                                    .height(3.dp)
                            )
                        }
                    }
                    if (
                        item[0] == "content"
                    )
                    {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp, 5.dp)
                                .background(
                                    shape = RoundedCornerShape(8.dp),
                                    color = Color.White.copy(0.5f)
                                )
                        )
                        {
                            Text(text = item[1], modifier = Modifier.padding(10.dp), fontSize = 20.sp, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold)
                            Text(text = item[2],modifier = Modifier.padding(10.dp,0.dp,10.dp,10.dp),fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold)
                        }
                    }

                }

            }
        }

    }
}