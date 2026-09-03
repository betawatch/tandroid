package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.j21;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class e1 {
    public static boolean a;
    public static boolean b;
    public static ArrayList c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z4;
        if (callback == null || b) {
            z4 = false;
        } else {
            if (e == null) {
                e = new ArrayList();
            }
            e.add(callback);
            z4 = true;
        }
        b();
        if (z4) {
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
        Utilities.globalQueue.postRunnable(new j21(8));
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
        int i10 = 7;
        AndroidUtilities.cancelRunOnUIThread(new j21(i10));
        AndroidUtilities.runOnUIThread(new j21(i10), 1000L);
    }
}
