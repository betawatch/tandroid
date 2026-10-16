package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k91;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ r1(q2 q2Var, int i10) {
        this.a = i10;
        this.b = q2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                q2 q2Var = this.b;
                q2Var.e.b((String) obj, new r1(q2Var, 1));
                break;
            default:
                q2 q2Var2 = this.b;
                q2Var2.f(true);
                k91 k91Var = q2Var2.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                k91Var.d(i10, q2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.m2 m2Var = q2Var2.a;
                if (m2Var instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var).G4(true);
                }
                q2Var2.n();
                break;
        }
    }
}
