// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class rx6 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public rx6(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final rx6 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new rx6(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b(rx6 rx6Var) {
        if (rx6Var == null) {
            return false;
        }
        if (this == rx6Var) {
            return true;
        }
        return this.a.equals(rx6Var.a) && this.b == rx6Var.b && this.c == rx6Var.c && this.d == rx6Var.d;
    }

    public final boolean c() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx6)) {
            return false;
        }
        rx6 rx6Var = (rx6) obj;
        return b(rx6Var) && this.e == rx6Var.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public rx6(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public rx6(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public rx6(Object obj) {
        this(obj, -1L);
    }
}
