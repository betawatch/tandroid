package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ h6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ o(Context context, h6 h6Var, TL_stars.StarGift starGift, int i7) {
        this.a = i7;
        this.b = context;
        this.c = h6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h6 h6Var = this.c;
                u.g1(this.b, this.d, h6Var);
                break;
            default:
                h6 h6Var2 = this.c;
                u.g1(this.b, this.d, h6Var2);
                break;
        }
    }
}
