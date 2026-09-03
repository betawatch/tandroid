package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xs0 extends org.telegram.ui.Components.v00 {
    public final /* synthetic */ es0 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(PhotoViewer photoViewer, es0 es0Var) {
        super(false);
        this.f = photoViewer;
        this.e = es0Var;
    }

    @Override // org.telegram.ui.Components.go0
    public final CharSequence d() {
        StringBuilder sb = new StringBuilder();
        PhotoViewer photoViewer = this.f;
        int[] iArr = photoViewer.j3;
        sb.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb.append(' ');
        sb.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        int[] iArr2 = photoViewer.k3;
        sb3.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb3.append(' ');
        sb3.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2, sb3.toString());
    }

    @Override // org.telegram.ui.Components.v00
    public final float k() {
        return this.f.n3.c();
    }

    @Override // org.telegram.ui.Components.v00
    public final void l(float f10) {
        this.e.b(f10);
        PhotoViewer photoViewer = this.f;
        photoViewer.n3.h(f10, false);
        photoViewer.o3.invalidate();
    }
}
