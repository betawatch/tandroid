package r9;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class p implements qa.b {
    public static final r.a c = new r.a(6);
    public static final f d = new f(1);
    public qa.a a;
    public volatile qa.b b;

    public p(r.a aVar, qa.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public final void a(qa.a aVar) {
        qa.b bVar;
        qa.b bVar2;
        qa.b bVar3 = this.b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.h(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.a = new org.telegram.ui.web.m(6, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.h(bVar);
        }
    }

    @Override // qa.b
    public final Object get() {
        return this.b.get();
    }
}
