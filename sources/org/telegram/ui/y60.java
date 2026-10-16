package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y60 implements org.telegram.ui.Components.p20, org.telegram.ui.ActionBar.z1, r0.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ j70 b;

    public /* synthetic */ y60(j70 j70Var, int i10) {
        this.a = i10;
        this.b = j70Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        j70 j70Var = this.b;
        j70Var.m0 = i10;
        bi.i7 i7Var = j70Var.F;
        if (i7Var != null) {
            i7Var.setPadding(0, 0, 0, i10);
        }
        j70Var.j0();
        j70Var.h0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.p20
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.c0));
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
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
