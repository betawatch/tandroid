package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
