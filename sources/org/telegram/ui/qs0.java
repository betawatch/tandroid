package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class qs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ qs0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.ti tiVar;
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                photoViewer.p6 = null;
                org.telegram.ui.Components.nf0 nf0Var = photoViewer.C1;
                if (nf0Var != null) {
                    if (nf0Var.b.j()) {
                        photoViewer.a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.zf), PorterDuff.Mode.MULTIPLY));
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
                photoViewer.g3();
                break;
            case 3:
                photoViewer.L1.o0(false);
                it0 it0Var = photoViewer.L1;
                it0Var.u1.setTypeface(qg.u0.e(it0Var.P1).j);
                it0Var.Z0.setVisibility(0);
                it0Var.W0.setVisibility(0);
                it0Var.X0.setVisibility(0);
                org.telegram.ui.Components.zd0 zd0Var = photoViewer.y4;
                int childCount = zd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    zd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.p6 = null;
                photoViewer.u4 = 3;
                photoViewer.f1().L.b(photoViewer.u4 != 0);
                ei.b4 b4Var = photoViewer.K1;
                if (b4Var != null) {
                    b4Var.b(photoViewer.u4 != 3);
                }
                photoViewer.o6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.a6 = r22;
                photoViewer.e6 = r22;
                photoViewer.c6 = 0.0f;
                photoViewer.d6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.t2 = true;
                photoViewer.e0.invalidate();
                ju0 ju0Var = photoViewer.d;
                if (ju0Var == null || !ju0Var.P()) {
                    photoViewer.S1();
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
                AndroidUtilities.runOnUIThread(new ek0(this, 21));
                break;
            case 6:
                photoViewer.m6 = 1.0f;
                Runnable runnable = photoViewer.p4;
                if (runnable != null) {
                    sn snVar = photoViewer.l4;
                    if (snVar == null && (tiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f0;
                        if (n2Var instanceof sn) {
                            snVar = (sn) n2Var;
                        }
                    }
                    if (snVar != null) {
                        snVar.k8(runnable);
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
