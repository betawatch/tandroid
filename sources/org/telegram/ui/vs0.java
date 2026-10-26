package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class vs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ vs0(PhotoViewer photoViewer, int i10) {
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
                org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
                if (of0Var != null) {
                    if (of0Var.b.j()) {
                        org.telegram.ui.ActionBar.f7.t(photoViewer.a1, org.telegram.ui.ActionBar.y6.zf, photoViewer.v2, PorterDuff.Mode.MULTIPLY);
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
                photoViewer.i3();
                break;
            case 3:
                photoViewer.L1.m0(false);
                nt0 nt0Var = photoViewer.L1;
                nt0Var.j1.setTypeface(rg.s0.e(nt0Var.E1).j);
                nt0Var.O0.setVisibility(0);
                nt0Var.L0.setVisibility(0);
                nt0Var.M0.setVisibility(0);
                org.telegram.ui.Components.yd0 yd0Var = photoViewer.y4;
                int childCount = yd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    yd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.p6 = null;
                photoViewer.u4 = 3;
                photoViewer.g1().L.b(photoViewer.u4 != 0);
                fi.z3 z3Var = photoViewer.K1;
                if (z3Var != null) {
                    z3Var.b(photoViewer.u4 != 3);
                }
                photoViewer.o6 = -1;
                float t22 = photoViewer.t2(false);
                photoViewer.a6 = t22;
                photoViewer.e6 = t22;
                photoViewer.c6 = 0.0f;
                photoViewer.d6 = 0.0f;
                photoViewer.y3(t22);
                photoViewer.t2 = true;
                photoViewer.e0.invalidate();
                ou0 ou0Var = photoViewer.d;
                if (ou0Var == null || !ou0Var.P()) {
                    photoViewer.U1();
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
                AndroidUtilities.runOnUIThread(new lj0(this, 23));
                break;
            case 6:
                photoViewer.m6 = 1.0f;
                Runnable runnable = photoViewer.p4;
                if (runnable != null) {
                    un unVar = photoViewer.l4;
                    if (unVar == null && (tiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
                        if (r2Var instanceof un) {
                            unVar = (un) r2Var;
                        }
                    }
                    if (unVar != null) {
                        unVar.o8(runnable);
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
