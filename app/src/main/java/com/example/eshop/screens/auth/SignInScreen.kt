package com.example.eshop.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.W400
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.eshop.R
import com.example.eshop.components.SpacerHeight
import com.example.eshop.components.SpacerWidth
import com.example.eshop.navigation.SignUp
import com.example.eshop.ui.theme.Background


@Composable
fun SignInScreen(navHostController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp),
            horizontalAlignment = CenterHorizontally
        ) {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .background(shape = CircleShape, color = Color.White)
                    .size(40.dp)
                    .align(Alignment.Start)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.back), contentDescription = "",
                    modifier = Modifier
                        .size(20.dp)
                )
            }

            SignInTitle()
            SignInTextFields(navHostController)
        }
    }
}

@Composable
fun SignInTitle() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 60.dp),
        horizontalAlignment = CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.hello_again),
            fontSize = 28.sp,
            fontWeight = W500,
            color = colorResource(id = R.color.title_color)
        )
        SpacerHeight()
        Text(
            text = stringResource(id = R.string.hello_again_subtitle),
            fontSize = 16.sp,
            fontWeight = W400,
            color = colorResource(id = R.color.subtitle_color)
        )
    }
}

@Composable
fun SignInTextFields(navHostController: NavHostController) {
    val email = rememberSaveable {
        mutableStateOf("")
    }
    val password = rememberSaveable {
        mutableStateOf("")
    }
    val isError = remember { mutableStateOf(false) }
    val isPasswordCorrect = remember {
        mutableStateOf(true)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 60.dp),
        horizontalAlignment = CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.email_address),
            fontSize = 16.sp,
            color = colorResource(id = R.color.title_color),
            fontWeight = W500,
            modifier = Modifier
                .align(Alignment.Start)
        )
        SpacerHeight()
        OutlinedTextField(
            value = email.value,
            textStyle = if (isError.value) {
                LocalTextStyle.current.copy(color = Color.Red)
            } else {
                LocalTextStyle.current
            },

            onValueChange = {
                email.value = it
            },
            shape = RoundedCornerShape(30.dp),
            leadingIcon = {
                Icon(Icons.Default.Email, contentDescription = "Email Icon")
            },
            placeholder = {
                Text(text = "Email Address")
            },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Done
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp)
                .background(shape = RoundedCornerShape(36.dp), color = Color.White)
                .size(height = 54.dp, width = 0.dp)
        )
        Text(
            text = stringResource(id = R.string.password),
            fontSize = 16.sp,
            color = colorResource(id = R.color.title_color),
            fontWeight = W500,
            modifier = Modifier
                .padding(top = 10.dp)
                .align(Alignment.Start)
        )
        SpacerHeight()

        OutlinedTextField(
            value = password.value,
            onValueChange = {
                password.value = it
            },
            shape = RoundedCornerShape(30.dp),
            leadingIcon = {
                Icon(Icons.Default.Lock, contentDescription = "password")
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.pass_preview),
                    contentDescription = ""
                )
            },
            placeholder = {
                Text(text = "Password")
            },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp)
                .background(shape = RoundedCornerShape(36.dp), color = Color.White)
                .size(height = 54.dp, width = 0.dp)
        )

        Text(
            text = stringResource(id = R.string.recovery_password),
            fontSize = 14.sp,
            color = colorResource(id = R.color.subtitle_color),
            fontWeight = W500,
            modifier = Modifier
                .padding(top = 10.dp)
                .align(Alignment.End)
        )

        SpacerHeight(30.dp)

        TextButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    shape = RoundedCornerShape(26.dp),
                    color = colorResource(id = R.color.primary)
                )
                .size(height = 54.dp, width = 0.dp)
        ) {
            Text(
                text = stringResource(id = R.string.sign_in),
                color = colorResource(id = R.color.white),
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                fontWeight = W500,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
        SpacerHeight(20.dp)
        TextButton(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                //.clip(shape = RectangleShape)
                .background(Color.White, RoundedCornerShape(30.dp))
                .size(height = 54.dp, width = 0.dp),
            content = {
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "google",
                    modifier = Modifier.size(28.dp)
                )
                SpacerWidth()
                Text(
                    text = "Sign in with Google",
                    fontSize = 18.sp,
                    fontWeight = W500,
                    color = colorResource(id = R.color.title_color)
                )
            }
        )
        SpacerHeight(140.dp)
        SignUpRow(navHostController)
    }
}

@Composable
fun SignUpRow(navHostController: NavHostController) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(text = stringResource(id = R.string.dont_have_an_account),
            fontSize = 12.sp,
            fontWeight = W400,
            color = colorResource(id = R.color.subtitle_color))

        SpacerWidth(5.dp)

        Text(text = stringResource(id = R.string.sign_up_for_free),
            fontSize = 12.sp,
            fontWeight = W500,
            color = colorResource(id = R.color.title_color),
            modifier = Modifier
                .clickable {
                    navHostController.navigate(SignUp)
                })

    }
}
