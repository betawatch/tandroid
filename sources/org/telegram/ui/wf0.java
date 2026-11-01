package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ wf0(ig0 ig0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = ig0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ig0 ig0Var = this.b;
                ig0Var.getNotificationCenter().d(new wf0(ig0Var, this.c, this.d, 1));
                break;
            default:
                ig0.a0(this.b, this.c, this.d);
                break;
        }
    }
}
