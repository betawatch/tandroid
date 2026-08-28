package x5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements b {
    public final /* synthetic */ y7.a a;

    public c(y7.a aVar) {
        this.a = aVar;
    }

    @Override // x5.b
    public final void a(u5.a aVar) {
        boolean c10 = aVar.c();
        y7.a aVar2 = this.a;
        if (c10) {
            aVar2.c(null, aVar2.O);
            return;
        }
        m mVar = aVar2.G;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.a).onConnectionFailed(aVar);
        }
    }
}
