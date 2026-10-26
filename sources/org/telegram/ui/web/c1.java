package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.u90;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        Utilities.globalQueue.postRunnable(new u90(16));
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
        int i10 = 15;
        AndroidUtilities.cancelRunOnUIThread(new u90(i10));
        AndroidUtilities.runOnUIThread(new u90(i10), 1000L);
    }
}
