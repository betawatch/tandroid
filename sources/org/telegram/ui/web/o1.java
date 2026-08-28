package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o1 extends org.telegram.ui.Cells.n1 {
    public final /* synthetic */ org.telegram.ui.n0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(org.telegram.ui.n0 n0Var) {
        super(1);
        this.e = n0Var;
    }

    public final void f() {
        invalidateSelf();
        this.e.K.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
