package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class s61 extends rg.c1 {
    public final /* synthetic */ t61 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s61(t61 t61Var, Context context) {
        super(context, 2, null);
        this.M = t61Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        t61 t61Var = this.M;
        if (t61Var.getParent() instanceof View) {
            ((View) t61Var.getParent()).invalidate();
        }
    }
}
