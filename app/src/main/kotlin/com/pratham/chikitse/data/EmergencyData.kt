package com.pratham.chikitse.data

import com.pratham.chikitse.models.EmergencyCategory
import com.pratham.chikitse.models.EmergencyStep

object EmergencyData {
    val emergencies = listOf(
        EmergencyCategory(
            id = "burns",
            icon = "Flame",
            color = "#EA580C",
            title = mapOf("en" to "Burns & Scalds", "kn" to "ಸುಟ್ಟ ಗಾಯಗಳು", "hi" to "जलना और झुलसना"),
            description = mapOf("en" to "Treatment for fire, hot water, and chemical burns.", "kn" to "ಬೆಂಕಿ ಮತ್ತು ಬಿಸಿ ನೀರಿನ ಗಾಯಗಳ ಚಿಕಿತ್ಸೆ.", "hi" to "आग, गर्म पानी और रासायनिक जलन का उपचार।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Cool the burn with running cold tap water for 20 minutes."),
                    EmergencyStep("Remove any jewelry or clothing near the burn area."),
                    EmergencyStep("Cover the burn loosely with plastic wrap or a clean cloth."),
                    EmergencyStep("Do NOT apply ice, butter, or ointments.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಸುಟ್ಟ ಗಾಯವನ್ನು 20 ನಿಮಿಷಗಳ ಕಾಲ ತಣ್ಣೀರಿನಲ್ಲಿ ಇರಿಸಿ."),
                    EmergencyStep("ಗಾಯದ ಹತ್ತಿರವಿರುವ ಆಭರಣ ಅಥವಾ ಬಟ್ಟೆಗಳನ್ನು ತೆಗೆದುಹಾಕಿ."),
                    EmergencyStep("ಗಾಯವನ್ನು ಶುದ್ಧವಾದ ಬಟ್ಟೆಯಿಂದ ಸಡಿಲವಾಗಿ ಮುಚ್ಚಿ."),
                    EmergencyStep("ಐಸ್ ಅಥವಾ ಬೆಣ್ಣೆಯನ್ನು ಹಚ್ಚಬೇಡಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("जले हुए हिस्से पर 20 मिनट तक ठंडा पानी डालें।"),
                    EmergencyStep("जले हुए क्षेत्र के पास के गहने या कपड़े हटा दें।"),
                    EmergencyStep("जलन को साफ कपड़े से ढीला ढंक दें।"),
                    EmergencyStep("बर्फ या मक्खन न लगाएं।")
                )
            )
        ),
        EmergencyCategory(
            id = "bleeding",
            icon = "Droplets",
            color = "#EF4444",
            title = mapOf("en" to "Cuts & Bleeding", "kn" to "ರಕ್ತಸ್ರಾವ", "hi" to "कटना और रक्तस्राव"),
            description = mapOf("en" to "Steps to stop bleeding and clean wounds safely.", "kn" to "ರಕ್ತಸ್ರಾವ ನಿಲ್ಲಿಸಲು ಮತ್ತು ಗಾಯವನ್ನು ಸ್ವಚ್ಛಗೊಳಿಸಲು ಕ್ರಮಗಳು.", "hi" to "रक्तस्राव रोकने और घावों को साफ करने के चरण।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Apply direct pressure to the wound with a clean cloth."),
                    EmergencyStep("Elevate the injured part above heart level if possible."),
                    EmergencyStep("Clean the wound with mild soap and water once bleeding stops."),
                    EmergencyStep("Apply a sterile bandage.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಶುದ್ಧವಾದ ಬಟ್ಟೆಯಿಂದ ಗಾಯದ ಮೇಲೆ ನೇರ ಒತ್ತಡ ಹಾಕಿ."),
                    EmergencyStep("ಸಾಧ್ಯವಾದರೆ ಗಾಯಗೊಂಡ ಭಾಗವನ್ನು ಎತ್ತರಿಸಿ."),
                    EmergencyStep("ರಕ್ತ ನಿಂತ ನಂತರ ಸೋಪು ಮತ್ತು ನೀರಿನಿಂದ ಸ್ವಚ್ಛಗೊಳಿಸಿ."),
                    EmergencyStep("ಬ್ಯಾಂಡೇಜ್ ಹಾಕಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("साफ कपड़े से घाव पर सीधा दबाव डालें।"),
                    EmergencyStep("यदि संभव हो तो घायल हिस्से को ऊपर उठाएं।"),
                    EmergencyStep("रक्तस्राव रुकने पर घाव को साबुन और पानी से साफ करें।"),
                    EmergencyStep("पट्टी लगाएं।")
                )
            )
        ),
        EmergencyCategory(
            id = "fractures",
            icon = "Activity",
            color = "#64748B",
            title = mapOf("en" to "Fractures & Sprains", "kn" to "ಮೂಳೆ ಮುರಿತ ಮತ್ತು ಉಳುಕು", "hi" to "अस्थि भंग और मोच"),
            description = mapOf("en" to "Basic support and immobilization for broken bones.", "kn" to "ಮೂಳೆ ಮುರಿತಕ್ಕೆ ಪ್ರಾಥಮಿಕ ಬೆಂಬಲ.", "hi" to "टूटी हड्डियों के लिए बुनियादी सहायता।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Do not try to realign the bone."),
                    EmergencyStep("Immobilize the area using a splint or sling."),
                    EmergencyStep("Apply ice packs to reduce swelling (not directly on skin)."),
                    EmergencyStep("Keep the person still and call for help.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಮೂಳೆಯನ್ನು ಸರಿಪಡಿಸಲು ಪ್ರಯತ್ನಿಸಬೇಡಿ."),
                    EmergencyStep("ಆ ಭಾಗವನ್ನು ಅಲುಗಾಡದಂತೆ ಪಟ್ಟಿ ಅಥವಾ ಸ್ಲಿಂಗ್ ಬಳಸಿ."),
                    EmergencyStep("ಊತ ಕಡಿಮೆ ಮಾಡಲು ಐಸ್ ಪ್ಯಾಕ್ ಬಳಸಿ."),
                    EmergencyStep("ವ್ಯಕ್ತಿಯನ್ನು ಸ್ಥಿರವಾಗಿರಿಸಿ ಮತ್ತು ಸಹಾಯಕ್ಕಾಗಿ ಕರೆ ಮಾಡಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("हड्डी को सीधा करने की कोशिश न करें।"),
                    EmergencyStep("उस हिस्से को हिलाने से बचाने के लिए स्प्लिंट का उपयोग करें।"),
                    EmergencyStep("सूजन कम करने के लिए बर्फ लगाएं।"),
                    EmergencyStep("व्यक्ति को स्थिर रखें और मदद बुलाएं।")
                )
            )
        ),
        EmergencyCategory(
            id = "snake-bite",
            icon = "Bug",
            color = "#15803D",
            title = mapOf("en" to "Snake Bite", "kn" to "ಹಾವು ಕಚ್ಚುವಿಕೆ", "hi" to "सांप का काटना"),
            description = mapOf("en" to "Emergency precautions before reaching hospital.", "kn" to "ಆಸ್ಪತ್ರೆ ತಲುಪುವ ಮೊದಲು ತೆಗೆದುಕೊಳ್ಳಬೇಕಾದ ಮುನ್ನೆಚ್ಚರಿಕೆಗಳು.", "hi" to "अस्पताल पहुंचने से पहले आपातकालीन सावधानियां।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Keep the person calm and still."),
                    EmergencyStep("Remove rings or tight clothing as swelling will occur."),
                    EmergencyStep("Keep the bite area below the level of the heart."),
                    EmergencyStep("Do NOT cut the wound or try to suck out venom.")
                ),
                "kn" to listOf(
                    EmergencyStep("ವ್ಯಕ್ತಿಯನ್ನು ಶಾಂತವಾಗಿ ಮತ್ತು ಅಲುಗಾಡದಂತೆ ಇರಿಸಿ."),
                    EmergencyStep("ಊತ ಬರುವ ಮೊದಲು ಉಂಗುರ ಅಥವಾ ಬಿಗಿಯಾದ ಬಟ್ಟೆಗಳನ್ನು ತೆಗೆಯಿರಿ."),
                    EmergencyStep("ಕಚ್ಚಿದ ಭಾಗವನ್ನು ಹೃದಯದ ಮಟ್ಟಕ್ಕಿಂತ ಕೆಳಗೆ ಇರಿಸಿ."),
                    EmergencyStep("ಗಾಯವನ್ನು ಕತ್ತರಿಸಬೇಡಿ ಅಥವಾ ವಿಷವನ್ನು ಹೀರಬೇಡಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("व्यक्ति को शांत और स्थिर रखें।"),
                    EmergencyStep("सूजन आने से पहले गहने या तंग कपड़े हटा दें।"),
                    EmergencyStep("दंश वाले हिस्से को दिल के स्तर से नीचे रखें।"),
                    EmergencyStep("घाव को काटें नहीं और न ही जहर चूसें।")
                )
            )
        ),
        EmergencyCategory(
            id = "heart-attack",
            icon = "HeartPulse",
            color = "#DC2626",
            title = mapOf("en" to "Heart Attack", "kn" to "ಹೃದಯಾಘಾತ", "hi" to "दिल का दौरा"),
            description = mapOf("en" to "Warning signs and immediate first-aid response.", "kn" to "ಎಚ್ಚರಿಕೆ ಚಿಹ್ನೆಗಳು ಮತ್ತು ತಕ್ಷಣದ ಪ್ರಥಮ ಚಿಕಿತ್ಸೆ.", "hi" to "चेतावनी के संकेत और तत्काल प्राथमिक चिकित्सा।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Call emergency services (108) immediately."),
                    EmergencyStep("Have the person sit down and stay calm."),
                    EmergencyStep("Loosen any tight clothing."),
                    EmergencyStep("Ask if they take chest pain medication like nitroglycerin.")
                ),
                "kn" to listOf(
                    EmergencyStep("ತಕ್ಷಣ 108 ಕ್ಕ್ಕೆ ಕರೆ ಮಾಡಿ."),
                    EmergencyStep("ವ್ಯಕ್ತಿಯನ್ನು ಕುಳಿತುಕೊಳ್ಳಲು ಹೇಳಿ ಮತ್ತು ಶಾಂತವಾಗಿರಿಸಿ."),
                    EmergencyStep("ಬಿಗಿಯಾದ ಬಟ್ಟೆಗಳನ್ನು ಸಡಿಲಗೊಳಿಸಿ."),
                    EmergencyStep("ಅವರು ಎದೆನೋವಿಗೆ ಔಷಧ ತೆಗೆದುಕೊಳ್ಳುತ್ತಾರೆಯೇ ಎಂದು ಕೇಳಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("तुरंत 108 पर कॉल करें।"),
                    EmergencyStep("व्यक्ति को बिठाएं और शांत रखें।"),
                    EmergencyStep("तंग कपड़े ढीले करें।"),
                    EmergencyStep("पूछें कि क्या वे कोई दवा लेते हैं।")
                )
            )
        ),
        EmergencyCategory(
            id = "unconscious",
            icon = "Brain",
            color = "#A855F7",
            title = mapOf("en" to "Fainting & Unconsciousness", "kn" to "ಪ್ರಜ್ಞಾಹೀನತೆ", "hi" to "बेहोशी और अचेत होना"),
            description = mapOf("en" to "Recovery position and emergency care steps.", "kn" to "ಚೇತರಿಕೆ ಸ್ಥಿತಿ ಮತ್ತು ತುರ್ತು ಆರೈಕೆ ಕ್ರಮಗಳು.", "hi" to "रिकवरी पोजीशन और आपातकालीन देखभाल।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Check for breathing and pulse."),
                    EmergencyStep("If breathing, place in the recovery position (on their side)."),
                    EmergencyStep("Loosen tight clothing around the neck and waist."),
                    EmergencyStep("Do not give anything to eat or drink.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಉಸಿರಾಟ ಮತ್ತು ನಾಡಿಮಿಡಿತವನ್ನು ಪರಿಶೀಲಿಸಿ."),
                    EmergencyStep("ಉಸಿರಾಟವಿದ್ದರೆ, ಅವರನ್ನು ಪಕ್ಕಕ್ಕೆ ತಿರುಗಿಸಿ ಮಲಗಿಸಿ."),
                    EmergencyStep("ಕುತ್ತಿಗೆ ಮತ್ತು ಸೊಂಟದ ಬಟ್ಟೆಗಳನ್ನು ಸಡಿಲಗೊಳಿಸಿ."),
                    EmergencyStep("ತಿನ್ನಲು ಅಥವಾ ಕುಡಿಯಲು ಏನನ್ನೂ ನೀಡಬೇಡಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("सांस और नाड़ी की जांच करें।"),
                    EmergencyStep("यदि सांस चल रही है, तो उन्हें करवट दिलाकर सुलाएं।"),
                    EmergencyStep("तंग कपड़े ढीले करें।"),
                    EmergencyStep("खाने या पीने के लिए कुछ न दें।")
                )
            )
        ),
        EmergencyCategory(
            id = "poisoning",
            icon = "Skull",
            color = "#10B981",
            title = mapOf("en" to "Poisoning", "kn" to "ವಿಷ ಸೇವನೆ", "hi" to "विषाक्तता (Poisoning)"),
            description = mapOf("en" to "What to do if harmful substances are swallowed.", "kn" to "ಹಾನಿಕಾರಕ ಪದಾರ್ಥಗಳನ್ನು ಸೇವಿಸಿದರೆ ಏನು ಮಾಡಬೇಕು.", "hi" to "हानिकारक पदार्थ निगलने पर क्या करें।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Call 108 or a poison control center immediately."),
                    EmergencyStep("Try to identify what was swallowed and how much."),
                    EmergencyStep("Do NOT induce vomiting unless told by a professional."),
                    EmergencyStep("If unconscious, check breathing and start CPR if needed.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಕೂಡಲೇ 108 ಕ್ಕ್ಕೆ ಕರೆ ಮಾಡಿ."),
                    EmergencyStep("ಏನನ್ನು ಮತ್ತು ಎಷ್ಟು ಸೇವಿಸಿದ್ದಾರೆ ಎಂದು ತಿಳಿಯಲು ಪ್ರಯತ್ನಿಸಿ."),
                    EmergencyStep("ವೈದ್ಯರು ಹೇಳುವವರೆಗೆ ವಾಂತಿ ಮಾಡಿಸಲು ಪ್ರಯತ್ನಿಸಬೇಡಿ."),
                    EmergencyStep("ಪ್ರಜ್ಞೆ ಇಲ್ಲದಿದ್ದರೆ ಉಸಿರಾಟವನ್ನು ಪರಿಶೀಲಿಸಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("तुरंत 108 पर कॉल करें।"),
                    EmergencyStep("पहचानें कि क्या और कितना निगला गया है।"),
                    EmergencyStep("जब तक कहा न जाए, उल्टी करवाने की कोशिश न करें।"),
                    EmergencyStep("यदि बेहोश है, तो सांस की जांच करें।")
                )
            )
        ),
        EmergencyCategory(
            id = "choking",
            icon = "Wind",
            color = "#F59E0B",
            title = mapOf("en" to "Choking", "kn" to "ಉಸಿರುಕಟ್ಟುವಿಕೆ", "hi" to "दम घुटना (Choking)"),
            description = mapOf("en" to "First aid for breathing blockage.", "kn" to "ಉಸಿರಾಟದ ಅಡಚಣೆಗೆ ಪ್ರಥಮ ಚಿಕಿತ್ಸೆ.", "hi" to "सांस लेने में रुकावट के लिए प्राथमिक चिकित्सा।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Give 5 back blows between the shoulder blades."),
                    EmergencyStep("Give 5 abdominal thrusts (Heimlich maneuver)."),
                    EmergencyStep("Repeat until the object is forced out or person becomes unconscious."),
                    EmergencyStep("If unconscious, start CPR.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಭುಜಗಳ ನಡುವೆ 5 ಬಾರಿ ಬೆನ್ನಿಗೆ ತಟ್ಟಿ."),
                    EmergencyStep("5 ಬಾರಿ ಹೊಟ್ಟೆಯ ಭಾಗವನ್ನು ಮೇಲಕ್ಕೆ ಒತ್ತಿರಿ."),
                    EmergencyStep("ವಸ್ತು ಹೊರಬರುವವರೆಗೆ ಇದನ್ನು ಮುಂದುವರಿಸಿ."),
                    EmergencyStep("ಪ್ರಜ್ಞೆ ತಪ್ಪಿದರೆ ಸಿಪಿಆರ್ ಪ್ರಾರಂಭಿಸಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("पीठ पर 5 बार थपथपाएं।"),
                    EmergencyStep("5 बार पेट के ऊपरी हिस्से को दबाएं (Heimlich maneuver)।"),
                    EmergencyStep("वस्तु बाहर आने तक जारी रखें।"),
                    EmergencyStep("बेहोश होने पर CPR शुरू करें।")
                )
            )
        ),
        EmergencyCategory(
            id = "electric-shock",
            icon = "Zap",
            color = "#EAB308",
            title = mapOf("en" to "Electric Shock", "kn" to "ವಿದ್ಯುತ್ ಆಘಾತ", "hi" to "बिजली का झटका"),
            description = mapOf("en" to "Safe rescue and emergency treatment guidance.", "kn" to "ಸುರಕ್ಷಿತ ರಕ್ಷಣೆ ಮತ್ತು ತುರ್ತು ಚಿಕಿತ್ಸೆ ಮಾರ್ಗದರ್ಶನ.", "hi" to "सुरक्षित बचाव और आपातकालीन उपचार मार्गदर्शन।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Do NOT touch the person until they are clear of the source."),
                    EmergencyStep("Turn off the power source if possible."),
                    EmergencyStep("Use a non-conducting object (wood) to move the source away."),
                    EmergencyStep("Check breathing and pulse; treat any burns.")
                ),
                "kn" to listOf(
                    EmergencyStep("ವಿದ್ಯುತ್ ಸಂಪರ್ಕ ಕಡಿತಗೊಳ್ಳುವವರೆಗೆ ವ್ಯಕ್ತಿಯನ್ನು ಮುಟ್ಟಬೇಡಿ."),
                    EmergencyStep("ಸಾಧ್ಯವಾದರೆ ಪವರ್ ಸ್ವಿಚ್ ಆಫ್ ಮಾಡಿ."),
                    EmergencyStep("ಮರದ ಕೋಲಿನಂತಹ ವಸ್ತು ಬಳಸಿ ವಿದ್ಯುತ್ ತಂತಿ ದೂರ ಸರಿಸಿ."),
                    EmergencyStep("ಉಸಿರಾಟವನ್ನು ಪರಿಶೀಲಿಸಿ ಮತ್ತು ಸುಟ್ಟ ಗಾಯಗಳಿಗೆ ಚಿಕಿತ್ಸೆ ನೀಡಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("जब तक बिजली बंद न हो, व्यक्ति को न छुएं।"),
                    EmergencyStep("यदि संभव हो तो बिजली का स्रोत बंद कर दें।"),
                    EmergencyStep("लकड़ी जैसी चीज़ से बिजली के तार को दूर करें।"),
                    EmergencyStep("सांस की जांच करें और जलने का इलाज करें।")
                )
            )
        ),
        EmergencyCategory(
            id = "animal-bite",
            icon = "Dog",
            color = "#B45309",
            title = mapOf("en" to "Dog Bite & Animal Bite", "kn" to "ನಾಯಿ ಅಥವಾ ಪ್ರಾಣಿ ಕಡಿತ", "hi" to "कुत्ते या जानवर का काटना"),
            description = mapOf("en" to "Cleaning wounds and preventing infection.", "kn" to "ಗಾಯಗಳನ್ನು ಸ್ವಚ್ಛಗೊಳಿಸುವುದು ಮತ್ತು ಸೋಂಕು ತಡೆಗಟ್ಟುವುದು.", "hi" to "घावों की सफाई और संक्रमण की रोकथाम।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Wash the wound thoroughly with soap and water for 15 minutes."),
                    EmergencyStep("Apply pressure with a clean cloth to stop bleeding."),
                    EmergencyStep("Apply an antibiotic cream and cover with a bandage."),
                    EmergencyStep("Seek medical help for rabies or tetanus shots.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಸೋಪು ಮತ್ತು ನೀರಿನಿಂದ 15 ನಿಮಿಷಗಳ ಕಾಲ ಗಾಯವನ್ನು ತೊಳೆಯಿರಿ."),
                    EmergencyStep("ರಕ್ತಸ್ರಾವ ನಿಲ್ಲಿಸಲು ಬಟ್ಟೆಯಿಂದ ಒತ್ತಿ ಹಿಡಿಯಿರಿ."),
                    EmergencyStep("ಆಂಟಿಬಯೋಟಿಕ್ ಕ್ರೀಮ್ ಹಚ್ಚಿ ಬ್ಯಾಂಡೇಜ್ ಮಾಡಿ."),
                    EmergencyStep("ರೇಬಿಸ್ ಲಸಿಕೆಗಾಗಿ ವೈದ್ಯರನ್ನು ಭೇಟಿ ಮಾಡಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("साबुन और पानी से 15 मिनट तक घाव धोएं।"),
                    EmergencyStep("रक्तस्राव रोकने के लिए दबाव डालें।"),
                    EmergencyStep("एंटीबायोटिक क्रीम लगाएं और पट्टी बांधें।"),
                    EmergencyStep("रेबीज के टीके के लिए डॉक्टर के पास जाएं।")
                )
            )
        ),
        EmergencyCategory(
            id = "fever",
            icon = "Thermometer",
            color = "#3B82F6",
            title = mapOf("en" to "Fever & Dehydration", "kn" to "ಜ್ವರ ಮತ್ತು ನಿರ್ಜಲೀಕರಣ", "hi" to "बुखार और निर्जलीकरण"),
            description = mapOf("en" to "Basic care and hydration methods.", "kn" to "ಮೂಲ ಆರೈಕೆ ಮತ್ತು ಹೈಡ್ರೇಶನ್ ವಿಧಾನಗಳು.", "hi" to "बुनियादी देखभाल और जलयोजन विधियां।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Drink plenty of fluids (water, ORS, juice)."),
                    EmergencyStep("Rest in a cool, well-ventilated room."),
                    EmergencyStep("Use a damp cloth on the forehead to lower temperature."),
                    EmergencyStep("Monitor temperature and seek help if very high.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಹೆಚ್ಚು ದ್ರವ ಪದಾರ್ಥಗಳನ್ನು ಕುಡಿಯಿರಿ (ನೀರು, ಓಆರ್ಎಸ್)."),
                    EmergencyStep("ತಂಪಾದ ಕೋಣೆಯಲ್ಲಿ ವಿಶ್ರಾಂತಿ ಪಡೆಯಿರಿ."),
                    EmergencyStep("ಜ್ವರ ಇಳಿಸಲು ಹಣೆ ಮೇಲೆ ಒದ್ದೆ ಬಟ್ಟೆ ಇರಿಸಿ."),
                    EmergencyStep("ಜ್ವರ ಹೆಚ್ಚಾದರೆ ವೈದ್ಯರನ್ನು ಸಂಪರ್ಕಿಸಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("खूब सारे तरल पदार्थ पिएं (पानी, ओआरएस)।"),
                    EmergencyStep("ठंडे कमरे में आराम करें।"),
                    EmergencyStep("तापमान कम करने के लिए माथे पर गीला कपड़ा रखें।"),
                    EmergencyStep("बुखार बढ़ने पर डॉक्टर से सलाह लें।")
                )
            )
        ),
        EmergencyCategory(
            id = "asthma",
            icon = "Wind",
            color = "#06B6D4",
            title = mapOf("en" to "Asthma Attack", "kn" to "ಆಸ್ತಮಾ ದಾಳಿ", "hi" to "अस्थमा का दौरा"),
            description = mapOf("en" to "Immediate help during breathing difficulty.", "kn" to "ಉಸಿರಾಟದ ತೊಂದರೆಯ ಸಮಯದಲ್ಲಿ ತಕ್ಷಣದ ಸಹಾಯ.", "hi" to "सांस लेने में तकलीफ के दौरान तत्काल सहायता।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Help the person sit upright and stay calm."),
                    EmergencyStep("Help them use their reliever inhaler (usually blue)."),
                    EmergencyStep("Take slow, steady breaths."),
                    EmergencyStep("Call 108 if symptoms worsen or inhaler doesn't help.")
                ),
                "kn" to listOf(
                    EmergencyStep("ವ್ಯಕ್ತಿಯನ್ನು ನೇರವಾಗಿ ಕುಳಿತುಕೊಳ್ಳಲು ಹೇಳಿ."),
                    EmergencyStep("ಅವರ ಇನ್ಹೇಲರ್ ಬಳಸಲು ಸಹಾಯ ಮಾಡಿ."),
                    EmergencyStep("ನಿಧಾನವಾಗಿ ಮತ್ತು ಸ್ಥಿರವಾಗಿ ಉಸಿರಾಡಲು ತಿಳಿಸಿ."),
                    EmergencyStep("ಉಸಿರಾಟ ತೀವ್ರವಾದರೆ 108 ಕ್ಕ್ಕೆ ಕರೆ ಮಾಡಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("व्यक्ति को सीधा बैठने में मदद करें।"),
                    EmergencyStep("इन्हेलर का उपयोग करने में उनकी मदद करें।"),
                    EmergencyStep("धीरे-धीरे सांस लेने को कहें।"),
                    EmergencyStep("हालत बिगड़ने पर 108 पर कॉल करें।")
                )
            )
        ),
        EmergencyCategory(
            id = "cpr",
            icon = "Heart",
            color = "#BE123C",
            title = mapOf("en" to "CPR Guidance", "kn" to "ಸಿಪಿಆರ್ ಮಾರ್ಗದರ್ಶನ", "hi" to "CPR मार्गदर्शन"),
            description = mapOf("en" to "Step-by-step CPR support.", "kn" to "ಹಂತ ಹಂತವಾಗಿ ಸಿಪಿಆರ್ ಬೆಂಬಲ.", "hi" to "चरण-दर-चरण CPR सहायता।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Push hard and fast in the center of the chest."),
                    EmergencyStep("Rate: 100-120 compressions per minute."),
                    EmergencyStep("Allow chest to recoil between compressions."),
                    EmergencyStep("Continue until professional help arrives.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಎದೆಯ ಮಧ್ಯಭಾಗದಲ್ಲಿ ವೇಗವಾಗಿ ಒತ್ತಿರಿ."),
                    EmergencyStep("ವೇಗ: ನಿಮಿಷಕ್ಕೆ 100-120 ಬಾರಿ."),
                    EmergencyStep("ಪ್ರತಿ ಒತ್ತಡದ ನಡುವೆ ಎದೆಯು ಮೇಲೆ ಬರಲು ಬಿಡಿ."),
                    EmergencyStep("ವೈದ್ಯಕೀಯ ಸಹಾಯ ಬರುವವರೆಗೆ ಮುಂದುವರಿಸಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("छाती के बीच में जोर से और तेजी से दबाएं।"),
                    EmergencyStep("गति: 100-120 बार प्रति मिनट।"),
                    EmergencyStep("दबाने के बाद छाती को ऊपर आने दें।"),
                    EmergencyStep("मदद आने तक जारी रखें।")
                )
            )
        ),
        EmergencyCategory(
            id = "road-accident",
            icon = "Car",
            color = "#334155",
            title = mapOf("en" to "Road Accident Injuries", "kn" to "ರಸ್ತೆ ಅಪಘಾತದ ಗಾಯಗಳು", "hi" to "सड़क दुर्घटना की चोटें"),
            description = mapOf("en" to "Emergency response before ambulance arrival.", "kn" to "ಆಂಬ್ಯುಲೆನ್ಸ್ ಬರುವ ಮೊದಲು ತುರ್ತು ಪ್ರತಿಕ್ರಿಯೆ.", "hi" to "एम्बुलेंस आने से पहले आपातकालीन प्रतिक्रिया।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Ensure the scene is safe for you and the victim."),
                    EmergencyStep("Do NOT move the victim unless there is a fire or explosion risk."),
                    EmergencyStep("Control any severe bleeding with direct pressure."),
                    EmergencyStep("Talk to the victim to keep them conscious.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಸ್ಥಳವು ಸುರಕ್ಷಿತವಾಗಿದೆ ಎಂದು ಖಚಿತಪಡಿಸಿಕೊಳ್ಳಿ."),
                    EmergencyStep("ಅಪಾಯವಿಲ್ಲದಿದ್ದರೆ ಗಾಯಾಳುವನ್ನು ಅಲುಗಾಡಿಸಬೇಡಿ."),
                    EmergencyStep("ರಕ್ತಸ್ರಾವವಿದ್ದರೆ ಒತ್ತಿ ಹಿಡಿದು ನಿಲ್ಲಿಸಿ."),
                    EmergencyStep("ಗಾಯಾಳುವಿನ ಜೊತೆ ಮಾತನಾಡುತ್ತಾ ಪ್ರಜ್ಞೆ ಇರುವಂತೆ ನೋಡಿಕೊಳ್ಳಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("सुनिश्चित करें कि घटनास्थल आपके लिए सुरक्षित है।"),
                    EmergencyStep("जब तक खतरा न हो, घायल को न हिलाएं।"),
                    EmergencyStep("रक्तस्राव को नियंत्रित करने के लिए दबाव डालें।"),
                    EmergencyStep("घायल से बात करते रहें।")
                )
            )
        ),
        EmergencyCategory(
            id = "nose-bleeding",
            icon = "Droplet",
            color = "#F43F5E",
            title = mapOf("en" to "Nose Bleeding", "kn" to "ಮೂಗಿನಲ್ಲಿ ರಕ್ತಸ್ರಾವ", "hi" to "नाक से खून बहना"),
            description = mapOf("en" to "Correct posture and bleeding control methods.", "kn" to "ಸರಿಯಾದ ಭಂಗಿ ಮತ್ತು ರಕ್ತಸ್ರಾವ ನಿಯಂತ್ರಣ ವಿಧಾನಗಳು.", "hi" to "सही मुद्रा और रक्तस्राव नियंत्रण के तरीके।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Sit upright and lean forward slightly."),
                    EmergencyStep("Pinch the soft part of the nose for 10-15 minutes."),
                    EmergencyStep("Breathe through your mouth."),
                    EmergencyStep("Apply an ice pack to the bridge of the nose.")
                ),
                "kn" to listOf(
                    EmergencyStep("ನೇರವಾಗಿ ಕುಳಿತು ಸ್ವಲ್ಪ ಮುಂದಕ್ಕೆ ಬಾಗಿ."),
                    EmergencyStep("ಮೂಗಿನ ಮೃದುವಾದ ಭಾಗವನ್ನು 10-15 ನಿಮಿಷ ಒತ್ತಿ ಹಿಡಿಯಿರಿ."),
                    EmergencyStep("ಬಾಯಿಯ ಮೂಲಕ ಉಸಿರಾಡಿ."),
                    EmergencyStep("ಮೂಗಿನ ಮೇಲೆ ಐಸ್ ಪ್ಯಾಕ್ ಇರಿಸಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("सीधे बैठें और थोड़ा आगे झुकें।"),
                    EmergencyStep("नाक के कोमल हिस्से को 10-15 मिनट तक दबाएं।"),
                    EmergencyStep("मुंह से सांस लें।"),
                    EmergencyStep("नाक के ऊपरी हिस्से पर बर्फ लगाएं।")
                )
            )
        ),
        EmergencyCategory(
            id = "eye-injury",
            icon = "Eye",
            color = "#6366F1",
            title = mapOf("en" to "Eye Injury", "kn" to "ಕಣ್ಣಿನ ಗಾಯ", "hi" to "आंख की चोट"),
            description = mapOf("en" to "First aid for dust, chemicals, or object injuries.", "kn" to "ಕಣ್ಣಿಗೆ ದೂಳು ಅಥವಾ ರಾಸಾಯನಿಕ ಬಿದ್ದಾಗ ಪ್ರಥಮ ಚಿಕಿತ್ಸೆ.", "hi" to "धूल, रसायन या चोट के लिए प्राथमिक चिकित्सा।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Do NOT rub the eye."),
                    EmergencyStep("Flush the eye with clean water for 15 minutes."),
                    EmergencyStep("If an object is stuck, do NOT try to remove it."),
                    EmergencyStep("Cover the eye loosely and seek a doctor.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಕಣ್ಣನ್ನು ಉಜ್ಜಬೇಡಿ."),
                    EmergencyStep("ಶುದ್ಧ ನೀರಿನಿಂದ 15 ನಿಮಿಷಗಳ ಕಾಲ ಕಣ್ಣನ್ನು ತೊಳೆಯಿರಿ."),
                    EmergencyStep("ಯಾವುದಾದರೂ ವಸ್ತು ಸಿಲುಕಿದ್ದರೆ ತೆಗೆಯಲು ಪ್ರಯತ್ನಿಸಬೇಡಿ."),
                    EmergencyStep("ಕಣ್ಣನ್ನು ಮುಚ್ಚಿ ವೈದ್ಯರ ಬಳಿ ಹೋಗಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("आंख को मलें नहीं।"),
                    EmergencyStep("आंख को 15 मिनट तक साफ पानी से धोएं।"),
                    EmergencyStep("यदि कोई वस्तु फंस गई है, तो उसे न निकालें।"),
                    EmergencyStep("आंख ढंक लें और डॉक्टर को दिखाएं।")
                )
            )
        ),
        EmergencyCategory(
            id = "seizures",
            icon = "Zap",
            color = "#8B5CF6",
            title = mapOf("en" to "Seizures/Fits", "kn" to "ಸೆಳೆತ ಅಥವಾ ಫಿಟ್ಸ್", "hi" to "मिर्गी के दौरे"),
            description = mapOf("en" to "Safe handling during epileptic attacks.", "kn" to "ಫಿಟ್ಸ್ ಬಂದಾಗ ಸುರಕ್ಷಿತ ನಿರ್ವಹಣೆ.", "hi" to "दौरे के दौरान सुरक्षित प्रबंधन।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Clear the area of hard or sharp objects."),
                    EmergencyStep("Place something soft under the head."),
                    EmergencyStep("Do NOT put anything in the person's mouth."),
                    EmergencyStep("Roll them onto their side after the seizure stops.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಸುತ್ತಮುತ್ತಲಿನ ಅಪಾಯಕಾರಿ ವಸ್ತುಗಳನ್ನು ದೂರ ಸರಿಸಿ."),
                    EmergencyStep("ತಲೆಯ ಕೆಳಗೆ ಮೃದುವಾದ ವಸ್ತುವನ್ನು ಇರಿಸಿ."),
                    EmergencyStep("ಬಾಯಿಯಲ್ಲಿ ಏನನ್ನೂ ಹಾಕಬೇಡಿ."),
                    EmergencyStep("ಸೆಳೆತ ನಿಂತ ನಂತರ ಅವರನ್ನು ಪಕ್ಕಕ್ಕೆ ತಿರುಗಿಸಿ ಮಲಗಿಸಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("आस-पास की खतरनाक चीजें हटा दें।"),
                    EmergencyStep("सिर के नीचे कुछ मुलायम रखें।"),
                    EmergencyStep("मुंह में कुछ भी न डालें।"),
                    EmergencyStep("दौरा खत्म होने के बाद करवट दिलाकर सुलाएं।")
                )
            )
        ),
        EmergencyCategory(
            id = "heat-stroke",
            icon = "Sun",
            color = "#F97316",
            title = mapOf("en" to "Heat Stroke", "kn" to "ಬಿಸಿಲು ಹೊಡೆತ", "hi" to "लू लगना (Heat Stroke)"),
            description = mapOf("en" to "Cooling and hydration emergency steps.", "kn" to "ತಂಪು ಮಾಡುವಿಕೆ ಮತ್ತು ಹೈಡ್ರೇಶನ್ ಕ್ರಮಗಳು.", "hi" to "ठंडा करने और जलयोजन के उपाय।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Move the person to a cool, shaded area."),
                    EmergencyStep("Cool the body with wet cloths or a cool bath."),
                    EmergencyStep("Fan the person and give sips of water if conscious."),
                    EmergencyStep("Call 108 if the person is confused or unconscious.")
                ),
                "kn" to listOf(
                    EmergencyStep("ವ್ಯಕ್ತಿಯನ್ನು ತಂಪಾದ ನೆರಳಿನ ಜಾಗಕ್ಕೆ ಕರೆದೊಯ್ಯಿರಿ."),
                    EmergencyStep("ಒದ್ದೆ ಬಟ್ಟೆಯಿಂದ ದೇಹವನ್ನು ತಂಪು ಮಾಡಿ."),
                    EmergencyStep("ಗಾಳಿ ಹಾಕಿ ಮತ್ತು ಪ್ರಜ್ಞೆಯಿದ್ದರೆ ನೀರು ಕುಡಿಸಿ."),
                    EmergencyStep("ಪ್ರಜ್ಞೆ ಇಲ್ಲದಿದ್ದರೆ ಕೂಡಲೇ 108 ಕ್ಕ್ಕೆ ಕರೆ ಮಾಡಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("व्यक्ति को ठंडी, छायादार जगह पर ले जाएं।"),
                    EmergencyStep("गीले कपड़ों से शरीर को ठंडा करें।"),
                    EmergencyStep("हवा करें और होश में होने पर पानी पिलाएं।"),
                    EmergencyStep("बेहोशी की स्थिति में 108 पर कॉल करें।")
                )
            )
        ),
        EmergencyCategory(
            id = "allergy",
            icon = "AlertTriangle",
            color = "#D97706",
            title = mapOf("en" to "Food Allergy Reaction", "kn" to "ಆಹಾರದ ಅಲರ್ಜಿ", "hi" to "फूड एलर्जी"),
            description = mapOf("en" to "Handling swelling, itching, or breathing problems.", "kn" to "ಊತ ಮತ್ತು ಉಸಿರಾಟದ ತೊಂದರೆ ನಿರ್ವಹಣೆ.", "hi" to "सूजन या सांस की तकलीफ का प्रबंधन।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Check if the person is carrying an EpiPen."),
                    EmergencyStep("Help them use the auto-injector if needed."),
                    EmergencyStep("Call 108 immediately if there is difficulty breathing."),
                    EmergencyStep("Have the person lie down and stay calm.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಅವರ ಬಳಿ ಎಪಿಪೆನ್ (EpiPen) ಇದೆಯೇ ಎಂದು ನೋಡಿ."),
                    EmergencyStep("ಅಗತ್ಯವಿದ್ದರೆ ಅದನ್ನು ಬಳಸಲು ಸಹಾಯ ಮಾಡಿ."),
                    EmergencyStep("ಉಸಿರಾಟದ ತೊಂದರೆ ಇದ್ದರೆ ಕೂಡಲೇ 108 ಕ್ಕ್ಕೆ ಕರೆ ಮಾಡಿ."),
                    EmergencyStep("ವ್ಯಕ್ತಿಯನ್ನು ಮಲಗಿಸಿ ಶಾಂತವಾಗಿರಿಸಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("जांचें कि क्या व्यक्ति के पास EpiPen है।"),
                    EmergencyStep("जरूरत पड़ने पर उसे इस्तेमाल करने में मदद करें।"),
                    EmergencyStep("सांस लेने में तकलीफ होने पर 108 पर कॉल करें।"),
                    EmergencyStep("व्यक्ति को लेटने के लिए कहें।")
                )
            )
        ),
        EmergencyCategory(
            id = "drowning",
            icon = "Waves",
            color = "#0EA5E9",
            title = mapOf("en" to "Drowning Emergency", "kn" to "ನೀರಿನಲ್ಲಿ ಮುಳುಗುವಿಕೆ", "hi" to "डूबना (Drowning)"),
            description = mapOf("en" to "Rescue precautions and CPR support.", "kn" to "ರಕ್ಷಣೆ ಮತ್ತು ಸಿಪಿಆರ್ ಬೆಂಬಲ.", "hi" to "बचाव और CPR सहायता।"),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Get the person out of the water safely."),
                    EmergencyStep("Check for breathing and pulse."),
                    EmergencyStep("If not breathing, start CPR immediately."),
                    EmergencyStep("Keep the person warm and wait for help.")
                ),
                "kn" to listOf(
                    EmergencyStep("ವ್ಯಕ್ತಿಯನ್ನು ಸುರಕ್ಷಿತವಾಗಿ ನೀರಿನಿಂದ ಹೊರಗೆ ತನ್ನಿ."),
                    EmergencyStep("ಉಸಿರಾಟ ಮತ್ತು ನಾಡಿಮಿಡಿತವನ್ನು ಪರಿಶೀಲಿಸಿ."),
                    EmergencyStep("ಉಸಿರಾಟವಿಲ್ಲದಿದ್ದರೆ ತಕ್ಷಣ ಸಿಪಿಆರ್ ಪ್ರಾರಂಭಿಸಿ."),
                    EmergencyStep("ವ್ಯಕ್ತಿಯನ್ನು ಬೆಚ್ಚಗಿರಿಸಿ ಮತ್ತು ಸಹಾಯಕ್ಕಾಗಿ ಕಾಯಿರಿ.")
                ),
                "hi" to listOf(
                    EmergencyStep("व्यक्ति को सुरक्षित रूप से पानी से बाहर निकालें।"),
                    EmergencyStep("सांस और नाड़ी की जांच करें।"),
                    EmergencyStep("सांस न चलने पर तुरंत CPR शुरू करें।"),
                    EmergencyStep("व्यक्ति को गर्म रखें और मदद का इंतज़ार करें।")
                )
            )
        )
    )
}
