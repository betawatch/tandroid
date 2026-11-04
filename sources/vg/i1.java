package vg;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ i1(int i3) {
        this.a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return (int) ((((l1) obj).a * 100.0f) - (((l1) obj2).a * 100.0f));
            case 1:
                return ((String) obj).compareTo((String) obj2);
            case 2:
                return ((d2.v) obj2).j - ((d2.v) obj).j;
            case 3:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 4:
                return Integer.compare(((z2.f) ((List) obj).get(0)).f, ((z2.f) ((List) obj2).get(0)).f);
            case 5:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i3 = 9;
                return g9.u.f(z2.m.c((z2.m) Collections.max(list, new i1(8)), (z2.m) Collections.max(list2, new i1(8)))).a(list.size(), list2.size()).b((z2.m) Collections.max(list, new i1(i3)), (z2.m) Collections.max(list2, new i1(i3)), new i1(i3)).e();
            case 6:
                return ((z2.e) Collections.max((List) obj)).compareTo((z2.e) Collections.max((List) obj2));
            case 7:
                return ((z2.j) ((List) obj).get(0)).compareTo((z2.j) ((List) obj2).get(0));
            case 8:
                return z2.m.c((z2.m) obj, (z2.m) obj2);
            case 9:
                z2.m mVar = (z2.m) obj;
                z2.m mVar2 = (z2.m) obj2;
                boolean z10 = mVar.e;
                int i10 = mVar.s;
                g9.q1 a10 = (z10 && mVar.n) ? z2.n.l : z2.n.l.a();
                boolean z11 = mVar.f.F;
                g9.w wVar = g9.w.a;
                if (z11) {
                    wVar = wVar.b(Integer.valueOf(i10), Integer.valueOf(mVar2.s), z2.n.l.a());
                }
                g9.w b10 = wVar.c(mVar.P, mVar2.P).b(Integer.valueOf(mVar.w), Integer.valueOf(mVar2.w), a10);
                if (mVar.L && mVar.N) {
                    b10 = b10.a(mVar.O, mVar2.O);
                }
                return b10.c(mVar.M, mVar2.M).b(Integer.valueOf(i10), Integer.valueOf(mVar2.s), a10).e();
            case 10:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            default:
                return ((ca.h0) ((ca.v1) obj)).a.compareTo(((ca.h0) ((ca.v1) obj2)).a);
        }
    }
}
