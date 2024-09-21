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
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.Alignment
import androidx.compose.material3.Icon
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

val Array = arrayOf(
    listOf("Clubs","Delta Force,Spider R&D","userimage"),
    listOf("Fests","Festember,NITTFEST,Pragyan","userimage"),
    listOf("General","Posts,Comments","userimage"),
    listOf("General","Posts,Comments","userimage"),
    listOf("General","Posts,Comments","userimage")
)

val iconsArray = arrayOf(
    "home",
    "calender",
    "add",
    "bookmark",
    "account"
)

val navigation = listOf(
    "A",
    "B",
    "E",
    "C",
    "D"
)

@Composable
fun SearchBar(navController: NavHostController)
{
    Box(modifier = Modifier.fillMaxSize().padding(WindowInsets.systemBars.asPaddingValues()), contentAlignment = Alignment.BottomStart)
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White.copy(alpha = 0.2f)),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.Bottom
        )
        {
            for(i in iconsArray)
            {
                Icon(iconName = i, size = 25, padding = 5, nav = navigation[iconsArray.indexOf(i)],navController=navController )
            }
        }
    }
}


@Composable
fun HomePage(navController: NavHostController)
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

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 0.dp)
                .background(color = Color.White, shape = RoundedCornerShape(6.dp)),
            contentAlignment = Alignment.Center
        )
        {
            Text(text = "Search", modifier = Modifier.padding(5.dp),fontSize = 16.sp,color = Color.Black, fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp,10.dp)
//                .border(2.dp,Color.White)
            ,
            horizontalArrangement = Arrangement.Absolute.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Column()
            {
                Text(text = "Hey",  fontSize = 15.sp,color = Color.White, fontWeight = FontWeight.Bold,fontStyle = FontStyle.Italic)
                Text(text = "Thiru !!", fontSize = 25.sp,color = Color.Black, fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            }
            Box(
                contentAlignment = Alignment.Center
            )
            {
                Icon(iconName = "circle", size = 60, padding = 0,navController=navController, nav = "E")
                Text(text = "Streaks", fontSize = 13.sp, fontWeight = FontWeight.Bold,color = Color.Black,fontStyle = FontStyle.Italic)
            }


        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 0.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Box(
                modifier = Modifier
                    .background(color = Color.White, shape = RoundedCornerShape(6.dp)),
                contentAlignment = Alignment.Center
            )
            {
                Text(text = "Home",fontWeight = FontWeight.Bold, fontSize = 15.sp, modifier = Modifier.padding(40.dp,10.dp),fontStyle = FontStyle.Italic)
            }

            Box(
                modifier = Modifier
                    .background(color = Color.White, shape = RoundedCornerShape(6.dp))
                    .clickable {
                        navController.navigate("E")
                    }
                ,
                contentAlignment = Alignment.Center
            )
            {
                Text(text = "Communities",fontWeight = FontWeight.Bold, fontSize = 15.sp,modifier = Modifier.padding(30.dp,10.dp),fontStyle = FontStyle.Italic)
            }
        }

        LazyColumn(
            modifier = Modifier
                .padding(20.dp,10.dp)
                .fillMaxHeight()
//                .border(2.dp, Color.Black)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(5.dp,Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(Array){item->
                Tab(title = item[0],body = item[1],iconName = item[2],navController=navController)
            }
        }


    }


}

@Composable
fun Tab(title:String,body:String,iconName: String,navController: NavHostController)
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Black.copy(alpha = 0.7f), shape = RoundedCornerShape(6.dp))
            .clickable {
                navController.navigate("D")
            }
            ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    )
    {
        Column(
            modifier = Modifier.padding(20.dp,10.dp)
        )
        {
            Text(text = title, fontWeight = FontWeight.Bold,color = Color.White, fontSize = 20.sp,fontStyle = FontStyle.Italic)
            Text(text = body, fontWeight = FontWeight.Bold,color = Color.Gray, fontSize = 15.sp,fontStyle = FontStyle.Italic)
        }
        Icon(iconName = iconName, size = 25, padding = 25,navController= navController, nav = "E")
    }
}

@Composable
fun Icon(iconName:String,size :Int,padding:Int,navController: NavHostController,nav:String)
{
    val context = LocalContext.current
    val resourceId = context.resources.getIdentifier(iconName, "drawable", context.packageName)

    Icon(
        painter = painterResource(id = resourceId),
        contentDescription = "user",
        tint = Color.Black,
        modifier = Modifier
            .padding(padding.dp)
            .size(size.dp)
            .clickable {
                navController.navigate(nav)
            }
    )

}