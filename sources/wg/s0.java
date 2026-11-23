package wg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.w10;
import org.telegram.ui.Wallet.o5;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ s0(v0 v0Var, int i7) {
        this.a = i7;
        this.b = v0Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                v0 v0Var = this.b;
                ArrayList arrayList = v0Var.c2;
                o5 o5Var = v0Var.r2;
                v0Var.j2 = str;
                int i7 = v0Var.n2;
                if (i7 == 1) {
                    org.telegram.messenger.g0.r(o5Var);
                    org.telegram.messenger.g0.h3(o5Var, 350L);
                    break;
                } else if (i7 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        org.telegram.messenger.g0.r(o5Var);
                        org.telegram.messenger.g0.h3(o5Var, 350L);
                        break;
                    } else {
                        org.telegram.messenger.g0.r(o5Var);
                        arrayList.clear();
                        arrayList.addAll(r.e(v0Var.m2.id));
                        v0Var.n1(false, true);
                        v0Var.k1(true);
                        break;
                    }
                } else if (i7 == 3) {
                    v0Var.n1(false, true);
                    v0Var.k1(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                v0 v0Var2 = this.b;
                ArrayList arrayList2 = v0Var2.c2;
                if (!TextUtils.isEmpty(v0Var2.j2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    v0Var2.o1(true, true);
                    v0Var2.k1(true);
                    break;
                }
                break;
        }
    }
}
