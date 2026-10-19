package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class yq implements g60 {
    public final /* synthetic */ l60 a;
    public final /* synthetic */ hr b;

    public yq(hr hrVar, l60 l60Var) {
        this.b = hrVar;
        this.a = l60Var;
    }

    @Override // org.telegram.ui.g60
    public final void h(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.g60
    public final void i(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        hr hrVar = this.b;
        hrVar.getMessagesController().addUsersToChat(hrVar.r, hrVar, arrayList, i10, new j3(this, 2), new xq(0), null);
    }
}
