// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class p99 extends zo5 {
    public static final p99 n;
    public final transient wq7 e;
    public final transient int f;
    public transient yo5 h;

    static {
        wq7 wq7Var = new wq7();
        wq7Var.d(3);
        n = new p99(wq7Var);
    }

    public p99(wq7 wq7Var) {
        this.e = wq7Var;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = wq7Var.c;
            if (i >= i2) {
                this.f = ype.d(j);
                return;
            } else {
                yve.j(i, i2);
                j += wq7Var.b[i];
                i++;
            }
        }
    }

    @Override // jo5
    public final boolean m() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f;
    }
}
