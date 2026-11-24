// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class oy0 implements my0 {
    public final xu7 a;
    public final int b;
    public final int c;
    public int d;
    public short e;

    public oy0(mf7 mf7Var) {
        xu7 xu7Var = mf7Var.e;
        this.a = xu7Var;
        xu7Var.N(12);
        this.c = xu7Var.E() & kk7.d4;
        this.b = xu7Var.E();
    }

    @Override // my0
    public final int a() {
        return -1;
    }

    @Override // my0
    public final int b() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [int, short] */
    @Override // my0
    public final int c() {
        xu7 xu7Var = this.a;
        int i = this.c;
        if (i == 8) {
            return xu7Var.A();
        }
        if (i == 16) {
            return xu7Var.H();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        ?? A = xu7Var.A();
        this.e = A;
        return (A & kk7.O3) >> 4;
    }
}
