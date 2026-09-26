package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class t41 extends org.telegram.ui.Components.s71 {
    public final /* synthetic */ SecretMediaViewer m0;

    public t41(SecretMediaViewer secretMediaViewer) {
        this.m0 = secretMediaViewer;
    }

    @Override // org.telegram.ui.Components.s71
    public final void B() {
        super.B();
        this.m0.W.a(false, true);
    }

    @Override // org.telegram.ui.Components.s71
    public final void C() {
        super.C();
        this.m0.W.a(true, true);
    }

    @Override // org.telegram.ui.Components.s71
    public final void P(boolean z10) {
        super.P(z10);
        this.m0.W.a(z10, true);
    }
}
