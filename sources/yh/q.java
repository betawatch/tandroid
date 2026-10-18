package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ d6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ q(Context context, d6 d6Var, TL_stars.StarGift starGift, int i10) {
        this.a = i10;
        this.b = context;
        this.c = d6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d6 d6Var = this.c;
                w.V(this.b, this.d, d6Var);
                break;
            default:
                d6 d6Var2 = this.c;
                w.V(this.b, this.d, d6Var2);
                break;
        }
    }
}
