package zd;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class p0 extends q0 {
    public final y1 c;

    public p0(long j3, y1 y1Var) {
        super(j3);
        this.c = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // zd.q0
    public final String toString() {
        return super.toString() + this.c;
    }
}
