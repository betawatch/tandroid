package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qj extends org.telegram.ui.Components.sn {
    public final /* synthetic */ un A0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(un unVar, Context context, un unVar2, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, unVar2, z10, p6Var);
        this.A0 = unVar;
    }

    @Override // org.telegram.ui.Components.sn
    public final boolean a() {
        boolean z10;
        un unVar = this.A0;
        if (unVar.ib || unVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).inBubbleMode;
        if (z10 || unVar.j0 == null || unVar.G3) {
            return false;
        }
        return !unVar.T9() || unVar.v4;
    }

    @Override // org.telegram.ui.Components.sn
    public final boolean d() {
        un unVar = this.A0;
        TLRPC.User user = unVar.f;
        if (user != null && user.linked_community_id != 0) {
            unVar.showDialog(new yh.a0(unVar, unVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        unVar.showDialog(new yh.a0(unVar, unVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.sn
    public final void f() {
        un unVar = this.A0;
        unVar.Ba(unVar.S9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.sn
    public final boolean o() {
        return this.A0.f4 == 3;
    }
}
