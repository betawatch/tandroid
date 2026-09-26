package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
