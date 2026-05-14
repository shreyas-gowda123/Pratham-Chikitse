package com.pratham.chikitse.ui.screens

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Map
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pratham.chikitse.models.Language

data class Hospital(
    val name: String,
    val address: String,
    val distance: String,
    val phone: String
)

val mockHospitals = listOf(
    Hospital("Sagar Hospital", "Jayanagar, Bangalore", "1.2 km", "0801234567"),
    Hospital("Manipal Hospital", "Old Airport Road, Bangalore", "3.5 km", "0809876543"),
    Hospital("Fortis Hospital", "Bannerghatta Road, Bangalore", "4.1 km", "0805554444"),
    Hospital("Apollo Clinic", "Indiranagar, Bangalore", "2.0 km", "0801112222")
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HospitalsScreen(language: Language, onBack: () -> Unit) {
    val context = LocalContext.current
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Nearby Hospitals", fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = null)
                    }
                }
            )
        }
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            // Map Placeholder / Trigger
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color(0xFFF1F5F9)),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(
                        onClick = { openGoogleMapsForHospitals(context) },
                        modifier = Modifier.size(64.dp)
                    ) {
                        Icon(Icons.Default.Map, contentDescription = null, tint = Color(0xFF1D4ED8), modifier = Modifier.size(48.dp))
                    }
                    Text("Open in Google Maps", color = Color(0xFF1D4ED8), fontSize = 14.sp, fontWeight = FontWeight.Bold)
                }
            }

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    Text(
                        text = "TOP SUGGESTIONS",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Black,
                        color = Color.LightGray,
                        letterSpacing = 2.sp,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                }
                
                items(mockHospitals) { hospital ->
                    HospitalCard(hospital)
                }
            }
        }
    }
}

@Composable
fun HospitalCard(hospital: Hospital) {
    val context = LocalContext.current
    
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(hospital.name, fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1E293B))
                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(top = 4.dp)) {
                        Icon(Icons.Default.LocationOn, contentDescription = null, tint = Color.Red, modifier = Modifier.size(14.dp))
                        Spacer(Modifier.width(4.dp))
                        Text(hospital.address, fontSize = 12.sp, color = Color.Gray)
                    }
                }
                
                Surface(
                    color = Color(0xFFDCFCE7),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = hospital.distance,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Black,
                        color = Color(0xFF15803D)
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                Button(
                    onClick = { 
                        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${hospital.phone}"))
                        context.startActivity(intent)
                    },
                    modifier = Modifier.weight(1f).height(48.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF1F5F9), contentColor = Color.DarkGray)
                ) {
                    Icon(Icons.Default.Call, contentDescription = null, modifier = Modifier.size(16.dp))
                    Spacer(Modifier.width(8.dp))
                    Text("Call", fontWeight = FontWeight.Bold)
                }
                
                Button(
                    onClick = { 
                        val gmmIntentUri = Uri.parse("geo:0,0?q=${hospital.name} ${hospital.address}")
                        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                        mapIntent.setPackage("com.google.android.apps.maps")
                        context.startActivity(mapIntent)
                    },
                    modifier = Modifier.weight(1f).height(48.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEFF6FF), contentColor = Color(0xFF1D4ED8))
                ) {
                    Icon(Icons.Default.Map, contentDescription = null, modifier = Modifier.size(16.dp))
                    Spacer(Modifier.width(8.dp))
                    Text("Map", fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

private fun openGoogleMapsForHospitals(context: Context) {
    val gmmIntentUri = Uri.parse("geo:0,0?q=hospitals+near+me")
    val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
    mapIntent.setPackage("com.google.android.apps.maps")
    if (mapIntent.resolveActivity(context.packageManager) != null) {
        context.startActivity(mapIntent)
    } else {
        // Fallback for devices without Google Maps app
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/hospitals+near+me"))
        context.startActivity(browserIntent)
    }
}
