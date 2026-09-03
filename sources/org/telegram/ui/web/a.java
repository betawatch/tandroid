package org.telegram.ui.web;

import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.c2, Utilities.Callback5 {
    public final /* synthetic */ k a;

    public /* synthetic */ a(k kVar) {
        this.a = kVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        k kVar = this.a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.w.V2.N(true);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.t tVar;
        h51 h51Var = (h51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = h51Var.G(d.class);
        k kVar = this.a;
        if (G) {
            String charSequence = h51Var.l.toString();
            org.telegram.ui.a0 a0Var = kVar.I;
            if (a0Var != null) {
                a0Var.run(charSequence);
                return;
            }
            return;
        }
        if (!h51Var.G(g.class) || (tVar = kVar.K) == null) {
            return;
        }
        try {
            tVar.run(k.a((MessageObject) h51Var.H));
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
