package rh;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class b2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ p2 a;

    public b2(p2 p2Var) {
        this.a = p2Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        p2 p2Var = this.a;
        if (i10 == -1) {
            if (p2Var.x.D()) {
                return;
            }
            p2Var.q();
        } else if (i10 == R.id.menu_collapse_bot) {
            p2Var.u0 = true;
            p2Var.k(true);
        }
    }
}
