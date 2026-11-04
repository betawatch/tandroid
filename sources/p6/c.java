package p6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements b {
    public final /* synthetic */ q8.a a;

    public c(q8.a aVar) {
        this.a = aVar;
    }

    @Override // p6.b
    public final void a(m6.a aVar) {
        boolean c2 = aVar.c();
        q8.a aVar2 = this.a;
        if (c2) {
            aVar2.l(null, aVar2.E);
            return;
        }
        n nVar = aVar2.u;
        if (nVar != null) {
            ((com.google.android.gms.common.api.l) nVar.a).onConnectionFailed(aVar);
        }
    }
}
