package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sq0 extends org.telegram.ui.Components.a00 {
    public final /* synthetic */ bq0 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq0(PhotoViewer photoViewer, bq0 bq0Var) {
        super(false);
        this.f = photoViewer;
        this.e = bq0Var;
    }

    @Override // org.telegram.ui.Components.ln0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f;
        int[] iArr = photoViewer.m3;
        sb2.append(org.telegram.messenger.cd.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.cd.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.n3;
        sb4.append(org.telegram.messenger.cd.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.cd.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.cd.a0("AccDescrPlayerDuration", null, 2131754806, sb3, sb4.toString());
    }

    @Override // org.telegram.ui.Components.a00
    public final float k() {
        return this.f.q3.c();
    }

    @Override // org.telegram.ui.Components.a00
    public final void l(float f7) {
        this.e.c(f7);
        PhotoViewer photoViewer = this.f;
        photoViewer.q3.h(false, f7);
        photoViewer.r3.invalidate();
    }
}
