package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z01 extends ug.b1 {
    public final /* synthetic */ a11 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z01(a11 a11Var, Context context) {
        super(2, context, null);
        this.N = a11Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        a11 a11Var = this.N;
        if (a11Var.getParent() instanceof View) {
            ((View) a11Var.getParent()).invalidate();
        }
    }
}
