package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ we1 a;

    public /* synthetic */ ue1(we1 we1Var) {
        this.a = we1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ze1 ze1Var = this.a.a;
        Iterator it = ze1Var.e.iterator();
        while (it.hasNext()) {
            ze1.U(ze1Var, ((Integer) it.next()).intValue());
        }
        ze1Var.e.clear();
        ze1Var.V();
    }
}
