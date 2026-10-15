package com.example.bussinescardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussinescardapp.ui.theme.BussinesCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BussinesCardAppTheme {
                BusinessCardApp(
                    names = stringResource(R.string.full_name),
                    title = stringResource(R.string.professional_title),
                    contactNumber = stringResource(R.string.contact_number),
                    socialMediaHandle = stringResource(R.string.socialmedia_handle),
                    emailAddress = stringResource(R.string.email)
                )
            }
        }
    }
}

@Composable
fun BusinessCardApp(
    names: String,
    title: String,
    contactNumber: String,
    socialMediaHandle: String,
    emailAddress: String,
    modifier: Modifier = Modifier
) {
    val image = painterResource(R.drawable.android_logo)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4))
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .background(Color(0xFF073042))
            )
            Text(
                text = names,
                fontSize = 40.sp
            )
            Text(
                text = title,
                color = Color(0xFF006D3B)
            )
        }

        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(bottom = 32.dp)
        ) {
            Text(
                text = contactNumber
            )
            Text(
                text = socialMediaHandle
            )
            Text(
                text = emailAddress
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BussinesCardAppTheme {
        BusinessCardApp(
            names = stringResource(R.string.full_name),
            title = stringResource(R.string.professional_title),
            contactNumber = stringResource(R.string.contact_number),
            socialMediaHandle = stringResource(R.string.socialmedia_handle),
            emailAddress = stringResource(R.string.email)
        )
    }
}
