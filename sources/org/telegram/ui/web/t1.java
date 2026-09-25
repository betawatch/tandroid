package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class t1 extends org.telegram.ui.Cells.o1 {
    public final /* synthetic */ org.telegram.ui.l0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(org.telegram.ui.l0 l0Var) {
        super(1);
        this.e = l0Var;
    }

    public final void f() {
        invalidateSelf();
        this.e.O.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
