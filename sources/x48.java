// default package

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x48 implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o68 b;

    public /* synthetic */ x48(o68 o68Var, byte b) {
        this.a = b;
        this.b = o68Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        byte b = this.a;
        o68 o68Var = this.b;
        switch (b) {
            case 0:
                if (!o68Var.v0(true)) {
                    fu5 G = fu5.G(o68Var.t0.w, o68Var.l0, view);
                    G.b(R.drawable.msg_edit, ob6.M0(2131748564, null), new u48(o68Var, (byte) 6), false);
                    G.k(R.drawable.menu_delete_paid, ob6.M0(2131748563, null), new u48(o68Var, (byte) 7), o68Var.u3 > 0);
                    G.W(5);
                    G.a0 = true;
                    G.a0();
                    break;
                } else {
                    break;
                }
            default:
                o68Var.v0.j(o68Var.v0(false));
                break;
        }
        return true;
    }
}
