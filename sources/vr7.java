// default package

import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class vr7 {
    public final Runnable a;
    public final ls b = new ls();
    public cq4 c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public vr7(Runnable runnable) {
        OnBackInvokedCallback a;
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                a = sr7.a.a(new or7(this, (byte) 0), new or7(this, (byte) 1), new pr7(this, (byte) 0), new pr7(this, (byte) 1));
            } else {
                a = qr7.a.a(new pr7(this, (byte) 2));
            }
            this.d = a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    public final void a() {
        cq4 cq4Var;
        cq4 cq4Var2 = this.c;
        if (cq4Var2 == null) {
            ls lsVar = this.b;
            ListIterator listIterator = lsVar.listIterator(lsVar.c);
            while (true) {
                if (listIterator.hasPrevious()) {
                    cq4Var = listIterator.previous();
                    if (((cq4) cq4Var).a) {
                        break;
                    }
                } else {
                    cq4Var = 0;
                    break;
                }
            }
            cq4Var2 = cq4Var;
        }
        this.c = null;
        if (cq4Var2 == null) {
            this.a.run();
            return;
        }
        kq4 kq4Var = cq4Var2.d;
        if (kq4.K(3)) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + kq4Var);
        }
        cq4 cq4Var3 = kq4Var.j;
        ArrayList arrayList = kq4Var.n;
        kq4Var.i = true;
        kq4Var.A(true);
        int i = 0;
        kq4Var.i = false;
        if (kq4Var.h == null) {
            if (cq4Var3.a) {
                if (kq4.K(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                kq4Var.S();
                return;
            } else {
                if (kq4.K(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                kq4Var.g.a();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(kq4.F(kq4Var.h));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (obj != null) {
                    grb.o();
                    return;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        ArrayList arrayList2 = kq4Var.h.a;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            gp4 gp4Var = ((ar4) obj2).b;
            if (gp4Var != null) {
                gp4Var.y = false;
            }
        }
        Iterator it2 = kq4Var.f(0, 1, new ArrayList(Collections.singletonList(kq4Var.h))).iterator();
        while (it2.hasNext()) {
            tc3 tc3Var = (tc3) it2.next();
            ArrayList arrayList3 = tc3Var.c;
            if (kq4.K(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            tc3Var.d(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                ((poa) obj3).getClass();
                yl2.d(null, arrayList4);
            }
            List k = sl2.k(sl2.m(arrayList4));
            int size4 = k.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((ooa) k.get(i5)).a(tc3Var.a);
            }
            int size5 = arrayList3.size();
            for (int i6 = 0; i6 < size5; i6++) {
                ((poa) arrayList3.get(i6)).getClass();
            }
            List k2 = sl2.k(arrayList3);
            if (k2.size() > 0) {
                ((poa) k2.get(0)).getClass();
                throw null;
            }
        }
        ArrayList arrayList5 = kq4Var.h.a;
        int size6 = arrayList5.size();
        while (i < size6) {
            Object obj4 = arrayList5.get(i);
            i++;
            gp4 gp4Var2 = ((ar4) obj4).b;
            if (gp4Var2 != null && gp4Var2.W == null) {
                kq4Var.g(gp4Var2).j();
            }
        }
        kq4Var.h = null;
        kq4Var.h0();
        if (kq4.K(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + cq4Var3.a + " for  FragmentManager " + kq4Var);
        }
    }

    public final void b(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        boolean z2 = this.f;
        qr7 qr7Var = qr7.a;
        if (z) {
            if (z2) {
                return;
            }
            qr7Var.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
            return;
        }
        if (z2) {
            qr7Var.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void c() {
        boolean z = this.g;
        boolean z2 = false;
        ls lsVar = this.b;
        if (lsVar == null || !lsVar.isEmpty()) {
            Iterator it = lsVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((cq4) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        b(z2);
    }
}
