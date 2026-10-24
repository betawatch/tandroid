package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k91;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    public /* synthetic */ p1(p2 p2Var, int i10) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                p2 p2Var = this.b;
                p2Var.e.b((String) obj, new p1(p2Var, 1));
                break;
            default:
                p2 p2Var2 = this.b;
                p2Var2.f(true);
                k91 k91Var = p2Var2.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                k91Var.d(i10, p2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = p2Var2.a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).I4(true);
                }
                p2Var2.n();
                break;
        }
    }
}
