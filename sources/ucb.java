// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ucb {
    public static final ucb c = new ucb(-9223372036854775807L, false);
    public long a;
    public boolean b;

    public ucb(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final void a(long j) {
        this.a = hs6.r(this.a, j);
    }

    public final void b(boolean z) {
        a(z ? 1L : 0L);
    }

    public final void c(float f) {
        a(Float.floatToIntBits(f));
    }
}
