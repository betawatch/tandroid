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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vo7 {
    public final Runnable a;
    public final ks b = new ks();
    public yn4 c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public vo7(Runnable runnable) {
        OnBackInvokedCallback a;
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                a = so7.a.a(new oo7(this, (byte) 0), new oo7(this, (byte) 1), new po7(this, (byte) 0), new po7(this, (byte) 1));
            } else {
                a = qo7.a.a(new po7(this, (byte) 2));
            }
            this.d = a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    public final void a() {
        yn4 yn4Var;
        yn4 yn4Var2 = this.c;
        if (yn4Var2 == null) {
            ks ksVar = this.b;
            ListIterator listIterator = ksVar.listIterator(ksVar.c);
            while (true) {
                if (listIterator.hasPrevious()) {
                    yn4Var = listIterator.previous();
                    if (((yn4) yn4Var).a) {
                        break;
                    }
                } else {
                    yn4Var = 0;
                    break;
                }
            }
            yn4Var2 = yn4Var;
        }
        this.c = null;
        if (yn4Var2 == null) {
            this.a.run();
            return;
        }
        go4 go4Var = yn4Var2.d;
        if (go4.K(3)) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + go4Var);
        }
        yn4 yn4Var3 = go4Var.j;
        ArrayList arrayList = go4Var.n;
        go4Var.i = true;
        go4Var.A(true);
        int i = 0;
        go4Var.i = false;
        if (go4Var.h == null) {
            if (yn4Var3.a) {
                if (go4.K(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                go4Var.S();
                return;
            } else {
                if (go4.K(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                go4Var.g.a();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(go4.F(go4Var.h));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (obj != null) {
                    fyb.g();
                    return;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        ArrayList arrayList2 = go4Var.h.a;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            bn4 bn4Var = ((wo4) obj2).b;
            if (bn4Var != null) {
                bn4Var.y = false;
            }
        }
        Iterator it2 = go4Var.f(0, 1, new ArrayList(Collections.singletonList(go4Var.h))).iterator();
        while (it2.hasNext()) {
            ac3 ac3Var = (ac3) it2.next();
            ArrayList arrayList3 = ac3Var.c;
            if (go4.K(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            ac3Var.d(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                ((vka) obj3).getClass();
                el2.d(null, arrayList4);
            }
            List k = yk2.k(yk2.m(arrayList4));
            int size4 = k.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((uka) k.get(i5)).a(ac3Var.a);
            }
            int size5 = arrayList3.size();
            for (int i6 = 0; i6 < size5; i6++) {
                ((vka) arrayList3.get(i6)).getClass();
            }
            List k2 = yk2.k(arrayList3);
            if (k2.size() > 0) {
                ((vka) k2.get(0)).getClass();
                throw null;
            }
        }
        ArrayList arrayList5 = go4Var.h.a;
        int size6 = arrayList5.size();
        while (i < size6) {
            Object obj4 = arrayList5.get(i);
            i++;
            bn4 bn4Var2 = ((wo4) obj4).b;
            if (bn4Var2 != null && bn4Var2.W == null) {
                go4Var.g(bn4Var2).j();
            }
        }
        go4Var.h = null;
        go4Var.h0();
        if (go4.K(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + yn4Var3.a + " for  FragmentManager " + go4Var);
        }
    }

    public final void b(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        boolean z2 = this.f;
        qo7 qo7Var = qo7.a;
        if (z) {
            if (z2) {
                return;
            }
            qo7Var.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
            return;
        }
        if (z2) {
            qo7Var.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void c() {
        boolean z = this.g;
        boolean z2 = false;
        ks ksVar = this.b;
        if (ksVar == null || !ksVar.isEmpty()) {
            Iterator it = ksVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((yn4) it.next()).a) {
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
