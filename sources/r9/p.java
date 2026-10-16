package r9;

import org.telegram.ui.web.o0;
import r0.s0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class p implements qa.b {
    public static final s0 c = new s0(3);
    public static final f d = new f(1);
    public qa.a a;
    public volatile qa.b b;

    public p(s0 s0Var, qa.b bVar) {
        this.a = s0Var;
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
                this.a = new o0(4, this.a, aVar);
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
