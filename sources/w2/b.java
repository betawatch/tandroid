package w2;

import h2.h;
import h2.l;
import java.nio.ByteBuffer;
import z3.f;
import z3.g;
import z3.j;
import z3.k;
import z3.n;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class b extends l implements f {
    public final String o;
    public final n p;

    public b(String str, n nVar) {
        super(new j[2], new k[2]);
        this.o = str;
        o(1024);
        this.p = nVar;
    }

    @Override // h2.l
    public final h f() {
        return new j();
    }

    @Override // h2.l
    public final h2.j g() {
        return new z3.d(this);
    }

    @Override // h2.e
    public final String getName() {
        return this.o;
    }

    @Override // h2.l
    public final h2.f h(Throwable th2) {
        return new g("Unexpected decode error", th2);
    }

    @Override // h2.l
    public final h2.f i(h hVar, h2.j jVar, boolean z10) {
        j jVar2 = (j) hVar;
        k kVar = (k) jVar;
        try {
            ByteBuffer byteBuffer = jVar2.c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            n nVar = this.p;
            if (z10) {
                nVar.reset();
            }
            z3.e w9 = nVar.w(0, limit, array);
            long j10 = jVar2.e;
            long j11 = jVar2.r;
            kVar.timeUs = j10;
            kVar.a = w9;
            if (j11 != Long.MAX_VALUE) {
                j10 = j11;
            }
            kVar.b = j10;
            kVar.shouldBeSkipped = false;
            return null;
        } catch (g e) {
            return e;
        }
    }

    @Override // z3.f
    public final void b(long j10) {
    }
}
