package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g81;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                g81 g81Var = s2Var2.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                g81Var.d(i10, s2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = s2Var2.a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                s2Var2.n();
                break;
        }
    }
}
