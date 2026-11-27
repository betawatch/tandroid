// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
