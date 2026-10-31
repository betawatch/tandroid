package vh;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ p0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.a) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    n5 a2 = ((r0) arrayList.get(i10)).a();
                    if ((a2.v() || ((file = a2.L) != null && file.exists())) && currentTimeMillis - a2.d <= 604800000) {
                        arrayList4.add(a2);
                        arrayList2.add(Long.valueOf(a2.b));
                    } else {
                        arrayList3.add(a2);
                    }
                }
                s0 s0Var = this.b;
                s0Var.b(arrayList3);
                s0Var.f = false;
                s0Var.e = true;
                th.e5 O1 = vp.r1(s0Var.a).O1();
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    th.d5 d5Var = new th.d5(O1, (n5) obj2);
                    O1.d(d5Var.J, d5Var, O1.b, false);
                }
                zs.f(O1.a).k(zs.v5, new Object[0]);
                break;
            default:
                s0 s0Var2 = this.b;
                s0Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    n5 a10 = ((r0) arrayList.get(i12)).a();
                    if ((a10.v() || ((file2 = a10.L) != null && file2.exists())) && (!a10.g ? currentTimeMillis2 - a10.d <= 604800000 : currentTimeMillis2 <= a10.J)) {
                        s0Var2.b.add(a10);
                        arrayList5.add(Long.valueOf(a10.b));
                    } else {
                        arrayList6.add(a10);
                    }
                }
                s0Var2.b(arrayList6);
                s0Var2.d = false;
                s0Var2.c = true;
                zs.f(s0Var2.a).k(zs.y5, new Object[0]);
                break;
        }
    }
}
