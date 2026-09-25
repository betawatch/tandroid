package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.v81;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ t1(s2 s2Var, int i10) {
        this.a = i10;
        this.b = s2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                s2 s2Var = this.b;
                s2Var.e.b((String) obj, new t1(s2Var, 1));
                break;
            default:
                s2 s2Var2 = this.b;
                s2Var2.f(true);
                v81 v81Var = s2Var2.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                v81Var.d(i10, s2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.m2 m2Var = s2Var2.a;
                if (m2Var instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var).G4(true);
                }
                s2Var2.n();
                break;
        }
    }
}
