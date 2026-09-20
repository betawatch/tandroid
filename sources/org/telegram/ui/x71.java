package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class x71 implements View.OnClickListener {
    public final /* synthetic */ g81 a;

    public x71(g81 g81Var) {
        this.a = g81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.kj0 kj0Var = this.a.d;
        if (kj0Var.b() || kj0Var.getAnimatedDrawable() == null) {
            return;
        }
        kj0Var.getAnimatedDrawable().M(40);
        kj0Var.d();
    }
}
