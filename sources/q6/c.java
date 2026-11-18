package q6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class c implements b {
    public final /* synthetic */ r8.a a;

    public c(r8.a aVar) {
        this.a = aVar;
    }

    @Override // q6.b
    public final void a(n6.a aVar) {
        boolean c10 = aVar.c();
        r8.a aVar2 = this.a;
        if (c10) {
            aVar2.g(null, aVar2.E);
            return;
        }
        n nVar = aVar2.u;
        if (nVar != null) {
            ((com.google.android.gms.common.api.l) nVar.a).onConnectionFailed(aVar);
        }
    }
}
