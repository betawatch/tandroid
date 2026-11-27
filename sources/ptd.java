// default package

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public abstract class ptd {
    public static boolean a;
    public static boolean b;
    public static ArrayList c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(pcc pccVar) {
        boolean z;
        if (pccVar == null || b) {
            z = false;
        } else {
            ArrayList arrayList = e;
            if (arrayList == null) {
                arrayList = new ArrayList();
                e = arrayList;
            }
            arrayList.add(pccVar);
            z = true;
        }
        b();
        if (z) {
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
        Utilities.e.c(new kc((byte) 12));
    }

    public static void c(n01 n01Var) {
        if (n01Var == null || n01Var.d == null) {
            return;
        }
        b();
        n01 n01Var2 = (n01) d.get(n01Var.a);
        if (n01Var2 != null) {
            n01Var2.d = n01Var.d;
        } else {
            c.add(n01Var);
            d.put(n01Var.a, n01Var);
        }
        byte b2 = 11;
        hl.r(new kc(b2));
        hl.d3(new kc(b2), 1000L);
    }
}
