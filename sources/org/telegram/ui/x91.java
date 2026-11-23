package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x91 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ z91 a;

    public /* synthetic */ x91(z91 z91Var) {
        this.a = z91Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ca1 ca1Var = this.a.a;
        Iterator it = ca1Var.e.iterator();
        while (it.hasNext()) {
            ca1.Z(ca1Var, ((Integer) it.next()).intValue());
        }
        ca1Var.e.clear();
        ca1Var.a0();
    }
}
