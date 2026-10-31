package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qq0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ qq0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.bi biVar;
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                photoViewer.p6 = null;
                org.telegram.ui.Components.be0 be0Var = photoViewer.C1;
                if (be0Var != null) {
                    if (be0Var.b.j()) {
                        org.telegram.ui.ActionBar.a7.t(photoViewer.a1, org.telegram.ui.ActionBar.t6.ng, photoViewer.v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.g6 = 0.0f;
                    photoViewer.e0.invalidate();
                    break;
                }
                break;
            case 1:
                photoViewer.t3 = null;
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.j3();
                break;
            case 3:
                photoViewer.L1.m0(false);
                er0 er0Var = photoViewer.L1;
                er0Var.d1.setTypeface(ig.s0.e(er0Var.y1).j);
                er0Var.I0.setVisibility(0);
                er0Var.F0.setVisibility(0);
                er0Var.G0.setVisibility(0);
                org.telegram.ui.Components.lc0 lc0Var = photoViewer.y4;
                int childCount = lc0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    lc0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.p6 = null;
                photoViewer.u4 = 3;
                photoViewer.h1().L.b(photoViewer.u4 != 0);
                vh.r2 r2Var = photoViewer.K1;
                if (r2Var != null) {
                    r2Var.b(photoViewer.u4 != 3);
                }
                photoViewer.o6 = -1;
                float u22 = photoViewer.u2(false);
                photoViewer.a6 = u22;
                photoViewer.e6 = u22;
                photoViewer.c6 = 0.0f;
                photoViewer.d6 = 0.0f;
                photoViewer.z3(u22);
                photoViewer.t2 = true;
                photoViewer.e0.invalidate();
                es0 es0Var = photoViewer.d;
                if (es0Var == null || !es0Var.P()) {
                    photoViewer.V1();
                    break;
                }
                break;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.o1.setVisibility(8);
                    photoViewer.B1 = null;
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.i0.g3(new mg0(this, 24));
                break;
            case 6:
                photoViewer.m6 = 1.0f;
                Runnable runnable = photoViewer.p4;
                if (runnable != null) {
                    un unVar = photoViewer.l4;
                    if (unVar == null && (biVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                        if (k2Var instanceof un) {
                            unVar = (un) k2Var;
                        }
                    }
                    if (unVar != null) {
                        unVar.p8(runnable);
                        break;
                    } else {
                        runnable.run();
                        photoViewer.p4 = null;
                        break;
                    }
                }
                break;
            case 7:
                photoViewer.p6 = null;
                photoViewer.e0.invalidate();
                break;
            case 8:
                photoViewer.y3[0].setTag(null);
                break;
            default:
                photoViewer.y3[0].setTag(null);
                break;
        }
    }
}
