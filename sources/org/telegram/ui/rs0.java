package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class rs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ rs0(PhotoViewer photoViewer, int i10) {
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
                org.telegram.ui.Components.rf0 rf0Var = photoViewer.C1;
                if (rf0Var != null) {
                    if (rf0Var.b.j()) {
                        org.telegram.ui.ActionBar.r6.t(photoViewer.a1, org.telegram.ui.ActionBar.k6.zf, photoViewer.v2, PorterDuff.Mode.MULTIPLY);
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
                photoViewer.L1.n0(false);
                jt0 jt0Var = photoViewer.L1;
                jt0Var.u1.setTypeface(qg.u0.e(jt0Var.P1).j);
                jt0Var.Z0.setVisibility(0);
                jt0Var.W0.setVisibility(0);
                jt0Var.X0.setVisibility(0);
                org.telegram.ui.Components.ce0 ce0Var = photoViewer.y4;
                int childCount = ce0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    ce0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.p6 = null;
                photoViewer.u4 = 3;
                photoViewer.g1().L.b(photoViewer.u4 != 0);
                ei.b4 b4Var = photoViewer.K1;
                if (b4Var != null) {
                    b4Var.b(photoViewer.u4 != 3);
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
                ku0 ku0Var = photoViewer.d;
                if (ku0Var == null || !ku0Var.P()) {
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
                AndroidUtilities.runOnUIThread(new oj0(this, 22));
                break;
            case 6:
                photoViewer.m6 = 1.0f;
                Runnable runnable = photoViewer.p4;
                if (runnable != null) {
                    sn snVar = photoViewer.l4;
                    if (snVar == null && (tiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.o2 o2Var = tiVar.f0;
                        if (o2Var instanceof sn) {
                            snVar = (sn) o2Var;
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
