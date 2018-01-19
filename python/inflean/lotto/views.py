from django.shortcuts import render, redirect
from django.http import HttpResponse
from .models import GuessNumbers
from .forms import PostForm


def index(request):
		# 리케스트 받아서
	lottos=GuessNumbers.objects.all()

	# 브라우저의 리퀘스트를 받아와서 그대로 전달해주는데 템플릿에 전달해준다 추가적으로 오브젝트를 보여주는데 빈오브젝트임
	return render(request, "lotto/default.html",{"lottos":lottos})
				# 리케스트 전달, 템플릿으로,			빈오브젝트

def post(request):
	if request.method =="POST":
		#save data
		form = PostForm(request.POST)
		if form.is_valid():
			lotto = form.save(commit=False)
			lotto.generate()
			return redirect('lotto:index')# 메인으로 가는 name
	else:
		form = PostForm()
		return render(request, "lotto/form.html", {"form":form})

def detail(request, lottokey):
	lotto=GuessNumbers.objects.get(pk=lottokey)
	return render(request,"lotto/detail.html",{"lotto":lotto})