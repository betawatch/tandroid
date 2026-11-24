// default package

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ws9 extends x23 {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable h(int i, yw7 yw7Var) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(yw7Var.u()));
        }
        if (i == 1) {
            return Boolean.valueOf(yw7Var.A() == 1);
        }
        if (i == 2) {
            return j(yw7Var);
        }
        if (i != 3) {
            if (i == 8) {
                return i(yw7Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(yw7Var.u()));
                yw7Var.O(2);
                return date;
            }
            int E = yw7Var.E();
            ArrayList arrayList = new ArrayList(E);
            for (int i2 = 0; i2 < E; i2++) {
                Serializable h = h(yw7Var.A(), yw7Var);
                if (h != null) {
                    arrayList.add(h);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String j = j(yw7Var);
            int A = yw7Var.A();
            if (A == 9) {
                return hashMap;
            }
            Serializable h2 = h(A, yw7Var);
            if (h2 != null) {
                hashMap.put(j, h2);
            }
        }
    }

    public static HashMap i(yw7 yw7Var) {
        int E = yw7Var.E();
        HashMap hashMap = new HashMap(E);
        for (int i = 0; i < E; i++) {
            String j = j(yw7Var);
            Serializable h = h(yw7Var.A(), yw7Var);
            if (h != null) {
                hashMap.put(j, h);
            }
        }
        return hashMap;
    }

    public static String j(yw7 yw7Var) {
        int H = yw7Var.H();
        int i = yw7Var.b;
        yw7Var.O(H);
        return new String(yw7Var.a, i, H);
    }
}
