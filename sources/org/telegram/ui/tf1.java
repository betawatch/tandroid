package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf1 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ vf1 a;

    public /* synthetic */ tf1(vf1 vf1Var) {
        this.a = vf1Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        yf1 yf1Var = this.a.a;
        Iterator it = yf1Var.e.iterator();
        while (it.hasNext()) {
            yf1.U(yf1Var, ((Integer) it.next()).intValue());
        }
        yf1Var.e.clear();
        yf1Var.V();
    }
}
