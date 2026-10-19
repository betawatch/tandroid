package yh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements BillingController.ProductDetailsResponseListenerLegacy, e2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                z3.h hVar = (z3.h) this.b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.b, sb.a.s2(aVar.a, aVar.c));
                hVar.c.add(gVar);
                long j10 = hVar.j;
                if (j10 == -9223372036854775807L || aVar.d >= j10) {
                    hVar.g(gVar);
                    break;
                }
                break;
            default:
                ((e9.k0) this.b).c((z3.a) obj);
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.i iVar, List list) {
        int i10;
        o1 o1Var = (o1) this.b;
        ArrayList arrayList = o1Var.n0;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            c5.p pVar = (c5.p) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    sg.k kVar = (sg.k) obj;
                    if (kVar.h() != null && kVar.h().equals(pVar.c)) {
                        kVar.h = pVar;
                        if (kVar.f() > j10) {
                            j10 = kVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((sg.k) obj2).g = j10;
        }
        AndroidUtilities.runOnUIThread(new tg.p(o1Var, 15));
    }
}
