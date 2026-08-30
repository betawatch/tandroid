package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xr0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.x61, org.telegram.ui.Components.j71, org.telegram.ui.Components.xe0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ xr0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z4) {
        boolean z10 = !z4;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.S0.isClickable() != z10) {
            photoViewer.S0.setClickable(z10);
            photoViewer.S0.setVisibility(0);
            photoViewer.S0.clearAnimation();
            photoViewer.S0.animate().alpha(!z4 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.nr.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.kv0(6, photoViewer, z10));
        }
    }

    @Override // org.telegram.ui.Components.j71
    public void b(float f10) {
        nt0 nt0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.C2 != null || ((nt0Var = photoViewer.c0) != null && nt0Var.x)) {
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

    @Override // org.telegram.ui.Components.j71
    public void d(float f10) {
        rs0 rs0Var;
        rs0 rs0Var2;
        PhotoViewer photoViewer = this.a;
        nt0 nt0Var = photoViewer.c0;
        if (nt0Var != null && nt0Var.x && (rs0Var2 = photoViewer.p3) != null) {
            int i10 = photoViewer.n3.h - org.telegram.ui.Components.k71.S;
            rs0Var2.K = nt0Var;
            if (rs0Var2.T != 0) {
                rs0Var2.T = 0L;
                rs0Var2.c0 = null;
                rs0Var2.b0 = null;
                rs0Var2.a0 = null;
                rs0Var2.b(-1);
            }
            if (i10 != 0) {
                rs0Var2.r = i10;
                int i11 = ((int) (i10 * f10)) / 5;
                if (rs0Var2.n != i11) {
                    rs0Var2.n = i11;
                }
            }
            rs0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (nt0Var.getVideoDuration() * f10)) / 1000));
            rs0Var2.B = (int) Math.ceil(rs0Var2.C.measureText(r0));
            rs0Var2.invalidate();
            if (rs0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(rs0Var2.f);
            }
            double videoDuration = (f10 * nt0Var.getVideoDuration()) / 1000.0d;
            rs0Var2.L = videoDuration;
            String c3 = nt0Var.c((int) videoDuration);
            if (c3 != null) {
                rs0Var2.N.setImage(c3, null, null, null, 0L);
            }
        } else if (photoViewer.C2 != null && (rs0Var = photoViewer.p3) != null) {
            rs0Var.e(photoViewer.Q4, f10, photoViewer.n3.h - org.telegram.ui.Components.k71.S);
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
        org.telegram.ui.Components.i71 i71Var = photoViewer.C2;
        if (i71Var == null) {
            return;
        }
        i71Var.K((long) (i71Var.p() * photoViewer.s8));
        photoViewer.C2.B();
        photoViewer.O7.setProgress(photoViewer.s8);
        photoViewer.u0();
        el0 el0Var = new el0(this, 19);
        photoViewer.F2 = el0Var;
        AndroidUtilities.runOnUIThread(el0Var, 860L);
    }

    @Override // org.telegram.ui.Components.x61
    public void invalidate() {
        this.a.b0.invalidate();
    }
}
