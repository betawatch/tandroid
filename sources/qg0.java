// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class qg0 implements gm6 {
    public final long a;
    public final long b;
    public long c;

    public qg0(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j - 1;
    }

    public final void b() {
        long j = this.c;
        if (j < this.a || j > this.b) {
            lq5.n();
        }
    }

    @Override // gm6
    public final boolean next() {
        long j = this.c + 1;
        this.c = j;
        return !(j > this.b);
    }
}
