package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
