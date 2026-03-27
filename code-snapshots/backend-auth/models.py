from django.db import models
from django.contrib.auth.models import User


class UserInfo(models.Model):
    user = models.OneToOneField(
        User,
        unique=True,
        on_delete=models.PROTECT,
        related_name="info"
    )
    nameShown = models.CharField(max_length=20, blank=True)
    profilePhotoInBase64 = models.CharField(max_length=128, blank=True)
    age = models.IntegerField(default=-1, blank=True)
    age_year = models.IntegerField(default=-1)
    age_month = models.IntegerField(default=-1)
    age_day = models.IntegerField(default=-1)
    blood = models.CharField(max_length=20, blank=True)
    PMH = models.CharField(max_length=500, blank=True)
    medicine = models.CharField(max_length=200, blank=True)
    allergic = models.CharField(max_length=200, blank=True)
    sex = models.CharField(max_length=2, blank=True)
    job = models.CharField(max_length=30, blank=True)
    height = models.FloatField(default=-1)
    weight = models.FloatField(default=-1)


class History(models.Model):
    type = models.IntegerField(default=-1)
    isDeleted = models.BooleanField(default=False)
    date = models.DateTimeField(auto_now=True)
    user = models.ForeignKey(
        User,
        on_delete=models.PROTECT,
        related_name="histories"
    )


class Conversation(models.Model):
    query = models.CharField(max_length=1000)
    answer = models.CharField(max_length=1000)
    history = models.ForeignKey(
        History,
        on_delete=models.PROTECT,
        related_name="conversations"
    )


class BandData(models.Model):
    user = models.ForeignKey(
        User,
        on_delete=models.PROTECT,
        related_name="bands"
    )
    DeviceId = models.CharField(max_length=30, blank=True)
    SerialNumber = models.CharField(max_length=20, blank=True)
    Step = models.IntegerField(blank=True)
    BodyTtemperature = models.FloatField(blank=True)
    Distance = models.FloatField(blank=True)
    Energy = models.FloatField(blank=True)
    HeartRate = models.IntegerField(blank=True)
    BloodMax = models.IntegerField(blank=True)
    BloodMin = models.IntegerField(blank=True)
    OX = models.IntegerField(blank=True)
    SleepAll = models.FloatField(blank=True)
    DeepSleep = models.FloatField(blank=True)
    LightSleep = models.FloatField(blank=True)
    Note = models.CharField(max_length=30, blank=True)
    LastUpdateTime = models.CharField(max_length=25, blank=True)
    HealthHeartTime = models.CharField(max_length=25, blank=True)
    HealthBloodTime = models.CharField(max_length=25, blank=True)
    Message = models.CharField(max_length=20, blank=True)
    State = models.CharField(max_length=20, blank=True)
    Msg = models.CharField(max_length=20, blank=True)
