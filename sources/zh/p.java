package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
