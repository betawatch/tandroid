package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class u71 implements View.OnClickListener {
    public final /* synthetic */ d81 a;

    public u71(d81 d81Var) {
        this.a = d81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.lj0 lj0Var = this.a.d;
        if (lj0Var.b() || lj0Var.getAnimatedDrawable() == null) {
            return;
        }
        lj0Var.getAnimatedDrawable().M(40);
        lj0Var.d();
    }
}
