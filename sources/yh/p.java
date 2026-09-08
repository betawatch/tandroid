package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ p(Context context, f6 f6Var, TL_stars.StarGift starGift, int i10) {
        this.a = i10;
        this.b = context;
        this.c = f6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f6 f6Var = this.c;
                v.U(this.b, this.d, f6Var);
                break;
            default:
                f6 f6Var2 = this.c;
                v.U(this.b, this.d, f6Var2);
                break;
        }
    }
}
