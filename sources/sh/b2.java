package sh;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
