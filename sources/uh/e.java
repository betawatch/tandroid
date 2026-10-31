package uh;

import android.content.Context;
import org.telegram.ui.Components.dw0;
import th.x4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e extends h {
    public final /* synthetic */ i w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Context context) {
        super(iVar, context);
        this.w = iVar;
    }

    @Override // uh.h, s4.g0
    public final void f() {
        super.f();
        i iVar = this.w;
        if (iVar.r.getVisibility() == 0) {
            iVar.x.f();
        }
        dw0 dw0Var = iVar.D;
        if (dw0Var != null) {
            x4 x4Var = this.e;
            dw0Var.e(x4Var != null && x4Var.k(), true);
        }
    }
}
