package y2;

import b4.i;
import b4.j;
import b4.m;
import j2.f;
import j2.h;
import j2.l;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends l implements b4.e {
    public final String o;
    public final m p;

    public b(String str, m mVar) {
        super(new i[2], new j[2]);
        this.o = str;
        o(1024);
        this.p = mVar;
    }

    @Override // j2.l
    public final h f() {
        return new i();
    }

    @Override // j2.l
    public final j2.j g() {
        return new b4.c(this);
    }

    @Override // j2.e
    public final String getName() {
        return this.o;
    }

    @Override // j2.l
    public final f h(Throwable th2) {
        return new b4.f("Unexpected decode error", th2);
    }

    @Override // j2.l
    public final f i(h hVar, j2.j jVar, boolean z10) {
        i iVar = (i) hVar;
        j jVar2 = (j) jVar;
        try {
            ByteBuffer byteBuffer = iVar.c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            m mVar = this.p;
            if (z10) {
                mVar.reset();
            }
            b4.d B = mVar.B(0, limit, array);
            long j10 = iVar.e;
            long j11 = iVar.r;
            jVar2.timeUs = j10;
            jVar2.a = B;
            if (j11 != Long.MAX_VALUE) {
                j10 = j11;
            }
            jVar2.b = j10;
            jVar2.shouldBeSkipped = false;
            return null;
        } catch (b4.f e10) {
            return e10;
        }
    }

    @Override // b4.e
    public final void b(long j10) {
    }
}
