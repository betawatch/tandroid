package v7;

import j$.util.Objects;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class r {
    public static boolean a(e0.n0 n0Var, e0.n0 n0Var2) {
        if (n0Var == null && n0Var2 == null) {
            return true;
        }
        if (n0Var == null || n0Var2 == null) {
            return false;
        }
        String str = n0Var.d;
        String str2 = n0Var2.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(n0Var.a), Objects.toString(n0Var2.a)) && Objects.equals(n0Var.c, n0Var2.c) && Boolean.valueOf(n0Var.e).equals(Boolean.valueOf(n0Var2.e)) && Boolean.valueOf(n0Var.f).equals(Boolean.valueOf(n0Var2.f)) : Objects.equals(str, str2);
    }

    public static int b(e0.n0 n0Var) {
        if (n0Var == null) {
            return 0;
        }
        String str = n0Var.d;
        return str != null ? str.hashCode() : Objects.hash(n0Var.a, n0Var.c, Boolean.valueOf(n0Var.e), Boolean.valueOf(n0Var.f));
    }
}
