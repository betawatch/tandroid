package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
