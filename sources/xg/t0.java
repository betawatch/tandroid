package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ t0(w0 w0Var, int i3) {
        this.a = i3;
        this.b = w0Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                w0 w0Var = this.b;
                ArrayList arrayList = w0Var.Z1;
                wi.i0 i0Var = w0Var.o2;
                w0Var.g2 = str;
                int i3 = w0Var.k2;
                if (i3 == 1) {
                    org.telegram.messenger.g0.r(i0Var);
                    org.telegram.messenger.g0.i3(i0Var, 350L);
                    break;
                } else if (i3 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        org.telegram.messenger.g0.r(i0Var);
                        org.telegram.messenger.g0.i3(i0Var, 350L);
                        break;
                    } else {
                        org.telegram.messenger.g0.r(i0Var);
                        arrayList.clear();
                        arrayList.addAll(s.e(w0Var.j2.id));
                        w0Var.m1(false, true);
                        w0Var.j1(true);
                        break;
                    }
                } else if (i3 == 3) {
                    w0Var.m1(false, true);
                    w0Var.j1(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                w0 w0Var2 = this.b;
                ArrayList arrayList2 = w0Var2.Z1;
                if (!TextUtils.isEmpty(w0Var2.g2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    w0Var2.n1(true, true);
                    w0Var2.j1(true);
                    break;
                }
                break;
        }
    }
}
