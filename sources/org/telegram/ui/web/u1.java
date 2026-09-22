package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class u1 extends org.telegram.ui.Cells.o1 {
    public final /* synthetic */ org.telegram.ui.k0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(org.telegram.ui.k0 k0Var) {
        super(1);
        this.e = k0Var;
    }

    public final void f() {
        invalidateSelf();
        this.e.O.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
