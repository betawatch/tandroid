// default package

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pj3 implements gk, nq4 {
    public final /* synthetic */ nk3 a;

    public /* synthetic */ pj3(nk3 nk3Var) {
        this.a = nk3Var;
    }

    public final void a(sh4 sh4Var) {
        nk3 nk3Var = this.a;
        if (nk3Var.s3) {
            sj3 sj3Var = nk3Var.D0;
            if (sj3Var != null) {
                sj3Var.D0.remove(sh4Var);
                sj3 sj3Var2 = nk3Var.D0;
                String obj = nk3Var.k0.getSearchField().getText().toString();
                View currentView = sj3Var2.getCurrentView();
                boolean z = TextUtils.isEmpty(sj3Var2.N0) ? true : !sj3Var2.h0;
                sj3Var2.N0 = obj;
                sj3Var2.P(currentView, sj3Var2.getCurrentPosition(), obj, z);
            }
            nk3Var.t5(true, null, null, false, true);
            nk3Var.Z.a.l(nk3Var.Y.r);
        }
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        nk3 nk3Var = this.a;
        ArrayList arrayList = nk3Var.K2;
        nk3Var.M2 = i;
        nk3Var.N2 = i2;
        nk3Var.O2 = false;
        if (nk3Var.E2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(bf7.a(((Long) nk3Var.K2.get(i3)).longValue(), 0L));
        }
        nk3Var.E2.q(nk3Var, arrayList2, nk3Var.D1.getFieldText(), false, z, i, i2, null);
    }
}
