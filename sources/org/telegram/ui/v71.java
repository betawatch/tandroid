package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v71 implements View.OnClickListener {
    public final /* synthetic */ e81 a;

    public v71(e81 e81Var) {
        this.a = e81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.aj0 aj0Var = this.a.d;
        if (aj0Var.b() || aj0Var.getAnimatedDrawable() == null) {
            return;
        }
        aj0Var.getAnimatedDrawable().M(40);
        aj0Var.d();
    }
}
