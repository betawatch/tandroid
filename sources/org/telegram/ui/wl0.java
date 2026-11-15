package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class wl0 extends v4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cm0 b;

    public wl0(cm0 cm0Var, int i7) {
        this.b = cm0Var;
        this.a = i7;
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        cm0 cm0Var = this.b;
        im0 im0Var = cm0Var.q0;
        cm0Var.h();
        if (cm0Var.L != null) {
            if (cm0Var.K == null || !cm0Var.c()) {
                return;
            }
            cm0Var.K.g(false);
            return;
        }
        di.m8 m8Var = this.a == 1 ? im0Var.c : im0Var.b;
        if (m8Var == null || !cm0Var.c()) {
            return;
        }
        m8Var.a();
    }
}
