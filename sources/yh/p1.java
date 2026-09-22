package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object n;

    public /* synthetic */ p1(y3 y3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.b = y3Var;
        this.c = tLObject;
        this.d = j3;
        this.e = j10;
        this.n = callback;
        this.f = tL_error;
        this.h = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y3.H0(this.b, (org.telegram.ui.ActionBar.b2) this.n, this.c, this.d, this.e, this.h, this.f);
                break;
            default:
                y3.g0(this.b, this.c, this.d, this.e, (Utilities.Callback) this.n, this.f, this.h);
                break;
        }
    }

    public /* synthetic */ p1(y3 y3Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.b = y3Var;
        this.n = b2Var;
        this.c = tLObject;
        this.d = j3;
        this.e = j10;
        this.h = j11;
        this.f = tL_error;
    }
}
