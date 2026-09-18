package org.telegram.ui.web;

import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final /* synthetic */ k a;

    public /* synthetic */ a(k kVar) {
        this.a = kVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        k kVar = this.a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.w.Y2.N(true);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.r rVar;
        j51 j51Var = (j51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = j51Var.G(d.class);
        k kVar = this.a;
        if (G) {
            String charSequence = j51Var.l.toString();
            org.telegram.ui.y yVar = kVar.L;
            if (yVar != null) {
                yVar.run(charSequence);
                return;
            }
            return;
        }
        if (!j51Var.G(g.class) || (rVar = kVar.N) == null) {
            return;
        }
        try {
            rVar.run(k.a((MessageObject) j51Var.H));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
