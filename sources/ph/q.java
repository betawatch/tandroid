package ph;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
