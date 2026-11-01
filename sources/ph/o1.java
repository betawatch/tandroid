package ph;

import org.telegram.messenger.r20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.w71;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2 b;

    public /* synthetic */ o1(j2 j2Var, int i10) {
        this.a = i10;
        this.b = j2Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                j2 j2Var = this.b;
                j2Var.f(true);
                w71 w71Var = j2Var.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                w71Var.d(i10, j2Var.e.f(i10) + 1);
                org.telegram.ui.ActionBar.k2 k2Var = j2Var.a;
                if (k2Var instanceof ProfileActivity) {
                    ((ProfileActivity) k2Var).U4(true);
                }
                j2Var.o();
                break;
            default:
                j2 j2Var2 = this.b;
                j2Var2.e.b((String) obj, new o1(j2Var2, 0));
                break;
        }
    }
}
