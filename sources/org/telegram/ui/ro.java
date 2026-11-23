package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ro extends org.telegram.ui.Components.v70 {
    public final /* synthetic */ TLRPC.Chat x;
    public final /* synthetic */ so y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(so soVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.y = soVar;
        this.x = chat2;
    }

    @Override // org.telegram.ui.Components.v70
    public final boolean a(boolean z10, org.telegram.ui.Components.t70 t70Var) {
        vo voVar = this.y.d;
        if (voVar.Q) {
            return false;
        }
        voVar.Q = true;
        e(new eh(13, this, t70Var), new yn(this, this.x, z10, t70Var, 2));
        return true;
    }

    @Override // org.telegram.ui.Components.v70
    public final boolean b(boolean z10, org.telegram.ui.Components.u70 u70Var) {
        vo voVar = this.y.d;
        if (voVar.P) {
            return false;
        }
        voVar.P = true;
        e(new eh(13, this, u70Var), new yn(this, this.x, z10, u70Var, 1));
        return true;
    }

    public final void e(eh ehVar, Runnable runnable) {
        vo voVar = this.y.d;
        if (org.telegram.messenger.v3.T(voVar.f)) {
            runnable.run();
        } else {
            voVar.getMessagesController().T(voVar.getParentActivity(), this.x.id, voVar, new oi.f0(22, this, runnable), ehVar);
        }
    }
}
