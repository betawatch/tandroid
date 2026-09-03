package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class s1 extends org.telegram.ui.Cells.m1 {
    public final /* synthetic */ org.telegram.ui.o0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(org.telegram.ui.o0 o0Var) {
        super(1);
        this.e = o0Var;
    }

    public final void f() {
        invalidateSelf();
        this.e.L.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
