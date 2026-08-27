package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.tq0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class b1 {
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
        Utilities.globalQueue.postRunnable(new tq0(9));
    }

    public static void c(a1 a1Var) {
        if (a1Var == null || a1Var.d == null) {
            return;
        }
        b();
        a1 a1Var2 = (a1) d.get(a1Var.a);
        if (a1Var2 != null) {
            a1Var2.d = a1Var.d;
        } else {
            c.add(a1Var);
            d.put(a1Var.a, a1Var);
        }
        int i10 = 8;
        AndroidUtilities.cancelRunOnUIThread(new tq0(i10));
        AndroidUtilities.runOnUIThread(new tq0(i10), 1000L);
    }
}
