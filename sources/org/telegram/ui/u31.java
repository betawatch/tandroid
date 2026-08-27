package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u31 extends org.telegram.ui.Components.m61 {
    public final /* synthetic */ SecretMediaViewer i0;

    public u31(SecretMediaViewer secretMediaViewer) {
        this.i0 = secretMediaViewer;
    }

    @Override // org.telegram.ui.Components.m61
    public final void C() {
        super.C();
        this.i0.S.a(false, true);
    }

    @Override // org.telegram.ui.Components.m61
    public final void D() {
        super.D();
        this.i0.S.a(true, true);
    }

    @Override // org.telegram.ui.Components.m61
    public final void Q(boolean z10) {
        super.Q(z10);
        this.i0.S.a(z10, true);
    }
}
