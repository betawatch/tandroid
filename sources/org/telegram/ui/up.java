package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class up extends org.telegram.ui.Components.u80 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ vp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(vp vpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = vpVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.u80
    public final boolean a(boolean z10, org.telegram.ui.Components.s80 s80Var) {
        yp ypVar = this.x.d;
        if (ypVar.P) {
            return false;
        }
        ypVar.P = true;
        e(new qh(18, this, s80Var), new bi.g2(this, this.w, z10, s80Var, 15));
        return true;
    }

    @Override // org.telegram.ui.Components.u80
    public final boolean b(boolean z10, org.telegram.ui.Components.t80 t80Var) {
        yp ypVar = this.x.d;
        if (ypVar.O) {
            return false;
        }
        ypVar.O = true;
        e(new qh(18, this, t80Var), new bi.g2(this, this.w, z10, t80Var, 14));
        return true;
    }

    public final void e(qh qhVar, Runnable runnable) {
        yp ypVar = this.x.d;
        if (ChatObject.isChannel(ypVar.f)) {
            runnable.run();
        } else {
            ypVar.getMessagesController().convertToMegaGroup(ypVar.getParentActivity(), this.w.id, ypVar, new oe(11, this, runnable), qhVar);
        }
    }
}
