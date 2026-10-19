package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c91;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    public /* synthetic */ p1(p2 p2Var, int i10) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                p2 p2Var = this.b;
                p2Var.e.b((String) obj, new p1(p2Var, 1));
                break;
            default:
                p2 p2Var2 = this.b;
                p2Var2.f(true);
                c91 c91Var = p2Var2.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                c91Var.d(i10, p2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = p2Var2.a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                p2Var2.n();
                break;
        }
    }
}
