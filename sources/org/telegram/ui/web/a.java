package org.telegram.ui.web;

import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.r1, a20 {
    public final /* synthetic */ j a;

    public /* synthetic */ a(j jVar) {
        this.a = jVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        j jVar = this.a;
        jVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        jVar.x.f3.O(true);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.q qVar;
        y31 y31Var = (y31) obj;
        boolean H = y31Var.H(c.class);
        j jVar = this.a;
        if (H) {
            String charSequence = y31Var.l.toString();
            org.telegram.ui.y yVar = jVar.L;
            if (yVar != null) {
                yVar.a(charSequence);
                return;
            }
            return;
        }
        if (!y31Var.H(f.class) || (qVar = jVar.N) == null) {
            return;
        }
        try {
            qVar.a(j.a((ij) y31Var.H));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
