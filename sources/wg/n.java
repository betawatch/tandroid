package wg;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c20 b;
    public final /* synthetic */ c20 c;

    public /* synthetic */ n(c20 c20Var, c20 c20Var2, int i7) {
        this.a = i7;
        this.b = c20Var;
        this.c = c20Var2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new r31(tL_error, this.b, this.c));
                break;
            default:
                org.telegram.messenger.g0.h3(new r(tL_error, this.b, tLObject, this.c));
                break;
        }
    }
}
