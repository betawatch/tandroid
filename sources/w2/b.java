package w2;

import h2.g;
import h2.h;
import h2.j;
import java.nio.ByteBuffer;
import z3.f;
import z3.i;
import z3.m;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b extends j implements z3.e {
    public final m o;

    public b(String str, m mVar) {
        super(new i[2], new z3.j[2]);
        int i10 = this.g;
        g[] gVarArr = this.e;
        e2.d.g(i10 == gVarArr.length);
        for (g gVar : gVarArr) {
            gVar.l(1024);
        }
        this.o = mVar;
    }

    @Override // h2.j
    public final g f() {
        return new i();
    }

    @Override // h2.j
    public final h g() {
        return new z3.c(this);
    }

    @Override // h2.j
    public final h2.e h(Throwable th2) {
        return new f("Unexpected decode error", th2);
    }

    @Override // h2.j
    public final h2.e i(g gVar, h hVar, boolean z10) {
        i iVar = (i) gVar;
        z3.j jVar = (z3.j) hVar;
        try {
            ByteBuffer byteBuffer = iVar.e;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            m mVar = this.o;
            if (z10) {
                mVar.reset();
            }
            z3.d p5 = mVar.p(0, limit, array);
            long j3 = iVar.h;
            long j10 = iVar.v;
            jVar.c = j3;
            jVar.f = p5;
            if (j10 != Long.MAX_VALUE) {
                j3 = j10;
            }
            jVar.h = j3;
            jVar.e = false;
            return null;
        } catch (f e7) {
            return e7;
        }
    }

    @Override // z3.e
    public final void b(long j3) {
    }
}
