package org.telegram.ui.web;

import java.io.Serializable;
import org.telegram.messenger.f8;
import org.telegram.messenger.kj;
import org.telegram.messenger.p20;
import org.telegram.ui.Components.b51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.u1, p20 {
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

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.p pVar;
        b51 b51Var = (b51) obj;
        boolean H = b51Var.H(c.class);
        j jVar = this.a;
        if (H) {
            String charSequence = b51Var.l.toString();
            org.telegram.ui.w wVar = jVar.L;
            if (wVar != null) {
                wVar.a(charSequence);
                return;
            }
            return;
        }
        if (!b51Var.H(f.class) || (pVar = jVar.N) == null) {
            return;
        }
        try {
            pVar.a(j.a((kj) b51Var.H));
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
