package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x91 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ z91 a;

    public /* synthetic */ x91(z91 z91Var) {
        this.a = z91Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ca1 ca1Var = this.a.a;
        Iterator it = ca1Var.e.iterator();
        while (it.hasNext()) {
            ca1.Z(ca1Var, ((Integer) it.next()).intValue());
        }
        ca1Var.e.clear();
        ca1Var.a0();
    }
}
