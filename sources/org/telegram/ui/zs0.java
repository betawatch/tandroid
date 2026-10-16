package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class zs0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.z71, org.telegram.ui.Components.j81, org.telegram.ui.Components.tf0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ zs0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            photoViewer.V0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.es.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.zr0(10, photoViewer, z11));
        }
    }

    @Override // org.telegram.ui.Components.j81
    public void b(float f7) {
        ou0 ou0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((ou0Var = photoViewer.f0) != null && ou0Var.x)) {
            if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
                f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
            }
            if (photoViewer.A1() == -9223372036854775807L) {
                photoViewer.a3 = f7;
            } else {
                photoViewer.t2((int) (f7 * r1));
            }
            photoViewer.b3(false);
            photoViewer.u3 = false;
        }
    }

    @Override // org.telegram.ui.Components.j81
    public void c(float f7) {
        st0 st0Var;
        st0 st0Var2;
        PhotoViewer photoViewer = this.a;
        ou0 ou0Var = photoViewer.f0;
        if (ou0Var != null && ou0Var.x && (st0Var2 = photoViewer.s3) != null) {
            int i10 = photoViewer.q3.h - org.telegram.ui.Components.k81.S;
            st0Var2.N = ou0Var;
            if (st0Var2.W != 0) {
                st0Var2.W = 0L;
                st0Var2.f0 = null;
                st0Var2.e0 = null;
                st0Var2.d0 = null;
                st0Var2.b(-1);
            }
            if (i10 != 0) {
                st0Var2.r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (st0Var2.n != i11) {
                    st0Var2.n = i11;
                }
            }
            st0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (ou0Var.getVideoDuration() * f7)) / 1000));
            st0Var2.E = (int) Math.ceil(st0Var2.F.measureText(r0));
            st0Var2.invalidate();
            if (st0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(st0Var2.f);
            }
            double videoDuration = (f7 * ou0Var.getVideoDuration()) / 1000.0d;
            st0Var2.O = videoDuration;
            String c10 = ou0Var.c((int) videoDuration);
            if (c10 != null) {
                st0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (st0Var = photoViewer.s3) != null) {
            st0Var.e(photoViewer.T4, f7, photoViewer.q3.h - org.telegram.ui.Components.k81.S);
        }
        this.a.b3(true);
        PhotoViewer.X(this.a);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void d() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void e() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.i81 i81Var = photoViewer.F2;
        if (i81Var == null) {
            return;
        }
        i81Var.K((long) (i81Var.p() * photoViewer.w8));
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.w8);
        photoViewer.u0();
        xk0 xk0Var = new xk0(this, 19);
        photoViewer.I2 = xk0Var;
        AndroidUtilities.runOnUIThread(xk0Var, 860L);
    }

    @Override // org.telegram.ui.Components.z71
    public void invalidate() {
        this.a.e0.invalidate();
    }
}
