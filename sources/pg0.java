// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class pg0 implements bk6 {
    public final long a;
    public final long b;
    public long c;

    public pg0(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j - 1;
    }

    public final void b() {
        long j = this.c;
        if (j < this.a || j > this.b) {
            w26.g();
        }
    }

    @Override // bk6
    public final boolean next() {
        long j = this.c + 1;
        this.c = j;
        return !(j > this.b);
    }
}
