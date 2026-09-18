package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v60 implements org.telegram.ui.Components.c20, org.telegram.ui.ActionBar.b2, r0.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ g70 b;

    public /* synthetic */ v60(g70 g70Var, int i10) {
        this.a = i10;
        this.b = g70Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        g70 g70Var = this.b;
        g70Var.m0 = i10;
        ai.v7 v7Var = g70Var.F;
        if (v7Var != null) {
            v7Var.setPadding(0, 0, 0, i10);
        }
        g70Var.j0();
        g70Var.h0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.c20
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.c0));
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
