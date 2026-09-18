package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class sp extends org.telegram.ui.Components.k80 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ tp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp(tp tpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = tpVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.k80
    public final boolean a(boolean z10, org.telegram.ui.Components.i80 i80Var) {
        wp wpVar = this.x.d;
        if (wpVar.P) {
            return false;
        }
        wpVar.P = true;
        e(new wh(15, this, i80Var), new ai.s4(this, this.w, z10, i80Var, 15));
        return true;
    }

    @Override // org.telegram.ui.Components.k80
    public final boolean b(boolean z10, org.telegram.ui.Components.j80 j80Var) {
        wp wpVar = this.x.d;
        if (wpVar.O) {
            return false;
        }
        wpVar.O = true;
        e(new wh(15, this, j80Var), new ai.s4(this, this.w, z10, j80Var, 14));
        return true;
    }

    public final void e(wh whVar, Runnable runnable) {
        wp wpVar = this.x.d;
        if (ChatObject.isChannel(wpVar.f)) {
            runnable.run();
        } else {
            wpVar.getMessagesController().convertToMegaGroup(wpVar.getParentActivity(), this.w.id, wpVar, new x5(15, this, runnable), whVar);
        }
    }
}
