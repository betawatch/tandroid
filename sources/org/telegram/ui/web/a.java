package org.telegram.ui.web;

import java.io.Serializable;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.o20;
import org.telegram.ui.Components.a51;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.u1, o20 {
    public final /* synthetic */ j a;

    public /* synthetic */ a(j jVar) {
        this.a = jVar;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        j jVar = this.a;
        jVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        jVar.x.f3.O(true);
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.p pVar;
        a51 a51Var = (a51) obj;
        boolean H = a51Var.H(c.class);
        j jVar = this.a;
        if (H) {
            String charSequence = a51Var.l.toString();
            org.telegram.ui.w wVar = jVar.L;
            if (wVar != null) {
                wVar.a(charSequence);
                return;
            }
            return;
        }
        if (!a51Var.H(f.class) || (pVar = jVar.N) == null) {
            return;
        }
        try {
            pVar.a(j.a((jj) a51Var.H));
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
