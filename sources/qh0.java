// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class qh0 implements em6 {
    public final long a;
    public final long b;
    public long c;

    public qh0(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j - 1;
    }

    public final void a() {
        long j = this.c;
        if (j < this.a || j > this.b) {
            u36.g();
        }
    }

    @Override // em6
    public final boolean next() {
        long j = this.c + 1;
        this.c = j;
        return !(j > this.b);
    }
}
