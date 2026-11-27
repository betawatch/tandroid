// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xa6 {
    public final long a;
    public final float b;
    public final long c;

    public xa6(wa6 wa6Var) {
        this.a = wa6Var.a;
        this.b = wa6Var.b;
        this.c = wa6Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa6)) {
            return false;
        }
        xa6 xa6Var = (xa6) obj;
        return this.a == xa6Var.a && this.b == xa6Var.b && this.c == xa6Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
