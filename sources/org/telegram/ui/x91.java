package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
