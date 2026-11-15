package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zm0 implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn0 b;

    public /* synthetic */ zm0(bn0 bn0Var, int i7) {
        this.a = i7;
        this.b = bn0Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public void D0(float f10) {
        bn0 bn0Var = this.b;
        if (f10 != 1.0f || bn0Var.n[1].getVisibility() == 0) {
            if (bn0Var.w) {
                bn0Var.n[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                bn0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * bn0Var.n[0].getMeasuredWidth()));
            } else {
                bn0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f10);
                bn0Var.n[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - bn0Var.n[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                org.telegram.ui.ActionBar.v4[] v4VarArr = bn0Var.n;
                org.telegram.ui.ActionBar.v4 v4Var = v4VarArr[0];
                v4VarArr[0] = v4VarArr[1];
                v4VarArr[1] = v4Var;
                v4Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.zk0
    public void b(int i7, boolean z10) {
        bn0 bn0Var = this.b;
        if (bn0Var.n[0].b == i7) {
            return;
        }
        bn0Var.e = i7 == bn0Var.h.getFirstTabId();
        org.telegram.ui.ActionBar.v4 v4Var = bn0Var.n[1];
        v4Var.b = i7;
        v4Var.setVisibility(0);
        bn0Var.o0(true);
        bn0Var.w = z10;
        if (i7 == 0) {
            bn0Var.c.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745761, null));
        } else {
            bn0Var.c.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745764, null));
        }
    }

    @Override // org.telegram.ui.Components.zk0
    public /* synthetic */ boolean j1(int i7, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.zk0
    public /* synthetic */ void D() {
    }
}
