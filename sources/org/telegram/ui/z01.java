package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class z01 extends ug.z0 {
    public final /* synthetic */ a11 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z01(a11 a11Var, Context context) {
        super(2, context, null);
        this.M = a11Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        a11 a11Var = this.M;
        if (a11Var.getParent() instanceof View) {
            ((View) a11Var.getParent()).invalidate();
        }
    }
}
