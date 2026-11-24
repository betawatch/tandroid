// default package

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xt3 extends fs5 {
    public boolean e;
    public final /* synthetic */ zt3 f;

    public xt3(zt3 zt3Var) {
        this.f = zt3Var;
    }

    @Override // fs5
    public final void a(RecyclerView recyclerView, s49 s49Var) {
        super.a(recyclerView, s49Var);
        s49Var.a.setPressed(false);
    }

    @Override // fs5
    public final boolean o(RecyclerView recyclerView, s49 s49Var, s49 s49Var2) {
        if (s49Var.f != s49Var2.f) {
            return false;
        }
        int b = s49Var.b();
        int b2 = s49Var2.b();
        zt3 zt3Var = this.f;
        wt3 wt3Var = zt3Var.a;
        zt3 zt3Var2 = wt3Var.f;
        int i = zt3Var2.n;
        ArrayList arrayList = zt3Var2.e;
        int i2 = b - i;
        int i3 = b2 - i;
        int i4 = zt3Var2.r - i;
        if (i2 >= 0 && i3 >= 0 && i2 < i4 && i3 < i4) {
            Long l = (Long) arrayList.get(i2);
            arrayList.set(i2, (Long) arrayList.get(i3));
            arrayList.set(i3, l);
            wt3Var.j(b, b2);
            ((za5) s49Var.a).setDrawDivider(b2 != zt3Var.r - 1);
            ((za5) s49Var2.a).setDrawDivider(b != zt3Var.r - 1);
            this.e = true;
        }
        return true;
    }

    @Override // fs5
    public final void q(s49 s49Var, int i) {
        zt3 zt3Var = this.f;
        if (i != 0) {
            zt3Var.b.J0(false);
            s49Var.a.setPressed(true);
        } else if (this.e) {
            yt3 yt3Var = zt3Var.f;
            if (yt3Var != null) {
                yt3Var.a();
            }
            this.e = false;
        }
    }
}
