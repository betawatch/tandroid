package u9;

import org.telegram.ui.Wallet.k8;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class o implements ua.b {
    public static final r2.j c = new r2.j(28);
    public static final ab.m d = new ab.m(2);
    public ua.a a;
    public volatile ua.b b;

    public o(r2.j jVar, ua.b bVar) {
        this.a = jVar;
        this.b = bVar;
    }

    public final void a(ua.a aVar) {
        ua.b bVar;
        ua.b bVar2;
        ua.b bVar3 = this.b;
        ab.m mVar = d;
        if (bVar3 != mVar) {
            aVar.b(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != mVar) {
                bVar2 = bVar;
            } else {
                this.a = new k8(19, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.b(bVar);
        }
    }

    @Override // ua.b
    public final Object get() {
        return this.b.get();
    }
}
