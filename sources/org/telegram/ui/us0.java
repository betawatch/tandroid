package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class us0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ us0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.li liVar;
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                photoViewer.m6 = null;
                org.telegram.ui.Components.ze0 ze0Var = photoViewer.z1;
                if (ze0Var != null) {
                    if (ze0Var.b.j()) {
                        photoViewer.X0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.X0.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.d6 = 0.0f;
                    photoViewer.b0.invalidate();
                    break;
                }
                break;
            case 1:
                photoViewer.q3 = null;
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.g3();
                break;
            case 3:
                photoViewer.I1.n0(false);
                mt0 mt0Var = photoViewer.I1;
                mt0Var.r1.setTypeface(cg.f1.e(mt0Var.M1).j);
                mt0Var.W0.setVisibility(0);
                mt0Var.T0.setVisibility(0);
                mt0Var.U0.setVisibility(0);
                org.telegram.ui.Components.id0 id0Var = photoViewer.v4;
                int childCount = id0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    id0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.m6 = null;
                photoViewer.r4 = 3;
                photoViewer.f1().I.b(photoViewer.r4 != 0);
                ph.i3 i3Var = photoViewer.H1;
                if (i3Var != null) {
                    i3Var.b(photoViewer.r4 != 3);
                }
                photoViewer.l6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.X5 = r22;
                photoViewer.b6 = r22;
                photoViewer.Z5 = 0.0f;
                photoViewer.a6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.q2 = true;
                photoViewer.b0.invalidate();
                ou0 ou0Var = photoViewer.d;
                if (ou0Var == null || !ou0Var.O()) {
                    photoViewer.R1();
                    break;
                }
                break;
            case 4:
                AnimatorSet animatorSet = photoViewer.y1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.l1.setVisibility(8);
                    photoViewer.y1 = null;
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new gl0(this, 20));
                break;
            case 6:
                photoViewer.j6 = 1.0f;
                Runnable runnable = photoViewer.m4;
                if (runnable != null) {
                    zn znVar = photoViewer.i4;
                    if (znVar == null && (liVar = photoViewer.X1) != null) {
                        org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
                        if (p2Var instanceof zn) {
                            znVar = (zn) p2Var;
                        }
                    }
                    if (znVar != null) {
                        znVar.h8(runnable);
                        break;
                    } else {
                        runnable.run();
                        photoViewer.m4 = null;
                        break;
                    }
                }
                break;
            case 7:
                photoViewer.m6 = null;
                photoViewer.b0.invalidate();
                break;
            case 8:
                photoViewer.v3[0].setTag(null);
                break;
            default:
                photoViewer.v3[0].setTag(null);
                break;
        }
    }
}
