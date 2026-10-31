package x2;

import e9.b0;
import e9.v1;
import e9.z;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import z9.d0;
import z9.h1;
import zf.k1;
import zf.y;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i10 = 4;
                return z.f(n.c((n) Collections.max(list, new e(3)), (n) Collections.max(list2, new e(3)))).a(list.size(), list2.size()).b((n) Collections.max(list, new e(i10)), (n) Collections.max(list2, new e(i10)), new e(i10)).e();
            case 1:
                return ((f) Collections.max((List) obj)).compareTo((f) Collections.max((List) obj2));
            case 2:
                return ((k) ((List) obj).get(0)).compareTo((k) ((List) obj2).get(0));
            case 3:
                return n.c((n) obj, (n) obj2);
            case 4:
                n nVar = (n) obj;
                n nVar2 = (n) obj2;
                boolean z10 = nVar.e;
                int i11 = nVar.s;
                v1 a2 = (z10 && nVar.n) ? o.l : o.l.a();
                boolean z11 = nVar.f.F;
                b0 b0Var = b0.a;
                if (z11) {
                    b0Var = b0Var.b(Integer.valueOf(i11), Integer.valueOf(nVar2.s), o.l.a());
                }
                b0 b10 = b0Var.c(nVar.O, nVar2.O).b(Integer.valueOf(nVar.w), Integer.valueOf(nVar2.w), a2);
                if (nVar.K && nVar.M) {
                    b10 = b10.a(nVar.N, nVar2.N);
                }
                return b10.c(nVar.L, nVar2.L).b(Integer.valueOf(i11), Integer.valueOf(nVar2.s), a2).e();
            case 5:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 6:
                return ((d0) ((h1) obj)).a.compareTo(((d0) ((h1) obj2)).a);
            case 7:
                return ((y2.p) obj).a - ((y2.p) obj2).a;
            case 8:
                return Float.compare(((y2.p) obj).c, ((y2.p) obj2).c);
            case 9:
                int i12 = ((y) obj).b;
                int i13 = ((y) obj2).b;
                if (i12 < i13) {
                    return 1;
                }
                return i12 > i13 ? -1 : 0;
            case 10:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            default:
                int i14 = ((k1) obj).b;
                int i15 = ((k1) obj2).b;
                if (i14 < i15) {
                    return 1;
                }
                return i14 > i15 ? -1 : 0;
        }
    }
}
