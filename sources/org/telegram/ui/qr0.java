package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qr0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.z51, org.telegram.ui.Components.l61, org.telegram.ui.Components.ae0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ qr0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.R0.isClickable() != z11) {
            photoViewer.R0.setClickable(z11);
            photoViewer.R0.setVisibility(0);
            photoViewer.R0.clearAnimation();
            photoViewer.R0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.gr.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.a50(12, photoViewer, z11));
        }
    }

    @Override // org.telegram.ui.Components.l61
    public void b(float f10) {
        gt0 gt0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.B2 != null || ((gt0Var = photoViewer.b0) != null && gt0Var.x)) {
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

    @Override // org.telegram.ui.ActionBar.t0
    public void c() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.h3 && photoViewer.L3) {
            photoViewer.s2();
        }
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void d() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.h3 && photoViewer.L3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.t2);
        }
    }

    @Override // org.telegram.ui.Components.l61
    public void e(float f10) {
        js0 js0Var;
        js0 js0Var2;
        PhotoViewer photoViewer = this.a;
        gt0 gt0Var = photoViewer.b0;
        if (gt0Var != null && gt0Var.x && (js0Var2 = photoViewer.o3) != null) {
            int i9 = photoViewer.m3.h - org.telegram.ui.Components.m61.S;
            js0Var2.J = gt0Var;
            if (js0Var2.S != 0) {
                js0Var2.S = 0L;
                js0Var2.b0 = null;
                js0Var2.a0 = null;
                js0Var2.W = null;
                js0Var2.b(-1);
            }
            if (i9 != 0) {
                js0Var2.r = i9;
                int i10 = ((int) (i9 * f10)) / 5;
                if (js0Var2.n != i10) {
                    js0Var2.n = i10;
                }
            }
            js0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (gt0Var.getVideoDuration() * f10)) / 1000));
            js0Var2.A = (int) Math.ceil(js0Var2.B.measureText(r0));
            js0Var2.invalidate();
            if (js0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(js0Var2.f);
            }
            double videoDuration = (f10 * gt0Var.getVideoDuration()) / 1000.0d;
            js0Var2.K = videoDuration;
            String c10 = gt0Var.c((int) videoDuration);
            if (c10 != null) {
                js0Var2.M.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.B2 != null && (js0Var = photoViewer.o3) != null) {
            js0Var.e(photoViewer.P4, f10, photoViewer.m3.h - org.telegram.ui.Components.m61.S);
        }
        this.a.b3(true);
        PhotoViewer.W(this.a);
    }

    public void f() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.k61 k61Var = photoViewer.B2;
        if (k61Var == null) {
            return;
        }
        k61Var.L((long) (k61Var.q() * photoViewer.r8));
        photoViewer.B2.C();
        photoViewer.N7.setProgress(photoViewer.r8);
        photoViewer.t0();
        zk0 zk0Var = new zk0(this, 19);
        photoViewer.E2 = zk0Var;
        AndroidUtilities.runOnUIThread(zk0Var, 860L);
    }

    @Override // org.telegram.ui.Components.z51
    public void invalidate() {
        this.a.a0.invalidate();
    }
}
