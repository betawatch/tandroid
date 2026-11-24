// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ux7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ fd5 c;
    public final /* synthetic */ by7 d;

    public ux7(by7 by7Var, int i, int i2, fd5 fd5Var) {
        this.d = by7Var;
        this.a = i;
        this.b = i2;
        this.c = fd5Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f;
        int L;
        a6 a6Var;
        int[] iArr;
        double d;
        View view;
        AnimatorSet animatorSet;
        float f2;
        float f3;
        float f4;
        float f5;
        by7 by7Var = this.d;
        a6 a6Var2 = by7Var.e;
        ArrayList arrayList = by7Var.a0;
        int[] iArr2 = by7Var.i0;
        s09 s09Var = by7Var.N;
        by7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (by7Var.Q || !by7Var.isAttachedToWindow()) {
            return;
        }
        by7Var.setAlpha(1.0f);
        byte b = 0;
        s09Var.getAnimatedDrawable().I(0, false, false);
        s09Var.getAnimatedDrawable().K(37);
        s09Var.d();
        by7Var.o(true);
        gm.d3(new kl7(this, (byte) 12), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        by7Var.R = animatorSet2;
        ArrayList arrayList2 = new ArrayList();
        Point point = gm.q;
        int i = point.x;
        int i2 = point.y + gm.m;
        int i3 = this.a;
        int i4 = i - i3;
        int i5 = i4 * i4;
        int i6 = this.b;
        int i7 = i2 - i6;
        int i8 = i7 * i7;
        int i9 = i3 * i3;
        int i10 = 1;
        int i11 = i6 * i6;
        double max = Math.max(Math.max(Math.max(Math.sqrt(i8 + i5), Math.sqrt(i8 + i9)), Math.sqrt(i9 + i11)), Math.sqrt(i11 + i5));
        arrayList.clear();
        int childCount = a6Var2.getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = a6Var2.getChildAt(i12);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            xx7 xx7Var = new xx7();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i3 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i6 - ((childAt.getMeasuredHeight() / 2) + iArr2[i10]);
            xx7Var.b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - gm.L(40.0f);
            if (i12 != -1) {
                animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                a6Var = a6Var2;
                float[] fArr = new float[i10];
                fArr[0] = 1.0f;
                view = childAt;
                iArr = iArr2;
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
                d = max;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                a6Var = a6Var2;
                iArr = iArr2;
                d = max;
                view = childAt;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            xx7Var.a = animatorSet3;
            Property property2 = View.SCALE_X;
            if (i12 == -1) {
                f2 = 1.0f;
                f3 = 0.9f;
            } else {
                f2 = 1.04f;
                f3 = 0.6f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f3, f2);
            Property property3 = View.SCALE_Y;
            if (i12 == -1) {
                f4 = 1.0f;
                f5 = 0.9f;
            } else {
                f4 = 1.04f;
                f5 = 0.6f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, (Property<View, Float>) property3, f5, f4), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            xx7Var.a.addListener(new v85(animatorSet, (byte) 27));
            xx7Var.a.setDuration(i12 == -1 ? 232L : 200L);
            xx7Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList.add(xx7Var);
            i12++;
            a6Var2 = a6Var;
            iArr2 = iArr;
            max = d;
            i10 = 1;
        }
        final double d2 = max;
        arrayList2.add(ObjectAnimator.ofFloat(by7Var.w, (Property<su, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList2.add(ofFloat2);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sx7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                by7 by7Var2 = ux7.this.d;
                double animatedFraction = d2 * valueAnimator.getAnimatedFraction();
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = by7Var2.a0;
                    if (i13 >= arrayList3.size()) {
                        return;
                    }
                    xx7 xx7Var2 = (xx7) arrayList3.get(i13);
                    if (xx7Var2.b <= animatedFraction) {
                        xx7Var2.a.start();
                        arrayList3.remove(i13);
                        i13--;
                    }
                    i13++;
                }
            }
        });
        d53 d53Var = d53.h;
        animatorSet2.setInterpolator(d53Var);
        animatorSet2.setDuration(500L);
        byte b2 = 1;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(by7Var.b0, 1.0f);
        ofFloat3.addUpdateListener(new fx7(this, b2));
        ofFloat3.addListener(new tx7(this, b));
        ofFloat3.setDuration(420L);
        ofFloat3.setInterpolator(d53Var);
        arrayList2.add(ofFloat3);
        animatorSet2.playTogether(arrayList2);
        animatorSet2.addListener(new tx7(this, b2));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        by7Var.S = animatorSet4;
        animatorSet4.setDuration(332L);
        if (gm.O1() || by7Var.getContext().getResources().getConfiguration().orientation != 2) {
            f = i / 2.0f;
            L = gm.L(29.0f);
        } else {
            f = (gda.q == 0 ? i / 2.0f : i) / 2.0f;
            L = gm.L(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(s09Var, (Property<s09, Float>) View.TRANSLATION_X, i3 - gm.L(29.0f), f - L), ObjectAnimator.ofFloat(s09Var, (Property<s09, Float>) View.TRANSLATION_Y, i6 - gm.L(29.0f), by7Var.M), ObjectAnimator.ofFloat(s09Var, (Property<s09, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(s09Var, (Property<s09, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(d53.g);
        animatorSet4.start();
    }
}
