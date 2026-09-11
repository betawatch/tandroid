package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class u60 implements org.telegram.ui.Components.c20, org.telegram.ui.ActionBar.a2, r0.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ f70 b;

    public /* synthetic */ u60(f70 f70Var, int i10) {
        this.a = i10;
        this.b = f70Var;
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        f70 f70Var = this.b;
        f70Var.m0 = i10;
        bi.e7 e7Var = f70Var.F;
        if (e7Var != null) {
            e7Var.setPadding(0, 0, 0, i10);
        }
        f70Var.j0();
        f70Var.h0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.c20
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.c0));
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
