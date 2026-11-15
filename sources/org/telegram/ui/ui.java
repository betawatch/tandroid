package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ui extends org.telegram.ui.Components.sn {
    public final /* synthetic */ an B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(an anVar, Context context, an anVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, anVar2, z10, e6Var);
        this.B0 = anVar;
    }

    @Override // org.telegram.ui.Components.sn
    public final boolean a() {
        boolean z10;
        an anVar = this.B0;
        if (anVar.lb || anVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).inBubbleMode;
        if (z10 || anVar.k0 == null || anVar.H3) {
            return false;
        }
        return !anVar.fa() || anVar.w4;
    }

    @Override // org.telegram.ui.Components.sn
    public final boolean d() {
        an anVar = this.B0;
        TLRPC.User user = anVar.f;
        if (user != null && user.linked_community_id != 0) {
            anVar.showDialog(new li.d0(anVar, anVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = anVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        anVar.showDialog(new li.d0(anVar, anVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.sn
    public final void f() {
        an anVar = this.B0;
        anVar.Oa(anVar.ea() ? "" : null);
    }

    @Override // org.telegram.ui.Components.sn
    public final boolean o() {
        return this.B0.g4 == 3;
    }
}
