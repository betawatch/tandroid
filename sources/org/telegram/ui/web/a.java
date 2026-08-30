package org.telegram.ui.web;

import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.c2, Utilities.Callback5 {
    public final /* synthetic */ k a;

    public /* synthetic */ a(k kVar) {
        this.a = kVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        k kVar = this.a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.w.V2.N(true);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.t tVar;
        i51 i51Var = (i51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = i51Var.G(d.class);
        k kVar = this.a;
        if (G) {
            String charSequence = i51Var.l.toString();
            org.telegram.ui.a0 a0Var = kVar.I;
            if (a0Var != null) {
                a0Var.run(charSequence);
                return;
            }
            return;
        }
        if (!i51Var.G(g.class) || (tVar = kVar.K) == null) {
            return;
        }
        try {
            tVar.run(k.a((MessageObject) i51Var.H));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
