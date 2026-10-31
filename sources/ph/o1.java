package ph;

import org.telegram.messenger.q20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.v71;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2 b;

    public /* synthetic */ o1(j2 j2Var, int i10) {
        this.a = i10;
        this.b = j2Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                j2 j2Var = this.b;
                j2Var.f(true);
                v71 v71Var = j2Var.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                v71Var.d(i10, j2Var.e.f(i10) + 1);
                org.telegram.ui.ActionBar.k2 k2Var = j2Var.a;
                if (k2Var instanceof ProfileActivity) {
                    ((ProfileActivity) k2Var).T4(true);
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
