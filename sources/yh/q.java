package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ c6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ q(Context context, c6 c6Var, TL_stars.StarGift starGift, int i10) {
        this.a = i10;
        this.b = context;
        this.c = c6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c6 c6Var = this.c;
                w.V(this.b, this.d, c6Var);
                break;
            default:
                c6 c6Var2 = this.c;
                w.V(this.b, this.d, c6Var2);
                break;
        }
    }
}
