package ph;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class b2 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ p2 a;

    public b2(p2 p2Var) {
        this.a = p2Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        p2 p2Var = this.a;
        if (i10 == -1) {
            if (p2Var.x.z()) {
                return;
            }
            p2Var.q();
        } else if (i10 == R.id.menu_collapse_bot) {
            p2Var.t0 = true;
            p2Var.k(true);
        }
    }
}
