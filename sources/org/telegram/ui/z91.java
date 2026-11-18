package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z91 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ ba1 a;

    public /* synthetic */ z91(ba1 ba1Var) {
        this.a = ba1Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ea1 ea1Var = this.a.a;
        Iterator it = ea1Var.e.iterator();
        while (it.hasNext()) {
            ea1.Z(ea1Var, ((Integer) it.next()).intValue());
        }
        ea1Var.e.clear();
        ea1Var.a0();
    }
}
