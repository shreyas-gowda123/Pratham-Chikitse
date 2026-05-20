package com.pratham.chikitse.data

import com.pratham.chikitse.models.EmergencyCategory
import com.pratham.chikitse.models.EmergencyStep

object EmergencyData {
    val emergencies = listOf(
        EmergencyCategory(
            id = "cardiac-arrest",
            icon = "HeartPulse",
            color = "#DC2626",
            title = mapOf("en" to "Cardiac Arrest", "kn" to "ಹೃದಯ ಸ್ತಂಭನ (Cardiac Arrest)"),
            description = mapOf(
                "en" to "Cardiac arrest happens when the heart suddenly stops beating properly.",
                "kn" to "ಹೃದಯವು ಇದ್ದಕ್ಕಿದ್ದಂತೆ ಬಡಿತವನ್ನು ನಿಲ್ಲಿಸಿದಾಗ ಹೃದಯ ಸ್ತಂಭನ ಸಂಭವಿಸುತ್ತದೆ."
            ),
            symptoms = mapOf(
                "en" to listOf("Sudden collapse", "No pulse", "No breathing or only gasping", "Unconsciousness"),
                "kn" to listOf("ಇದ್ದಕ್ಕಿದ್ದಂತೆ ಕುಸಿಯುವುದು", "ನಾಡಿಮಿಡಿತ ಇಲ್ಲದಿರುವುದು", "ಉಸಿರಾಟ ನಿಲ್ಲುವುದು", "ಪ್ರಜ್ಞೆ ತಪ್ಪುವುದು")
            ),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Call emergency services immediately (108)."),
                    EmergencyStep("Check responsiveness and breathing."),
                    EmergencyStep("Start CPR: Push hard and fast (100–120 compressions per minute)."),
                    EmergencyStep("Use an AED if available."),
                    EmergencyStep("Continue CPR until medical help arrives.")
                ),
                "kn" to listOf(
                    EmergencyStep("ತಕ್ಷಣ ತುರ್ತು ಸೇವೆಗೆ (108) ಕರೆ ಮಾಡಿ."),
                    EmergencyStep("ಪ್ರತಿಕ್ರಿಯೆ ಮತ್ತು ಉಸಿರಾಟವನ್ನು ಪರೀಕ್ಷಿಸಿ."),
                    EmergencyStep("ಸಿಪಿಆರ್ ಪ್ರಾರಂಭಿಸಿ: ಎದೆಯ ಮಧ್ಯಭಾಗದಲ್ಲಿ ವೇಗವಾಗಿ ಒತ್ತಿರಿ (ನಿಮಿಷಕ್ಕೆ 100-120 ಬಾರಿ)."),
                    EmergencyStep("AED ಲಭ್ಯವಿದ್ದರೆ ಬಳಸಿ."),
                    EmergencyStep("ವೈದ್ಯಕೀಯ ಸಹಾಯ ಬರುವವರೆಗೆ ಸಿಪಿಆರ್ ಮುಂದುವರಿಸಿ.")
                )
            ),
            doNot = mapOf(
                "en" to listOf("Do not delay CPR.", "Do not shake the person violently."),
                "kn" to listOf("ಸಿಪಿಆರ್ ಮಾಡಲು ವಿಳಂಬ ಮಾಡಬೇಡಿ.", "ವ್ಯಕ್ತಿಯನ್ನು ಜೋರಾಗಿ ಅಲುಗಾಡಿಸಬೇಡಿ.")
            ),
            preventionTips = mapOf(
                "en" to listOf("Regular exercise", "Healthy diet", "Avoid smoking and alcohol", "Regular heart checkups"),
                "kn" to listOf("ನಿಯಮಿತ ವ್ಯಾಯಾಮ", "ಸಮತೋಲಿತ ಆಹಾರ", "ಧೂಮಪಾನ ಮತ್ತು ಮದ್ಯಪಾನ ತ್ಯಜಿಸಿ", "ನಿಯಮಿತ ಹೃದಯ ತಪಾಸಣೆ")
            )
        ),
        EmergencyCategory(
            id = "snake-bite",
            icon = "Bug",
            color = "#15803D",
            title = mapOf("en" to "Snake Bite", "kn" to "ಹಾವು ಕಚ್ಚುವಿಕೆ"),
            description = mapOf(
                "en" to "A snake bite occurs when a snake injects venom through its fangs.",
                "kn" to "ಹಾವು ತನ್ನ ಹಲ್ಲುಗಳ ಮೂಲಕ ವಿಷವನ್ನು ದೇಹಕ್ಕೆ ಚುಚ್ಚಿದಾಗ ಹಾವು ಕಡಿತ ಸಂಭವಿಸುತ್ತದೆ."
            ),
            symptoms = mapOf(
                "en" to listOf("Pain and swelling around the bite", "Redness or bleeding", "Nausea or dizziness", "Difficulty breathing"),
                "kn" to listOf("ಕಚ್ಚಿದ ಜಾಗದಲ್ಲಿ ನೋವು ಮತ್ತು ಊತ", "ಕೆಂಪಾಗುವುದು ಅಥವಾ ರಕ್ತಸ್ರಾವ", "ವಾಕರಿಕೆ ಅಥವಾ ತಲೆತಿರುಗುವಿಕೆ", "ಉಸಿರಾಟದ ತೊಂದರೆ")
            ),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Keep the person calm."),
                    EmergencyStep("Move away from the snake safely."),
                    EmergencyStep("Immobilize the affected limb."),
                    EmergencyStep("Remove tight clothing or jewelry."),
                    EmergencyStep("Take the person to the nearest hospital immediately.")
                ),
                "kn" to listOf(
                    EmergencyStep("ವ್ಯಕ್ತಿಯನ್ನು ಶಾಂತವಾಗಿರಿಸಿ."),
                    EmergencyStep("ಹಾವಿನಿಂದ ಸುರಕ್ಷಿತವಾಗಿ ದೂರ ಸರಿಯಿರಿ."),
                    EmergencyStep("ಕಚ್ಚಿದ ಭಾಗವನ್ನು ಅಲುಗಾಡದಂತೆ ಇರಿಸಿ."),
                    EmergencyStep("ಬಿಗಿಯಾದ ಬಟ್ಟೆ ಅಥವಾ ಆಭರಣಗಳನ್ನು ತೆಗೆದುಹಾಕಿ."),
                    EmergencyStep("ಕೂಡಲೇ ಹತ್ತಿರದ ಆಸ್ಪತ್ರೆಗೆ ಕರೆದೊಯ್ಯಿರಿ.")
                )
            ),
            doNot = mapOf(
                "en" to listOf("Do not cut the wound.", "Do not suck out venom.", "Do not apply ice.", "Do not use a tight tourniquet."),
                "kn" to listOf("ಗಾಯವನ್ನು ಕತ್ತರಿಸಬೇಡಿ.", "ವಿಷವನ್ನು ಹೀರಿ ತೆಗೆಯಲು ಪ್ರಯತ್ನಿಸಬೇಡಿ.", "ಐಸ್ ಹಚ್ಚಬೇಡಿ.", "ಬಿಗಿಯಾದ ಕಟ್ಟನ್ನು ಹಾಕಬೇಡಿ.")
            ),
            preventionTips = mapOf(
                "en" to listOf("Wear shoes in grassy areas.", "Use a flashlight at night.", "Avoid touching unknown snakes."),
                "kn" to listOf("ಹುಲ್ಲು ಇರುವ ಜಾಗದಲ್ಲಿ ಪಾದರಕ್ಷೆ ಧರಿಸಿ.", "ರಾತ್ರಿ ಸಮಯದಲ್ಲಿ ಟಾರ್ಚ್ ಬಳಸಿ.", "ಅಪರಿಚಿತ ಹಾವುಗಳನ್ನು ಮುಟ್ಟಬೇಡಿ.")
            )
        ),
        EmergencyCategory(
            id = "burns",
            icon = "Flame",
            color = "#EA580C",
            title = mapOf("en" to "Burns", "kn" to "ಸುಟ್ಟ ಗಾಯಗಳು"),
            description = mapOf(
                "en" to "Burns are injuries caused by heat, fire, electricity, chemicals, or hot liquids.",
                "kn" to "ಶಾಖ, ಬೆಂಕಿ, ವಿದ್ಯುತ್ ಅಥವಾ ರಾಸಾಯನಿಕಗಳಿಂದ ಉಂಟಾಗುವ ಗಾಯಗಳೇ ಸುಟ್ಟ ಗಾಯಗಳು."
            ),
            symptoms = mapOf(
                "en" to listOf("Red or blistered skin", "Pain and swelling", "Peeling skin"),
                "kn" to listOf("ಕೆಂಪಾದ ಅಥವಾ ಗುಳ್ಳೆಗಳಾದ ಚರ್ಮ", "ನೋವು ಮತ್ತು ಊತ", "ಚರ್ಮ ಸುಲಿಯುವುದು")
            ),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Cool the burn under running water for 10–20 minutes."),
                    EmergencyStep("Remove tight objects carefully."),
                    EmergencyStep("Cover with a clean cloth or sterile bandage."),
                    EmergencyStep("Seek medical help for severe burns.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಹರಿಯುವ ನೀರಿನಲ್ಲಿ 10-20 ನಿಮಿಷಗಳ ಕಾಲ ತಂಪು ಮಾಡಿ."),
                    EmergencyStep("ಬಿಗಿಯಾದ ವಸ್ತುಗಳನ್ನು ಎಚ್ಚರಿಕೆಯಿಂದ ತೆಗೆಯಿರಿ."),
                    EmergencyStep("ಶುದ್ಧವಾದ ಬಟ್ಟೆ ಅಥವಾ ಬ್ಯಾಂಡೇಜ್‌ನಿಂದ ಮುಚ್ಚಿ."),
                    EmergencyStep("ತೀವ್ರವಾದ ಸುಟ್ಟ ಗಾಯಗಳಿಗೆ ವೈದ್ಯಕೀಯ ಸಹಾಯ ಪಡೆಯಿರಿ.")
                )
            ),
            doNot = mapOf(
                "en" to listOf("Do not apply toothpaste, oil, or butter.", "Do not burst blisters."),
                "kn" to listOf("ಟೂತ್‌ಪೇಸ್ಟ್, ಎಣ್ಣೆ ಅಥವಾ ಬೆಣ್ಣೆಯನ್ನು ಹಚ್ಚಬೇಡಿ.", "ಗುಳ್ಳೆಗಳನ್ನು ಒಡೆಯಬೇಡಿ.")
            ),
            preventionTips = mapOf(
                "en" to listOf("Keep children away from fire.", "Handle hot items carefully.", "Use electrical appliances safely."),
                "kn" to listOf("ಮಕ್ಕಳನ್ನು ಬೆಂಕಿಯಿಂದ ದೂರವಿಡಿ.", "ಬಿಸಿ ವಸ್ತುಗಳನ್ನು ಎಚ್ಚರಿಕೆಯಿಂದ ಬಳಸಿ.", "ವಿದ್ಯುತ್ ಉಪಕರಣಗಳನ್ನು ಸುರಕ್ಷಿತವಾಗಿ ಬಳಸಿ.")
            )
        ),
        EmergencyCategory(
            id = "fracture",
            icon = "Activity",
            color = "#64748B",
            title = mapOf("en" to "Fracture", "kn" to "ಮೂಳೆ ಮುರಿತ"),
            description = mapOf(
                "en" to "A fracture is a broken bone caused by injury or accidents.",
                "kn" to "ಅಪಘಾತ ಅಥವಾ ಪೆಟ್ಟಿನಿಂದ ಮೂಳೆ ಮುರಿಯುವುದನ್ನು ಫ್ರಾಕ್ಚರ್ ಎನ್ನಲಾಗುತ್ತದೆ."
            ),
            symptoms = mapOf(
                "en" to listOf("Severe pain", "Swelling", "Difficulty moving the limb", "Deformity"),
                "kn" to listOf("ತೀವ್ರ ನೋವು", "ಊತ", "ಅಂಗಾಂಗ ಅಲುಗಾಡಿಸಲು ಕಷ್ಟವಾಗುವುದು", "ವಿಕಾರತೆ")
            ),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Keep the injured area still."),
                    EmergencyStep("Use a splint if possible."),
                    EmergencyStep("Apply ice wrapped in cloth."),
                    EmergencyStep("Take the person to a hospital.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಗಾಯಗೊಂಡ ಭಾಗವನ್ನು ಸ್ಥಿರವಾಗಿರಿಸಿ.",),
                    EmergencyStep("ಸಾಧ್ಯವಾದರೆ ಪಟ್ಟಿ (splint) ಬಳಸಿ.",),
                    EmergencyStep("ಬಟ್ಟೆಯಲ್ಲಿ ಸುತ್ತಿದ ಐಸ್ ಅನ್ನು ಹಚ್ಚಿ.",),
                    EmergencyStep("ವ್ಯಕ್ತಿಯನ್ನು ಆಸ್ಪತ್ರೆಗೆ ಕರೆದೊಯ್ಯಿರಿ.")
                )
            ),
            doNot = mapOf(
                "en" to listOf("Do not move the bone unnecessarily.", "Do not try to straighten the bone."),
                "kn" to listOf("ಅಗತ್ಯವಿಲ್ಲದೆ ಮೂಳೆಯನ್ನು ಅಲುಗಾಡಿಸಬೇಡಿ.", "ಮೂಳೆಯನ್ನು ನೇರಗೊಳಿಸಲು ಪ್ರಯತ್ನಿಸಬೇಡಿ.")
            ),
            preventionTips = mapOf(
                "en" to listOf("Wear protective gear.", "Avoid slippery surfaces.", "Maintain bone health with calcium-rich foods."),
                "kn" to listOf("ರಕ್ಷಣಾತ್ಮಕ ಸಾಧನಗಳನ್ನು ಧರಿಸಿ.", "ಜಾರುವ ಮೇಲ್ಮೈಗಳಿಂದ ದೂರವಿರಿ.", "ಕ್ಯಾಲ್ಸಿಯಂ ಭರಿತ ಆಹಾರ ಸೇವಿಸಿ.")
            )
        ),
        EmergencyCategory(
            id = "choking",
            icon = "Wind",
            color = "#F59E0B",
            title = mapOf("en" to "Choking", "kn" to "ಉಸಿರುಕಟ್ಟುವಿಕೆ"),
            description = mapOf(
                "en" to "Choking occurs when an object blocks the airway.",
                "kn" to "ಯಾವುದಾದರೂ ವಸ್ತು ಉಸಿರಾಟದ ಹಾದಿಯನ್ನು ತಡೆದಾಗ ಉಸಿರುಕಟ್ಟುವಿಕೆ ಸಂಭವಿಸುತ್ತದೆ."
            ),
            symptoms = mapOf(
                "en" to listOf("Difficulty breathing", "Inability to speak", "Blue lips or face", "Clutching throat"),
                "kn" to listOf("ಉಸಿರಾಟದ ತೊಂದರೆ", "ಮಾತನಾಡಲು ಸಾಧ್ಯವಾಗದಿರುವುದು", "ತುಟಿ ಅಥವಾ ಮುಖ ನೀಲಿ ಬಣ್ಣಕ್ಕೆ ತಿರುಗುವುದು", "ಗಂಟಲನ್ನು ಹಿಡಿದುಕೊಳ್ಳುವುದು")
            ),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Encourage coughing."),
                    EmergencyStep("Give 5 back blows between the shoulder blades."),
                    EmergencyStep("Perform abdominal thrusts (Heimlich maneuver)."),
                    EmergencyStep("Call emergency services if the blockage continues.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಕೆಮ್ಮಲು ಪ್ರೋತ್ಸಾಹಿಸಿ."),
                    EmergencyStep("ಭುಜಗಳ ನಡುವೆ 5 ಬಾರಿ ಬೆನ್ನಿಗೆ ತಟ್ಟಿ."),
                    EmergencyStep("ಹೊಟ್ಟೆಯ ಭಾಗವನ್ನು ಮೇಲಕ್ಕೆ ಒತ್ತಿರಿ (Heimlich maneuver)."),
                    EmergencyStep("ಅಡಚಣೆ ಮುಂದುವರಿದರೆ ತುರ್ತು ಸೇವೆಗೆ ಕರೆ ಮಾಡಿ.")
                )
            ),
            doNot = mapOf(
                "en" to listOf("Do not give water immediately.", "Do not slap continuously without checking."),
                "kn" to listOf("ತಕ್ಷಣವೇ ನೀರು ಕೊಡಬೇಡಿ.", "ಪರಿಶೀಲಿಸದೆ ಸತತವಾಗಿ ಬೆನ್ನಿಗೆ ತಟ್ಟಬೇಡಿ.")
            ),
            preventionTips = mapOf(
                "en" to listOf("Eat slowly.", "Keep small objects away from children.", "Cut food into small pieces."),
                "kn" to listOf("ನಿಧಾನವಾಗಿ ಆಹಾರ ಸೇವಿಸಿ.", "ಸಣ್ಣ ವಸ್ತುಗಳನ್ನು ಮಕ್ಕಳಿಂದ ದೂರವಿಡಿ.", "ಆಹಾರವನ್ನು ಸಣ್ಣ ತುಂಡುಗಳಾಗಿ ಕತ್ತರಿಸಿ.")
            )
        ),
        EmergencyCategory(
            id = "electric-shock",
            icon = "Zap",
            color = "#EAB308",
            title = mapOf("en" to "Electric Shock", "kn" to "ವಿದ್ಯುತ್ ಆಘಾತ"),
            description = mapOf(
                "en" to "Electric shock happens when electricity passes through the body.",
                "kn" to "ದೇಹದ ಮೂಲಕ ವಿದ್ಯುತ್ ಹಾದುಹೋದಾಗ ವಿದ್ಯುತ್ ಆಘಾತ ಸಂಭವಿಸುತ್ತದೆ."
            ),
            symptoms = mapOf(
                "en" to listOf("Burns", "Unconsciousness", "Muscle pain", "Breathing difficulty"),
                "kn" to listOf("ಸುಟ್ಟ ಗಾಯಗಳು", "ಪ್ರಜ್ಞಾಹೀನತೆ", "ಸ್ನಾಯು ನೋವು", "ಉಸಿರಾಟದ ತೊಂದರೆ")
            ),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Turn off the power source."),
                    EmergencyStep("Do not touch the person directly if current is active."),
                    EmergencyStep("Use a wooden or non-conductive object to separate the person."),
                    EmergencyStep("Check breathing and pulse."),
                    EmergencyStep("Call emergency services.")
                ),
                "kn" to listOf(
                    EmergencyStep("ವಿದ್ಯುತ್ ಮೂಲವನ್ನು ಆಫ್ ಮಾಡಿ."),
                    EmergencyStep("ಕರೆಂಟ್ ಚಾಲ್ತಿಯಲ್ಲಿದ್ದರೆ ವ್ಯಕ್ತಿಯನ್ನು ನೇರವಾಗಿ ಮುಟ್ಟಬೇಡಿ."),
                    EmergencyStep("ಮರದ ಕೋಲಿನಂತಹ ಅವಾಹಕ ವಸ್ತುವಿನಿಂದ ವ್ಯಕ್ತಿಯನ್ನು ಬೇರ್ಪಡಿಸಿ."),
                    EmergencyStep("ಉಸಿರಾಟ ಮತ್ತು ನಾಡಿಮಿಡಿತವನ್ನು ಪರೀಕ್ಷಿಸಿ."),
                    EmergencyStep("ತುರ್ತು ಸೇವೆಗೆ ಕರೆ ಮಾಡಿ.")
                )
            ),
            doNot = mapOf(
                "en" to listOf("Do not touch exposed wires.", "Do not pour water near electrical sources."),
                "kn" to listOf("ತೆರೆದ ವೈರ್‌ಗಳನ್ನು ಮುಟ್ಟಬೇಡಿ.", "ವಿದ್ಯುತ್ ಮೂಲಗಳ ಬಳಿ ನೀರು ಹಾಕಬೇಡಿ.")
            ),
            preventionTips = mapOf(
                "en" to listOf("Avoid damaged wires.", "Use proper insulation.", "Keep electrical items away from water."),
                "kn" to listOf("ಹಾನಿಗೊಳಗಾದ ವೈರ್‌ಗಳನ್ನು ಬಳಸಬೇಡಿ.", "ಸರಿಯಾದ ಇನ್ಸುಲೇಷನ್ ಬಳಸಿ.", "ವಿದ್ಯುತ್ ವಸ್ತುಗಳನ್ನು ನೀರಿಂದ ದೂರವಿಡಿ.")
            )
        ),
        EmergencyCategory(
            id = "heat-stroke",
            icon = "Sun",
            color = "#F97316",
            title = mapOf("en" to "Heat Stroke", "kn" to "ಬಿಸಿಲು ಹೊಡೆತ"),
            description = mapOf(
                "en" to "Heat stroke occurs when the body overheats due to high temperatures.",
                "kn" to "ಹೆಚ್ಚಿನ ತಾಪಮಾನದಿಂದಾಗಿ ದೇಹವು ಅತಿಯಾಗಿ ಬಿಸಿಯಾದಾಗ ಬಿಸಿಲು ಹೊಡೆತ ಸಂಭವಿಸುತ್ತದೆ."
            ),
            symptoms = mapOf(
                "en" to listOf("High body temperature", "Dizziness", "Headache", "Confusion", "Fainting"),
                "kn" to listOf("ದೇಹದ ಹೆಚ್ಚಿನ ತಾಪಮಾನ", "ತಲೆತಿರುಗುವಿಕೆ", "ತಲೆನೋವು", "ಗೊಂದಲ", "ಪ್ರಜ್ಞೆ ತಪ್ಪುವುದು")
            ),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Move the person to a cool place."),
                    EmergencyStep("Give water if conscious."),
                    EmergencyStep("Apply cool wet cloths."),
                    EmergencyStep("Use a fan if available."),
                    EmergencyStep("Seek medical help.")
                ),
                "kn" to listOf(
                    EmergencyStep("ವ್ಯಕ್ತಿಯನ್ನು ತಂಪಾದ ಜಾಗಕ್ಕೆ ಸ್ಥಳಾಂತರಿಸಿ.",),
                    EmergencyStep("ಪ್ರಜ್ಞೆಯಿದ್ದರೆ ನೀರು ಕುಡಿಸಿ.",),
                    EmergencyStep("ತಣ್ಣನೆಯ ಒದ್ದೆ ಬಟ್ಟೆಗಳನ್ನು ಹಚ್ಚಿ.",),
                    EmergencyStep("ಫ್ಯಾನ್ ಲಭ್ಯವಿದ್ದರೆ ಬಳಸಿ.",),
                    EmergencyStep("ವೈದ್ಯಕೀಯ ಸಹಾಯ ಪಡೆಯಿರಿ.")
                )
            ),
            doNot = mapOf(
                "en" to listOf("Do not give caffeinated drinks.", "Do not leave the person alone."),
                "kn" to listOf("ಕೆಫೀನ್ ಭರಿತ ಪಾನೀಯಗಳನ್ನು ನೀಡಬೇಡಿ.", "ವ್ಯಕ್ತಿಯನ್ನು ಒಬ್ಬಂಟಿಯಾಗಿ ಬಿಡಬೇಡಿ.")
            ),
            preventionTips = mapOf(
                "en" to listOf("Drink enough water.", "Avoid direct sunlight for long periods.", "Wear light clothing."),
                "kn" to listOf("ಸಾಕಷ್ಟು ನೀರು ಕುಡಿಯಿರಿ.", "ಬಿಸಿಲಿನಲ್ಲಿ ಹೆಚ್ಚು ಹೊತ್ತು ಇರಬೇಡಿ.", "ಹಗುರವಾದ ಬಟ್ಟೆಗಳನ್ನು ಧರಿಸಿ.")
            )
        ),
        EmergencyCategory(
            id = "poisoning",
            icon = "Skull",
            color = "#10B981",
            title = mapOf("en" to "Poisoning", "kn" to "ವಿಷ ಸೇವನೆ"),
            description = mapOf(
                "en" to "Poisoning occurs when harmful substances enter the body.",
                "kn" to "ಹಾನಿಕಾರಕ ಪದಾರ್ಥಗಳು ದೇಹವನ್ನು ಪ್ರವೇಶಿಸಿದಾಗ ವಿಷ ಸೇವನೆ ಸಂಭವಿಸುತ್ತದೆ."
            ),
            symptoms = mapOf(
                "en" to listOf("Vomiting", "Drowsiness", "Difficulty breathing", "Burns around the mouth"),
                "kn" to listOf("ವಾಂತಿ", "ತೂಕಡಿಕೆ", "ಉಸಿರಾಟದ ತೊಂದರೆ", "ಬಾಯಿಯ ಸುತ್ತ ಸುಟ್ಟ ಗಾಯಗಳು")
            ),
            steps = mapOf(
                "en" to listOf(
                    EmergencyStep("Identify the poison if possible."),
                    EmergencyStep("Call emergency services."),
                    EmergencyStep("Keep the person calm."),
                    EmergencyStep("Follow medical instructions.")
                ),
                "kn" to listOf(
                    EmergencyStep("ಸಾಧ್ಯವಾದರೆ ವಿಷದ ವಸ್ತುವನ್ನು ಗುರುತಿಸಿ.",),
                    EmergencyStep("ತುರ್ತು ಸೇವೆಗೆ ಕರೆ ಮಾಡಿ.",),
                    EmergencyStep("ವ್ಯಕ್ತಿಯನ್ನು ಶಾಂತವಾಗಿರಿಸಿ.",),
                    EmergencyStep("ವೈದ್ಯಕೀಯ ಸೂಚನೆಗಳನ್ನು ಪಾಲಿಸಿ.")
                )
            ),
            doNot = mapOf(
                "en" to listOf("Do not force vomiting unless instructed.", "Do not give random medicines."),
                "kn" to listOf("ಸೂಚನೆ ನೀಡುವವರೆಗೆ ವಾಂತಿ ಮಾಡಿಸಲು ಪ್ರಯತ್ನಿಸಬೇಡಿ.", "ಯಾವುದೇ ಔಷಧಿಗಳನ್ನು ನೀಡಬೇಡಿ.")
            ),
            preventionTips = mapOf(
                "en" to listOf("Store chemicals safely.", "Keep medicines away from children.", "Read labels carefully."),
                "kn" to listOf("ರಾಸಾಯನಿಕಗಳನ್ನು ಸುರಕ್ಷಿತವಾಗಿ ಸಂಗ್ರಹಿಸಿ.", "ಔಷಧಿಗಳನ್ನು ಮಕ್ಕಳಿಂದ ದೂರವಿಡಿ.", "ಲೇಬಲ್‌ಗಳನ್ನು ಎಚ್ಚರಿಕೆಯಿಂದ ಓದಿ.")
            )
        )
    )
}
