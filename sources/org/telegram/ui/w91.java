package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w91 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ y91 a;

    public /* synthetic */ w91(y91 y91Var) {
        this.a = y91Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ba1 ba1Var = this.a.a;
        Iterator it = ba1Var.e.iterator();
        while (it.hasNext()) {
            ba1.Z(ba1Var, ((Integer) it.next()).intValue());
        }
        ba1Var.e.clear();
        ba1Var.a0();
    }
}
