package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
