package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.c30;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        Utilities.globalQueue.postRunnable(new d1(0));
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
        int i10 = 29;
        AndroidUtilities.cancelRunOnUIThread(new c30(i10));
        AndroidUtilities.runOnUIThread(new c30(i10), 1000L);
    }
}
