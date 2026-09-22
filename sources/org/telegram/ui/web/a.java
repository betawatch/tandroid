package org.telegram.ui.web;

import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.y51;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final /* synthetic */ k a;

    public /* synthetic */ a(k kVar) {
        this.a = kVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        k kVar = this.a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.w.Y2.N(true);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.r rVar;
        y51 y51Var = (y51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = y51Var.G(d.class);
        k kVar = this.a;
        if (G) {
            String charSequence = y51Var.l.toString();
            org.telegram.ui.y yVar = kVar.L;
            if (yVar != null) {
                yVar.run(charSequence);
                return;
            }
            return;
        }
        if (!y51Var.G(g.class) || (rVar = kVar.N) == null) {
            return;
        }
        try {
            rVar.run(k.a((MessageObject) y51Var.H));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
