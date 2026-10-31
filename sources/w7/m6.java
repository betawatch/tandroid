package w7;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class m6 {
    public static boolean a;
    public static boolean b;
    public static ArrayList c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(q20 q20Var) {
        boolean z10;
        if (q20Var == null || b) {
            z10 = false;
        } else {
            if (e == null) {
                e = new ArrayList();
            }
            e.add(q20Var);
            z10 = true;
        }
        b();
        if (z10) {
            return null;
        }
        return c;
    }

    public static void b() {
        if (a || b) {
            return;
        }
        a = true;
        c = new ArrayList();
        d = new LongSparseArray();
        Utilities.e.c(new org.telegram.ui.Components.voip.m0(24));
    }

    public static void c(org.telegram.ui.web.a1 a1Var) {
        if (a1Var == null || a1Var.d == null) {
            return;
        }
        b();
        org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) d.get(a1Var.a);
        if (a1Var2 != null) {
            a1Var2.d = a1Var.d;
        } else {
            c.add(a1Var);
            d.put(a1Var.a, a1Var);
        }
        int i10 = 23;
        org.telegram.messenger.i0.r(new org.telegram.ui.Components.voip.m0(i10));
        org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.m0(i10), 1000L);
    }
}
