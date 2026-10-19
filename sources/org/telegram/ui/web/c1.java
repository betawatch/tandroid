package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.df0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public abstract class c1 {
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
        Utilities.globalQueue.postRunnable(new df0(13));
    }

    public static void c(b1 b1Var) {
        if (b1Var == null || b1Var.d == null) {
            return;
        }
        b();
        b1 b1Var2 = (b1) d.get(b1Var.a);
        if (b1Var2 != null) {
            b1Var2.d = b1Var.d;
        } else {
            c.add(b1Var);
            d.put(b1Var.a, b1Var);
        }
        int i10 = 12;
        AndroidUtilities.cancelRunOnUIThread(new df0(i10));
        AndroidUtilities.runOnUIThread(new df0(i10), 1000L);
    }
}
