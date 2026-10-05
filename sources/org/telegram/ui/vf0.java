package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class vf0 extends org.telegram.ui.Components.voip.o2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.rw0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf0(xf0 xf0Var, Context context, int i10) {
        super(xf0Var.s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = xf0Var;
                super(xf0Var.s0, context);
                break;
            default:
                this.f = xf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.o2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((xf0) this.f).i0;
            case 1:
                return ((xf0) this.f).i0;
            default:
                return ((ve0) this.f).M;
        }
    }

    @Override // org.telegram.ui.Components.voip.o2
    public final boolean b() {
        vf0 vf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    xf0 xf0Var = (xf0) this.f;
                    if (xf0Var.V <= 0 || xf0Var.R == null) {
                    }
                }
                break;
            case 1:
                xf0 xf0Var2 = (xf0) this.f;
                if (!isClickable() || getVisibility() != 0 || xf0Var2.d0 || (((vf0Var = xf0Var2.v) != null && vf0Var.getVisibility() != 8) || xf0Var2.i0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    ve0 ve0Var = (ve0) this.f;
                    if (ve0Var.P <= 0 || ve0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf0(ve0 ve0Var, Context context) {
        super(ve0Var.a0, context);
        this.e = 2;
        this.f = ve0Var;
    }
}
