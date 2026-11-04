package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zo0 extends org.telegram.ui.Components.jz {
    public final /* synthetic */ io0 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo0(PhotoViewer photoViewer, io0 io0Var) {
        super(false);
        this.f = photoViewer;
        this.e = io0Var;
    }

    @Override // org.telegram.ui.Components.nm0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f;
        int[] iArr = photoViewer.n3;
        sb2.append(org.telegram.messenger.bd.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.bd.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.o3;
        sb4.append(org.telegram.messenger.bd.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.bd.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.bd.a0("AccDescrPlayerDuration", null, 2131754806, sb3, sb4.toString());
    }

    @Override // org.telegram.ui.Components.jz
    public final float k() {
        return this.f.r3.c();
    }

    @Override // org.telegram.ui.Components.jz
    public final void l(float f10) {
        this.e.c(f10);
        PhotoViewer photoViewer = this.f;
        photoViewer.r3.h(false, f10);
        photoViewer.s3.invalidate();
    }
}
