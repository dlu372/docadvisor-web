from django.contrib.auth import authenticate
from django.contrib.auth.models import User
from django.http import JsonResponse


def login_user(request):
    if request.method == 'POST':
        user_name = request.POST.get("user_name")
        pwd = request.POST.get("password")
        user = authenticate(username=user_name, password=pwd)

        if user is not None:
            return JsonResponse({"ret": 1, "msg": "登录成功", "id": user.id})
        else:
            try:
                User.objects.get(username=user_name)
                return JsonResponse({"ret": -2, "msg": "密码错误", "id": "-1"})
            except User.DoesNotExist:
                return JsonResponse({"ret": -1, "msg": "账户不存在", "id": "-1"})
    else:
        return JsonResponse({"ret": -3, "msg": "InvalidRequest"})


def register(request):
    if request.method == 'POST':
        user_name = request.POST.get("user_name")
        pwd = request.POST.get("password")
        try:
            User.objects.get(username=user_name)
            return JsonResponse({"ret": 0, "msg": "用户已存在"})
        except User.DoesNotExist:
            User.objects.create_user(username=user_name, password=pwd)
            return JsonResponse({"ret": 1, "msg": "注册成功！"})
    else:
        return JsonResponse({"ret": -3, "msg": "InvalidRequest"})


def reset(request):
    if request.method == 'POST':
        user_name = request.POST.get("user_name")
        old_pwd = request.POST.get("old_password")
        pwd = request.POST.get("password")

        user = authenticate(username=user_name, password=old_pwd)
        if user is not None:
            user.set_password(pwd)
            user.save()
            return JsonResponse({"ret": 1, "msg": "修改成功"})
        else:
            try:
                User.objects.get(username=user_name)
                return JsonResponse({"ret": -2, "msg": "密码错误"})
            except User.DoesNotExist:
                return JsonResponse({"ret": -1, "msg": "用户不存在"})
    else:
        return JsonResponse({"ret": -3, "msg": "InvalidRequest"})
