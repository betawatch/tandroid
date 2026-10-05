package yh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ zf.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ c1(y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = y3Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                y3.M0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
            default:
                y3.t0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
        }
    }
}
