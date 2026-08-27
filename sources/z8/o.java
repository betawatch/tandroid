package z8;

import org.telegram.ui.di1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o implements y9.b {
    public static final u3.k c = new u3.k(16);
    public static final a9.l d = new a9.l(5);
    public y9.a a;
    public volatile y9.b b;

    public o(u3.k kVar, y9.b bVar) {
        this.a = kVar;
        this.b = bVar;
    }

    public final void a(y9.a aVar) {
        y9.b bVar;
        y9.b bVar2;
        y9.b bVar3 = this.b;
        a9.l lVar = d;
        if (bVar3 != lVar) {
            aVar.b(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != lVar) {
                bVar2 = bVar;
            } else {
                this.a = new di1(13, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.b(bVar);
        }
    }

    @Override // y9.b
    public final Object get() {
        return this.b.get();
    }
}
