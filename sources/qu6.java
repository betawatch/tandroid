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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qu6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ wu6 c;

    public qu6(wu6 wu6Var, HashMap hashMap, HashMap hashMap2) {
        this.c = wu6Var;
        this.a = hashMap;
        this.b = hashMap2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        HashMap hashMap;
        HashMap hashMap2;
        it7 it7Var;
        ew6 ew6Var;
        wu6 wu6Var = this.c;
        wu6Var.V.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = wu6Var.Y;
        if (hashSet == null || wu6Var.Z == null) {
            return;
        }
        int size = hashSet.size() - wu6Var.Z.size();
        boolean z = true;
        mu6 mu6Var = new mu6(wu6Var, 1 == true ? 1 : 0);
        int firstVisiblePosition = wu6Var.V.getFirstVisiblePosition();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int childCount = wu6Var.V.getChildCount();
            hashMap = this.a;
            hashMap2 = this.b;
            if (i >= childCount) {
                break;
            }
            View childAt = wu6Var.V.getChildAt(i);
            ew6 ew6Var2 = (ew6) wu6Var.W.getItem(firstVisiblePosition + i);
            Rect rect = (Rect) hashMap.get(ew6Var2);
            int top = childAt.getTop();
            int i2 = rect != null ? rect.top : (wu6Var.f0 * size) + top;
            AnimationSet animationSet = new AnimationSet(z);
            HashSet hashSet2 = wu6Var.Y;
            if (hashSet2 == null || !hashSet2.contains(ew6Var2)) {
                ew6Var = ew6Var2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                ew6Var = ew6Var2;
                alphaAnimation.setDuration(wu6Var.z0);
                animationSet.addAnimation(alphaAnimation);
                i2 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i2 - top, 0.0f);
            translateAnimation.setDuration(wu6Var.y0);
            animationSet.addAnimation(translateAnimation);
            z = true;
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(wu6Var.B0);
            if (!z2) {
                animationSet.setAnimationListener(mu6Var);
                z2 = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            ew6 ew6Var3 = ew6Var;
            hashMap.remove(ew6Var3);
            hashMap2.remove(ew6Var3);
            i++;
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            ew6 ew6Var4 = (ew6) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) hashMap.get(ew6Var4);
            if (wu6Var.Z.contains(ew6Var4)) {
                it7Var = new it7(bitmapDrawable, rect2);
                it7Var.h = 0.0f;
                it7Var.e = wu6Var.A0;
                it7Var.d = wu6Var.B0;
            } else {
                int i3 = wu6Var.f0 * size;
                it7 it7Var2 = new it7(bitmapDrawable, rect2);
                it7Var2.g = i3;
                it7Var2.e = wu6Var.y0;
                it7Var2.d = wu6Var.B0;
                it7Var2.l = new wm4(wu6Var, ew6Var4, false, (byte) 9);
                wu6Var.a0.add(ew6Var4);
                it7Var = it7Var2;
            }
            wu6Var.V.a.add(it7Var);
        }
    }
}
