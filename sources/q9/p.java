package q9;

import org.telegram.ui.fs0;
import org.telegram.ui.web.w;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class p implements pa.b {
    public static final w c = new w(13);
    public static final f d = new f(1);
    public pa.a a;
    public volatile pa.b b;

    public p(w wVar, pa.b bVar) {
        this.a = wVar;
        this.b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.f(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.a = new fs0(26, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.f(bVar);
        }
    }

    @Override // pa.b
    public final Object get() {
        return this.b.get();
    }
}
