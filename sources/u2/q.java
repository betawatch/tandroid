package u2;

import android.content.Context;
import android.net.Uri;
import e9.x1;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m.g3;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class q implements f0 {
    public final jg.f a;
    public final qf.b b;
    public t7.u c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public q(Context context, c3.m mVar) {
        qf.b bVar = new qf.b(context, 18);
        t7.u uVar = new t7.u(28);
        this.b = bVar;
        this.c = uVar;
        jg.f fVar = new jg.f(mVar, uVar);
        this.a = fVar;
        if (bVar != ((qf.b) fVar.f)) {
            fVar.f = bVar;
            ((HashMap) fVar.d).clear();
            ((HashMap) fVar.e).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static f0 e(Class cls, g2.g gVar) {
        try {
            return (f0) cls.getConstructor(g2.g.class).newInstance(gVar);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u2.f0
    public final a a(b2.o0 o0Var) {
        Uri uri;
        boolean z10;
        boolean z11;
        long j10;
        Uri uri2;
        String str;
        b2.b0 b0Var;
        String str2;
        b2.f0 f0Var;
        b2.o0 o0Var2 = o0Var;
        o0Var2.b.getClass();
        String scheme = o0Var2.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(o0Var2.b.b, "application/x-image-uri")) {
            long j11 = o0Var2.b.h;
            String str3 = e2.m0.a;
            throw null;
        }
        b2.j0 j0Var = o0Var2.b;
        int K = e2.m0.K(j0Var.a, j0Var.b);
        if (o0Var2.b.h != -9223372036854775807L) {
            c3.m mVar = (c3.m) this.a.c;
            synchronized (mVar) {
                mVar.e = 1;
            }
            jg.f.a(this.a);
        }
        try {
            f0 b10 = this.a.b(K);
            b2.h0 a2 = o0Var2.c.a();
            b2.i0 i0Var = o0Var2.c;
            if (i0Var.a == -9223372036854775807L) {
                a2.a = this.d;
            }
            if (i0Var.d == -3.4028235E38f) {
                a2.d = this.g;
            }
            if (i0Var.e == -3.4028235E38f) {
                a2.e = this.h;
            }
            if (i0Var.b == -9223372036854775807L) {
                a2.b = this.e;
            }
            if (i0Var.c == -9223372036854775807L) {
                a2.c = this.f;
            }
            b2.i0 i0Var2 = new b2.i0(a2);
            if (i0Var2.equals(o0Var2.c)) {
                uri = null;
                z10 = true;
                z11 = false;
            } else {
                b2.f0 f0Var2 = new b2.f0();
                List list = Collections.EMPTY_LIST;
                e9.n0 n0Var = x1.e;
                b2.k0 k0Var = b2.k0.d;
                b2.e0 e0Var = o0Var2.e;
                b2.c0 c0Var = new b2.c0();
                c0Var.a = e0Var.b;
                c0Var.b = e0Var.d;
                c0Var.c = e0Var.e;
                c0Var.d = e0Var.f;
                c0Var.e = e0Var.g;
                c0Var.f = e0Var.h;
                String str4 = o0Var2.a;
                b2.r0 r0Var = o0Var2.d;
                o0Var2.c.a();
                b2.k0 k0Var2 = o0Var2.f;
                b2.j0 j0Var2 = o0Var2.b;
                if (j0Var2 != null) {
                    String str5 = j0Var2.f;
                    String str6 = j0Var2.b;
                    Uri uri3 = j0Var2.a;
                    list = j0Var2.e;
                    n0Var = j0Var2.g;
                    uri = null;
                    b2.g0 g0Var = j0Var2.c;
                    if (g0Var != null) {
                        z11 = false;
                        b2.f0 f0Var3 = new b2.f0();
                        z10 = true;
                        f0Var3.a = g0Var.a;
                        f0Var3.b = g0Var.b;
                        f0Var3.c = g0Var.c;
                        f0Var3.d = g0Var.d;
                        f0Var3.e = g0Var.e;
                        f0Var3.f = g0Var.f;
                        f0Var3.g = g0Var.g;
                        f0Var3.h = g0Var.h;
                        f0Var = f0Var3;
                    } else {
                        z10 = true;
                        z11 = false;
                        f0Var = new b2.f0();
                    }
                    b2.b0 b0Var2 = j0Var2.d;
                    j10 = j0Var2.h;
                    b0Var = b0Var2;
                    str = str6;
                    uri2 = uri3;
                    str2 = str5;
                    f0Var2 = f0Var;
                } else {
                    uri = null;
                    z10 = true;
                    z11 = false;
                    j10 = -9223372036854775807L;
                    uri2 = null;
                    str = null;
                    b0Var = null;
                    str2 = null;
                }
                List list2 = list;
                e9.n0 n0Var2 = n0Var;
                b2.h0 a10 = i0Var2.a();
                u6.p((f0Var2.b == null || f0Var2.a != null) ? z10 : z11 ? 1 : 0);
                b2.j0 j0Var3 = uri2 != null ? new b2.j0(uri2, str, f0Var2.a != null ? new b2.g0(f0Var2) : uri, b0Var, list2, str2, n0Var2, j10) : uri;
                if (str4 == null) {
                    str4 = "";
                }
                String str7 = str4;
                b2.e0 e0Var2 = new b2.e0(c0Var);
                b2.i0 i0Var3 = new b2.i0(a10);
                if (r0Var == null) {
                    r0Var = b2.r0.L;
                }
                o0Var2 = new b2.o0(str7, e0Var2, j0Var3, i0Var3, r0Var, k0Var2);
            }
            a a11 = b10.a(o0Var2);
            e9.n0 n0Var3 = o0Var2.b.g;
            if (!n0Var3.isEmpty()) {
                a[] aVarArr = new a[n0Var3.size() + 1];
                aVarArr[z11 ? 1 : 0] = a11;
                for (int i10 = z11 ? 1 : 0; i10 < n0Var3.size(); i10++) {
                    if (this.i) {
                        b2.v vVar = new b2.v();
                        vVar.r = b2.v0.n(((b2.n0) n0Var3.get(i10)).b);
                        vVar.d = ((b2.n0) n0Var3.get(i10)).c;
                        vVar.e = ((b2.n0) n0Var3.get(i10)).d;
                        vVar.f = ((b2.n0) n0Var3.get(i10)).e;
                        vVar.b = ((b2.n0) n0Var3.get(i10)).f;
                        vVar.a = ((b2.n0) n0Var3.get(i10)).g;
                        b2.w wVar = new b2.w(vVar);
                        org.telegram.ui.web.m mVar2 = new org.telegram.ui.web.m(11, this, wVar);
                        qf.b bVar = this.b;
                        qg.h0 h0Var = new qg.h0(mVar2, 17);
                        g3 g3Var = new g3(5);
                        oa.d dVar = new oa.d(27);
                        if (this.c.a0(wVar)) {
                            b2.v a12 = wVar.a();
                            a12.r = b2.v0.n("application/x-media3-cues");
                            a12.j = wVar.s;
                            a12.P = this.c.L(wVar);
                            wVar = new b2.w(a12);
                        }
                        b2.w wVar2 = wVar;
                        int i11 = i10 + 1;
                        String uri4 = ((b2.n0) n0Var3.get(i10)).a.toString();
                        b2.c0 c0Var2 = new b2.c0();
                        b2.f0 f0Var4 = new b2.f0();
                        List list3 = Collections.EMPTY_LIST;
                        x1 x1Var = x1.e;
                        b2.h0 h0Var2 = new b2.h0();
                        b2.k0 k0Var3 = b2.k0.d;
                        Uri parse = uri4 == null ? uri : Uri.parse(uri4);
                        u6.p((f0Var4.b == null || f0Var4.a != null) ? z10 : z11 ? 1 : 0);
                        b2.j0 j0Var4 = parse != null ? new b2.j0(parse, null, f0Var4.a != null ? new b2.g0(f0Var4) : uri, null, list3, null, x1Var, -9223372036854775807L) : uri;
                        b2.o0 o0Var3 = new b2.o0("", new b2.e0(c0Var2), j0Var4, new b2.i0(h0Var2), b2.r0.L, k0Var3);
                        j0Var4.getClass();
                        aVarArr[i11] = new y0(o0Var3, bVar, h0Var, g3Var.B(o0Var3), dVar, 1048576, wVar2);
                    } else {
                        qf.b bVar2 = this.b;
                        bVar2.getClass();
                        aVarArr[i10 + 1] = new n1((b2.n0) n0Var3.get(i10), bVar2, new oa.d(27));
                    }
                }
                a11 = new o0(aVarArr);
            }
            b2.e0 e0Var3 = o0Var2.e;
            if (e0Var3.b != 0 || e0Var3.d != Long.MIN_VALUE || e0Var3.f) {
                f fVar = new f(a11);
                long j12 = e0Var3.b;
                if (j12 >= 0) {
                    z11 = z10;
                }
                u6.g(z11);
                u6.p(!fVar.h);
                fVar.b = j12;
                long j13 = e0Var3.d;
                u6.p(!fVar.h);
                fVar.c = j13;
                boolean z12 = !e0Var3.g;
                u6.p(!fVar.h);
                fVar.d = z12;
                boolean z13 = e0Var3.e;
                u6.p(!fVar.h);
                fVar.e = z13;
                boolean z14 = e0Var3.f;
                u6.p(!fVar.h);
                fVar.f = z14;
                boolean z15 = e0Var3.h;
                u6.p(!fVar.h);
                fVar.g = z15;
                u6.p(!fVar.h);
                fVar.h = z10;
                a11 = new i(fVar);
            }
            o0Var2.b.getClass();
            if (o0Var2.b.d == null) {
                return a11;
            }
            e2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return a11;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // u2.f0
    public final f0 b(boolean z10) {
        this.i = z10;
        jg.f fVar = this.a;
        fVar.a = z10;
        c3.m mVar = (c3.m) fVar.c;
        synchronized (mVar) {
            mVar.b = z10;
        }
        Iterator it = ((HashMap) fVar.e).values().iterator();
        while (it.hasNext()) {
            ((f0) it.next()).b(z10);
        }
        return this;
    }

    @Override // u2.f0
    public final f0 c(int i10) {
        jg.f fVar = this.a;
        fVar.b = i10;
        c3.m mVar = (c3.m) fVar.c;
        synchronized (mVar) {
            mVar.d = i10;
        }
        return this;
    }

    @Override // u2.f0
    public final f0 d(t7.u uVar) {
        this.c = uVar;
        jg.f fVar = this.a;
        fVar.g = uVar;
        c3.m mVar = (c3.m) fVar.c;
        synchronized (mVar) {
            mVar.c = uVar;
        }
        Iterator it = ((HashMap) fVar.e).values().iterator();
        while (it.hasNext()) {
            ((f0) it.next()).d(uVar);
        }
        return this;
    }
}
