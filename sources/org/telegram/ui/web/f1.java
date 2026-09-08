package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.q31;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public abstract class f1 {
    public static boolean a;
    public static boolean b;
    public static ArrayList c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback == null || b) {
            z10 = false;
        } else {
            if (e == null) {
                e = new ArrayList();
            }
            e.add(callback);
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
        Utilities.globalQueue.postRunnable(new q31(6));
    }

    public static void c(e1 e1Var) {
        if (e1Var == null || e1Var.d == null) {
            return;
        }
        b();
        e1 e1Var2 = (e1) d.get(e1Var.a);
        if (e1Var2 != null) {
            e1Var2.d = e1Var.d;
        } else {
            c.add(e1Var);
            d.put(e1Var.a, e1Var);
        }
        int i10 = 5;
        AndroidUtilities.cancelRunOnUIThread(new q31(i10));
        AndroidUtilities.runOnUIThread(new q31(i10), 1000L);
    }
}
