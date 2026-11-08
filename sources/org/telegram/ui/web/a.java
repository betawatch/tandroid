package org.telegram.ui.web;

import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        x31 x31Var = (x31) obj;
        boolean H = x31Var.H(c.class);
        j jVar = this.a;
        if (H) {
            String charSequence = x31Var.l.toString();
            org.telegram.ui.y yVar = jVar.L;
            if (yVar != null) {
                yVar.a(charSequence);
                return;
            }
            return;
        }
        if (!x31Var.H(f.class) || (qVar = jVar.N) == null) {
            return;
        }
        try {
            qVar.a(j.a((ij) x31Var.H));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
