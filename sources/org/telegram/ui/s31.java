package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s31 implements View.OnClickListener {
    public final /* synthetic */ a41 a;

    public s31(a41 a41Var) {
        this.a = a41Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.fi0 fi0Var = this.a.k1;
        if (fi0Var.b() || fi0Var.getAnimatedDrawable() == null) {
            return;
        }
        fi0Var.getAnimatedDrawable().M(40);
        fi0Var.d();
    }
}
