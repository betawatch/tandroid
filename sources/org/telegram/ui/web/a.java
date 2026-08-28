package org.telegram.ui.web;

import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final /* synthetic */ k a;

    public /* synthetic */ a(k kVar) {
        this.a = kVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        k kVar = this.a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.w.U2.N(true);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.r rVar;
        l41 l41Var = (l41) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = l41Var.G(d.class);
        k kVar = this.a;
        if (G) {
            String charSequence = l41Var.l.toString();
            org.telegram.ui.a0 a0Var = kVar.H;
            if (a0Var != null) {
                a0Var.run(charSequence);
                return;
            }
            return;
        }
        if (!l41Var.G(g.class) || (rVar = kVar.J) == null) {
            return;
        }
        try {
            rVar.run(k.a((MessageObject) l41Var.H));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
