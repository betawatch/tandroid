package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class r1 extends org.telegram.ui.Cells.n1 {
    public final /* synthetic */ org.telegram.ui.m0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(org.telegram.ui.m0 m0Var) {
        super(1);
        this.e = m0Var;
    }

    public final void f() {
        invalidateSelf();
        this.e.L.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
