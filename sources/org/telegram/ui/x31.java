package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class x31 extends org.telegram.ui.Components.x61 {
    public final /* synthetic */ SecretMediaViewer i0;

    public x31(SecretMediaViewer secretMediaViewer) {
        this.i0 = secretMediaViewer;
    }

    @Override // org.telegram.ui.Components.x61
    public final void C() {
        super.C();
        this.i0.S.a(false, true);
    }

    @Override // org.telegram.ui.Components.x61
    public final void D() {
        super.D();
        this.i0.S.a(true, true);
    }

    @Override // org.telegram.ui.Components.x61
    public final void Q(boolean z10) {
        super.Q(z10);
        this.i0.S.a(z10, true);
    }
}
