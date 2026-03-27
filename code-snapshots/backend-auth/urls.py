from django.urls import path
from .views import login_user, register, reset

urlpatterns = [
    path('login', login_user),
    path('retrieve', reset),
    path('register', register),
]
