package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ro extends org.telegram.ui.Components.t70 {
    public final /* synthetic */ TLRPC.Chat x;
    public final /* synthetic */ so y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(so soVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.y = soVar;
        this.x = chat2;
    }

    @Override // org.telegram.ui.Components.t70
    public final boolean a(boolean z10, org.telegram.ui.Components.r70 r70Var) {
        vo voVar = this.y.d;
        if (voVar.Q) {
            return false;
        }
        voVar.Q = true;
        e(new ci(11, this, r70Var), new yn(this, this.x, z10, r70Var, 2));
        return true;
    }

    @Override // org.telegram.ui.Components.t70
    public final boolean b(boolean z10, org.telegram.ui.Components.s70 s70Var) {
        vo voVar = this.y.d;
        if (voVar.P) {
            return false;
        }
        voVar.P = true;
        e(new ci(11, this, s70Var), new yn(this, this.x, z10, s70Var, 1));
        return true;
    }

    public final void e(ci ciVar, Runnable runnable) {
        vo voVar = this.y.d;
        if (org.telegram.messenger.v3.T(voVar.f)) {
            runnable.run();
        } else {
            voVar.getMessagesController().T(voVar.getParentActivity(), this.x.id, voVar, new oi.e0(22, this, runnable), ciVar);
        }
    }
}
