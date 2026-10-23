package v7;

import j$.util.Objects;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public abstract class r {
    public static boolean a(e0.m0 m0Var, e0.m0 m0Var2) {
        if (m0Var == null && m0Var2 == null) {
            return true;
        }
        if (m0Var == null || m0Var2 == null) {
            return false;
        }
        String str = m0Var.d;
        String str2 = m0Var2.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(m0Var.a), Objects.toString(m0Var2.a)) && Objects.equals(m0Var.c, m0Var2.c) && Boolean.valueOf(m0Var.e).equals(Boolean.valueOf(m0Var2.e)) && Boolean.valueOf(m0Var.f).equals(Boolean.valueOf(m0Var2.f)) : Objects.equals(str, str2);
    }

    public static int b(e0.m0 m0Var) {
        if (m0Var == null) {
            return 0;
        }
        String str = m0Var.d;
        return str != null ? str.hashCode() : Objects.hash(m0Var.a, m0Var.c, Boolean.valueOf(m0Var.e), Boolean.valueOf(m0Var.f));
    }
}
