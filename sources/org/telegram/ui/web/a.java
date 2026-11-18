package org.telegram.ui.web;

import java.io.Serializable;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.r1, v10 {
    public final /* synthetic */ k a;

    public /* synthetic */ a(k kVar) {
        this.a = kVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        k kVar = this.a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.x.g3.O(true);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.q qVar;
        l41 l41Var = (l41) obj;
        boolean H = l41Var.H(d.class);
        k kVar = this.a;
        if (H) {
            String charSequence = l41Var.m.toString();
            org.telegram.ui.x xVar = kVar.M;
            if (xVar != null) {
                xVar.a(charSequence);
                return;
            }
            return;
        }
        if (!l41Var.H(g.class) || (qVar = kVar.O) == null) {
            return;
        }
        try {
            qVar.a(k.a((fj) l41Var.I));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
