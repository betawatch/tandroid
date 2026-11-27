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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class vu6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ bv6 c;

    public vu6(bv6 bv6Var, HashMap hashMap, HashMap hashMap2) {
        this.c = bv6Var;
        this.a = hashMap;
        this.b = hashMap2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        HashMap hashMap;
        HashMap hashMap2;
        nu7 nu7Var;
        jw6 jw6Var;
        bv6 bv6Var = this.c;
        bv6Var.V.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = bv6Var.Y;
        if (hashSet == null || bv6Var.Z == null) {
            return;
        }
        int size = hashSet.size() - bv6Var.Z.size();
        boolean z = true;
        ru6 ru6Var = new ru6(bv6Var, 1 == true ? 1 : 0);
        int firstVisiblePosition = bv6Var.V.getFirstVisiblePosition();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int childCount = bv6Var.V.getChildCount();
            hashMap = this.a;
            hashMap2 = this.b;
            if (i >= childCount) {
                break;
            }
            View childAt = bv6Var.V.getChildAt(i);
            jw6 jw6Var2 = (jw6) bv6Var.W.getItem(firstVisiblePosition + i);
            Rect rect = (Rect) hashMap.get(jw6Var2);
            int top = childAt.getTop();
            int i2 = rect != null ? rect.top : (bv6Var.f0 * size) + top;
            AnimationSet animationSet = new AnimationSet(z);
            HashSet hashSet2 = bv6Var.Y;
            if (hashSet2 == null || !hashSet2.contains(jw6Var2)) {
                jw6Var = jw6Var2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                jw6Var = jw6Var2;
                alphaAnimation.setDuration(bv6Var.z0);
                animationSet.addAnimation(alphaAnimation);
                i2 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i2 - top, 0.0f);
            translateAnimation.setDuration(bv6Var.y0);
            animationSet.addAnimation(translateAnimation);
            z = true;
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(bv6Var.B0);
            if (!z2) {
                animationSet.setAnimationListener(ru6Var);
                z2 = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            jw6 jw6Var3 = jw6Var;
            hashMap.remove(jw6Var3);
            hashMap2.remove(jw6Var3);
            i++;
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            jw6 jw6Var4 = (jw6) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) hashMap.get(jw6Var4);
            if (bv6Var.Z.contains(jw6Var4)) {
                nu7Var = new nu7(bitmapDrawable, rect2);
                nu7Var.h = 0.0f;
                nu7Var.e = bv6Var.A0;
                nu7Var.d = bv6Var.B0;
            } else {
                int i3 = bv6Var.f0 * size;
                nu7 nu7Var2 = new nu7(bitmapDrawable, rect2);
                nu7Var2.g = i3;
                nu7Var2.e = bv6Var.y0;
                nu7Var2.d = bv6Var.B0;
                nu7Var2.l = new um4(bv6Var, jw6Var4, false, (byte) 10);
                bv6Var.a0.add(jw6Var4);
                nu7Var = nu7Var2;
            }
            bv6Var.V.a.add(nu7Var);
        }
    }
}
