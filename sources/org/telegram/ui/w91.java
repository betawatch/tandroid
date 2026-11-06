package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w91 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ y91 a;

    public /* synthetic */ w91(y91 y91Var) {
        this.a = y91Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ba1 ba1Var = this.a.a;
        Iterator it = ba1Var.e.iterator();
        while (it.hasNext()) {
            ba1.Z(ba1Var, ((Integer) it.next()).intValue());
        }
        ba1Var.e.clear();
        ba1Var.a0();
    }
}
