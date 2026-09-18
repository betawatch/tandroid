package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class qp extends org.telegram.ui.Components.t80 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ rp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(rp rpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = rpVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.t80
    public final boolean a(boolean z10, org.telegram.ui.Components.r80 r80Var) {
        up upVar = this.x.d;
        if (upVar.P) {
            return false;
        }
        upVar.P = true;
        e(new qh(19, this, r80Var), new ai.s4(this, this.w, z10, r80Var, 16));
        return true;
    }

    @Override // org.telegram.ui.Components.t80
    public final boolean b(boolean z10, org.telegram.ui.Components.s80 s80Var) {
        up upVar = this.x.d;
        if (upVar.O) {
            return false;
        }
        upVar.O = true;
        e(new qh(19, this, s80Var), new ai.s4(this, this.w, z10, s80Var, 15));
        return true;
    }

    public final void e(qh qhVar, Runnable runnable) {
        up upVar = this.x.d;
        if (ChatObject.isChannel(upVar.f)) {
            runnable.run();
        } else {
            upVar.getMessagesController().convertToMegaGroup(upVar.getParentActivity(), this.w.id, upVar, new l4(16, this, runnable), qhVar);
        }
    }
}
