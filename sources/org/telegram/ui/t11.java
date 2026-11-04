package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t11 implements View.OnClickListener {
    public final /* synthetic */ b21 a;

    public t11(b21 b21Var) {
        this.a = b21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.fh0 fh0Var = this.a.l1;
        if (fh0Var.b() || fh0Var.getAnimatedDrawable() == null) {
            return;
        }
        fh0Var.getAnimatedDrawable().M(40);
        fh0Var.d();
    }
}
