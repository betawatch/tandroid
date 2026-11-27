// default package

import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
