package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qo0 extends f2.b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo0 b;

    public qo0(vo0 vo0Var, int i10) {
        this.b = vo0Var;
        this.a = i10;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        vo0 vo0Var = this.b;
        ap0 ap0Var = vo0Var.f0;
        if (vo0Var.B != null) {
            if (vo0Var.A == null || !vo0Var.c()) {
                return;
            }
            vo0Var.A.g(false);
            return;
        }
        hh.m7 m7Var = this.a == 1 ? ap0Var.c : ap0Var.b;
        if (m7Var == null || !vo0Var.c()) {
            return;
        }
        m7Var.a();
    }
}
