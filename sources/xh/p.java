package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ d6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ p(Context context, d6 d6Var, TL_stars.StarGift starGift, int i10) {
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
                v.U(this.b, this.d, d6Var);
                break;
            default:
                d6 d6Var2 = this.c;
                v.U(this.b, this.d, d6Var2);
                break;
        }
    }
}
