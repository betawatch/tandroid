package xh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ yf.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ a1(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, yf.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = x3Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                x3.M0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
            default:
                x3.t0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
        }
    }
}
