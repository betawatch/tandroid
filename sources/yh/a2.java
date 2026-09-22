package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ a2(z3 z3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.a = i10;
        this.b = z3Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                z3.j0(this.b, this.c, (zf.a) obj, (Runnable) obj2);
                break;
            case 1:
                z3.h0(this.b, this.c, (Utilities.Callback) obj, (Boolean) obj2);
                break;
            default:
                z3.O0(this.b, this.c, (zf.a) obj, (Runnable) obj2);
                break;
        }
    }
}
