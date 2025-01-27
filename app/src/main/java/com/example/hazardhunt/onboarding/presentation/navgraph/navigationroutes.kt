// ktlint-disable filename
package com.example.hazardhunt.onboarding.presentation.navgraph

sealed class NavigationRoutes(val routes: String) {

    object OnBoardingScreen : NavigationRoutes("onboarding")
    object LoginScreen : NavigationRoutes("homescreen")
    object SignupScreen : NavigationRoutes("signup")
    object StartNavigation : NavigationRoutes("startnavigation")
    object LoginandSignup : NavigationRoutes("LoginandSignup")
    object HomeNavigation : NavigationRoutes("home")
    object HomeNavigationScreen : NavigationRoutes("homeNavigator")
}
