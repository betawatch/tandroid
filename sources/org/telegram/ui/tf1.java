package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf1 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ vf1 a;

    public /* synthetic */ tf1(vf1 vf1Var) {
        this.a = vf1Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        yf1 yf1Var = this.a.a;
        Iterator it = yf1Var.e.iterator();
        while (it.hasNext()) {
            yf1.U(yf1Var, ((Integer) it.next()).intValue());
        }
        yf1Var.e.clear();
        yf1Var.V();
    }
}
