package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ff0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ ue0(ff0 ff0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = ff0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ff0 ff0Var = this.b;
                ff0Var.getNotificationCenter().d(new ue0(ff0Var, this.c, this.d, 1));
                break;
            default:
                ff0.a0(this.b, this.c, this.d);
                break;
        }
    }
}
