package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ e6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ p(Context context, e6 e6Var, TL_stars.StarGift starGift, int i10) {
        this.a = i10;
        this.b = context;
        this.c = e6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e6 e6Var = this.c;
                v.U(this.b, this.d, e6Var);
                break;
            default:
                e6 e6Var2 = this.c;
                v.U(this.b, this.d, e6Var2);
                break;
        }
    }
}
