package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class r1 extends org.telegram.ui.Cells.o1 {
    public final /* synthetic */ org.telegram.ui.n0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(org.telegram.ui.n0 n0Var) {
        super(1);
        this.e = n0Var;
    }

    public final void f() {
        invalidateSelf();
        this.e.O.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
