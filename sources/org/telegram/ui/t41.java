package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
