package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class z51 extends fg.r1 {
    public final /* synthetic */ a61 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z51(a61 a61Var, Context context) {
        super(context, 2, null);
        this.J = a61Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        a61 a61Var = this.J;
        if (a61Var.getParent() instanceof View) {
            ((View) a61Var.getParent()).invalidate();
        }
    }
}
