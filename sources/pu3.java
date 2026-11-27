// default package

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class pu3 extends iu5 {
    public boolean e;
    public final /* synthetic */ ru3 f;

    public pu3(ru3 ru3Var) {
        this.f = ru3Var;
    }

    @Override // iu5
    public final void a(RecyclerView recyclerView, f89 f89Var) {
        super.a(recyclerView, f89Var);
        f89Var.a.setPressed(false);
    }

    @Override // iu5
    public final boolean o(RecyclerView recyclerView, f89 f89Var, f89 f89Var2) {
        if (f89Var.f != f89Var2.f) {
            return false;
        }
        int b = f89Var.b();
        int b2 = f89Var2.b();
        ru3 ru3Var = this.f;
        ou3 ou3Var = ru3Var.a;
        ru3 ru3Var2 = ou3Var.f;
        int i = ru3Var2.n;
        ArrayList arrayList = ru3Var2.e;
        int i2 = b - i;
        int i3 = b2 - i;
        int i4 = ru3Var2.r - i;
        if (i2 >= 0 && i3 >= 0 && i2 < i4 && i3 < i4) {
            Long l = (Long) arrayList.get(i2);
            arrayList.set(i2, (Long) arrayList.get(i3));
            arrayList.set(i3, l);
            ou3Var.j(b, b2);
            ((bd5) f89Var.a).setDrawDivider(b2 != ru3Var.r - 1);
            ((bd5) f89Var2.a).setDrawDivider(b != ru3Var.r - 1);
            this.e = true;
        }
        return true;
    }

    @Override // iu5
    public final void q(f89 f89Var, int i) {
        ru3 ru3Var = this.f;
        if (i != 0) {
            ru3Var.b.K0(false);
            f89Var.a.setPressed(true);
        } else if (this.e) {
            qu3 qu3Var = ru3Var.f;
            if (qu3Var != null) {
                qu3Var.a();
            }
            this.e = false;
        }
    }
}
