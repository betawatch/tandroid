package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i81;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                i81 i81Var = r2Var2.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                i81Var.d(i10, r2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = r2Var2.a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).G4(true);
                }
                r2Var2.n();
                break;
        }
    }
}
