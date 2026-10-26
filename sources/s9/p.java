package s9;

import org.telegram.ui.zg1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class p implements ra.b {
    public static final s0.b c = new s0.b(5);
    public static final f d = new f(1);
    public ra.a a;
    public volatile ra.b b;

    public p(s0.b bVar, ra.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    public final void a(ra.a aVar) {
        ra.b bVar;
        ra.b bVar2;
        ra.b bVar3 = this.b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.i(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.a = new zg1(12, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.i(bVar);
        }
    }

    @Override // ra.b
    public final Object get() {
        return this.b.get();
    }
}
