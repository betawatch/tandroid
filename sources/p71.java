// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class p71 extends ka {
    public t61 c;
    public c71 d;

    public final boolean equals(Object obj) {
        c71 c71Var;
        c71 c71Var2;
        t61 t61Var;
        t61 t61Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && p71.class == obj.getClass()) {
            p71 p71Var = (p71) obj;
            int i = this.a;
            if (i == p71Var.a) {
                if (i == 1 && (t61Var = this.c) != null && (t61Var2 = p71Var.c) != null) {
                    return t61Var.a == t61Var2.a;
                }
                if (i == 2 && (c71Var = this.d) != null && (c71Var2 = p71Var.d) != null) {
                    return Objects.equals(c71Var.a, c71Var2.a);
                }
            }
        }
        return false;
    }
}
