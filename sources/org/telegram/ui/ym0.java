package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ym0 implements org.telegram.ui.Components.uk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ an0 b;

    public /* synthetic */ ym0(an0 an0Var, int i7) {
        this.a = i7;
        this.b = an0Var;
    }

    @Override // org.telegram.ui.Components.uk0
    public void F0(float f10) {
        an0 an0Var = this.b;
        if (f10 != 1.0f || an0Var.n[1].getVisibility() == 0) {
            if (an0Var.w) {
                an0Var.n[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                an0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * an0Var.n[0].getMeasuredWidth()));
            } else {
                an0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f10);
                an0Var.n[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - an0Var.n[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                org.telegram.ui.ActionBar.x4[] x4VarArr = an0Var.n;
                org.telegram.ui.ActionBar.x4 x4Var = x4VarArr[0];
                x4VarArr[0] = x4VarArr[1];
                x4VarArr[1] = x4Var;
                x4Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.uk0
    public void b(int i7, boolean z9) {
        an0 an0Var = this.b;
        if (an0Var.n[0].b == i7) {
            return;
        }
        an0Var.e = i7 == an0Var.h.getFirstTabId();
        org.telegram.ui.ActionBar.x4 x4Var = an0Var.n[1];
        x4Var.b = i7;
        x4Var.setVisibility(0);
        an0Var.o0(true);
        an0Var.w = z9;
        if (i7 == 0) {
            an0Var.c.setSearchFieldHint(org.telegram.messenger.id.M0(2131745764, null));
        } else {
            an0Var.c.setSearchFieldHint(org.telegram.messenger.id.M0(2131745767, null));
        }
    }

    @Override // org.telegram.ui.Components.uk0
    public /* synthetic */ boolean m1(int i7, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.uk0
    public /* synthetic */ void c() {
    }
}
