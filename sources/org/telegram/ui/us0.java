package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class us0 extends org.telegram.ui.Components.c10 {
    public final /* synthetic */ cs0 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(PhotoViewer photoViewer, cs0 cs0Var) {
        super(false);
        this.f = photoViewer;
        this.e = cs0Var;
    }

    @Override // org.telegram.ui.Components.ep0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f;
        int[] iArr = photoViewer.m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override // org.telegram.ui.Components.c10
    public final float k() {
        return this.f.q3.c();
    }

    @Override // org.telegram.ui.Components.c10
    public final void l(float f7) {
        this.e.a(f7);
        PhotoViewer photoViewer = this.f;
        photoViewer.q3.h(f7, false);
        photoViewer.r3.invalidate();
    }
}
