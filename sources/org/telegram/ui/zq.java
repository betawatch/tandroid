package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zq implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zq(Object obj, org.telegram.ui.Components.t00 t00Var, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = t00Var;
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
                sr srVar = (sr) obj;
                srVar.c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = srVar.c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = srVar.c.getChildAt(i15);
                    if (childAt != view) {
                        srVar.c.getClass();
                        if (RecyclerView.S(childAt) >= i12) {
                            childAt.setAlpha(0.0f);
                            int min = (int) ((Math.min(srVar.c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / srVar.c.getMeasuredHeight()) * 100.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay(min);
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    srVar.c.addView(view);
                    s4.o0 layoutManager = srVar.c.getLayoutManager();
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
                org.telegram.ui.Components.nk nkVar = (org.telegram.ui.Components.nk) obj;
                org.telegram.ui.Components.ok okVar = nkVar.X;
                okVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = okVar.r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                while (i10 < childCount2) {
                    View childAt2 = okVar.r.getChildAt(i10);
                    if (view != null) {
                        okVar.r.getClass();
                        i10 = RecyclerView.S(childAt2) < i12 ? i10 + 1 : 0;
                    }
                    childAt2.setAlpha(0.0f);
                    int min2 = (int) ((Math.min(okVar.r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / okVar.r.getMeasuredHeight()) * 100.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay(min2);
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.lk(this));
                nkVar.U.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    okVar.r.addView(view);
                    s4.o0 layoutManager2 = okVar.r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.lk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) obj;
                SparseArray sparseArray = dl0Var.b;
                org.telegram.ui.Components.yl0 yl0Var = dl0Var.a;
                yl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                dl0Var.h.remove(this);
                int childCount3 = yl0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                for (int i16 = 0; i16 < childCount3; i16++) {
                    View childAt3 = yl0Var.getChildAt(i16);
                    yl0Var.getClass();
                    int S = RecyclerView.S(childAt3);
                    if (childAt3 != view && S >= i12 - 1 && sparseArray.get(S, null) == null) {
                        sparseArray.put(S, Float.valueOf(0.0f));
                        dl0Var.d = true;
                        yl0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, S, 5));
                        ofFloat5.addListener(new ei.v2(this, S, 9));
                        ofFloat5.setStartDelay((int) ((Math.min(yl0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / yl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                }
                dl0Var.g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.cl0(0, this, animatorSet3));
                return false;
            default:
                x10 x10Var = (x10) obj;
                x10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ai.w0 w0Var = x10Var.b;
                int childCount4 = w0Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = w0Var.getChildAt(i17);
                    if (view != null) {
                        w0Var.getClass();
                        f7 = 100.0f;
                        if (RecyclerView.S(childAt4) < i12) {
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
                animatorSet4.addListener(new n10(this));
                x10Var.l0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    w0Var.addView(view);
                    s4.o0 layoutManager3 = w0Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat7.addListener(new n10(this, layoutManager3));
                        ofFloat7.start();
                        return true;
                    }
                }
                return true;
        }
    }
}
