package org.telegram.ui.web;

import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final /* synthetic */ k a;

    public /* synthetic */ a(k kVar) {
        this.a = kVar;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        k kVar = this.a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.w.Y2.N(true);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.s sVar;
        x51 x51Var = (x51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = x51Var.G(d.class);
        k kVar = this.a;
        if (G) {
            String charSequence = x51Var.l.toString();
            org.telegram.ui.z zVar = kVar.L;
            if (zVar != null) {
                zVar.run(charSequence);
                return;
            }
            return;
        }
        if (!x51Var.G(g.class) || (sVar = kVar.N) == null) {
            return;
        }
        try {
            sVar.run(k.a((MessageObject) x51Var.H));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
