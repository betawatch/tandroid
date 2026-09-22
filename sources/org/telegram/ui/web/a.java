package org.telegram.ui.web;

import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final /* synthetic */ k a;

    public /* synthetic */ a(k kVar) {
        this.a = kVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        k kVar = this.a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.w.Y2.N(true);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.r rVar;
        i51 i51Var = (i51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = i51Var.G(d.class);
        k kVar = this.a;
        if (G) {
            String charSequence = i51Var.l.toString();
            org.telegram.ui.y yVar = kVar.L;
            if (yVar != null) {
                yVar.run(charSequence);
                return;
            }
            return;
        }
        if (!i51Var.G(g.class) || (rVar = kVar.N) == null) {
            return;
        }
        try {
            rVar.run(k.a((MessageObject) i51Var.H));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
