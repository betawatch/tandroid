package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h81;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ s1(r2 r2Var, int i10) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                r2 r2Var = this.b;
                r2Var.e.b((String) obj, new s1(r2Var, 1));
                break;
            default:
                r2 r2Var2 = this.b;
                r2Var2.f(true);
                h81 h81Var = r2Var2.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                h81Var.d(i10, r2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = r2Var2.a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                r2Var2.n();
                break;
        }
    }
}
