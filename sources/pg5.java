// default package

import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pg5 extends qg0 {
    public final List d;
    public final long e;

    public pg5(long j, List list) {
        super(0L, list.size() - 1);
        this.e = j;
        this.d = list;
    }

    @Override // gm6
    public final long a() {
        b();
        return this.e + ((dh5) this.d.get((int) this.c)).e;
    }

    @Override // gm6
    public final long g() {
        b();
        dh5 dh5Var = (dh5) this.d.get((int) this.c);
        return this.e + dh5Var.e + dh5Var.c;
    }
}
