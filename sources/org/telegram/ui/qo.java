package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qo extends org.telegram.ui.Components.g70 {
    public final /* synthetic */ TLRPC.Chat x;
    public final /* synthetic */ ro y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo(ro roVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.y = roVar;
        this.x = chat2;
    }

    @Override // org.telegram.ui.Components.g70
    public final boolean a(boolean z9, org.telegram.ui.Components.e70 e70Var) {
        uo uoVar = this.y.d;
        if (uoVar.P) {
            return false;
        }
        uoVar.P = true;
        e(new rf(26, this, e70Var), new xn(this, this.x, z9, e70Var, 2));
        return true;
    }

    @Override // org.telegram.ui.Components.g70
    public final boolean b(boolean z9, org.telegram.ui.Components.f70 f70Var) {
        uo uoVar = this.y.d;
        if (uoVar.O) {
            return false;
        }
        uoVar.O = true;
        e(new rf(26, this, f70Var), new xn(this, this.x, z9, f70Var, 1));
        return true;
    }

    public final void e(rf rfVar, Runnable runnable) {
        uo uoVar = this.y.d;
        if (org.telegram.messenger.t3.T(uoVar.f)) {
            runnable.run();
        } else {
            uoVar.getMessagesController().T(uoVar.getParentActivity(), this.x.id, uoVar, new ni.c(20, this, runnable), rfVar);
        }
    }
}
