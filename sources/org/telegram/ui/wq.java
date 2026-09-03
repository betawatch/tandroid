package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        boolean z4;
        int i10;
        float f10;
        int i11 = this.a;
        int i12 = this.c;
        Object obj = this.d;
        View view = this.b;
        float f11 = 0.0f;
        int i13 = 2;
        int i14 = 0;
        boolean z10 = true;
        switch (i11) {
            case 0:
                qr qrVar = (qr) obj;
                qrVar.c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = qrVar.c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = qrVar.c.getChildAt(i15);
                    if (childAt != view) {
                        qrVar.c.getClass();
                        if (RecyclerView.R(childAt) >= i12) {
                            childAt.setAlpha(0.0f);
                            int min = (int) ((Math.min(qrVar.c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / qrVar.c.getMeasuredHeight()) * 100.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay(min);
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    qrVar.c.addView(view);
                    f2.w0 layoutManager = qrVar.c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z4 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new s5(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z4;
                    }
                }
                z4 = true;
                animatorSet.start();
                return z4;
            case 1:
                org.telegram.ui.Components.ik ikVar = (org.telegram.ui.Components.ik) obj;
                org.telegram.ui.Components.jk jkVar = ikVar.U;
                jkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = jkVar.r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                while (i10 < childCount2) {
                    View childAt2 = jkVar.r.getChildAt(i10);
                    if (view != null) {
                        jkVar.r.getClass();
                        i10 = RecyclerView.R(childAt2) < i12 ? i10 + 1 : 0;
                    }
                    childAt2.setAlpha(0.0f);
                    int min2 = (int) ((Math.min(jkVar.r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / jkVar.r.getMeasuredHeight()) * 100.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay(min2);
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.gk(this));
                ikVar.R.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    jkVar.r.addView(view);
                    f2.w0 layoutManager2 = jkVar.r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.gk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.zk0 zk0Var = (org.telegram.ui.Components.zk0) obj;
                SparseArray sparseArray = zk0Var.b;
                org.telegram.ui.Components.sl0 sl0Var = zk0Var.a;
                sl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                zk0Var.h.remove(this);
                int childCount3 = sl0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                int i16 = 0;
                while (i16 < childCount3) {
                    View childAt3 = sl0Var.getChildAt(i16);
                    sl0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i12 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        zk0Var.d = z10;
                        sl0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        int i17 = 6;
                        ofFloat5.addUpdateListener(new jh.b(this, R, i17));
                        ofFloat5.addListener(new org.telegram.ui.Cells.b4(this, R, i17));
                        ofFloat5.setStartDelay((int) ((Math.min(sl0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / sl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i16++;
                    z10 = true;
                }
                zk0Var.g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new eg.w2(27, this, animatorSet3));
                return false;
            default:
                t10 t10Var = (t10) obj;
                t10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                mh.d1 d1Var = t10Var.b;
                int childCount4 = d1Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i18 = 0;
                while (i18 < childCount4) {
                    View childAt4 = d1Var.getChildAt(i18);
                    if (view != null) {
                        d1Var.getClass();
                        f10 = 100.0f;
                        if (RecyclerView.R(childAt4) < i12) {
                            i18++;
                            f11 = 0.0f;
                            i13 = 2;
                            i14 = 0;
                        }
                    } else {
                        f10 = 100.0f;
                    }
                    childAt4.setAlpha(f11);
                    int min3 = (int) ((Math.min(d1Var.getMeasuredHeight(), Math.max(i14, childAt4.getTop())) / d1Var.getMeasuredHeight()) * f10);
                    float[] fArr = new float[i13];
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, (Property<View, Float>) View.ALPHA, fArr);
                    ofFloat6.setStartDelay(min3);
                    ofFloat6.setDuration(200L);
                    animatorSet4.playTogether(ofFloat6);
                    i18++;
                    f11 = 0.0f;
                    i13 = 2;
                    i14 = 0;
                }
                animatorSet4.addListener(new j10(this));
                t10Var.i0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    d1Var.addView(view);
                    f2.w0 layoutManager3 = d1Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat7.addListener(new j10(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}
