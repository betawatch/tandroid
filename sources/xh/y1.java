package xh;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class y1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;

    public /* synthetic */ y1(m2 m2Var, int i10) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11 = this.a;
        m2 m2Var = this.b;
        switch (i11) {
            case 0:
                if (i10 != -1) {
                    if (i10 == R.id.menu_collapse_bot) {
                        m2Var.y0 = true;
                        m2Var.o(true);
                        break;
                    }
                } else if (!m2Var.D.C()) {
                    m2Var.v();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    m2Var.v();
                    break;
                }
                break;
        }
    }
}
