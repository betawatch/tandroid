package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class u41 extends org.telegram.ui.Components.e81 {
    public final /* synthetic */ SecretMediaViewer m0;

    public u41(SecretMediaViewer secretMediaViewer) {
        this.m0 = secretMediaViewer;
    }

    @Override // org.telegram.ui.Components.e81
    public final void B() {
        super.B();
        this.m0.W.a(false, true);
    }

    @Override // org.telegram.ui.Components.e81
    public final void C() {
        super.C();
        this.m0.W.a(true, true);
    }

    @Override // org.telegram.ui.Components.e81
    public final void P(boolean z10) {
        super.P(z10);
        this.m0.W.a(z10, true);
    }
}
