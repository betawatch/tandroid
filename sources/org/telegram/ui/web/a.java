package org.telegram.ui.web;

import java.io.Serializable;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.q1, u10 {
    public final /* synthetic */ k a;

    public /* synthetic */ a(k kVar) {
        this.a = kVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        k kVar = this.a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.x.g3.O(true);
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.q qVar;
        n41 n41Var = (n41) obj;
        boolean H = n41Var.H(d.class);
        k kVar = this.a;
        if (H) {
            String charSequence = n41Var.m.toString();
            org.telegram.ui.x xVar = kVar.M;
            if (xVar != null) {
                xVar.a(charSequence);
                return;
            }
            return;
        }
        if (!n41Var.H(g.class) || (qVar = kVar.O) == null) {
            return;
        }
        try {
            qVar.a(k.a((fj) n41Var.I));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
