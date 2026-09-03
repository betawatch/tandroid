package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
