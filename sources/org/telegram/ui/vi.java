package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class vi extends org.telegram.ui.Components.co {
    public final /* synthetic */ bn B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi(bn bnVar, Context context, bn bnVar2, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, bnVar2, z10, h6Var);
        this.B0 = bnVar;
    }

    @Override // org.telegram.ui.Components.co
    public final boolean a() {
        boolean z10;
        bn bnVar = this.B0;
        if (bnVar.mb || bnVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inBubbleMode;
        if (z10 || bnVar.k0 == null || bnVar.H3) {
            return false;
        }
        return !bnVar.fa() || bnVar.x4;
    }

    @Override // org.telegram.ui.Components.co
    public final boolean d() {
        bn bnVar = this.B0;
        TLRPC.User user = bnVar.f;
        if (user != null && user.linked_community_id != 0) {
            bnVar.showDialog(new li.d0(bnVar, bnVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = bnVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        bnVar.showDialog(new li.d0(bnVar, bnVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.co
    public final void f() {
        bn bnVar = this.B0;
        bnVar.Oa(bnVar.ea() ? "" : null);
    }

    @Override // org.telegram.ui.Components.co
    public final boolean o() {
        return this.B0.g4 == 3;
    }
}
