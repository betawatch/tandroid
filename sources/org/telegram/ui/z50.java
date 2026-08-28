package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z50 implements org.telegram.ui.Components.n10, org.telegram.ui.ActionBar.b2, r0.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ k60 b;

    public /* synthetic */ z50(k60 k60Var, int i9) {
        this.a = i9;
        this.b = k60Var;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        int i9 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        k60 k60Var = this.b;
        k60Var.i0 = i9;
        gh.h1 h1Var = k60Var.B;
        if (h1Var != null) {
            h1Var.setPadding(0, 0, 0, i9);
        }
        k60Var.i0();
        k60Var.g0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.n10
    public void a(int i9) {
        this.b.b.a(Math.min(i9, r0.Y));
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 1:
                this.b.n0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
