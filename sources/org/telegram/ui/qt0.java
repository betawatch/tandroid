package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qt0 implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.o20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rt0 b;

    public /* synthetic */ qt0(rt0 rt0Var, int i10) {
        this.a = i10;
        this.b = rt0Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.c0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        if (((org.telegram.ui.Components.a51) obj).d == 1) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            boolean z10 = !t8Var.e.h;
            rt0 rt0Var = this.b;
            rt0Var.n = z10;
            t8Var.setChecked(z10);
            rt0Var.d.f3.O(true);
            rt0Var.Z(true);
        }
    }
}
