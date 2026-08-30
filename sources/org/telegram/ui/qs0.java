package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qs0 extends org.telegram.ui.Components.u00 {
    public final /* synthetic */ xr0 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs0(PhotoViewer photoViewer, xr0 xr0Var) {
        super(false);
        this.f = photoViewer;
        this.e = xr0Var;
    }

    @Override // org.telegram.ui.Components.ho0
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

    @Override // org.telegram.ui.Components.u00
    public final float k() {
        return this.f.n3.c();
    }

    @Override // org.telegram.ui.Components.u00
    public final void l(float f10) {
        this.e.b(f10);
        PhotoViewer photoViewer = this.f;
        photoViewer.n3.h(f10, false);
        photoViewer.o3.invalidate();
    }
}
