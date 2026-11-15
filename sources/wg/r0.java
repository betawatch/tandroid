package wg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ r0(u0 u0Var, int i7) {
        this.a = i7;
        this.b = u0Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                u0 u0Var = this.b;
                ArrayList arrayList = u0Var.c2;
                s4.s0 s0Var = u0Var.r2;
                u0Var.j2 = str;
                int i7 = u0Var.n2;
                if (i7 == 1) {
                    org.telegram.messenger.g0.r(s0Var);
                    org.telegram.messenger.g0.i3(s0Var, 350L);
                    break;
                } else if (i7 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        org.telegram.messenger.g0.r(s0Var);
                        org.telegram.messenger.g0.i3(s0Var, 350L);
                        break;
                    } else {
                        org.telegram.messenger.g0.r(s0Var);
                        arrayList.clear();
                        arrayList.addAll(q.e(u0Var.m2.id));
                        u0Var.m1(false, true);
                        u0Var.j1(true);
                        break;
                    }
                } else if (i7 == 3) {
                    u0Var.m1(false, true);
                    u0Var.j1(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                u0 u0Var2 = this.b;
                ArrayList arrayList2 = u0Var2.c2;
                if (!TextUtils.isEmpty(u0Var2.j2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    u0Var2.n1(true, true);
                    u0Var2.j1(true);
                    break;
                }
                break;
        }
    }
}
