package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uq implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uq(Object obj, org.telegram.ui.Components.zz zzVar, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = zzVar;
        this.c = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z10;
        float f7;
        float f10;
        int i10;
        int i11 = this.a;
        int i12 = this.c;
        Object obj = this.d;
        View view = this.b;
        float f11 = 0.0f;
        int i13 = 2;
        int i14 = 0;
        boolean z11 = true;
        switch (i11) {
            case 0:
                pr prVar = (pr) obj;
                prVar.c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = prVar.c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = prVar.c.getChildAt(i15);
                    if (childAt != view) {
                        prVar.c.getClass();
                        if (RecyclerView.R(childAt) >= i12) {
                            childAt.setAlpha(0.0f);
                            int min = (int) ((Math.min(prVar.c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / prVar.c.getMeasuredHeight()) * 100.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay(min);
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    prVar.c.addView(view);
                    s4.n0 layoutManager = prVar.c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new s9(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z10;
                    }
                }
                z10 = true;
                animatorSet.start();
                return z10;
            case 1:
                float f12 = 0.0f;
                org.telegram.ui.Components.wj wjVar = (org.telegram.ui.Components.wj) obj;
                org.telegram.ui.Components.xj xjVar = wjVar.X;
                xjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = xjVar.r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                int i16 = 0;
                while (i16 < childCount2) {
                    View childAt2 = xjVar.r.getChildAt(i16);
                    if (view != null) {
                        xjVar.r.getClass();
                        if (RecyclerView.R(childAt2) < i12) {
                            i16++;
                            f12 = 0.0f;
                        }
                    }
                    childAt2.setAlpha(f12);
                    int min2 = (int) ((Math.min(xjVar.r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / xjVar.r.getMeasuredHeight()) * 100.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay(min2);
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                    i16++;
                    f12 = 0.0f;
                }
                animatorSet2.addListener(new org.telegram.ui.Components.uj(this));
                wjVar.U.d();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    xjVar.r.addView(view);
                    s4.n0 layoutManager2 = xjVar.r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.uj(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                int i17 = 0;
                org.telegram.ui.Components.wj0 wj0Var = (org.telegram.ui.Components.wj0) obj;
                SparseArray sparseArray = wj0Var.b;
                org.telegram.ui.Components.tk0 tk0Var = wj0Var.a;
                tk0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                wj0Var.h.remove(this);
                int childCount3 = tk0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                while (i14 < childCount3) {
                    View childAt3 = tk0Var.getChildAt(i14);
                    tk0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i12 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        wj0Var.d = z11;
                        tk0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new nh.b(this, R, 6));
                        ofFloat5.addListener(new bi.d5(this, R, 11));
                        ofFloat5.setStartDelay((int) ((Math.min(tk0Var.getMeasuredHeight(), Math.max(i17, childAt3.getTop())) / tk0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i14++;
                    z11 = true;
                    i17 = 0;
                }
                wj0Var.g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new bg.f(28, this, animatorSet3));
                return false;
            default:
                z00 z00Var = (z00) obj;
                z00Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ag.b1 b1Var = z00Var.b;
                int childCount4 = b1Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i18 = 0;
                while (i18 < childCount4) {
                    View childAt4 = b1Var.getChildAt(i18);
                    if (view != null) {
                        b1Var.getClass();
                        f7 = 100.0f;
                        if (RecyclerView.R(childAt4) < i12) {
                            f10 = f11;
                            i10 = i14;
                            i18++;
                            f11 = f10;
                            i14 = i10;
                            i13 = 2;
                        }
                    } else {
                        f7 = 100.0f;
                    }
                    childAt4.setAlpha(f11);
                    f10 = f11;
                    int min3 = (int) ((Math.min(b1Var.getMeasuredHeight(), Math.max(i14, childAt4.getTop())) / b1Var.getMeasuredHeight()) * f7);
                    i10 = i14;
                    float[] fArr = new float[i13];
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, (Property<View, Float>) View.ALPHA, fArr);
                    ofFloat6.setStartDelay(min3);
                    ofFloat6.setDuration(200L);
                    Animator[] animatorArr = new Animator[1];
                    animatorArr[i10] = ofFloat6;
                    animatorSet4.playTogether(animatorArr);
                    i18++;
                    f11 = f10;
                    i14 = i10;
                    i13 = 2;
                }
                float f13 = f11;
                int i19 = i14;
                animatorSet4.addListener(new p00(this));
                z00Var.l0.d();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    b1Var.addView(view);
                    s4.n0 layoutManager3 = b1Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        Property property = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[i19] = view.getAlpha();
                        fArr2[1] = f13;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr2);
                        ofFloat7.addListener(new p00(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}
