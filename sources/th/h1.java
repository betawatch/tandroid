package th;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ h1(z2 z2Var, int i10) {
        this.a = i10;
        this.b = z2Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i10 = this.a;
        z2 z2Var = this.b;
        switch (i10) {
            case 0:
                if (!z2Var.B0(true)) {
                    z60 F = z60.F(z2Var.s0.w, z2Var.k0, view);
                    F.c(R.drawable.msg_edit, dd.L0(2131748820, null), new i1(z2Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, dd.L0(2131748819, null), new i1(z2Var, 7), z2Var.u3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                } else {
                    break;
                }
            default:
                z2Var.u0.k(z2Var.B0(false));
                break;
        }
        return true;
    }
}
