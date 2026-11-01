package vh;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ p0(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // org.telegram.messenger.r20
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
                    n5 a2 = ((s0) arrayList.get(i10)).a();
                    if ((a2.v() || ((file = a2.L) != null && file.exists())) && currentTimeMillis - a2.d <= 604800000) {
                        arrayList4.add(a2);
                        arrayList2.add(Long.valueOf(a2.b));
                    } else {
                        arrayList3.add(a2);
                    }
                }
                t0 t0Var = this.b;
                t0Var.b(arrayList3);
                t0Var.f = false;
                t0Var.e = true;
                th.e5 O1 = wp.r1(t0Var.a).O1();
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    th.d5 d5Var = new th.d5(O1, (n5) obj2);
                    O1.d(d5Var.J, d5Var, O1.b, false);
                }
                at.f(O1.a).k(at.v5, new Object[0]);
                break;
            default:
                t0 t0Var2 = this.b;
                t0Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    n5 a10 = ((s0) arrayList.get(i12)).a();
                    if ((a10.v() || ((file2 = a10.L) != null && file2.exists())) && (!a10.g ? currentTimeMillis2 - a10.d <= 604800000 : currentTimeMillis2 <= a10.J)) {
                        t0Var2.b.add(a10);
                        arrayList5.add(Long.valueOf(a10.b));
                    } else {
                        arrayList6.add(a10);
                    }
                }
                t0Var2.b(arrayList6);
                t0Var2.d = false;
                t0Var2.c = true;
                at.f(t0Var2.a).k(at.y5, new Object[0]);
                break;
        }
    }
}
