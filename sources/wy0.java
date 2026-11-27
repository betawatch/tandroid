// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wy0 implements uy0 {
    public final ey7 a;
    public final int b;
    public final int c;
    public int d;
    public short e;

    public wy0(wh7 wh7Var) {
        ey7 ey7Var = wh7Var.e;
        this.a = ey7Var;
        ey7Var.N(12);
        this.c = ey7Var.E() & jn7.d4;
        this.b = ey7Var.E();
    }

    @Override // uy0
    public final int a() {
        return -1;
    }

    @Override // uy0
    public final int b() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [int, short] */
    @Override // uy0
    public final int c() {
        ey7 ey7Var = this.a;
        int i = this.c;
        if (i == 8) {
            return ey7Var.A();
        }
        if (i == 16) {
            return ey7Var.H();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        ?? A = ey7Var.A();
        this.e = A;
        return (A & jn7.O3) >> 4;
    }
}
