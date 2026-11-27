// default package

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xi3 implements hj, qq4 {
    public final /* synthetic */ uj3 a;

    public /* synthetic */ xi3(uj3 uj3Var) {
        this.a = uj3Var;
    }

    public final void a(ph4 ph4Var) {
        uj3 uj3Var = this.a;
        if (uj3Var.s3) {
            bj3 bj3Var = uj3Var.D0;
            if (bj3Var != null) {
                bj3Var.D0.remove(ph4Var);
                bj3 bj3Var2 = uj3Var.D0;
                String obj = uj3Var.k0.getSearchField().getText().toString();
                View currentView = bj3Var2.getCurrentView();
                boolean z = TextUtils.isEmpty(bj3Var2.N0) ? true : !bj3Var2.h0;
                bj3Var2.N0 = obj;
                bj3Var2.Q(currentView, bj3Var2.getCurrentPosition(), obj, z);
            }
            uj3Var.t5(true, null, null, false, true);
            uj3Var.Z.a.l(uj3Var.Y.r);
        }
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        uj3 uj3Var = this.a;
        ArrayList arrayList = uj3Var.K2;
        uj3Var.M2 = i;
        uj3Var.N2 = i2;
        uj3Var.O2 = false;
        if (uj3Var.E2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(jf7.a(((Long) uj3Var.K2.get(i3)).longValue(), 0L));
        }
        uj3Var.E2.q(uj3Var, arrayList2, uj3Var.D1.getFieldText(), false, z, i, i2, null);
    }
}
