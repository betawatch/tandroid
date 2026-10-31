package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u31 implements View.OnClickListener {
    public final /* synthetic */ c41 a;

    public u31(c41 c41Var) {
        this.a = c41Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.ei0 ei0Var = this.a.k1;
        if (ei0Var.b() || ei0Var.getAnimatedDrawable() == null) {
            return;
        }
        ei0Var.getAnimatedDrawable().M(40);
        ei0Var.d();
    }
}
