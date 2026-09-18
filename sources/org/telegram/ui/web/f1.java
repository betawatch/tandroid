package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.p91;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        Utilities.globalQueue.postRunnable(new p91(5));
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
        int i10 = 4;
        AndroidUtilities.cancelRunOnUIThread(new p91(i10));
        AndroidUtilities.runOnUIThread(new p91(i10), 1000L);
    }
}
