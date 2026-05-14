package com.pratham.chikitse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pratham.chikitse.data.EmergencyData
import com.pratham.chikitse.models.Language
import com.pratham.chikitse.ui.screens.*
import com.pratham.chikitse.ui.theme.PrathamChikitseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrathamChikitseTheme {
                var currentLanguage by remember { mutableStateOf(Language.ENGLISH) }
                val navController = rememberNavController()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavHost(navController = navController, startDestination = "splash") {
                        composable("splash") {
                            SplashScreen(onTimeout = {
                                navController.navigate("language") {
                                    popUpTo("splash") { inclusive = true }
                                }
                            })
                        }
                        composable("language") {
                            LanguageScreen(onLanguageSelected = { lang ->
                                currentLanguage = lang
                                navController.navigate("login")
                            })
                        }
                        composable("login") {
                            LoginScreen(
                                language = currentLanguage,
                                onLoginSuccess = {
                                    navController.navigate("home") {
                                        popUpTo("login") { inclusive = true }
                                    }
                                }
                            )
                        }
                        composable("home") {
                            HomeScreen(
                                language = currentLanguage,
                                onEmergencySelected = { emergency ->
                                    navController.navigate("detail/${emergency.id}")
                                },
                                onFindHospitals = {
                                    navController.navigate("hospitals")
                                },
                                onLogout = {
                                    navController.navigate("login") {
                                        popUpTo("home") { inclusive = true }
                                    }
                                }
                            )
                        }
                        composable("detail/{emergencyId}") { backStackEntry ->
                            val emergencyId = backStackEntry.arguments?.getString("emergencyId")
                            val emergency = EmergencyData.emergencies.find { it.id == emergencyId }
                            if (emergency != null) {
                                DetailScreen(
                                    emergency = emergency,
                                    language = currentLanguage,
                                    onBack = { navController.popBackStack() },
                                    onFindHospitals = { navController.navigate("hospitals") }
                                )
                            }
                        }
                        composable("hospitals") {
                            HospitalsScreen(
                                language = currentLanguage,
                                onBack = { navController.popBackStack() }
                            )
                        }
                    }
                }
            }
        }
    }
}
