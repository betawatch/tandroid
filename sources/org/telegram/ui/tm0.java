package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tm0 implements org.telegram.ui.Components.yk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm0 b;

    public /* synthetic */ tm0(vm0 vm0Var, int i3) {
        this.a = i3;
        this.b = vm0Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public void F0(float f10) {
        vm0 vm0Var = this.b;
        if (f10 != 1.0f || vm0Var.n[1].getVisibility() == 0) {
            if (vm0Var.w) {
                vm0Var.n[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                vm0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * vm0Var.n[0].getMeasuredWidth()));
            } else {
                vm0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f10);
                vm0Var.n[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - vm0Var.n[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                org.telegram.ui.ActionBar.x4[] x4VarArr = vm0Var.n;
                org.telegram.ui.ActionBar.x4 x4Var = x4VarArr[0];
                x4VarArr[0] = x4VarArr[1];
                x4VarArr[1] = x4Var;
                x4Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.yk0
    public void f(int i3, boolean z10) {
        vm0 vm0Var = this.b;
        if (vm0Var.n[0].b == i3) {
            return;
        }
        vm0Var.e = i3 == vm0Var.h.getFirstTabId();
        org.telegram.ui.ActionBar.x4 x4Var = vm0Var.n[1];
        x4Var.b = i3;
        x4Var.setVisibility(0);
        vm0Var.o0(true);
        vm0Var.w = z10;
        if (i3 == 0) {
            vm0Var.c.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745771, null));
        } else {
            vm0Var.c.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745774, null));
        }
    }

    @Override // org.telegram.ui.Components.yk0
    public /* synthetic */ boolean k1(int i3, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.yk0
    public /* synthetic */ void A() {
    }
}
