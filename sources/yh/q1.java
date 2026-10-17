package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b91;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ q1(q2 q2Var, int i10) {
        this.a = i10;
        this.b = q2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                q2 q2Var = this.b;
                q2Var.e.b((String) obj, new q1(q2Var, 1));
                break;
            default:
                q2 q2Var2 = this.b;
                q2Var2.f(true);
                b91 b91Var = q2Var2.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                b91Var.d(i10, q2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = q2Var2.a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                q2Var2.n();
                break;
        }
    }
}
