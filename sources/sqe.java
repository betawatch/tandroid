// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class sqe {
    public static boolean a(l38 l38Var, l38 l38Var2) {
        if (l38Var == null) {
            if (l38Var2 == null) {
                return true;
            }
        } else if (l38Var2 != null) {
            String str = l38Var.d;
            String str2 = l38Var2.d;
            return (str == null && str2 == null) ? Objects.equals(Objects.toString(l38Var.a), Objects.toString(l38Var2.a)) && Objects.equals(l38Var.c, l38Var2.c) && Boolean.valueOf(l38Var.e).equals(Boolean.valueOf(l38Var2.e)) && Boolean.valueOf(l38Var.f).equals(Boolean.valueOf(l38Var2.f)) : Objects.equals(str, str2);
        }
        return false;
    }

    public static int b(l38 l38Var) {
        if (l38Var == null) {
            return 0;
        }
        String str = l38Var.d;
        return str != null ? str.hashCode() : Objects.hash(l38Var.a, l38Var.c, Boolean.valueOf(l38Var.e), Boolean.valueOf(l38Var.f));
    }
}
