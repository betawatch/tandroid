package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ zf1 a;

    public /* synthetic */ xf1(zf1 zf1Var) {
        this.a = zf1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        cg1 cg1Var = this.a.a;
        Iterator it = cg1Var.e.iterator();
        while (it.hasNext()) {
            cg1.U(cg1Var, ((Integer) it.next()).intValue());
        }
        cg1Var.e.clear();
        cg1Var.V();
    }
}
