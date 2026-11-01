package rh;

import org.telegram.messenger.r20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ow0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ r20 b;

    public /* synthetic */ m5(r20 r20Var, int i10) {
        this.a = i10;
        this.b = r20Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new ow0(tLObject, this.b, 1));
                break;
            default:
                org.telegram.messenger.i0.g3(new th.o0(6, this.b, tL_error));
                break;
        }
    }
}
