// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class pl6 {
    public long a;
    public int b;
    public int c;
    public Object d;

    public final long a() {
        int i;
        long j = this.a;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        ci7 ci7Var = (ci7) this.d;
        long j2 = j * ci7Var.g;
        if (this.b != -1 && (i = this.c) != -1) {
            j2 -= r5 + i;
        }
        if (j2 > 0) {
            return gcc.Z(ci7Var.d, j2 - 1);
        }
        return -9223372036854775807L;
    }
}
