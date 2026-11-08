package zh;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u61;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ j1(d2 d2Var, int i7) {
        this.a = i7;
        this.b = d2Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                d2 d2Var = this.b;
                d2Var.f(true);
                u61 u61Var = d2Var.n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                u61Var.d(i7, d2Var.e.f(i7) + 1);
                org.telegram.ui.ActionBar.f2 f2Var = d2Var.a;
                if (f2Var instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var).U4(true);
                }
                d2Var.o();
                break;
            default:
                d2 d2Var2 = this.b;
                d2Var2.e.b((String) obj, new j1(d2Var2, 0));
                break;
        }
    }
}
