// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
