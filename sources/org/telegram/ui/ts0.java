package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ts0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.k71, org.telegram.ui.Components.v71, org.telegram.ui.Components.cf0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ ts0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            photoViewer.V0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.qr.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.es0(7, photoViewer, z11));
        }
    }

    @Override // org.telegram.ui.Components.v71
    public void b(float f7) {
        iu0 iu0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((iu0Var = photoViewer.f0) != null && iu0Var.x)) {
            if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
                f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
            }
            if (photoViewer.A1() == -9223372036854775807L) {
                photoViewer.a3 = f7;
            } else {
                photoViewer.s2((int) (f7 * r1));
            }
            photoViewer.a3(false);
            photoViewer.u3 = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void c() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.r2();
        }
    }

    @Override // org.telegram.ui.Components.v71
    public void d(float f7) {
        mt0 mt0Var;
        mt0 mt0Var2;
        PhotoViewer photoViewer = this.a;
        iu0 iu0Var = photoViewer.f0;
        if (iu0Var != null && iu0Var.x && (mt0Var2 = photoViewer.s3) != null) {
            int i10 = photoViewer.q3.h - org.telegram.ui.Components.w71.S;
            mt0Var2.N = iu0Var;
            if (mt0Var2.W != 0) {
                mt0Var2.W = 0L;
                mt0Var2.f0 = null;
                mt0Var2.e0 = null;
                mt0Var2.d0 = null;
                mt0Var2.b(-1);
            }
            if (i10 != 0) {
                mt0Var2.r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (mt0Var2.n != i11) {
                    mt0Var2.n = i11;
                }
            }
            mt0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (iu0Var.getVideoDuration() * f7)) / 1000));
            mt0Var2.E = (int) Math.ceil(mt0Var2.F.measureText(r0));
            mt0Var2.invalidate();
            if (mt0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(mt0Var2.f);
            }
            double videoDuration = (f7 * iu0Var.getVideoDuration()) / 1000.0d;
            mt0Var2.O = videoDuration;
            String c10 = iu0Var.c((int) videoDuration);
            if (c10 != null) {
                mt0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (mt0Var = photoViewer.s3) != null) {
            mt0Var.e(photoViewer.T4, f7, photoViewer.q3.h - org.telegram.ui.Components.w71.S);
        }
        this.a.a3(true);
        PhotoViewer.X(this.a);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void e() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.u71 u71Var = photoViewer.F2;
        if (u71Var == null) {
            return;
        }
        u71Var.K((long) (u71Var.p() * photoViewer.w8));
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.w8);
        photoViewer.u0();
        sl0 sl0Var = new sl0(this, 18);
        photoViewer.I2 = sl0Var;
        AndroidUtilities.runOnUIThread(sl0Var, 860L);
    }

    @Override // org.telegram.ui.Components.k71
    public void invalidate() {
        this.a.e0.invalidate();
    }
}
