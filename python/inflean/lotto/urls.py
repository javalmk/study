
from django.conf.urls import url
from django.contrib import admin
from . import views

#views가 lotto라는 폴더(모듈)의 views다

app_name= 'lotto'
urlpatterns = [
    url(r'^$', views.index, name='index'), 
    url(r'^new/$', views.post, name="new_lotto"),
    url(r'^(?P<lottokey>[0-9]+)/detail/$', views.detail, name='detail'),
    	]
    #^$아무것도 없는 url(기본 유알엘)

