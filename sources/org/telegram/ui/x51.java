package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class x51 extends eg.s1 {
    public final /* synthetic */ y51 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x51(y51 y51Var, Context context) {
        super(context, 2, null);
        this.J = y51Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        y51 y51Var = this.J;
        if (y51Var.getParent() instanceof View) {
            ((View) y51Var.getParent()).invalidate();
        }
    }
}
