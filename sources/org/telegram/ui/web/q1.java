package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class q1 extends org.telegram.ui.Cells.n1 {
    public final /* synthetic */ org.telegram.ui.m0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(org.telegram.ui.m0 m0Var) {
        super(1);
        this.e = m0Var;
    }

    public final void f() {
        invalidateSelf();
        this.e.L.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
