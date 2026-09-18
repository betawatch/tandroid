package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ b2(a4 a4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.a = i10;
        this.b = a4Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a4.j0(this.b, this.c, (zf.a) obj, (Runnable) obj2);
                break;
            case 1:
                a4.h0(this.b, this.c, (Utilities.Callback) obj, (Boolean) obj2);
                break;
            default:
                a4.O0(this.b, this.c, (zf.a) obj, (Runnable) obj2);
                break;
        }
    }
}
