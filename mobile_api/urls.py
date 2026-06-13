
from django.urls import path

from mobile_api.views import auth

urlpatterns = [
    path('login/', auth.LoginView.as_view(), name='login'),
    path('register/', auth.RegisterView.as_view(), name='register'),
    path('logout/', auth.LogoutView.as_view(), name='logout'),
]
