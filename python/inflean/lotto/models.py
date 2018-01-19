from django.db import models
from django.utils import timezone #장고 유틸에 타임존 있음
import random

# Create your models here.
class GuessNumbers(models.Model):
	# 하위클래스		슈퍼클래스(상위클래스)
	# 변수선언하기		캐릭터필드
	name=models.CharField(max_length = 24)
	lottos=models.CharField(max_length = 255, default = '[1,2,3,4,5,6]')
	text=models.CharField(max_length = 255)
	num_lotto = models.IntegerField(default = 5)
	update_date = models.DateTimeField()

# 로토 번호 생성 및 데이터베이스 저장
	def generate(self):
		self.lottos = ""
		origin = list(range(1,46))
		for _ in range(0, self.num_lotto):
			random.shuffle(origin)
			guess = origin[:6]
			guess.sort()
			self.lottos += str(guess) +'\n'
		self.update_date = timezone.now()
		self.save() #object를 데이터에 저장

	def __str__(self):
		return "%s %s" % (self.name, self.text)