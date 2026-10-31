package u2;

import android.content.Context;
import android.net.Uri;
import e9.x1;
import j$.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q implements f0 {
    public final p a;
    public final hf.b b;
    public t7.u c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public q(Context context, c3.m mVar) {
        hf.b bVar = new hf.b(context);
        t7.u uVar = new t7.u(28);
        this.b = bVar;
        this.c = uVar;
        p pVar = new p(mVar, uVar);
        this.a = pVar;
        if (bVar != pVar.d) {
            pVar.d = bVar;
            pVar.b.clear();
            pVar.c.clear();
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
    public final a a(b2.p0 p0Var) {
        Uri uri;
        boolean z10;
        boolean z11;
        long j10;
        Uri uri2;
        String str;
        b2.c0 c0Var;
        String str2;
        b2.g0 g0Var;
        b2.p0 p0Var2 = p0Var;
        p0Var2.b.getClass();
        String scheme = p0Var2.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(p0Var2.b.b, "application/x-image-uri")) {
            long j11 = p0Var2.b.h;
            String str3 = e2.l0.a;
            throw null;
        }
        b2.k0 k0Var = p0Var2.b;
        int K = e2.l0.K(k0Var.a, k0Var.b);
        if (p0Var2.b.h != -9223372036854775807L) {
            c3.m mVar = this.a.a;
            synchronized (mVar) {
                mVar.e = 1;
            }
            p.a(this.a);
        }
        try {
            f0 b10 = this.a.b(K);
            b2.i0 a2 = p0Var2.c.a();
            b2.j0 j0Var = p0Var2.c;
            if (j0Var.a == -9223372036854775807L) {
                a2.a = this.d;
            }
            if (j0Var.d == -3.4028235E38f) {
                a2.d = this.g;
            }
            if (j0Var.e == -3.4028235E38f) {
                a2.e = this.h;
            }
            if (j0Var.b == -9223372036854775807L) {
                a2.b = this.e;
            }
            if (j0Var.c == -9223372036854775807L) {
                a2.c = this.f;
            }
            b2.j0 j0Var2 = new b2.j0(a2);
            if (j0Var2.equals(p0Var2.c)) {
                uri = null;
                z10 = true;
                z11 = false;
            } else {
                b2.g0 g0Var2 = new b2.g0();
                List list = Collections.EMPTY_LIST;
                e9.n0 n0Var = x1.e;
                b2.l0 l0Var = b2.l0.d;
                b2.f0 f0Var = p0Var2.e;
                b2.d0 d0Var = new b2.d0();
                d0Var.a = f0Var.b;
                d0Var.b = f0Var.d;
                d0Var.c = f0Var.e;
                d0Var.d = f0Var.f;
                d0Var.e = f0Var.g;
                d0Var.f = f0Var.h;
                String str4 = p0Var2.a;
                b2.s0 s0Var = p0Var2.d;
                p0Var2.c.a();
                b2.l0 l0Var2 = p0Var2.f;
                b2.k0 k0Var2 = p0Var2.b;
                if (k0Var2 != null) {
                    String str5 = k0Var2.f;
                    String str6 = k0Var2.b;
                    Uri uri3 = k0Var2.a;
                    list = k0Var2.e;
                    n0Var = k0Var2.g;
                    uri = null;
                    b2.h0 h0Var = k0Var2.c;
                    if (h0Var != null) {
                        z11 = false;
                        b2.g0 g0Var3 = new b2.g0();
                        z10 = true;
                        g0Var3.a = h0Var.a;
                        g0Var3.b = h0Var.b;
                        g0Var3.c = h0Var.c;
                        g0Var3.d = h0Var.d;
                        g0Var3.e = h0Var.e;
                        g0Var3.f = h0Var.f;
                        g0Var3.g = h0Var.g;
                        g0Var3.h = h0Var.h;
                        g0Var = g0Var3;
                    } else {
                        z10 = true;
                        z11 = false;
                        g0Var = new b2.g0();
                    }
                    b2.c0 c0Var2 = k0Var2.d;
                    j10 = k0Var2.h;
                    c0Var = c0Var2;
                    str = str6;
                    uri2 = uri3;
                    str2 = str5;
                    g0Var2 = g0Var;
                } else {
                    uri = null;
                    z10 = true;
                    z11 = false;
                    j10 = -9223372036854775807L;
                    uri2 = null;
                    str = null;
                    c0Var = null;
                    str2 = null;
                }
                List list2 = list;
                e9.n0 n0Var2 = n0Var;
                b2.i0 a10 = j0Var2.a();
                t6.p((g0Var2.b == null || g0Var2.a != null) ? z10 : z11 ? 1 : 0);
                b2.k0 k0Var3 = uri2 != null ? new b2.k0(uri2, str, g0Var2.a != null ? new b2.h0(g0Var2) : uri, c0Var, list2, str2, n0Var2, j10) : uri;
                if (str4 == null) {
                    str4 = "";
                }
                String str7 = str4;
                b2.f0 f0Var2 = new b2.f0(d0Var);
                b2.j0 j0Var3 = new b2.j0(a10);
                if (s0Var == null) {
                    s0Var = b2.s0.L;
                }
                p0Var2 = new b2.p0(str7, f0Var2, k0Var3, j0Var3, s0Var, l0Var2);
            }
            a a11 = b10.a(p0Var2);
            e9.n0 n0Var3 = p0Var2.b.g;
            if (!n0Var3.isEmpty()) {
                a[] aVarArr = new a[n0Var3.size() + 1];
                aVarArr[z11 ? 1 : 0] = a11;
                for (int i10 = z11 ? 1 : 0; i10 < n0Var3.size(); i10++) {
                    if (this.i) {
                        b2.w wVar = new b2.w();
                        wVar.r = b2.v0.n(((b2.o0) n0Var3.get(i10)).b);
                        wVar.d = ((b2.o0) n0Var3.get(i10)).c;
                        wVar.e = ((b2.o0) n0Var3.get(i10)).d;
                        wVar.f = ((b2.o0) n0Var3.get(i10)).e;
                        wVar.b = ((b2.o0) n0Var3.get(i10)).f;
                        wVar.a = ((b2.o0) n0Var3.get(i10)).g;
                        b2.x xVar = new b2.x(wVar);
                        org.telegram.ui.web.k0 k0Var4 = new org.telegram.ui.web.k0(21, this, xVar);
                        hf.b bVar = this.b;
                        rh.d0 d0Var2 = new rh.d0(k0Var4, 19);
                        li.k kVar = new li.k(7);
                        hb.a aVar = new hb.a(27);
                        if (this.c.F(xVar)) {
                            b2.w a12 = xVar.a();
                            a12.r = b2.v0.n("application/x-media3-cues");
                            a12.j = xVar.s;
                            a12.P = this.c.y(xVar);
                            xVar = new b2.x(a12);
                        }
                        b2.x xVar2 = xVar;
                        int i11 = i10 + 1;
                        String uri4 = ((b2.o0) n0Var3.get(i10)).a.toString();
                        b2.d0 d0Var3 = new b2.d0();
                        b2.g0 g0Var4 = new b2.g0();
                        List list3 = Collections.EMPTY_LIST;
                        x1 x1Var = x1.e;
                        b2.i0 i0Var = new b2.i0();
                        b2.l0 l0Var3 = b2.l0.d;
                        Uri parse = uri4 == null ? uri : Uri.parse(uri4);
                        t6.p((g0Var4.b == null || g0Var4.a != null) ? z10 : z11 ? 1 : 0);
                        b2.k0 k0Var5 = parse != null ? new b2.k0(parse, null, g0Var4.a != null ? new b2.h0(g0Var4) : uri, null, list3, null, x1Var, -9223372036854775807L) : uri;
                        b2.p0 p0Var3 = new b2.p0("", new b2.f0(d0Var3), k0Var5, new b2.j0(i0Var), b2.s0.L, l0Var3);
                        k0Var5.getClass();
                        aVarArr[i11] = new y0(p0Var3, bVar, d0Var2, kVar.u(p0Var3), aVar, TLObject.FLAG_20, xVar2);
                    } else {
                        hf.b bVar2 = this.b;
                        bVar2.getClass();
                        aVarArr[i10 + 1] = new n1((b2.o0) n0Var3.get(i10), bVar2, new hb.a(27));
                    }
                }
                a11 = new o0(aVarArr);
            }
            b2.f0 f0Var3 = p0Var2.e;
            if (f0Var3.b != 0 || f0Var3.d != Long.MIN_VALUE || f0Var3.f) {
                e eVar = new e(a11);
                long j12 = f0Var3.b;
                if (j12 >= 0) {
                    z11 = z10;
                }
                t6.f(z11);
                t6.p(!eVar.h);
                eVar.b = j12;
                long j13 = f0Var3.d;
                t6.p(!eVar.h);
                eVar.c = j13;
                boolean z12 = !f0Var3.g;
                t6.p(!eVar.h);
                eVar.d = z12;
                boolean z13 = f0Var3.e;
                t6.p(!eVar.h);
                eVar.e = z13;
                boolean z14 = f0Var3.f;
                t6.p(!eVar.h);
                eVar.f = z14;
                boolean z15 = f0Var3.h;
                t6.p(!eVar.h);
                eVar.g = z15;
                t6.p(!eVar.h);
                eVar.h = z10;
                a11 = new h(eVar);
            }
            p0Var2.b.getClass();
            if (p0Var2.b.d == null) {
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
        p pVar = this.a;
        pVar.e = z10;
        c3.m mVar = pVar.a;
        synchronized (mVar) {
            mVar.b = z10;
        }
        Iterator it = pVar.c.values().iterator();
        while (it.hasNext()) {
            ((f0) it.next()).b(z10);
        }
        return this;
    }

    @Override // u2.f0
    public final f0 c(int i10) {
        p pVar = this.a;
        pVar.g = i10;
        c3.m mVar = pVar.a;
        synchronized (mVar) {
            mVar.d = i10;
        }
        return this;
    }

    @Override // u2.f0
    public final f0 d(t7.u uVar) {
        this.c = uVar;
        p pVar = this.a;
        pVar.f = uVar;
        c3.m mVar = pVar.a;
        synchronized (mVar) {
            mVar.c = uVar;
        }
        Iterator it = pVar.c.values().iterator();
        while (it.hasNext()) {
            ((f0) it.next()).d(uVar);
        }
        return this;
    }
}
