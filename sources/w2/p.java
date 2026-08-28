package w2;

import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p {
    public final i a;
    public final String b;
    public final t2.c c;
    public final t2.e d;
    public final q e;

    public p(i iVar, String str, t2.c cVar, t2.e eVar, q qVar) {
        this.a = iVar;
        this.b = str;
        this.c = cVar;
        this.d = eVar;
        this.e = qVar;
    }

    public final void a(t2.a aVar, t2.g gVar) {
        t2.e eVar = this.d;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        q qVar = this.e;
        b3.c cVar = qVar.c;
        i b10 = this.a.b(aVar.c);
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
        mVar.f = new HashMap();
        mVar.d = Long.valueOf(qVar.a.d());
        mVar.e = Long.valueOf(qVar.b.d());
        mVar.a = this.b;
        mVar.c = new l(this.c, (byte[]) eVar.apply(aVar.b));
        mVar.b = aVar.a;
        b3.a aVar2 = (b3.a) cVar;
        aVar2.b.execute(new androidx.car.app.utils.c(aVar2, b10, gVar, mVar.i(), 1));
    }
}
