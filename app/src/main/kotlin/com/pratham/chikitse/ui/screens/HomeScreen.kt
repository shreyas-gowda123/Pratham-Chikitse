package com.pratham.chikitse.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.LocalHospital
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pratham.chikitse.data.EmergencyData
import com.pratham.chikitse.models.EmergencyCategory
import com.pratham.chikitse.models.Language

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    language: Language,
    onEmergencySelected: (EmergencyCategory) -> Unit,
    onFindHospitals: () -> Unit,
    onLogout: () -> Unit
) {
    var searchQuery by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }
    val langCode = language.code

    val filteredEmergencies = EmergencyData.emergencies.filter {
        it.title[langCode]?.contains(searchQuery, ignoreCase = true) == true ||
        it.title["en"]?.contains(searchQuery, ignoreCase = true) == true
    }

    Scaffold(
        floatingActionButton = {
            if (!active) {
                ExtendedFloatingActionButton(
                    onClick = onFindHospitals,
                    containerColor = Color(0xFF0F172A),
                    contentColor = Color.White,
                    shape = RoundedCornerShape(32.dp)
                ) {
                    Icon(Icons.Default.LocalHospital, contentDescription = null)
                    Spacer(Modifier.width(8.dp))
                    Text("Find Hospitals", fontWeight = FontWeight.SemiBold)
                }
            }
        },
        floatingActionButtonPosition = FabPosition.Center
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            if (!active) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            text = "Pratham",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Black,
                            color = Color(0xFF1E293B)
                        )
                        Text(
                            text = "LIFE MATTERS",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Gray,
                            letterSpacing = 2.sp
                        )
                    }

                    IconButton(onClick = onLogout) {
                        Icon(
                            imageVector = Icons.Default.ExitToApp,
                            contentDescription = "Logout",
                            tint = Color(0xFFDC2626)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
            }

            SearchBar(
                query = searchQuery,
                onQueryChange = { searchQuery = it },
                onSearch = { 
                    active = false 
                },
                active = active,
                onActiveChange = { active = it },
                placeholder = { Text("Search procedure...") },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                trailingIcon = {
                    if (active) {
                        IconButton(onClick = {
                            if (searchQuery.isNotEmpty()) {
                                searchQuery = ""
                            } else {
                                active = false
                            }
                        }) {
                            Icon(Icons.Default.Close, contentDescription = "Close Search")
                        }
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                shape = SearchBarDefaults.inputFieldShape,
            ) {
                LazyColumn(
                    modifier = Modifier.fillMaxWidth(),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    items(filteredEmergencies) { emergency ->
                        ListItem(
                            headlineContent = { 
                                Text(
                                    emergency.title[langCode] ?: "",
                                    fontWeight = FontWeight.Bold
                                ) 
                            },
                            supportingContent = { 
                                Text(
                                    emergency.description[langCode] ?: "",
                                    maxLines = 1,
                                    color = Color.Gray
                                ) 
                            },
                            leadingContent = {
                                val bgColor = try { Color(android.graphics.Color.parseColor(emergency.color)) } catch (e: Exception) { Color.Red }
                                Box(
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(bgColor),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(emergency.icon.take(1), color = Color.White, fontWeight = FontWeight.Bold)
                                }
                            },
                            modifier = Modifier.clickable {
                                searchQuery = emergency.title[langCode] ?: ""
                                active = false
                                onEmergencySelected(emergency)
                            }
                        )
                    }
                }
            }

            if (!active) {
                Spacer(modifier = Modifier.height(24.dp))

                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(filteredEmergencies) { emergency ->
                        EmergencyCard(
                            emergency = emergency,
                            languageCode = langCode,
                            onClick = { onEmergencySelected(emergency) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun EmergencyCard(
    emergency: EmergencyCategory,
    languageCode: String,
    onClick: () -> Unit
) {
    val bgColor = try { Color(android.graphics.Color.parseColor(emergency.color)) } catch (e: Exception) { Color.Red }
    
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(bgColor),
                contentAlignment = Alignment.Center
            ) {
                // Placeholder for icon
                Text(emergency.icon.take(1), color = Color.White, fontWeight = FontWeight.Bold)
            }
            
            Spacer(modifier = Modifier.height(12.dp))
            
            Text(
                text = emergency.title[languageCode] ?: "",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 18.sp,
                color = Color(0xFF1E293B)
            )
            
            Spacer(modifier = Modifier.height(4.dp))
            
            Text(
                text = emergency.description[languageCode] ?: "",
                fontSize = 10.sp,
                color = Color.Gray,
                maxLines = 2
            )
        }
    }
}
