package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze1 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ bf1 a;

    public /* synthetic */ ze1(bf1 bf1Var) {
        this.a = bf1Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ef1 ef1Var = this.a.a;
        Iterator it = ef1Var.e.iterator();
        while (it.hasNext()) {
            ef1.U(ef1Var, ((Integer) it.next()).intValue());
        }
        ef1Var.e.clear();
        ef1Var.V();
    }
}
