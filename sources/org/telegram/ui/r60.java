package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r60 implements org.telegram.ui.Components.t20, org.telegram.ui.ActionBar.a2, r0.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ c70 b;

    public /* synthetic */ r60(c70 c70Var, int i10) {
        this.a = i10;
        this.b = c70Var;
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        c70 c70Var = this.b;
        c70Var.m0 = i10;
        ai.x7 x7Var = c70Var.F;
        if (x7Var != null) {
            x7Var.setPadding(0, 0, 0, i10);
        }
        c70Var.j0();
        c70Var.h0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.t20
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.c0));
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.o0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
