package org.telegram.ui.web;

import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final /* synthetic */ l a;

    public /* synthetic */ a(l lVar) {
        this.a = lVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        l lVar = this.a;
        lVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        lVar.w.g3.O(true);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.q qVar;
        u61 u61Var = (u61) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean H = u61Var.H(e.class);
        l lVar = this.a;
        if (H) {
            String charSequence = u61Var.l.toString();
            org.telegram.ui.y yVar = lVar.L;
            if (yVar != null) {
                yVar.run(charSequence);
                return;
            }
            return;
        }
        if (!u61Var.H(h.class) || (qVar = lVar.N) == null) {
            return;
        }
        try {
            qVar.run(l.a((MessageObject) u61Var.H));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
