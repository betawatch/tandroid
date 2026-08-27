package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rr0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.b61, org.telegram.ui.Components.n61, org.telegram.ui.Components.fe0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ rr0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.R0.isClickable() != z11) {
            photoViewer.R0.setClickable(z11);
            photoViewer.R0.setVisibility(0);
            photoViewer.R0.clearAnimation();
            photoViewer.R0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.er.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.f50(12, photoViewer, z11));
        }
    }

    @Override // org.telegram.ui.Components.n61
    public void b(float f10) {
        ht0 ht0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.B2 != null || ((ht0Var = photoViewer.b0) != null && ht0Var.x)) {
            if (!photoViewer.w8 && photoViewer.M7.getVisibility() == 0) {
                f10 = ((photoViewer.N7.getRightProgress() - photoViewer.N7.getLeftProgress()) * f10) + photoViewer.N7.getLeftProgress();
            }
            if (photoViewer.A1() == -9223372036854775807L) {
                photoViewer.W2 = f10;
            } else {
                photoViewer.t2((int) (f10 * r1));
            }
            photoViewer.b3(false);
            photoViewer.q3 = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void c() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.h3 && photoViewer.L3) {
            photoViewer.s2();
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void d() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.h3 && photoViewer.L3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.t2);
        }
    }

    @Override // org.telegram.ui.Components.n61
    public void e(float f10) {
        ks0 ks0Var;
        ks0 ks0Var2;
        PhotoViewer photoViewer = this.a;
        ht0 ht0Var = photoViewer.b0;
        if (ht0Var != null && ht0Var.x && (ks0Var2 = photoViewer.o3) != null) {
            int i10 = photoViewer.m3.h - org.telegram.ui.Components.o61.S;
            ks0Var2.J = ht0Var;
            if (ks0Var2.S != 0) {
                ks0Var2.S = 0L;
                ks0Var2.b0 = null;
                ks0Var2.a0 = null;
                ks0Var2.W = null;
                ks0Var2.b(-1);
            }
            if (i10 != 0) {
                ks0Var2.r = i10;
                int i11 = ((int) (i10 * f10)) / 5;
                if (ks0Var2.n != i11) {
                    ks0Var2.n = i11;
                }
            }
            ks0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (ht0Var.getVideoDuration() * f10)) / 1000));
            ks0Var2.A = (int) Math.ceil(ks0Var2.B.measureText(r0));
            ks0Var2.invalidate();
            if (ks0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(ks0Var2.f);
            }
            double videoDuration = (f10 * ht0Var.getVideoDuration()) / 1000.0d;
            ks0Var2.K = videoDuration;
            String c10 = ht0Var.c((int) videoDuration);
            if (c10 != null) {
                ks0Var2.M.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.B2 != null && (ks0Var = photoViewer.o3) != null) {
            ks0Var.e(photoViewer.P4, f10, photoViewer.m3.h - org.telegram.ui.Components.o61.S);
        }
        this.a.b3(true);
        PhotoViewer.X(this.a);
    }

    public void f() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.m61 m61Var = photoViewer.B2;
        if (m61Var == null) {
            return;
        }
        m61Var.L((long) (m61Var.q() * photoViewer.r8));
        photoViewer.B2.C();
        photoViewer.N7.setProgress(photoViewer.r8);
        photoViewer.u0();
        zk0 zk0Var = new zk0(this, 19);
        photoViewer.E2 = zk0Var;
        AndroidUtilities.runOnUIThread(zk0Var, 860L);
    }

    @Override // org.telegram.ui.Components.b61
    public void invalidate() {
        this.a.a0.invalidate();
    }
}
