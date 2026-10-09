package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class y71 implements View.OnClickListener {
    public final /* synthetic */ h81 a;

    public y71(h81 h81Var) {
        this.a = h81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.fk0 fk0Var = this.a.d;
        if (fk0Var.b() || fk0Var.getAnimatedDrawable() == null) {
            return;
        }
        fk0Var.getAnimatedDrawable().M(40);
        fk0Var.d();
    }
}
