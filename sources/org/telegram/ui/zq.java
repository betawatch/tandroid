package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zq implements f60 {
    public final /* synthetic */ k60 a;
    public final /* synthetic */ jr b;

    public zq(jr jrVar, k60 k60Var) {
        this.b = jrVar;
        this.a = k60Var;
    }

    @Override // org.telegram.ui.f60
    public final void i(TLRPC.User user) {
        this.b.s0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.f60
    public final void j(int i9, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        jr jrVar = this.b;
        jrVar.getMessagesController().addUsersToChat(jrVar.r, jrVar, arrayList, i9, new k3(this, 2), new yq(0), null);
    }
}
