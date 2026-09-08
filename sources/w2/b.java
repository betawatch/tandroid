package w2;

import h2.f;
import h2.h;
import h2.l;
import java.nio.ByteBuffer;
import z3.i;
import z3.j;
import z3.m;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b extends l implements z3.e {
    public final String o;
    public final m p;

    public b(String str, m mVar) {
        super(new i[2], new j[2]);
        this.o = str;
        o(1024);
        this.p = mVar;
    }

    @Override // h2.l
    public final h f() {
        return new i();
    }

    @Override // h2.l
    public final h2.j g() {
        return new z3.c(this);
    }

    @Override // h2.e
    public final String getName() {
        return this.o;
    }

    @Override // h2.l
    public final f h(Throwable th2) {
        return new z3.f("Unexpected decode error", th2);
    }

    @Override // h2.l
    public final f i(h hVar, h2.j jVar, boolean z10) {
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
            z3.d p5 = mVar.p(0, limit, array);
            long j3 = iVar.e;
            long j10 = iVar.r;
            jVar2.timeUs = j3;
            jVar2.a = p5;
            if (j10 != Long.MAX_VALUE) {
                j3 = j10;
            }
            jVar2.b = j3;
            jVar2.shouldBeSkipped = false;
            return null;
        } catch (z3.f e7) {
            return e7;
        }
    }

    @Override // z3.e
    public final void b(long j3) {
    }
}
