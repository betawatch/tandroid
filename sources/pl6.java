// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        di7 di7Var = (di7) this.d;
        long j2 = j * di7Var.g;
        if (this.b != -1 && (i = this.c) != -1) {
            j2 -= r5 + i;
        }
        if (j2 > 0) {
            return gcc.Z(di7Var.d, j2 - 1);
        }
        return -9223372036854775807L;
    }
}
