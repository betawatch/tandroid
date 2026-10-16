package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ut0 extends org.telegram.ui.Components.i81 {
    public final /* synthetic */ PhotoViewer m0;

    public ut0(PhotoViewer photoViewer) {
        this.m0 = photoViewer;
    }

    @Override // org.telegram.ui.Components.i81
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

    @Override // org.telegram.ui.Components.i81
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

    @Override // org.telegram.ui.Components.i81
    public final void K(long j10) {
        L(j10, false);
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.r1) {
            PhotoViewer.Z(photoViewer, j10);
        }
        if (photoViewer.O8) {
            return;
        }
        b5.d.D(j10);
    }

    @Override // org.telegram.ui.Components.i81
    public final void Q(float f7) {
        super.Q(f7);
        if (this.m0.O8) {
            return;
        }
        b5.d.z(f7);
    }

    @Override // org.telegram.ui.Components.i81, b2.e1
    public final void onRenderedFirstFrame() {
        b2.a1 h;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.m0;
        boolean z10 = true;
        photoViewer.R = true;
        if (photoViewer.D2) {
            photoViewer.e0.invalidate();
        }
        photoViewer.z3();
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
