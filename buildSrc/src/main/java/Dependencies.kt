object Dependencies {
    object Android {
        object Tools {
            object Build {
                private const val version = "7.0.3"
                const val gradle = "com.android.tools.build:gradle:$version"
            }
        }
    }

    object AndroidX {
        object AppCompat {
            private const val version = "1.3.1"
            const val appCompat = "androidx.appcompat:appcompat:$version"
        }

        object ConstraintLayout {
            private const val version = "2.1.1"
            const val constraintLayout = "androidx.constraintlayout:constraintlayout:$version"
        }

        object Core {
            private const val version = "1.7.0"
            const val coreKtx = "androidx.core:core-ktx:$version"
        }

        object Test {
            object Ext {
                private const val version = "1.1.3"
                const val jUnit = "androidx.test.ext:junit:$version"
            }

            object Espresso {
                private const val version = "3.4.0"
                const val espressoCore = "androidx.test.espresso:espresso-core:$version"
            }
        }
    }

    object Google {
        object Android {
            object Material {
                private const val version = "1.4.0"
                const val material = "com.google.android.material:material:$version"
            }
        }
    }

    object JetBrains {
        object Kotlin {
            private const val version = "1.5.31"
            const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        }
    }

    object JUnit {
        private const val version = "4.13.2"
        const val jUnit = "junit:junit:$version"
    }
}
