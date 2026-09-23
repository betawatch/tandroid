package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.g91;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        Utilities.globalQueue.postRunnable(new g91(5));
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
        int i10 = 4;
        AndroidUtilities.cancelRunOnUIThread(new g91(i10));
        AndroidUtilities.runOnUIThread(new g91(i10), 1000L);
    }
}
