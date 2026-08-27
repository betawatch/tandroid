package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ ze1 a;

    public /* synthetic */ xe1(ze1 ze1Var) {
        this.a = ze1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        cf1 cf1Var = this.a.a;
        Iterator it = cf1Var.e.iterator();
        while (it.hasNext()) {
            cf1.U(cf1Var, ((Integer) it.next()).intValue());
        }
        cf1Var.e.clear();
        cf1Var.V();
    }
}
