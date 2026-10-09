package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.t21;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public abstract class d1 {
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
        Utilities.globalQueue.postRunnable(new t21(9));
    }

    public static void c(c1 c1Var) {
        if (c1Var == null || c1Var.d == null) {
            return;
        }
        b();
        c1 c1Var2 = (c1) d.get(c1Var.a);
        if (c1Var2 != null) {
            c1Var2.d = c1Var.d;
        } else {
            c.add(c1Var);
            d.put(c1Var.a, c1Var);
        }
        int i10 = 8;
        AndroidUtilities.cancelRunOnUIThread(new t21(i10));
        AndroidUtilities.runOnUIThread(new t21(i10), 1000L);
    }
}
