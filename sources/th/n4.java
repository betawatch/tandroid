package th;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t70;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class n4 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ t70 b;
    public final /* synthetic */ e5 c;

    public n4(e5 e5Var, long j10, t70 t70Var) {
        this.c = e5Var;
        this.a = j10;
        this.b = t70Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.i0.g3(new ag.a3(this, tLObject, this.a, this.b, 24));
    }
}
