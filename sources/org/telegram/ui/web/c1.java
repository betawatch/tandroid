package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.sj0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class c1 {
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
        Utilities.globalQueue.postRunnable(new sj0(10));
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
        int i10 = 9;
        AndroidUtilities.cancelRunOnUIThread(new sj0(i10));
        AndroidUtilities.runOnUIThread(new sj0(i10), 1000L);
    }
}
