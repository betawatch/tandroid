package y5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements b {
    public final /* synthetic */ z7.a a;

    public c(z7.a aVar) {
        this.a = aVar;
    }

    @Override // y5.b
    public final void a(v5.a aVar) {
        boolean c10 = aVar.c();
        z7.a aVar2 = this.a;
        if (c10) {
            aVar2.i(null, aVar2.O);
            return;
        }
        m mVar = aVar2.G;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.a).onConnectionFailed(aVar);
        }
    }
}
