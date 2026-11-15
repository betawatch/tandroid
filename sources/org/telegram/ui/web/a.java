package org.telegram.ui.web;

import java.io.Serializable;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.b41;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.q1, x10 {
    public final /* synthetic */ k a;

    public /* synthetic */ a(k kVar) {
        this.a = kVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        k kVar = this.a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.x.g3.O(true);
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.q qVar;
        b41 b41Var = (b41) obj;
        boolean H = b41Var.H(d.class);
        k kVar = this.a;
        if (H) {
            String charSequence = b41Var.l.toString();
            org.telegram.ui.x xVar = kVar.M;
            if (xVar != null) {
                xVar.a(charSequence);
                return;
            }
            return;
        }
        if (!b41Var.H(g.class) || (qVar = kVar.O) == null) {
            return;
        }
        try {
            qVar.a(k.a((gj) b41Var.H));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
