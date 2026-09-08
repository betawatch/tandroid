package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class x71 implements View.OnClickListener {
    public final /* synthetic */ g81 a;

    public x71(g81 g81Var) {
        this.a = g81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.aj0 aj0Var = this.a.d;
        if (aj0Var.b() || aj0Var.getAnimatedDrawable() == null) {
            return;
        }
        aj0Var.getAnimatedDrawable().K(40);
        aj0Var.d();
    }
}
