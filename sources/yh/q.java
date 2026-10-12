package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
