package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf1 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ zf1 a;

    public /* synthetic */ xf1(zf1 zf1Var) {
        this.a = zf1Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        cg1 cg1Var = this.a.a;
        Iterator it = cg1Var.e.iterator();
        while (it.hasNext()) {
            cg1.U(cg1Var, ((Integer) it.next()).intValue());
        }
        cg1Var.e.clear();
        cg1Var.V();
    }
}
