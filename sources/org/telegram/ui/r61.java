package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r61 implements View.OnClickListener {
    public final /* synthetic */ a71 a;

    public r61(a71 a71Var) {
        this.a = a71Var;
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
