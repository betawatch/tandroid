package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class r61 extends rg.b1 {
    public final /* synthetic */ s61 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r61(s61 s61Var, Context context) {
        super(context, 2, null);
        this.M = s61Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        s61 s61Var = this.M;
        if (s61Var.getParent() instanceof View) {
            ((View) s61Var.getParent()).invalidate();
        }
    }
}
