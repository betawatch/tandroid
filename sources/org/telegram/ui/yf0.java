package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ yf0(kg0 kg0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = kg0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kg0 kg0Var = this.b;
                kg0Var.getNotificationCenter().d(new yf0(kg0Var, this.c, this.d, 1));
                break;
            default:
                kg0.Z(this.b, this.c, this.d);
                break;
        }
    }
}
