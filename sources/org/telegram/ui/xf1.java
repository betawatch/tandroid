package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ zf1 a;

    public /* synthetic */ xf1(zf1 zf1Var) {
        this.a = zf1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        cg1 cg1Var = this.a.a;
        Iterator it = cg1Var.e.iterator();
        while (it.hasNext()) {
            cg1.S(cg1Var, ((Integer) it.next()).intValue());
        }
        cg1Var.e.clear();
        cg1Var.T();
    }
}
