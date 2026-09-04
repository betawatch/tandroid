package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class tp extends org.telegram.ui.Components.k80 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ up x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp(up upVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = upVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.k80
    public final boolean a(boolean z10, org.telegram.ui.Components.i80 i80Var) {
        xp xpVar = this.x.d;
        if (xpVar.P) {
            return false;
        }
        xpVar.P = true;
        e(new fh(21, this, i80Var), new bi.e4(this, this.w, z10, i80Var, 15));
        return true;
    }

    @Override // org.telegram.ui.Components.k80
    public final boolean b(boolean z10, org.telegram.ui.Components.j80 j80Var) {
        xp xpVar = this.x.d;
        if (xpVar.O) {
            return false;
        }
        xpVar.O = true;
        e(new fh(21, this, j80Var), new bi.e4(this, this.w, z10, j80Var, 14));
        return true;
    }

    public final void e(fh fhVar, Runnable runnable) {
        xp xpVar = this.x.d;
        if (ChatObject.isChannel(xpVar.f)) {
            runnable.run();
        } else {
            xpVar.getMessagesController().convertToMegaGroup(xpVar.getParentActivity(), this.w.id, xpVar, new m4(16, this, runnable), fhVar);
        }
    }
}
