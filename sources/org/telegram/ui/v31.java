package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v31 extends org.telegram.ui.Components.k61 {
    public final /* synthetic */ SecretMediaViewer i0;

    public v31(SecretMediaViewer secretMediaViewer) {
        this.i0 = secretMediaViewer;
    }

    @Override // org.telegram.ui.Components.k61
    public final void C() {
        super.C();
        this.i0.S.a(false, true);
    }

    @Override // org.telegram.ui.Components.k61
    public final void D() {
        super.D();
        this.i0.S.a(true, true);
    }

    @Override // org.telegram.ui.Components.k61
    public final void Q(boolean z10) {
        super.Q(z10);
        this.i0.S.a(z10, true);
    }
}
