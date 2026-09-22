package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class t1 extends org.telegram.ui.Cells.n1 {
    public final /* synthetic */ org.telegram.ui.k0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(org.telegram.ui.k0 k0Var) {
        super(1);
        this.e = k0Var;
    }

    public final void f() {
        invalidateSelf();
        this.e.O.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
