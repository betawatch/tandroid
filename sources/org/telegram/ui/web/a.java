package org.telegram.ui.web;

import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final /* synthetic */ l a;

    public /* synthetic */ a(l lVar) {
        this.a = lVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        l lVar = this.a;
        lVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        lVar.w.U2.N(true);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.s sVar;
        n41 n41Var = (n41) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = n41Var.G(e.class);
        l lVar = this.a;
        if (G) {
            String charSequence = n41Var.l.toString();
            org.telegram.ui.b0 b0Var = lVar.H;
            if (b0Var != null) {
                b0Var.run(charSequence);
                return;
            }
            return;
        }
        if (!n41Var.G(h.class) || (sVar = lVar.J) == null) {
            return;
        }
        try {
            sVar.run(l.a((MessageObject) n41Var.H));
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
