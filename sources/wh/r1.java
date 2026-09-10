package wh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u81;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
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
                u81 u81Var = q2Var2.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                u81Var.d(i10, q2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.p2 p2Var = q2Var2.a;
                if (p2Var instanceof ProfileActivity) {
                    ((ProfileActivity) p2Var).G4(true);
                }
                q2Var2.n();
                break;
        }
    }
}
