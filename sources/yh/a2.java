package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ a2(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.a = i10;
        this.b = x3Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                x3.i0(this.b, this.c, (zf.a) obj, (Runnable) obj2);
                break;
            case 1:
                x3.g0(this.b, this.c, (Utilities.Callback) obj, (Boolean) obj2);
                break;
            default:
                x3.O0(this.b, this.c, (zf.a) obj, (Runnable) obj2);
                break;
        }
    }
}
