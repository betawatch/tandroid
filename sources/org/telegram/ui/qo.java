package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qo extends org.telegram.ui.Components.f70 {
    public final /* synthetic */ TLRPC.Chat x;
    public final /* synthetic */ ro y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo(ro roVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.y = roVar;
        this.x = chat2;
    }

    @Override // org.telegram.ui.Components.f70
    public final boolean a(boolean z9, org.telegram.ui.Components.d70 d70Var) {
        uo uoVar = this.y.d;
        if (uoVar.P) {
            return false;
        }
        uoVar.P = true;
        e(new oe(27, this, d70Var), new xn(this, this.x, z9, d70Var, 2));
        return true;
    }

    @Override // org.telegram.ui.Components.f70
    public final boolean b(boolean z9, org.telegram.ui.Components.e70 e70Var) {
        uo uoVar = this.y.d;
        if (uoVar.O) {
            return false;
        }
        uoVar.O = true;
        e(new oe(27, this, e70Var), new xn(this, this.x, z9, e70Var, 1));
        return true;
    }

    public final void e(oe oeVar, Runnable runnable) {
        uo uoVar = this.y.d;
        if (org.telegram.messenger.t3.T(uoVar.f)) {
            runnable.run();
        } else {
            uoVar.getMessagesController().T(uoVar.getParentActivity(), this.x.id, uoVar, new ni.c(20, this, runnable), oeVar);
        }
    }
}
