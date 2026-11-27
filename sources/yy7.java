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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class yy7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ tg5 c;
    public final /* synthetic */ fz7 d;

    public yy7(fz7 fz7Var, int i, int i2, tg5 tg5Var) {
        this.d = fz7Var;
        this.a = i;
        this.b = i2;
        this.c = tg5Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f;
        int L;
        b6 b6Var;
        int[] iArr;
        double d;
        View view;
        AnimatorSet animatorSet;
        float f2;
        float f3;
        float f4;
        float f5;
        fz7 fz7Var = this.d;
        b6 b6Var2 = fz7Var.e;
        ArrayList arrayList = fz7Var.a0;
        int[] iArr2 = fz7Var.i0;
        e29 e29Var = fz7Var.N;
        fz7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (fz7Var.Q || !fz7Var.isAttachedToWindow()) {
            return;
        }
        fz7Var.setAlpha(1.0f);
        byte b = 0;
        e29Var.getAnimatedDrawable().I(0, false, false);
        e29Var.getAnimatedDrawable().K(37);
        e29Var.d();
        fz7Var.o(true);
        hl.d3(new fe7(this, (byte) 20), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        fz7Var.R = animatorSet2;
        ArrayList arrayList2 = new ArrayList();
        Point point = hl.q;
        int i = point.x;
        int i2 = point.y + hl.m;
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
        int childCount = b6Var2.getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = b6Var2.getChildAt(i12);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            bz7 bz7Var = new bz7();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i3 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i6 - ((childAt.getMeasuredHeight() / 2) + iArr2[i10]);
            bz7Var.b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - hl.L(40.0f);
            if (i12 != -1) {
                animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                b6Var = b6Var2;
                float[] fArr = new float[i10];
                fArr[0] = 1.0f;
                view = childAt;
                iArr = iArr2;
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
                d = max;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                b6Var = b6Var2;
                iArr = iArr2;
                d = max;
                view = childAt;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            bz7Var.a = animatorSet3;
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
            bz7Var.a.addListener(new ad5(animatorSet, (byte) 24));
            bz7Var.a.setDuration(i12 == -1 ? 232L : 200L);
            bz7Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList.add(bz7Var);
            i12++;
            b6Var2 = b6Var;
            iArr2 = iArr;
            max = d;
            i10 = 1;
        }
        final double d2 = max;
        arrayList2.add(ObjectAnimator.ofFloat(fz7Var.w, (Property<tt, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList2.add(ofFloat2);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wy7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                fz7 fz7Var2 = yy7.this.d;
                double animatedFraction = d2 * valueAnimator.getAnimatedFraction();
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = fz7Var2.a0;
                    if (i13 >= arrayList3.size()) {
                        return;
                    }
                    bz7 bz7Var2 = (bz7) arrayList3.get(i13);
                    if (bz7Var2.b <= animatedFraction) {
                        bz7Var2.a.start();
                        arrayList3.remove(i13);
                        i13--;
                    }
                    i13++;
                }
            }
        });
        k43 k43Var = k43.h;
        animatorSet2.setInterpolator(k43Var);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fz7Var.b0, 1.0f);
        ofFloat3.addUpdateListener(new pv7(this, (byte) 2));
        ofFloat3.addListener(new xy7(this, b));
        ofFloat3.setDuration(420L);
        ofFloat3.setInterpolator(k43Var);
        arrayList2.add(ofFloat3);
        animatorSet2.playTogether(arrayList2);
        animatorSet2.addListener(new xy7(this, (byte) 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        fz7Var.S = animatorSet4;
        animatorSet4.setDuration(332L);
        if (hl.O1() || fz7Var.getContext().getResources().getConfiguration().orientation != 2) {
            f = i / 2.0f;
            L = hl.L(29.0f);
        } else {
            f = (xea.q == 0 ? i / 2.0f : i) / 2.0f;
            L = hl.L(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(e29Var, (Property<e29, Float>) View.TRANSLATION_X, i3 - hl.L(29.0f), f - L), ObjectAnimator.ofFloat(e29Var, (Property<e29, Float>) View.TRANSLATION_Y, i6 - hl.L(29.0f), fz7Var.M), ObjectAnimator.ofFloat(e29Var, (Property<e29, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(e29Var, (Property<e29, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(k43.g);
        animatorSet4.start();
    }
}
