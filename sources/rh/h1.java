package rh;

import org.telegram.messenger.r20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h1(e4 e4Var, long j10, long j11, r20 r20Var, long j12) {
        this.b = e4Var;
        this.c = j10;
        this.d = j11;
        this.f = r20Var;
        this.e = j12;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new n1(this.b, (org.telegram.ui.ActionBar.x1) this.f, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                org.telegram.messenger.i0.g3(new n1(this.b, tLObject, this.c, this.d, (r20) this.f, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ h1(e4 e4Var, org.telegram.ui.ActionBar.x1 x1Var, long j10, long j11, long j12) {
        this.b = e4Var;
        this.f = x1Var;
        this.c = j10;
        this.d = j11;
        this.e = j12;
    }
}
