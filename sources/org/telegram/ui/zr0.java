package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class zr0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.s71, org.telegram.ui.Components.d81, org.telegram.ui.Components.nf0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ zr0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            photoViewer.V0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.bs.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.b60(13, photoViewer, z11));
        }
    }

    @Override // org.telegram.ui.Components.d81
    public void b(float f7) {
        ot0 ot0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((ot0Var = photoViewer.f0) != null && ot0Var.x)) {
            if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
                f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
            }
            if (photoViewer.B1() == -9223372036854775807L) {
                photoViewer.a3 = f7;
            } else {
                photoViewer.v2((int) (f7 * r1));
            }
            photoViewer.d3(false);
            photoViewer.u3 = false;
        }
    }

    @Override // org.telegram.ui.Components.d81
    public void c(float f7) {
        ss0 ss0Var;
        ss0 ss0Var2;
        PhotoViewer photoViewer = this.a;
        ot0 ot0Var = photoViewer.f0;
        if (ot0Var != null && ot0Var.x && (ss0Var2 = photoViewer.s3) != null) {
            int i10 = photoViewer.q3.h - org.telegram.ui.Components.e81.S;
            ss0Var2.N = ot0Var;
            if (ss0Var2.W != 0) {
                ss0Var2.W = 0L;
                ss0Var2.f0 = null;
                ss0Var2.e0 = null;
                ss0Var2.d0 = null;
                ss0Var2.b(-1);
            }
            if (i10 != 0) {
                ss0Var2.r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (ss0Var2.n != i11) {
                    ss0Var2.n = i11;
                }
            }
            ss0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (ot0Var.getVideoDuration() * f7)) / 1000));
            ss0Var2.E = (int) Math.ceil(ss0Var2.F.measureText(r0));
            ss0Var2.invalidate();
            if (ss0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(ss0Var2.f);
            }
            double videoDuration = (f7 * ot0Var.getVideoDuration()) / 1000.0d;
            ss0Var2.O = videoDuration;
            String c10 = ot0Var.c((int) videoDuration);
            if (c10 != null) {
                ss0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (ss0Var = photoViewer.s3) != null) {
            ss0Var.e(photoViewer.T4, f7, photoViewer.q3.h - org.telegram.ui.Components.e81.S);
        }
        this.a.d3(true);
        PhotoViewer.Y(this.a);
    }

    public void d() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.c81 c81Var = photoViewer.F2;
        if (c81Var == null) {
            return;
        }
        c81Var.K((long) (c81Var.p() * photoViewer.w8));
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.w8);
        photoViewer.v0();
        ck0 ck0Var = new ck0(this, 19);
        photoViewer.I2 = ck0Var;
        AndroidUtilities.runOnUIThread(ck0Var, 860L);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void e() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.u2();
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void f() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.x2);
        }
    }

    @Override // org.telegram.ui.Components.s71
    public void invalidate() {
        this.a.e0.invalidate();
    }
}
