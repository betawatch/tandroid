package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.q31;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
