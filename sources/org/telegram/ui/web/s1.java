package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class s1 extends org.telegram.ui.Cells.n1 {
    public final /* synthetic */ org.telegram.ui.m0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(org.telegram.ui.m0 m0Var) {
        super(1);
        this.e = m0Var;
    }

    public final void f() {
        invalidateSelf();
        this.e.O.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
