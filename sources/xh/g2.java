package xh;

import org.telegram.messenger.wp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import rh.l5;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class g2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2 b;

    public /* synthetic */ g2(h2 h2Var, int i10) {
        this.a = i10;
        this.b = h2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                m2 m2Var = this.b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    wp.r1(m2Var.H).L3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.i0.g3(new q1(m2Var, 16));
                break;
            default:
                org.telegram.messenger.i0.g3(new l5(this.b, tLObject, tL_error, 24));
                break;
        }
    }
}
