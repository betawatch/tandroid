package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ss0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.v61, org.telegram.ui.Components.h71, org.telegram.ui.Components.te0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ ss0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            photoViewer.V0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.pr.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.mr0(8, photoViewer, z11));
        }
    }

    @Override // org.telegram.ui.Components.h71
    public void b(float f7) {
        hu0 hu0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((hu0Var = photoViewer.f0) != null && hu0Var.x)) {
            if (!photoViewer.A8 && photoViewer.Q7.getVisibility() == 0) {
                f7 = ((photoViewer.R7.getRightProgress() - photoViewer.R7.getLeftProgress()) * f7) + photoViewer.R7.getLeftProgress();
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

    @Override // org.telegram.ui.Components.h71
    public void c(float f7) {
        lt0 lt0Var;
        lt0 lt0Var2;
        PhotoViewer photoViewer = this.a;
        hu0 hu0Var = photoViewer.f0;
        if (hu0Var != null && hu0Var.x && (lt0Var2 = photoViewer.s3) != null) {
            int i10 = photoViewer.q3.h - org.telegram.ui.Components.i71.S;
            lt0Var2.N = hu0Var;
            if (lt0Var2.W != 0) {
                lt0Var2.W = 0L;
                lt0Var2.f0 = null;
                lt0Var2.e0 = null;
                lt0Var2.d0 = null;
                lt0Var2.b(-1);
            }
            if (i10 != 0) {
                lt0Var2.r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (lt0Var2.n != i11) {
                    lt0Var2.n = i11;
                }
            }
            lt0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (hu0Var.getVideoDuration() * f7)) / 1000));
            lt0Var2.E = (int) Math.ceil(lt0Var2.F.measureText(r0));
            lt0Var2.invalidate();
            if (lt0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(lt0Var2.f);
            }
            double videoDuration = (f7 * hu0Var.getVideoDuration()) / 1000.0d;
            lt0Var2.O = videoDuration;
            String c10 = hu0Var.c((int) videoDuration);
            if (c10 != null) {
                lt0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (lt0Var = photoViewer.s3) != null) {
            lt0Var.e(photoViewer.T4, f7, photoViewer.q3.h - org.telegram.ui.Components.i71.S);
        }
        this.a.b3(true);
        PhotoViewer.X(this.a);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void d() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.s2();
        }
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
        org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
        if (g71Var == null) {
            return;
        }
        g71Var.K((long) (g71Var.p() * photoViewer.v8));
        photoViewer.F2.B();
        photoViewer.R7.setProgress(photoViewer.v8);
        photoViewer.u0();
        rl0 rl0Var = new rl0(this, 18);
        photoViewer.I2 = rl0Var;
        AndroidUtilities.runOnUIThread(rl0Var, 860L);
    }

    @Override // org.telegram.ui.Components.v61
    public void invalidate() {
        this.a.e0.invalidate();
    }
}
