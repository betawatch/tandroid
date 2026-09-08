package u2;

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import rg.p2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class p implements e0 {
    public final c5.g a;
    public final pf.b b;
    public rb.a c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public p(Context context, c3.m mVar) {
        pf.b bVar = new pf.b(context, 18);
        this.b = bVar;
        rb.a aVar = new rb.a(28);
        this.c = aVar;
        c5.g gVar = new c5.g();
        gVar.b = mVar;
        gVar.f = aVar;
        gVar.c = new HashMap();
        gVar.d = new HashMap();
        gVar.a = true;
        this.a = gVar;
        if (bVar != ((pf.b) gVar.e)) {
            gVar.e = bVar;
            ((HashMap) gVar.c).clear();
            ((HashMap) gVar.d).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static e0 e(Class cls, g2.g gVar) {
        try {
            return (e0) cls.getConstructor(g2.g.class).newInstance(gVar);
        } catch (Exception e7) {
            throw new IllegalStateException(e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u2.e0
    public final a a(b2.k0 k0Var) {
        Uri uri;
        char c10;
        long j3;
        Uri uri2;
        String str;
        b2.x xVar;
        String str2;
        b2.b0 b0Var;
        b2.k0 k0Var2 = k0Var;
        k0Var2.b.getClass();
        String scheme = k0Var2.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(k0Var2.b.b, "application/x-image-uri")) {
            long j10 = k0Var2.b.h;
            String str3 = e2.d0.a;
            throw null;
        }
        b2.f0 f0Var = k0Var2.b;
        int I = e2.d0.I(f0Var.a, f0Var.b);
        if (k0Var2.b.h != -9223372036854775807L) {
            c3.m mVar = (c3.m) this.a.b;
            synchronized (mVar) {
                mVar.d = 1;
            }
        }
        try {
            c5.g gVar = this.a;
            HashMap hashMap = (HashMap) gVar.d;
            e0 e0Var = (e0) hashMap.get(Integer.valueOf(I));
            if (e0Var == null) {
                e0Var = (e0) gVar.a(I).get();
                e0Var.d((rb.a) gVar.f);
                e0Var.b(gVar.a);
                e0Var.c();
                hashMap.put(Integer.valueOf(I), e0Var);
            }
            b2.d0 a2 = k0Var2.c.a();
            b2.e0 e0Var2 = k0Var2.c;
            if (e0Var2.a == -9223372036854775807L) {
                a2.a = this.d;
            }
            if (e0Var2.d == -3.4028235E38f) {
                a2.d = this.g;
            }
            if (e0Var2.e == -3.4028235E38f) {
                a2.e = this.h;
            }
            if (e0Var2.b == -9223372036854775807L) {
                a2.b = this.e;
            }
            if (e0Var2.c == -9223372036854775807L) {
                a2.c = this.f;
            }
            b2.e0 e0Var3 = new b2.e0(a2);
            if (e0Var3.equals(k0Var2.c)) {
                uri = null;
                c10 = 0;
            } else {
                b2.b0 b0Var2 = new b2.b0();
                List list = Collections.EMPTY_LIST;
                e9.i0 i0Var = e9.a1.e;
                b2.g0 g0Var = b2.g0.d;
                b2.a0 a0Var = k0Var2.e;
                b2.y yVar = new b2.y();
                yVar.a = a0Var.b;
                yVar.b = a0Var.d;
                yVar.c = a0Var.e;
                yVar.d = a0Var.f;
                yVar.e = a0Var.g;
                yVar.f = a0Var.h;
                String str4 = k0Var2.a;
                b2.n0 n0Var = k0Var2.d;
                k0Var2.c.a();
                b2.g0 g0Var2 = k0Var2.f;
                b2.f0 f0Var2 = k0Var2.b;
                if (f0Var2 != null) {
                    String str5 = f0Var2.f;
                    String str6 = f0Var2.b;
                    Uri uri3 = f0Var2.a;
                    list = f0Var2.e;
                    i0Var = f0Var2.g;
                    uri = null;
                    b2.c0 c0Var = f0Var2.c;
                    if (c0Var != null) {
                        c10 = 0;
                        b2.b0 b0Var3 = new b2.b0();
                        b0Var3.a = c0Var.a;
                        b0Var3.b = c0Var.b;
                        b0Var3.c = c0Var.c;
                        b0Var3.d = c0Var.d;
                        b0Var3.e = c0Var.e;
                        b0Var3.f = c0Var.f;
                        b0Var3.g = c0Var.g;
                        b0Var3.h = c0Var.h;
                        b0Var = b0Var3;
                    } else {
                        c10 = 0;
                        b0Var = new b2.b0();
                    }
                    b2.x xVar2 = f0Var2.d;
                    j3 = f0Var2.h;
                    xVar = xVar2;
                    str = str6;
                    uri2 = uri3;
                    str2 = str5;
                    b0Var2 = b0Var;
                } else {
                    uri = null;
                    c10 = 0;
                    j3 = -9223372036854775807L;
                    uri2 = null;
                    str = null;
                    xVar = null;
                    str2 = null;
                }
                List list2 = list;
                e9.i0 i0Var2 = i0Var;
                b2.d0 a10 = e0Var3.a();
                e2.d.g(b0Var2.b == null || b0Var2.a != null);
                b2.f0 f0Var3 = uri2 != null ? new b2.f0(uri2, str, b0Var2.a != null ? new b2.c0(b0Var2) : uri, xVar, list2, str2, i0Var2, j3) : uri;
                if (str4 == null) {
                    str4 = "";
                }
                String str7 = str4;
                b2.a0 a0Var2 = new b2.a0(yVar);
                b2.e0 e0Var4 = new b2.e0(a10);
                if (n0Var == null) {
                    n0Var = b2.n0.K;
                }
                k0Var2 = new b2.k0(str7, a0Var2, f0Var3, e0Var4, n0Var, g0Var2);
            }
            a a11 = e0Var.a(k0Var2);
            e9.i0 i0Var3 = k0Var2.b.g;
            if (!i0Var3.isEmpty()) {
                a[] aVarArr = new a[i0Var3.size() + 1];
                aVarArr[c10] = a11;
                for (int i10 = 0; i10 < i0Var3.size(); i10++) {
                    if (this.i) {
                        b2.r rVar = new b2.r();
                        rVar.q = b2.r0.n(((b2.j0) i0Var3.get(i10)).b);
                        rVar.d = ((b2.j0) i0Var3.get(i10)).c;
                        rVar.e = ((b2.j0) i0Var3.get(i10)).d;
                        rVar.f = ((b2.j0) i0Var3.get(i10)).e;
                        rVar.b = ((b2.j0) i0Var3.get(i10)).f;
                        rVar.a = ((b2.j0) i0Var3.get(i10)).g;
                        b2.s sVar = new b2.s(rVar);
                        sg.x xVar3 = new sg.x(1, this, sVar);
                        pf.b bVar = this.b;
                        p2 p2Var = new p2(xVar3, 4);
                        m2.t tVar = new m2.t(4);
                        rb.a aVar = new rb.a(26);
                        if (this.c.i0(sVar)) {
                            b2.r a12 = sVar.a();
                            a12.q = b2.r0.n("application/x-media3-cues");
                            a12.j = sVar.r;
                            a12.O = this.c.J(sVar);
                            sVar = new b2.s(a12);
                        }
                        b2.s sVar2 = sVar;
                        int i11 = i10 + 1;
                        String uri4 = ((b2.j0) i0Var3.get(i10)).a.toString();
                        b2.y yVar2 = new b2.y();
                        b2.b0 b0Var4 = new b2.b0();
                        List list3 = Collections.EMPTY_LIST;
                        e9.a1 a1Var = e9.a1.e;
                        b2.d0 d0Var = new b2.d0();
                        b2.g0 g0Var3 = b2.g0.d;
                        Uri parse = uri4 == null ? uri : Uri.parse(uri4);
                        e2.d.g(b0Var4.b == null || b0Var4.a != null);
                        b2.f0 f0Var4 = parse != null ? new b2.f0(parse, null, b0Var4.a != null ? new b2.c0(b0Var4) : uri, null, list3, null, a1Var, -9223372036854775807L) : uri;
                        b2.k0 k0Var3 = new b2.k0("", new b2.a0(yVar2), f0Var4, new b2.e0(d0Var), b2.n0.K, g0Var3);
                        f0Var4.getClass();
                        aVarArr[i11] = new w0(k0Var3, bVar, p2Var, tVar.w(k0Var3), aVar, 1048576, sVar2);
                    } else {
                        pf.b bVar2 = this.b;
                        bVar2.getClass();
                        aVarArr[i10 + 1] = new l1((b2.j0) i0Var3.get(i10), bVar2, new rb.a(26));
                    }
                }
                a11 = new o0(aVarArr);
            }
            b2.a0 a0Var3 = k0Var2.e;
            if (a0Var3.b != 0 || a0Var3.d != Long.MIN_VALUE || a0Var3.f) {
                e eVar = new e(a11);
                long j11 = a0Var3.b;
                e2.d.b(j11 >= 0);
                e2.d.g(!eVar.h);
                eVar.b = j11;
                long j12 = a0Var3.d;
                e2.d.g(!eVar.h);
                eVar.c = j12;
                boolean z10 = !a0Var3.g;
                e2.d.g(!eVar.h);
                eVar.d = z10;
                boolean z11 = a0Var3.e;
                e2.d.g(!eVar.h);
                eVar.e = z11;
                boolean z12 = a0Var3.f;
                e2.d.g(!eVar.h);
                eVar.f = z12;
                boolean z13 = a0Var3.h;
                e2.d.g(!eVar.h);
                eVar.g = z13;
                eVar.h = true;
                a11 = new h(eVar);
            }
            k0Var2.b.getClass();
            if (k0Var2.b.d == null) {
                return a11;
            }
            e2.a.n("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return a11;
        } catch (ClassNotFoundException e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // u2.e0
    public final e0 b(boolean z10) {
        this.i = z10;
        c5.g gVar = this.a;
        gVar.a = z10;
        c3.m mVar = (c3.m) gVar.b;
        synchronized (mVar) {
            mVar.b = z10;
        }
        Iterator it = ((HashMap) gVar.d).values().iterator();
        while (it.hasNext()) {
            ((e0) it.next()).b(z10);
        }
        return this;
    }

    @Override // u2.e0
    public final e0 c() {
        c5.g gVar = this.a;
        gVar.getClass();
        synchronized (((c3.m) gVar.b)) {
        }
        return this;
    }

    @Override // u2.e0
    public final e0 d(rb.a aVar) {
        this.c = aVar;
        c5.g gVar = this.a;
        gVar.f = aVar;
        c3.m mVar = (c3.m) gVar.b;
        synchronized (mVar) {
            mVar.c = aVar;
        }
        Iterator it = ((HashMap) gVar.d).values().iterator();
        while (it.hasNext()) {
            ((e0) it.next()).d(aVar);
        }
        return this;
    }
}
