package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ a4 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object n;

    public /* synthetic */ p1(a4 a4Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.b = a4Var;
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
                a4.H0(this.b, (org.telegram.ui.ActionBar.c2) this.n, this.c, this.d, this.e, this.h, this.f);
                break;
            default:
                a4.g0(this.b, this.c, this.d, this.e, (Utilities.Callback) this.n, this.f, this.h);
                break;
        }
    }

    public /* synthetic */ p1(a4 a4Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.b = a4Var;
        this.n = c2Var;
        this.c = tLObject;
        this.d = j3;
        this.e = j10;
        this.h = j11;
        this.f = tL_error;
    }
}
