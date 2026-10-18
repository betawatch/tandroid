package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
