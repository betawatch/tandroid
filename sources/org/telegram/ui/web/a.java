package org.telegram.ui.web;

import java.io.Serializable;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.q1, v10 {
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

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.q qVar;
        o41 o41Var = (o41) obj;
        boolean H = o41Var.H(d.class);
        k kVar = this.a;
        if (H) {
            String charSequence = o41Var.m.toString();
            org.telegram.ui.x xVar = kVar.M;
            if (xVar != null) {
                xVar.a(charSequence);
                return;
            }
            return;
        }
        if (!o41Var.H(g.class) || (qVar = kVar.O) == null) {
            return;
        }
        try {
            qVar.a(k.a((fj) o41Var.I));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
