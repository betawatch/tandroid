package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class wp extends org.telegram.ui.Components.l90 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ xp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp(xp xpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = xpVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.l90
    public final boolean a(boolean z10, org.telegram.ui.Components.i90 i90Var) {
        aq aqVar = this.x.d;
        if (aqVar.P) {
            return false;
        }
        aqVar.P = true;
        e(new jd(29, this, i90Var), new bi.h4(this, this.w, z10, i90Var, 14));
        return true;
    }

    @Override // org.telegram.ui.Components.l90
    public final boolean b(boolean z10, org.telegram.ui.Components.j90 j90Var) {
        aq aqVar = this.x.d;
        if (aqVar.O) {
            return false;
        }
        aqVar.O = true;
        e(new jd(29, this, j90Var), new bi.h4(this, this.w, z10, j90Var, 13));
        return true;
    }

    public final void e(jd jdVar, Runnable runnable) {
        aq aqVar = this.x.d;
        if (ChatObject.isChannel(aqVar.f)) {
            runnable.run();
        } else {
            aqVar.getMessagesController().convertToMegaGroup(aqVar.getParentActivity(), this.w.id, aqVar, new m4.y0(20, this, runnable), jdVar);
        }
    }
}
