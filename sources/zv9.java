// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class zv9 implements View.OnClickListener {
    public final /* synthetic */ ox0 a;

    public zv9(ox0 ox0Var) {
        this.a = ox0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aw9 aw9Var = (aw9) this.a.d;
        for (int i = 0; i < aw9Var.e.size(); i++) {
            r47 r47Var = (r47) aw9Var.e.get(i);
            boolean z = aw9Var.I;
            int i2 = yac.t0;
            if (z) {
                xb4.G(k5.a(i2).a).f(r47Var.F0());
            } else {
                xb4.G(k5.a(i2).a).X(r47Var.F0(), r47Var, 0, 0);
                lq3.q(aw9Var.d).y();
            }
        }
        aw9Var.d(true);
    }
}
