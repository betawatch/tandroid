package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class r61 extends rg.b1 {
    public final /* synthetic */ s61 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r61(s61 s61Var, Context context) {
        super(context, 2, null);
        this.M = s61Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        s61 s61Var = this.M;
        if (s61Var.getParent() instanceof View) {
            ((View) s61Var.getParent()).invalidate();
        }
    }
}
