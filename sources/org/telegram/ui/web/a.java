package org.telegram.ui.web;

import java.io.Serializable;
import org.telegram.messenger.a8;
import org.telegram.messenger.s10;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.p1, s10 {
    public final /* synthetic */ l a;

    public /* synthetic */ a(l lVar) {
        this.a = lVar;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        l lVar = this.a;
        lVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        lVar.x.g3.O(true);
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.q qVar;
        r31 r31Var = (r31) obj;
        boolean H = r31Var.H(e.class);
        l lVar = this.a;
        if (H) {
            String charSequence = r31Var.l.toString();
            org.telegram.ui.z zVar = lVar.M;
            if (zVar != null) {
                zVar.a(charSequence);
                return;
            }
            return;
        }
        if (!r31Var.H(h.class) || (qVar = lVar.O) == null) {
            return;
        }
        try {
            qVar.a(l.a((zi) r31Var.H));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
