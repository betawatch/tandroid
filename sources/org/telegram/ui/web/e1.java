package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.b31;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public abstract class e1 {
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
        Utilities.globalQueue.postRunnable(new b31(10));
    }

    public static void c(d1 d1Var) {
        if (d1Var == null || d1Var.d == null) {
            return;
        }
        b();
        d1 d1Var2 = (d1) d.get(d1Var.a);
        if (d1Var2 != null) {
            d1Var2.d = d1Var.d;
        } else {
            c.add(d1Var);
            d.put(d1Var.a, d1Var);
        }
        int i10 = 9;
        AndroidUtilities.cancelRunOnUIThread(new b31(i10));
        AndroidUtilities.runOnUIThread(new b31(i10), 1000L);
    }
}
