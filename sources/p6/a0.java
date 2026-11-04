package p6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a0 extends Exception {
    public final m6.a a;

    public a0(m6.a aVar) {
        m.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", aVar.b());
        this.a = aVar;
    }
}
