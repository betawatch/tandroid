package sh;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            if (p2Var.x.z()) {
                return;
            }
            p2Var.q();
        } else if (i10 == R.id.menu_collapse_bot) {
            p2Var.u0 = true;
            p2Var.k(true);
        }
    }
}
