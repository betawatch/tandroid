// default package

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qs6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ws6 c;

    public qs6(ws6 ws6Var, HashMap hashMap, HashMap hashMap2) {
        this.c = ws6Var;
        this.a = hashMap;
        this.b = hashMap2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        HashMap hashMap;
        HashMap hashMap2;
        hr7 hr7Var;
        eu6 eu6Var;
        ws6 ws6Var = this.c;
        ws6Var.V.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = ws6Var.Y;
        if (hashSet == null || ws6Var.Z == null) {
            return;
        }
        int size = hashSet.size() - ws6Var.Z.size();
        boolean z = true;
        ms6 ms6Var = new ms6(ws6Var, 1 == true ? 1 : 0);
        int firstVisiblePosition = ws6Var.V.getFirstVisiblePosition();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int childCount = ws6Var.V.getChildCount();
            hashMap = this.a;
            hashMap2 = this.b;
            if (i >= childCount) {
                break;
            }
            View childAt = ws6Var.V.getChildAt(i);
            eu6 eu6Var2 = (eu6) ws6Var.W.getItem(firstVisiblePosition + i);
            Rect rect = (Rect) hashMap.get(eu6Var2);
            int top = childAt.getTop();
            int i2 = rect != null ? rect.top : (ws6Var.f0 * size) + top;
            AnimationSet animationSet = new AnimationSet(z);
            HashSet hashSet2 = ws6Var.Y;
            if (hashSet2 == null || !hashSet2.contains(eu6Var2)) {
                eu6Var = eu6Var2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                eu6Var = eu6Var2;
                alphaAnimation.setDuration(ws6Var.z0);
                animationSet.addAnimation(alphaAnimation);
                i2 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i2 - top, 0.0f);
            translateAnimation.setDuration(ws6Var.y0);
            animationSet.addAnimation(translateAnimation);
            z = true;
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(ws6Var.B0);
            if (!z2) {
                animationSet.setAnimationListener(ms6Var);
                z2 = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            eu6 eu6Var3 = eu6Var;
            hashMap.remove(eu6Var3);
            hashMap2.remove(eu6Var3);
            i++;
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            eu6 eu6Var4 = (eu6) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) hashMap.get(eu6Var4);
            if (ws6Var.Z.contains(eu6Var4)) {
                hr7Var = new hr7(bitmapDrawable, rect2);
                hr7Var.h = 0.0f;
                hr7Var.e = ws6Var.A0;
                hr7Var.d = ws6Var.B0;
            } else {
                int i3 = ws6Var.f0 * size;
                hr7 hr7Var2 = new hr7(bitmapDrawable, rect2);
                hr7Var2.g = i3;
                hr7Var2.e = ws6Var.y0;
                hr7Var2.d = ws6Var.B0;
                hr7Var2.l = new wk4(ws6Var, eu6Var4, false, (byte) 9);
                ws6Var.a0.add(eu6Var4);
                hr7Var = hr7Var2;
            }
            ws6Var.V.a.add(hr7Var);
        }
    }
}
