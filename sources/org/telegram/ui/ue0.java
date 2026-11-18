package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gf0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ ue0(gf0 gf0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = gf0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gf0 gf0Var = this.b;
                gf0Var.getNotificationCenter().d(new ue0(gf0Var, this.c, this.d, 1));
                break;
            default:
                gf0.a0(this.b, this.c, this.d);
                break;
        }
    }
}
