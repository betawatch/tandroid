package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class te0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ff0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ te0(ff0 ff0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
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
                ff0Var.getNotificationCenter().d(new te0(ff0Var, this.c, this.d, 1));
                break;
            default:
                ff0.a0(this.b, this.c, this.d);
                break;
        }
    }
}
