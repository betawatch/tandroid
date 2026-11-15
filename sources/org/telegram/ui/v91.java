package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v91 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ x91 a;

    public /* synthetic */ v91(x91 x91Var) {
        this.a = x91Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        aa1 aa1Var = this.a.a;
        Iterator it = aa1Var.e.iterator();
        while (it.hasNext()) {
            aa1.Z(aa1Var, ((Integer) it.next()).intValue());
        }
        aa1Var.e.clear();
        aa1Var.a0();
    }
}
