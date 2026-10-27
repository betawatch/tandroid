package x2;

import android.view.View;
import b2.q1;
import bi.h0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import f9.f0;
import f9.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import r0.k1;
import zh.i0;
import zh.p1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements l, Continuation, e2.j, ag.s, b2, r0.n, BillingController.ProductDetailsResponseListenerLegacy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public k1 P0(View view, k1 k1Var) {
        ((i0) this.b).h.j(k1Var);
        return k1.b;
    }

    @Override // x2.l
    public s1 a(int i10, q1 q1Var, int[] iArr) {
        j jVar = (j) this.b;
        f0 t10 = f9.i0.t();
        for (int i11 = 0; i11 < q1Var.a; i11++) {
            t10.c(new g(i10, q1Var, i11, jVar, iArr[i11]));
        }
        return t10.f();
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                z3.h hVar = (z3.h) this.b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.b, pa.d.f(aVar.a, aVar.c));
                hVar.c.add(gVar);
                long j10 = hVar.j;
                if (j10 == -9223372036854775807L || aVar.d >= j10) {
                    hVar.g(gVar);
                    break;
                }
                break;
            default:
                ((f0) this.b).c((z3.a) obj);
                break;
        }
    }

    @Override // ag.s
    public void f(long j10) {
        ((zh.d) this.b).a(j10, true);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        ((h0) this.b).run();
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(d5.i iVar, List list) {
        int i10;
        p1 p1Var = (p1) this.b;
        ArrayList arrayList = p1Var.n0;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            d5.o oVar = (d5.o) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    tg.k kVar = (tg.k) obj;
                    if (kVar.h() != null && kVar.h().equals(oVar.c)) {
                        kVar.h = oVar;
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
            ((tg.k) obj2).g = j10;
        }
        AndroidUtilities.runOnUIThread(new ti.g(p1Var, 19));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }
}
