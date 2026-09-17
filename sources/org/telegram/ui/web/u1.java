package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class u1 extends org.telegram.ui.Cells.n1 {
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
