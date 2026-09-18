package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class w71 implements View.OnClickListener {
    public final /* synthetic */ f81 a;

    public w71(f81 f81Var) {
        this.a = f81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.bj0 bj0Var = this.a.d;
        if (bj0Var.b() || bj0Var.getAnimatedDrawable() == null) {
            return;
        }
        bj0Var.getAnimatedDrawable().M(40);
        bj0Var.d();
    }
}
