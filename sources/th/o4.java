package th;

import org.telegram.messenger.r20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class o4 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ r20 b;
    public final /* synthetic */ e5 c;

    public o4(e5 e5Var, long j10, r20 r20Var) {
        this.c = e5Var;
        this.a = j10;
        this.b = r20Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.i0.g3(new ag.a3(this, tLObject, this.a, this.b, 25));
    }
}
