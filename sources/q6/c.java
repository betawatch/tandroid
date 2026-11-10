package q6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
