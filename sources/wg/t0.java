package wg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.y10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ t0(w0 w0Var, int i7) {
        this.a = i7;
        this.b = w0Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                w0 w0Var = this.b;
                ArrayList arrayList = w0Var.c2;
                s4.s0 s0Var = w0Var.r2;
                w0Var.j2 = str;
                int i7 = w0Var.n2;
                if (i7 == 1) {
                    org.telegram.messenger.g0.r(s0Var);
                    org.telegram.messenger.g0.h3(s0Var, 350L);
                    break;
                } else if (i7 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        org.telegram.messenger.g0.r(s0Var);
                        org.telegram.messenger.g0.h3(s0Var, 350L);
                        break;
                    } else {
                        org.telegram.messenger.g0.r(s0Var);
                        arrayList.clear();
                        arrayList.addAll(s.e(w0Var.m2.id));
                        w0Var.n1(false, true);
                        w0Var.k1(true);
                        break;
                    }
                } else if (i7 == 3) {
                    w0Var.n1(false, true);
                    w0Var.k1(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                w0 w0Var2 = this.b;
                ArrayList arrayList2 = w0Var2.c2;
                if (!TextUtils.isEmpty(w0Var2.j2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    w0Var2.o1(true, true);
                    w0Var2.k1(true);
                    break;
                }
                break;
        }
    }
}
