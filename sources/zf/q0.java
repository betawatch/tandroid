package zf;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q0 implements Comparator {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;

    public q0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final int a(w0 w0Var) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i11 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i10 >= Math.min(20, arrayList2.size())) {
                        return -1;
                    }
                    if (((TLRPC.Document) arrayList2.get(i10)).id == w0Var.a.id) {
                        return (arrayList2.size() - i10) + 1000000;
                    }
                    i10++;
                }
            } else {
                if (((TLRPC.Document) arrayList.get(i11)).id == w0Var.a.id) {
                    return i11 + 2000000;
                }
                i11++;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        w0 w0Var = (w0) obj;
        w0 w0Var2 = (w0) obj2;
        boolean K2 = jj.K2(w0Var.a, true);
        if (K2 == jj.K2(w0Var2.a, true)) {
            int a2 = a(w0Var);
            int a10 = a(w0Var2);
            if (a2 > a10) {
                return -1;
            }
            if (a2 >= a10) {
                return 0;
            }
        } else if (K2) {
            return -1;
        }
        return 1;
    }
}
