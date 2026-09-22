package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class x71 implements View.OnClickListener {
    public final /* synthetic */ g81 a;

    public x71(g81 g81Var) {
        this.a = g81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.nj0 nj0Var = this.a.d;
        if (nj0Var.b() || nj0Var.getAnimatedDrawable() == null) {
            return;
        }
        nj0Var.getAnimatedDrawable().M(40);
        nj0Var.d();
    }
}
