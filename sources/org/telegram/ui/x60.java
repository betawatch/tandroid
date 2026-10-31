package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x60 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public org.telegram.ui.Components.s20 d;
    public int e;
    public final /* synthetic */ y60 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x60(y60 y60Var, Context context) {
        super(context);
        this.f = y60Var;
        this.c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.s20 s20Var) {
        y60 y60Var = this.f;
        y60Var.D.remove(s20Var.getKey());
        y60Var.E.remove(s20Var);
        s20Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.a.setupEndValues();
            this.a.cancel();
        }
        this.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.iw0(4, (Object) this, (Object) s20Var));
        this.a.setInterpolator(org.telegram.ui.Components.gr.h);
        this.a.setDuration(320L);
        this.d = s20Var;
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.s20, Float>) View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.s20, Float>) View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.s20, Float>) View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        int i12;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(8.0f);
        int i13 = size - (L * 2);
        int i14 = L;
        int i15 = i14;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            arrayList = this.c;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Components.s20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(28.0f), TLObject.FLAG_30));
                if (childAt != this.d && childAt.getMeasuredWidth() + i18 > i13) {
                    i15 += org.telegram.messenger.i0.L(34.0f);
                    i18 = 0;
                }
                if (childAt.getMeasuredWidth() + i19 > i13) {
                    i14 += org.telegram.messenger.i0.L(34.0f);
                    i19 = 0;
                }
                int i20 = L + i18;
                if (!this.b) {
                    org.telegram.ui.Components.s20 s20Var = this.d;
                    if (childAt == s20Var) {
                        childAt.setTranslationX(L + i19);
                        childAt.setTranslationY(i14);
                    } else if (s20Var != null) {
                        float f7 = i20;
                        if (childAt.getTranslationX() != f7) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f7));
                        } else {
                            i12 = 1;
                        }
                        float f10 = i15;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr = new float[i12];
                            fArr[0] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(i20);
                        childAt.setTranslationY(i15);
                    }
                }
                if (childAt != this.d) {
                    int C = org.telegram.messenger.m5.C(6.0f, childAt.getMeasuredWidth(), i18);
                    i17 = Math.max(i17, i15);
                    i18 = C;
                }
                i19 = org.telegram.messenger.m5.C(6.0f, childAt.getMeasuredWidth(), i19);
            }
            i16++;
        }
        int C2 = org.telegram.messenger.m5.C(28.0f, i17, L);
        if (!this.b) {
            AnimatorSet animatorSet = this.a;
            if (animatorSet != null) {
                this.e = C2;
                animatorSet.playTogether(arrayList);
                this.a.start();
                this.b = true;
            } else {
                this.e = Math.max(C2, org.telegram.messenger.i0.L(28.0f) + i14 + L);
            }
        }
        y60 y60Var = this.f;
        y60Var.a.a(y60Var.E.isEmpty() ? 0.0f : Math.min(C2, y60Var.x));
        setMeasuredDimension(size, this.e);
    }
}
