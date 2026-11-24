// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q54 extends r54 {
    public final oqb c;

    public q54(long j, oqb oqbVar) {
        super(j);
        this.c = oqbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // r54
    public final String toString() {
        return super.toString() + this.c;
    }
}
