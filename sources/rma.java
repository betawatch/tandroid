// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class rma {
    public static final rma c = new rma(-1, -1);
    public final int a;
    public final int b;

    static {
        new rma(0, 0);
        String str = gcc.a;
    }

    public rma(int i, int i2) {
        yve.f((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof rma) {
            rma rmaVar = (rma) obj;
            if (this.a == rmaVar.a && this.b == rmaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b ^ ((i << 16) | (i >>> 16));
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
