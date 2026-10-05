package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ b2(y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.a = i10;
        this.b = y3Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                y3.i0(this.b, this.c, (zf.a) obj, (Runnable) obj2);
                break;
            case 1:
                y3.g0(this.b, this.c, (Utilities.Callback) obj, (Boolean) obj2);
                break;
            default:
                y3.O0(this.b, this.c, (zf.a) obj, (Runnable) obj2);
                break;
        }
    }
}
