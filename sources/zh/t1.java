package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u91;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ t1(r2 r2Var, int i10) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                r2 r2Var = this.b;
                r2Var.f(true);
                u91 u91Var = r2Var.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                u91Var.d(i10, r2Var.e.f(i10) + 1);
                org.telegram.ui.ActionBar.r2 r2Var2 = r2Var.a;
                if (r2Var2 instanceof ProfileActivity) {
                    ((ProfileActivity) r2Var2).O4(true);
                }
                r2Var.o();
                break;
            default:
                r2 r2Var3 = this.b;
                r2Var3.e.b((String) obj, new t1(r2Var3, 0));
                break;
        }
    }
}
