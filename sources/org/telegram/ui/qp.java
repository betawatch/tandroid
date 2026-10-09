package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qp extends org.telegram.ui.Components.m90 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ rp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(rp rpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = rpVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.m90
    public final boolean a(boolean z10, org.telegram.ui.Components.k90 k90Var) {
        up upVar = this.x.d;
        if (upVar.P) {
            return false;
        }
        upVar.P = true;
        e(new sg(23, this, k90Var), new ai.t4(this, this.w, z10, k90Var, 16));
        return true;
    }

    @Override // org.telegram.ui.Components.m90
    public final boolean b(boolean z10, org.telegram.ui.Components.l90 l90Var) {
        up upVar = this.x.d;
        if (upVar.O) {
            return false;
        }
        upVar.O = true;
        e(new sg(23, this, l90Var), new ai.t4(this, this.w, z10, l90Var, 15));
        return true;
    }

    public final void e(sg sgVar, Runnable runnable) {
        up upVar = this.x.d;
        if (ChatObject.isChannel(upVar.f)) {
            runnable.run();
        } else {
            upVar.getMessagesController().convertToMegaGroup(upVar.getParentActivity(), this.w.id, upVar, new o(18, this, runnable), sgVar);
        }
    }
}
