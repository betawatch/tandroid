package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class wq implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wq(Object obj, org.telegram.ui.Components.u00 u00Var, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = u00Var;
        this.c = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z10;
        int i10;
        float f7;
        int i11 = this.a;
        int i12 = this.c;
        Object obj = this.d;
        View view = this.b;
        float f10 = 0.0f;
        int i13 = 2;
        int i14 = 0;
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
                    s4.o0 layoutManager = prVar.c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new t4(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z10;
                    }
                }
                z10 = true;
                animatorSet.start();
                return z10;
            case 1:
                org.telegram.ui.Components.ok okVar = (org.telegram.ui.Components.ok) obj;
                org.telegram.ui.Components.pk pkVar = okVar.X;
                pkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = pkVar.r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                while (i10 < childCount2) {
                    View childAt2 = pkVar.r.getChildAt(i10);
                    if (view != null) {
                        pkVar.r.getClass();
                        i10 = RecyclerView.R(childAt2) < i12 ? i10 + 1 : 0;
                    }
                    childAt2.setAlpha(0.0f);
                    int min2 = (int) ((Math.min(pkVar.r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / pkVar.r.getMeasuredHeight()) * 100.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay(min2);
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.mk(this));
                okVar.U.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    pkVar.r.addView(view);
                    s4.o0 layoutManager2 = pkVar.r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.mk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.bl0 bl0Var = (org.telegram.ui.Components.bl0) obj;
                SparseArray sparseArray = bl0Var.b;
                org.telegram.ui.Components.wl0 wl0Var = bl0Var.a;
                wl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                bl0Var.h.remove(this);
                int childCount3 = wl0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                for (int i16 = 0; i16 < childCount3; i16++) {
                    View childAt3 = wl0Var.getChildAt(i16);
                    wl0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i12 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        bl0Var.d = true;
                        wl0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.p2(this, R, 5));
                        ofFloat5.addListener(new ei.v2(this, R, 9));
                        ofFloat5.setStartDelay((int) ((Math.min(wl0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / wl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                }
                bl0Var.g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.al0(0, this, animatorSet3));
                return false;
            default:
                t10 t10Var = (t10) obj;
                t10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ai.w0 w0Var = t10Var.b;
                int childCount4 = w0Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = w0Var.getChildAt(i17);
                    if (view != null) {
                        w0Var.getClass();
                        f7 = 100.0f;
                        if (RecyclerView.R(childAt4) < i12) {
                            i17++;
                            f10 = 0.0f;
                            i13 = 2;
                            i14 = 0;
                        }
                    } else {
                        f7 = 100.0f;
                    }
                    childAt4.setAlpha(f10);
                    int min3 = (int) ((Math.min(w0Var.getMeasuredHeight(), Math.max(i14, childAt4.getTop())) / w0Var.getMeasuredHeight()) * f7);
                    float[] fArr = new float[i13];
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, (Property<View, Float>) View.ALPHA, fArr);
                    ofFloat6.setStartDelay(min3);
                    ofFloat6.setDuration(200L);
                    animatorSet4.playTogether(ofFloat6);
                    i17++;
                    f10 = 0.0f;
                    i13 = 2;
                    i14 = 0;
                }
                animatorSet4.addListener(new j10(this));
                t10Var.l0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    w0Var.addView(view);
                    s4.o0 layoutManager3 = w0Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat7.addListener(new j10(this, layoutManager3));
                        ofFloat7.start();
                        return true;
                    }
                }
                return true;
        }
    }
}
