package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class qt0 extends org.telegram.ui.Components.h71 {
    public final /* synthetic */ PhotoViewer m0;

    public qt0(PhotoViewer photoViewer) {
        this.m0 = photoViewer;
    }

    @Override // org.telegram.ui.Components.h71
    public final void B() {
        super.B();
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.u4 == 0) {
            PhotoViewer.Y(photoViewer, false);
        }
        if (photoViewer.O8) {
            return;
        }
        b5.d.D(n());
        b5.d.x(false);
    }

    @Override // org.telegram.ui.Components.h71
    public final void C() {
        super.C();
        PhotoViewer photoViewer = this.m0;
        PhotoViewer.Y(photoViewer, true);
        if (photoViewer.O8) {
            return;
        }
        b5.d.D(n());
        b5.d.x(true);
    }

    @Override // org.telegram.ui.Components.h71
    public final void K(long j3) {
        L(j3, false);
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.r1) {
            PhotoViewer.Z(photoViewer, j3);
        }
        if (photoViewer.O8) {
            return;
        }
        b5.d.D(j3);
    }

    @Override // org.telegram.ui.Components.h71
    public final void Q(float f7) {
        super.Q(f7);
        if (this.m0.O8) {
            return;
        }
        b5.d.z(f7);
    }

    @Override // org.telegram.ui.Components.h71, b2.z0
    public final void onRenderedFirstFrame() {
        b2.v0 h;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.m0;
        boolean z10 = true;
        photoViewer.R = true;
        if (photoViewer.D2) {
            photoViewer.e0.invalidate();
        }
        photoViewer.y3();
        if (!b5.d.u() && !photoViewer.r) {
            z10 = false;
        }
        O(z10);
        if (photoViewer.O8) {
            return;
        }
        b5.d.D(n());
        i2.e0 e0Var = this.d;
        float f7 = 1.0f;
        if (e0Var != null && (h = e0Var.h()) != null) {
            f7 = h.a;
        }
        b5.d.z(f7);
    }
}
