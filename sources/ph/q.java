package ph;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ p6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ q(Context context, p6 p6Var, TL_stars.StarGift starGift, int i10) {
        this.a = i10;
        this.b = context;
        this.c = p6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p6 p6Var = this.c;
                w.g1(this.b, this.d, p6Var);
                break;
            default:
                p6 p6Var2 = this.c;
                w.g1(this.b, this.d, p6Var2);
                break;
        }
    }
}
