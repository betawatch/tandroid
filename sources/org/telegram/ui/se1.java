package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ ue1 a;

    public /* synthetic */ se1(ue1 ue1Var) {
        this.a = ue1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        xe1 xe1Var = this.a.a;
        Iterator it = xe1Var.e.iterator();
        while (it.hasNext()) {
            xe1.U(xe1Var, ((Integer) it.next()).intValue());
        }
        xe1Var.e.clear();
        xe1Var.V();
    }
}
