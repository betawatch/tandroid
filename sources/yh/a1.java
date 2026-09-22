package yh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ zf.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ a1(z3 z3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = z3Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                z3.M0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
            default:
                z3.t0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
        }
    }
}
