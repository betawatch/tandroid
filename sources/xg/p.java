package xg;

import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iv0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u10 b;
    public final /* synthetic */ u10 c;

    public /* synthetic */ p(u10 u10Var, u10 u10Var2, int i3) {
        this.a = i3;
        this.b = u10Var;
        this.c = u10Var2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new iv0(tL_error, this.b, this.c, 27));
                break;
            default:
                org.telegram.messenger.g0.h3(new ui.b(tL_error, this.b, tLObject, this.c, 2));
                break;
        }
    }
}
