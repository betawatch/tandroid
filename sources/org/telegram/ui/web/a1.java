package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.lj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class a1 {
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
        Utilities.globalQueue.postRunnable(new lj0(10));
    }

    public static void c(z0 z0Var) {
        if (z0Var == null || z0Var.d == null) {
            return;
        }
        b();
        z0 z0Var2 = (z0) d.get(z0Var.a);
        if (z0Var2 != null) {
            z0Var2.d = z0Var.d;
        } else {
            c.add(z0Var);
            d.put(z0Var.a, z0Var);
        }
        int i9 = 9;
        AndroidUtilities.cancelRunOnUIThread(new lj0(i9));
        AndroidUtilities.runOnUIThread(new lj0(i9), 1000L);
    }
}
