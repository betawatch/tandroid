package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class t61 extends qg.e1 {
    public final /* synthetic */ u61 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t61(u61 u61Var, Context context) {
        super(context, 2, null);
        this.M = u61Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        u61 u61Var = this.M;
        if (u61Var.getParent() instanceof View) {
            ((View) u61Var.getParent()).invalidate();
        }
    }
}
