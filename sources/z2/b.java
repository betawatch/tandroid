package z2;

import c4.i;
import c4.j;
import c4.m;
import java.nio.ByteBuffer;
import k2.h;
import k2.l;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b extends l implements c4.e {
    public final String o;
    public final m p;

    public b(String str, m mVar) {
        super(new i[2], new j[2]);
        this.o = str;
        o(1024);
        this.p = mVar;
    }

    @Override // k2.l
    public final h f() {
        return new i();
    }

    @Override // k2.l
    public final k2.j g() {
        return new c4.c(this);
    }

    @Override // k2.e
    public final String getName() {
        return this.o;
    }

    @Override // k2.l
    public final k2.f h(Throwable th2) {
        return new c4.f("Unexpected decode error", th2);
    }

    @Override // k2.l
    public final k2.f i(h hVar, k2.j jVar, boolean z9) {
        i iVar = (i) hVar;
        j jVar2 = (j) jVar;
        try {
            ByteBuffer byteBuffer = iVar.c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            m mVar = this.p;
            if (z9) {
                mVar.reset();
            }
            c4.d c10 = mVar.c(0, limit, array);
            long j3 = iVar.e;
            long j10 = iVar.r;
            jVar2.timeUs = j3;
            jVar2.a = c10;
            if (j10 != Long.MAX_VALUE) {
                j3 = j10;
            }
            jVar2.b = j3;
            jVar2.shouldBeSkipped = false;
            return null;
        } catch (c4.f e10) {
            return e10;
        }
    }

    @Override // c4.e
    public final void b(long j3) {
    }
}
