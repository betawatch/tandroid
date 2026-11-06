package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ p(Context context, f6 f6Var, TL_stars.StarGift starGift, int i7) {
        this.a = i7;
        this.b = context;
        this.c = f6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f6 f6Var = this.c;
                v.g1(this.b, this.d, f6Var);
                break;
            default:
                f6 f6Var2 = this.c;
                v.g1(this.b, this.d, f6Var2);
                break;
        }
    }
}
