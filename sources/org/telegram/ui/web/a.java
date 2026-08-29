package org.telegram.ui.web;

import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final /* synthetic */ l a;

    public /* synthetic */ a(l lVar) {
        this.a = lVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        l lVar = this.a;
        lVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        lVar.w.U2.N(true);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.t tVar;
        w41 w41Var = (w41) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = w41Var.G(e.class);
        l lVar = this.a;
        if (G) {
            String charSequence = w41Var.l.toString();
            org.telegram.ui.b0 b0Var = lVar.H;
            if (b0Var != null) {
                b0Var.run(charSequence);
                return;
            }
            return;
        }
        if (!w41Var.G(h.class) || (tVar = lVar.J) == null) {
            return;
        }
        try {
            tVar.run(l.a((MessageObject) w41Var.H));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
