package z5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements b {
    public final /* synthetic */ a8.a a;

    public c(a8.a aVar) {
        this.a = aVar;
    }

    @Override // z5.b
    public final void a(w5.a aVar) {
        boolean c3 = aVar.c();
        a8.a aVar2 = this.a;
        if (c3) {
            aVar2.m(null, aVar2.O);
            return;
        }
        m mVar = aVar2.G;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.a).onConnectionFailed(aVar);
        }
    }
}
