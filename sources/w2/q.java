package w2;

import android.content.Context;
import android.net.Uri;
import b8.zb;
import j$.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.na1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q implements f0 {
    public final p a;
    public final tf.b b;
    public mb.b c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public q(Context context, e3.m mVar) {
        tf.b bVar = new tf.b(context);
        mb.b bVar2 = new mb.b(4);
        this.b = bVar;
        this.c = bVar2;
        p pVar = new p(mVar, bVar2);
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

    public static f0 e(Class cls, i2.g gVar) {
        try {
            return (f0) cls.getConstructor(i2.g.class).newInstance(gVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // w2.f0
    public final f0 a(mb.b bVar) {
        this.c = bVar;
        p pVar = this.a;
        pVar.f = bVar;
        e3.m mVar = pVar.a;
        synchronized (mVar) {
            mVar.c = bVar;
        }
        Iterator it = pVar.c.values().iterator();
        while (it.hasNext()) {
            ((f0) it.next()).a(bVar);
        }
        return this;
    }

    @Override // w2.f0
    public final f0 b(boolean z10) {
        this.i = z10;
        p pVar = this.a;
        pVar.e = z10;
        e3.m mVar = pVar.a;
        synchronized (mVar) {
            mVar.b = z10;
        }
        Iterator it = pVar.c.values().iterator();
        while (it.hasNext()) {
            ((f0) it.next()).b(z10);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w2.f0
    public final a c(d2.n0 n0Var) {
        Uri uri;
        int i3;
        boolean z10;
        d2.i0 i0Var;
        long j10;
        Uri uri2;
        String str;
        d2.a0 a0Var;
        String str2;
        d2.i0 i0Var2;
        d2.e0 e0Var;
        d2.n0 n0Var2 = n0Var;
        n0Var2.b.getClass();
        String scheme = n0Var2.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(n0Var2.b.b, "application/x-image-uri")) {
            long j11 = n0Var2.b.h;
            String str3 = g2.n0.a;
            throw null;
        }
        d2.i0 i0Var3 = n0Var2.b;
        int K = g2.n0.K(i0Var3.a, i0Var3.b);
        if (n0Var2.b.h != -9223372036854775807L) {
            e3.m mVar = this.a.a;
            synchronized (mVar) {
                mVar.e = 1;
            }
            p.a(this.a);
        }
        try {
            f0 b10 = this.a.b(K);
            d2.g0 a10 = n0Var2.c.a();
            d2.h0 h0Var = n0Var2.c;
            if (h0Var.a == -9223372036854775807L) {
                a10.a = this.d;
            }
            if (h0Var.d == -3.4028235E38f) {
                a10.d = this.g;
            }
            if (h0Var.e == -3.4028235E38f) {
                a10.e = this.h;
            }
            if (h0Var.b == -9223372036854775807L) {
                a10.b = this.e;
            }
            if (h0Var.c == -9223372036854775807L) {
                a10.c = this.f;
            }
            d2.h0 h0Var2 = new d2.h0(a10);
            if (h0Var2.equals(n0Var2.c)) {
                uri = null;
                i3 = 1;
                z10 = false;
            } else {
                d2.e0 e0Var2 = new d2.e0();
                List list = Collections.EMPTY_LIST;
                g9.i0 i0Var4 = g9.s1.e;
                d2.j0 j0Var = d2.j0.d;
                d2.d0 d0Var = n0Var2.e;
                d2.b0 b0Var = new d2.b0();
                b0Var.a = d0Var.b;
                b0Var.b = d0Var.d;
                b0Var.c = d0Var.e;
                b0Var.d = d0Var.f;
                b0Var.e = d0Var.g;
                b0Var.f = d0Var.h;
                String str4 = n0Var2.a;
                d2.q0 q0Var = n0Var2.d;
                n0Var2.c.a();
                d2.j0 j0Var2 = n0Var2.f;
                d2.i0 i0Var5 = n0Var2.b;
                if (i0Var5 != null) {
                    String str5 = i0Var5.f;
                    String str6 = i0Var5.b;
                    Uri uri3 = i0Var5.a;
                    list = i0Var5.e;
                    i0Var4 = i0Var5.g;
                    uri = null;
                    d2.f0 f0Var = i0Var5.c;
                    if (f0Var != null) {
                        z10 = false;
                        d2.e0 e0Var3 = new d2.e0();
                        i3 = 1;
                        e0Var3.a = f0Var.a;
                        e0Var3.b = f0Var.b;
                        e0Var3.c = f0Var.c;
                        e0Var3.d = f0Var.d;
                        e0Var3.e = f0Var.e;
                        e0Var3.f = f0Var.f;
                        e0Var3.g = f0Var.g;
                        e0Var3.h = f0Var.h;
                        e0Var = e0Var3;
                    } else {
                        i3 = 1;
                        z10 = false;
                        e0Var = new d2.e0();
                    }
                    d2.a0 a0Var2 = i0Var5.d;
                    j10 = i0Var5.h;
                    a0Var = a0Var2;
                    str = str6;
                    uri2 = uri3;
                    str2 = str5;
                    e0Var2 = e0Var;
                } else {
                    uri = null;
                    i3 = 1;
                    z10 = false;
                    j10 = -9223372036854775807L;
                    uri2 = null;
                    str = null;
                    a0Var = null;
                    str2 = null;
                }
                List list2 = list;
                g9.i0 i0Var6 = i0Var4;
                d2.g0 a11 = h0Var2.a();
                zb.p((e0Var2.b == null || e0Var2.a != null) ? i3 : z10 ? 1 : 0);
                if (uri2 != null) {
                    i0Var2 = new d2.i0(uri2, str, e0Var2.a != null ? new d2.f0(e0Var2) : uri, a0Var, list2, str2, i0Var6, j10);
                } else {
                    i0Var2 = uri;
                }
                if (str4 == null) {
                    str4 = "";
                }
                String str7 = str4;
                d2.d0 d0Var2 = new d2.d0(b0Var);
                d2.h0 h0Var3 = new d2.h0(a11);
                if (q0Var == null) {
                    q0Var = d2.q0.L;
                }
                n0Var2 = new d2.n0(str7, d0Var2, i0Var2, h0Var3, q0Var, j0Var2);
            }
            a c2 = b10.c(n0Var2);
            g9.i0 i0Var7 = n0Var2.b.g;
            if (!i0Var7.isEmpty()) {
                a[] aVarArr = new a[i0Var7.size() + 1];
                aVarArr[z10 ? 1 : 0] = c2;
                int i10 = z10 ? 1 : 0;
                while (i10 < i0Var7.size()) {
                    if (this.i) {
                        d2.u uVar = new d2.u();
                        uVar.r = d2.u0.n(((d2.m0) i0Var7.get(i10)).b);
                        uVar.d = ((d2.m0) i0Var7.get(i10)).c;
                        uVar.e = ((d2.m0) i0Var7.get(i10)).d;
                        uVar.f = ((d2.m0) i0Var7.get(i10)).e;
                        uVar.b = ((d2.m0) i0Var7.get(i10)).f;
                        uVar.a = ((d2.m0) i0Var7.get(i10)).g;
                        d2.v vVar = new d2.v(uVar);
                        na1 na1Var = new na1(19, this, vVar);
                        tf.b bVar = this.b;
                        e3 e3Var = new e3(na1Var, 27);
                        k4.j jVar = new k4.j(28);
                        kb.a aVar = new kb.a(i3);
                        if (this.c.l(vVar)) {
                            d2.u a12 = vVar.a();
                            a12.r = d2.u0.n("application/x-media3-cues");
                            a12.j = vVar.s;
                            a12.P = this.c.q0(vVar);
                            vVar = new d2.v(a12);
                        }
                        d2.v vVar2 = vVar;
                        int i11 = i10 + 1;
                        String uri4 = ((d2.m0) i0Var7.get(i10)).a.toString();
                        d2.b0 b0Var2 = new d2.b0();
                        d2.e0 e0Var4 = new d2.e0();
                        List list3 = Collections.EMPTY_LIST;
                        g9.s1 s1Var = g9.s1.e;
                        d2.g0 g0Var = new d2.g0();
                        d2.j0 j0Var3 = d2.j0.d;
                        Uri parse = uri4 == null ? uri : Uri.parse(uri4);
                        zb.p((e0Var4.b == null || e0Var4.a != null) ? true : z10 ? 1 : 0);
                        if (parse != null) {
                            i0Var = new d2.i0(parse, null, e0Var4.a != null ? new d2.f0(e0Var4) : uri, null, list3, null, s1Var, -9223372036854775807L);
                        } else {
                            i0Var = uri;
                        }
                        d2.n0 n0Var3 = new d2.n0("", new d2.d0(b0Var2), i0Var, new d2.h0(g0Var), d2.q0.L, j0Var3);
                        i0Var.getClass();
                        aVarArr[i11] = new y0(n0Var3, bVar, e3Var, jVar.x(n0Var3), aVar, TLObject.FLAG_20, vVar2);
                    } else {
                        tf.b bVar2 = this.b;
                        bVar2.getClass();
                        aVarArr[i10 + 1] = new n1((d2.m0) i0Var7.get(i10), bVar2, new kb.a(1));
                    }
                    i10++;
                    i3 = 1;
                }
                c2 = new o0(aVarArr);
            }
            d2.d0 d0Var3 = n0Var2.e;
            if (d0Var3.b != 0 || d0Var3.d != Long.MIN_VALUE || d0Var3.f) {
                e eVar = new e(c2);
                long j12 = d0Var3.b;
                if (j12 >= 0) {
                    z10 = true;
                }
                zb.f(z10);
                zb.p(!eVar.h);
                eVar.b = j12;
                long j13 = d0Var3.d;
                zb.p(!eVar.h);
                eVar.c = j13;
                boolean z11 = !d0Var3.g;
                zb.p(!eVar.h);
                eVar.d = z11;
                boolean z12 = d0Var3.e;
                zb.p(!eVar.h);
                eVar.e = z12;
                boolean z13 = d0Var3.f;
                zb.p(!eVar.h);
                eVar.f = z13;
                boolean z14 = d0Var3.h;
                zb.p(!eVar.h);
                eVar.g = z14;
                zb.p(!eVar.h);
                eVar.h = true;
                c2 = new h(eVar);
            }
            n0Var2.b.getClass();
            if (n0Var2.b.d == null) {
                return c2;
            }
            g2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return c2;
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // w2.f0
    public final f0 d(int i3) {
        p pVar = this.a;
        pVar.g = i3;
        e3.m mVar = pVar.a;
        synchronized (mVar) {
            mVar.d = i3;
        }
        return this;
    }
}
