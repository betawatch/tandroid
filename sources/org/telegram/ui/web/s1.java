package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class s1 extends org.telegram.ui.Cells.o1 {
    public final /* synthetic */ org.telegram.ui.n0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(org.telegram.ui.n0 n0Var) {
        super(1);
        this.e = n0Var;
    }

    public final void f() {
        invalidateSelf();
        this.e.O.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
