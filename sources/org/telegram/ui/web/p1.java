package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class p1 extends org.telegram.ui.Cells.m1 {
    public final /* synthetic */ org.telegram.ui.o0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(org.telegram.ui.o0 o0Var) {
        super(1);
        this.e = o0Var;
    }

    public final void f() {
        invalidateSelf();
        this.e.K.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
