package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zr0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.z61, org.telegram.ui.Components.l71, org.telegram.ui.Components.ze0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ zr0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z4) {
        boolean z10 = !z4;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.S0.isClickable() != z10) {
            photoViewer.S0.setClickable(z10);
            photoViewer.S0.setVisibility(0);
            photoViewer.S0.clearAnimation();
            photoViewer.S0.animate().alpha(!z4 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.pr.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.rv0(5, photoViewer, z10));
        }
    }

    @Override // org.telegram.ui.Components.l71
    public void b(float f10) {
        pt0 pt0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.C2 != null || ((pt0Var = photoViewer.c0) != null && pt0Var.x)) {
            if (!photoViewer.x8 && photoViewer.N7.getVisibility() == 0) {
                f10 = ((photoViewer.O7.getRightProgress() - photoViewer.O7.getLeftProgress()) * f10) + photoViewer.O7.getLeftProgress();
            }
            if (photoViewer.A1() == -9223372036854775807L) {
                photoViewer.X2 = f10;
            } else {
                photoViewer.t2((int) (f10 * r1));
            }
            photoViewer.b3(false);
            photoViewer.r3 = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void c() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.i3 && photoViewer.M3) {
            photoViewer.s2();
        }
    }

    @Override // org.telegram.ui.Components.l71
    public void d(float f10) {
        ts0 ts0Var;
        ts0 ts0Var2;
        PhotoViewer photoViewer = this.a;
        pt0 pt0Var = photoViewer.c0;
        if (pt0Var != null && pt0Var.x && (ts0Var2 = photoViewer.p3) != null) {
            int i10 = photoViewer.n3.h - org.telegram.ui.Components.m71.S;
            ts0Var2.K = pt0Var;
            if (ts0Var2.T != 0) {
                ts0Var2.T = 0L;
                ts0Var2.c0 = null;
                ts0Var2.b0 = null;
                ts0Var2.a0 = null;
                ts0Var2.b(-1);
            }
            if (i10 != 0) {
                ts0Var2.r = i10;
                int i11 = ((int) (i10 * f10)) / 5;
                if (ts0Var2.n != i11) {
                    ts0Var2.n = i11;
                }
            }
            ts0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (pt0Var.getVideoDuration() * f10)) / 1000));
            ts0Var2.B = (int) Math.ceil(ts0Var2.C.measureText(r0));
            ts0Var2.invalidate();
            if (ts0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(ts0Var2.f);
            }
            double videoDuration = (f10 * pt0Var.getVideoDuration()) / 1000.0d;
            ts0Var2.L = videoDuration;
            String c3 = pt0Var.c((int) videoDuration);
            if (c3 != null) {
                ts0Var2.N.setImage(c3, null, null, null, 0L);
            }
        } else if (photoViewer.C2 != null && (ts0Var = photoViewer.p3) != null) {
            ts0Var.e(photoViewer.Q4, f10, photoViewer.n3.h - org.telegram.ui.Components.m71.S);
        }
        this.a.b3(true);
        PhotoViewer.X(this.a);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void e() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.i3 && photoViewer.M3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.u2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.k71 k71Var = photoViewer.C2;
        if (k71Var == null) {
            return;
        }
        k71Var.K((long) (k71Var.p() * photoViewer.s8));
        photoViewer.C2.B();
        photoViewer.O7.setProgress(photoViewer.s8);
        photoViewer.u0();
        gl0 gl0Var = new gl0(this, 19);
        photoViewer.F2 = gl0Var;
        AndroidUtilities.runOnUIThread(gl0Var, 860L);
    }

    @Override // org.telegram.ui.Components.z61
    public void invalidate() {
        this.a.b0.invalidate();
    }
}
