package rh;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class c2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ q2 a;

    public c2(q2 q2Var) {
        this.a = q2Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        q2 q2Var = this.a;
        if (i10 == -1) {
            if (q2Var.x.z()) {
                return;
            }
            q2Var.q();
        } else if (i10 == R.id.menu_collapse_bot) {
            q2Var.u0 = true;
            q2Var.k(true);
        }
    }
}
