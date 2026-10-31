package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uq0 extends org.telegram.ui.Components.u61 {
    public final /* synthetic */ int m0;
    public final /* synthetic */ org.telegram.messenger.us n0;

    public /* synthetic */ uq0(org.telegram.messenger.us usVar, int i10) {
        this.m0 = i10;
        this.n0 = usVar;
    }

    @Override // org.telegram.ui.Components.u61
    public final void g0() {
        switch (this.m0) {
            case 0:
                super.g0();
                PhotoViewer photoViewer = (PhotoViewer) this.n0;
                if (photoViewer.u4 == 0) {
                    PhotoViewer.Z(photoViewer, false);
                }
                if (!photoViewer.O8) {
                    b5.d.D(S());
                    b5.d.x(false);
                    break;
                }
                break;
            default:
                super.g0();
                ((SecretMediaViewer) this.n0).U.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.u61
    public final void h0() {
        switch (this.m0) {
            case 0:
                super.h0();
                PhotoViewer photoViewer = (PhotoViewer) this.n0;
                PhotoViewer.Z(photoViewer, true);
                if (!photoViewer.O8) {
                    b5.d.D(S());
                    b5.d.x(true);
                    break;
                }
                break;
            default:
                super.h0();
                ((SecretMediaViewer) this.n0).U.a(true, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.u61, b2.d1
    public void onRenderedFirstFrame() {
        b2.z0 g10;
        switch (this.m0) {
            case 0:
                super.onRenderedFirstFrame();
                PhotoViewer photoViewer = (PhotoViewer) this.n0;
                boolean z10 = true;
                photoViewer.R = true;
                if (photoViewer.D2) {
                    photoViewer.e0.invalidate();
                }
                photoViewer.C3();
                if (!b5.d.u() && !photoViewer.r) {
                    z10 = false;
                }
                t0(z10);
                if (!photoViewer.O8) {
                    b5.d.D(S());
                    i2.i0 i0Var = this.d;
                    float f7 = 1.0f;
                    if (i0Var != null && (g10 = i0Var.g()) != null) {
                        f7 = g10.a;
                    }
                    b5.d.z(f7);
                    break;
                }
                break;
            default:
                super.onRenderedFirstFrame();
                break;
        }
    }

    @Override // org.telegram.ui.Components.u61
    public void p0(long j10) {
        switch (this.m0) {
            case 0:
                q0(j10, false);
                PhotoViewer photoViewer = (PhotoViewer) this.n0;
                if (photoViewer.r1) {
                    PhotoViewer.a0(photoViewer, j10);
                }
                if (!photoViewer.O8) {
                    b5.d.D(j10);
                    break;
                }
                break;
            default:
                super.p0(j10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.u61
    public void u0(boolean z10) {
        switch (this.m0) {
            case 1:
                super.u0(z10);
                ((SecretMediaViewer) this.n0).U.a(z10, true);
                break;
            default:
                super.u0(z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.u61
    public void v0(float f7) {
        switch (this.m0) {
            case 0:
                super.v0(f7);
                if (!((PhotoViewer) this.n0).O8) {
                    b5.d.z(f7);
                    break;
                }
                break;
            default:
                super.v0(f7);
                break;
        }
    }
}
