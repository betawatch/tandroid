package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.n21;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        Utilities.globalQueue.postRunnable(new n21(7));
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
        int i10 = 6;
        AndroidUtilities.cancelRunOnUIThread(new n21(i10));
        AndroidUtilities.runOnUIThread(new n21(i10), 1000L);
    }
}
