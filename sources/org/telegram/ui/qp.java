package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class qp extends org.telegram.ui.Components.v80 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ rp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(rp rpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = rpVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.v80
    public final boolean a(boolean z10, org.telegram.ui.Components.t80 t80Var) {
        up upVar = this.x.d;
        if (upVar.P) {
            return false;
        }
        upVar.P = true;
        e(new gh(21, this, t80Var), new ai.s4(this, this.w, z10, t80Var, 16));
        return true;
    }

    @Override // org.telegram.ui.Components.v80
    public final boolean b(boolean z10, org.telegram.ui.Components.u80 u80Var) {
        up upVar = this.x.d;
        if (upVar.O) {
            return false;
        }
        upVar.O = true;
        e(new gh(21, this, u80Var), new ai.s4(this, this.w, z10, u80Var, 15));
        return true;
    }

    public final void e(gh ghVar, Runnable runnable) {
        up upVar = this.x.d;
        if (ChatObject.isChannel(upVar.f)) {
            runnable.run();
        } else {
            upVar.getMessagesController().convertToMegaGroup(upVar.getParentActivity(), this.w.id, upVar, new l4(16, this, runnable), ghVar);
        }
    }
}
