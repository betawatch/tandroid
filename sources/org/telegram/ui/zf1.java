package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class zf1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ bg1 a;

    public /* synthetic */ zf1(bg1 bg1Var) {
        this.a = bg1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        eg1 eg1Var = this.a.a;
        Iterator it = eg1Var.e.iterator();
        while (it.hasNext()) {
            eg1.S(eg1Var, ((Integer) it.next()).intValue());
        }
        eg1Var.e.clear();
        eg1Var.T();
    }
}
