package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xo0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ xo0(PhotoViewer photoViewer, int i3) {
        this.a = i3;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.bi biVar;
        int i3 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i3) {
            case 0:
                photoViewer.q6 = null;
                org.telegram.ui.Components.ad0 ad0Var = photoViewer.D1;
                if (ad0Var != null) {
                    if (ad0Var.b.j()) {
                        org.telegram.ui.ActionBar.r6.t(photoViewer.b1, org.telegram.ui.ActionBar.k6.ng, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.b1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.h6 = 0.0f;
                    photoViewer.f0.invalidate();
                    break;
                }
                break;
            case 1:
                photoViewer.u3 = null;
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.j3();
                break;
            case 3:
                photoViewer.M1.m0(false);
                lp0 lp0Var = photoViewer.M1;
                lp0Var.e1.setTypeface(tg.k0.e(lp0Var.z1).j);
                lp0Var.J0.setVisibility(0);
                lp0Var.G0.setVisibility(0);
                lp0Var.H0.setVisibility(0);
                org.telegram.ui.Components.nb0 nb0Var = photoViewer.z4;
                int childCount = nb0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    nb0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.q6 = null;
                photoViewer.v4 = 3;
                photoViewer.h1().M.b(photoViewer.v4 != 0);
                gi.p3 p3Var = photoViewer.L1;
                if (p3Var != null) {
                    p3Var.b(photoViewer.v4 != 3);
                }
                photoViewer.p6 = -1;
                float u22 = photoViewer.u2(false);
                photoViewer.b6 = u22;
                photoViewer.f6 = u22;
                photoViewer.d6 = 0.0f;
                photoViewer.e6 = 0.0f;
                photoViewer.z3(u22);
                photoViewer.u2 = true;
                photoViewer.f0.invalidate();
                kq0 kq0Var = photoViewer.d;
                if (kq0Var == null || !kq0Var.P()) {
                    photoViewer.V1();
                    break;
                }
                break;
            case 4:
                AnimatorSet animatorSet = photoViewer.C1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.p1.setVisibility(8);
                    photoViewer.C1 = null;
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.h3(new sg0(this, 23));
                break;
            case 6:
                photoViewer.n6 = 1.0f;
                Runnable runnable = photoViewer.q4;
                if (runnable != null) {
                    wm wmVar = photoViewer.m4;
                    if (wmVar == null && (biVar = photoViewer.b2) != null) {
                        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                        if (d2Var instanceof wm) {
                            wmVar = (wm) d2Var;
                        }
                    }
                    if (wmVar != null) {
                        wmVar.w8(runnable);
                        break;
                    } else {
                        runnable.run();
                        photoViewer.q4 = null;
                        break;
                    }
                }
                break;
            case 7:
                photoViewer.q6 = null;
                photoViewer.f0.invalidate();
                break;
            case 8:
                photoViewer.z3[0].setTag(null);
                break;
            default:
                photoViewer.z3[0].setTag(null);
                break;
        }
    }
}
