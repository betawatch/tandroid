package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class qo extends org.telegram.ui.Components.s70 {
    public final /* synthetic */ TLRPC.Chat x;
    public final /* synthetic */ ro y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo(ro roVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.y = roVar;
        this.x = chat2;
    }

    @Override // org.telegram.ui.Components.s70
    public final boolean a(boolean z10, org.telegram.ui.Components.q70 q70Var) {
        uo uoVar = this.y.d;
        if (uoVar.Q) {
            return false;
        }
        uoVar.Q = true;
        e(new ah(15, this, q70Var), new xn(this, this.x, z10, q70Var, 2));
        return true;
    }

    @Override // org.telegram.ui.Components.s70
    public final boolean b(boolean z10, org.telegram.ui.Components.r70 r70Var) {
        uo uoVar = this.y.d;
        if (uoVar.P) {
            return false;
        }
        uoVar.P = true;
        e(new ah(15, this, r70Var), new xn(this, this.x, z10, r70Var, 1));
        return true;
    }

    public final void e(ah ahVar, Runnable runnable) {
        uo uoVar = this.y.d;
        if (org.telegram.messenger.v3.T(uoVar.f)) {
            runnable.run();
        } else {
            uoVar.getMessagesController().T(uoVar.getParentActivity(), this.x.id, uoVar, new oi.f0(22, this, runnable), ahVar);
        }
    }
}
