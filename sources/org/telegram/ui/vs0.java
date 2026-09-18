package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class vs0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.w61, org.telegram.ui.Components.i71, org.telegram.ui.Components.te0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ vs0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            photoViewer.V0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.qr.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.tr0(7, photoViewer, z11));
        }
    }

    @Override // org.telegram.ui.Components.i71
    public void b(float f7) {
        ku0 ku0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((ku0Var = photoViewer.f0) != null && ku0Var.x)) {
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

    @Override // org.telegram.ui.ActionBar.t0
    public void c() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.r2();
        }
    }

    @Override // org.telegram.ui.Components.i71
    public void d(float f7) {
        ot0 ot0Var;
        ot0 ot0Var2;
        PhotoViewer photoViewer = this.a;
        ku0 ku0Var = photoViewer.f0;
        if (ku0Var != null && ku0Var.x && (ot0Var2 = photoViewer.s3) != null) {
            int i10 = photoViewer.q3.h - org.telegram.ui.Components.j71.S;
            ot0Var2.N = ku0Var;
            if (ot0Var2.W != 0) {
                ot0Var2.W = 0L;
                ot0Var2.f0 = null;
                ot0Var2.e0 = null;
                ot0Var2.d0 = null;
                ot0Var2.b(-1);
            }
            if (i10 != 0) {
                ot0Var2.r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (ot0Var2.n != i11) {
                    ot0Var2.n = i11;
                }
            }
            ot0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (ku0Var.getVideoDuration() * f7)) / 1000));
            ot0Var2.E = (int) Math.ceil(ot0Var2.F.measureText(r0));
            ot0Var2.invalidate();
            if (ot0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(ot0Var2.f);
            }
            double videoDuration = (f7 * ku0Var.getVideoDuration()) / 1000.0d;
            ot0Var2.O = videoDuration;
            String c10 = ku0Var.c((int) videoDuration);
            if (c10 != null) {
                ot0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (ot0Var = photoViewer.s3) != null) {
            ot0Var.e(photoViewer.T4, f7, photoViewer.q3.h - org.telegram.ui.Components.j71.S);
        }
        this.a.a3(true);
        PhotoViewer.X(this.a);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void e() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.h71 h71Var = photoViewer.F2;
        if (h71Var == null) {
            return;
        }
        h71Var.K((long) (h71Var.p() * photoViewer.w8));
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.w8);
        photoViewer.u0();
        sl0 sl0Var = new sl0(this, 18);
        photoViewer.I2 = sl0Var;
        AndroidUtilities.runOnUIThread(sl0Var, 860L);
    }

    @Override // org.telegram.ui.Components.w61
    public void invalidate() {
        this.a.e0.invalidate();
    }
}
