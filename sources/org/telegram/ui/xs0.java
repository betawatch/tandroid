package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class xs0 extends org.telegram.ui.Components.j81 {
    public final /* synthetic */ PhotoViewer m0;

    public xs0(PhotoViewer photoViewer) {
        this.m0 = photoViewer;
    }

    @Override // org.telegram.ui.Components.j81
    public final void B() {
        super.B();
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.u4 == 0) {
            PhotoViewer.Z(photoViewer, false);
        }
        if (photoViewer.O8) {
            return;
        }
        b5.d.D(n());
        b5.d.x(false);
    }

    @Override // org.telegram.ui.Components.j81
    public final void C() {
        super.C();
        PhotoViewer photoViewer = this.m0;
        PhotoViewer.Z(photoViewer, true);
        if (photoViewer.O8) {
            return;
        }
        b5.d.D(n());
        b5.d.x(true);
    }

    @Override // org.telegram.ui.Components.j81
    public final void K(long j10) {
        L(j10, false);
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.r1) {
            PhotoViewer.a0(photoViewer, j10);
        }
        if (photoViewer.O8) {
            return;
        }
        b5.d.D(j10);
    }

    @Override // org.telegram.ui.Components.j81
    public final void Q(float f7) {
        super.Q(f7);
        if (this.m0.O8) {
            return;
        }
        b5.d.z(f7);
    }

    @Override // org.telegram.ui.Components.j81, b2.d1
    public final void onRenderedFirstFrame() {
        b2.z0 h;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.m0;
        boolean z10 = true;
        photoViewer.R = true;
        if (photoViewer.D2) {
            photoViewer.e0.invalidate();
        }
        photoViewer.B3();
        if (!b5.d.u() && !photoViewer.r) {
            z10 = false;
        }
        O(z10);
        if (photoViewer.O8) {
            return;
        }
        b5.d.D(n());
        i2.h0 h0Var = this.d;
        float f7 = 1.0f;
        if (h0Var != null && (h = h0Var.h()) != null) {
            f7 = h.a;
        }
        b5.d.z(f7);
    }
}
