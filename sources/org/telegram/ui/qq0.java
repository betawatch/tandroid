package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qq0 extends org.telegram.ui.Components.a00 {
    public final /* synthetic */ zp0 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq0(PhotoViewer photoViewer, zp0 zp0Var) {
        super(false);
        this.f = photoViewer;
        this.e = zp0Var;
    }

    @Override // org.telegram.ui.Components.mn0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f;
        int[] iArr = photoViewer.m3;
        sb2.append(org.telegram.messenger.dd.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.dd.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.n3;
        sb4.append(org.telegram.messenger.dd.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.dd.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.dd.a0("AccDescrPlayerDuration", null, 2131754806, sb3, sb4.toString());
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
