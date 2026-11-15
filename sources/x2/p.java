package x2;

import a8.ja;
import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Wallet.k8;
import org.telegram.ui.ld0;
import tg.z1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class p implements e0 {
    public final h5 a;
    public final wf.b b;
    public nb.a c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public p(Context context, f3.m mVar) {
        wf.b bVar = new wf.b(context);
        nb.a aVar = new nb.a(6);
        this.b = bVar;
        this.c = aVar;
        h5 h5Var = new h5(mVar, aVar);
        this.a = h5Var;
        if (bVar != ((wf.b) h5Var.f)) {
            h5Var.f = bVar;
            ((HashMap) h5Var.d).clear();
            ((HashMap) h5Var.e).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static e0 e(Class cls, j2.g gVar) {
        try {
            return (e0) cls.getConstructor(j2.g.class).newInstance(gVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // x2.e0
    public final e0 a(nb.a aVar) {
        this.c = aVar;
        h5 h5Var = this.a;
        h5Var.h = aVar;
        f3.m mVar = (f3.m) h5Var.c;
        synchronized (mVar) {
            mVar.c = aVar;
        }
        Iterator it = ((HashMap) h5Var.e).values().iterator();
        while (it.hasNext()) {
            ((e0) it.next()).a(aVar);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x2.e0
    public final a b(e2.l0 l0Var) {
        Uri uri;
        boolean z10;
        boolean z11;
        long j3;
        Uri uri2;
        String str;
        e2.y yVar;
        String str2;
        e2.c0 c0Var;
        e2.l0 l0Var2 = l0Var;
        l0Var2.b.getClass();
        String scheme = l0Var2.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(l0Var2.b.b, "application/x-image-uri")) {
            long j10 = l0Var2.b.h;
            String str3 = h2.l0.a;
            throw null;
        }
        e2.g0 g0Var = l0Var2.b;
        int K = h2.l0.K(g0Var.a, g0Var.b);
        if (l0Var2.b.h != -9223372036854775807L) {
            f3.m mVar = (f3.m) this.a.c;
            synchronized (mVar) {
                mVar.e = 1;
            }
            h5.c(this.a);
        }
        try {
            e0 i7 = this.a.i(K);
            e2.e0 a10 = l0Var2.c.a();
            e2.f0 f0Var = l0Var2.c;
            if (f0Var.a == -9223372036854775807L) {
                a10.a = this.d;
            }
            if (f0Var.d == -3.4028235E38f) {
                a10.d = this.g;
            }
            if (f0Var.e == -3.4028235E38f) {
                a10.e = this.h;
            }
            if (f0Var.b == -9223372036854775807L) {
                a10.b = this.e;
            }
            if (f0Var.c == -9223372036854775807L) {
                a10.c = this.f;
            }
            e2.f0 f0Var2 = new e2.f0(a10);
            if (f0Var2.equals(l0Var2.c)) {
                uri = null;
                z10 = true;
                z11 = false;
            } else {
                e2.c0 c0Var2 = new e2.c0();
                List list = Collections.EMPTY_LIST;
                h9.i0 i0Var = h9.s1.e;
                e2.h0 h0Var = e2.h0.d;
                e2.b0 b0Var = l0Var2.e;
                e2.z zVar = new e2.z();
                zVar.a = b0Var.b;
                zVar.b = b0Var.d;
                zVar.c = b0Var.e;
                zVar.d = b0Var.f;
                zVar.e = b0Var.g;
                zVar.f = b0Var.h;
                String str4 = l0Var2.a;
                e2.o0 o0Var = l0Var2.d;
                l0Var2.c.a();
                e2.h0 h0Var2 = l0Var2.f;
                e2.g0 g0Var2 = l0Var2.b;
                if (g0Var2 != null) {
                    String str5 = g0Var2.f;
                    String str6 = g0Var2.b;
                    Uri uri3 = g0Var2.a;
                    list = g0Var2.e;
                    i0Var = g0Var2.g;
                    uri = null;
                    e2.d0 d0Var = g0Var2.c;
                    if (d0Var != null) {
                        z11 = false;
                        e2.c0 c0Var3 = new e2.c0();
                        z10 = true;
                        c0Var3.a = d0Var.a;
                        c0Var3.b = d0Var.b;
                        c0Var3.c = d0Var.c;
                        c0Var3.d = d0Var.d;
                        c0Var3.e = d0Var.e;
                        c0Var3.f = d0Var.f;
                        c0Var3.g = d0Var.g;
                        c0Var3.h = d0Var.h;
                        c0Var = c0Var3;
                    } else {
                        z10 = true;
                        z11 = false;
                        c0Var = new e2.c0();
                    }
                    e2.y yVar2 = g0Var2.d;
                    j3 = g0Var2.h;
                    yVar = yVar2;
                    str = str6;
                    uri2 = uri3;
                    str2 = str5;
                    c0Var2 = c0Var;
                } else {
                    uri = null;
                    z10 = true;
                    z11 = false;
                    j3 = -9223372036854775807L;
                    uri2 = null;
                    str = null;
                    yVar = null;
                    str2 = null;
                }
                List list2 = list;
                h9.i0 i0Var2 = i0Var;
                e2.e0 a11 = f0Var2.a();
                ja.p((c0Var2.b == null || c0Var2.a != null) ? z10 : z11 ? 1 : 0);
                e2.g0 g0Var3 = uri2 != null ? new e2.g0(uri2, str, c0Var2.a != null ? new e2.d0(c0Var2) : uri, yVar, list2, str2, i0Var2, j3) : uri;
                if (str4 == null) {
                    str4 = "";
                }
                String str7 = str4;
                e2.b0 b0Var2 = new e2.b0(zVar);
                e2.f0 f0Var3 = new e2.f0(a11);
                if (o0Var == null) {
                    o0Var = e2.o0.L;
                }
                l0Var2 = new e2.l0(str7, b0Var2, g0Var3, f0Var3, o0Var, h0Var2);
            }
            a b10 = i7.b(l0Var2);
            h9.i0 i0Var3 = l0Var2.b.g;
            if (!i0Var3.isEmpty()) {
                a[] aVarArr = new a[i0Var3.size() + 1];
                aVarArr[z11 ? 1 : 0] = b10;
                for (int i10 = z11 ? 1 : 0; i10 < i0Var3.size(); i10++) {
                    if (this.i) {
                        e2.t tVar = new e2.t();
                        tVar.r = e2.s0.n(((e2.k0) i0Var3.get(i10)).b);
                        tVar.d = ((e2.k0) i0Var3.get(i10)).c;
                        tVar.e = ((e2.k0) i0Var3.get(i10)).d;
                        tVar.f = ((e2.k0) i0Var3.get(i10)).e;
                        tVar.b = ((e2.k0) i0Var3.get(i10)).f;
                        tVar.a = ((e2.k0) i0Var3.get(i10)).g;
                        e2.u uVar = new e2.u(tVar);
                        k8 k8Var = new k8(28, this, uVar);
                        wf.b bVar = this.b;
                        z1 z1Var = new z1(k8Var, 14);
                        ld0 ld0Var = new ld0(7);
                        qb.a aVar = new qb.a(4);
                        if (this.c.L(uVar)) {
                            e2.t a12 = uVar.a();
                            a12.r = e2.s0.n("application/x-media3-cues");
                            a12.j = uVar.s;
                            a12.P = this.c.O(uVar);
                            uVar = new e2.u(a12);
                        }
                        e2.u uVar2 = uVar;
                        int i11 = i10 + 1;
                        String uri4 = ((e2.k0) i0Var3.get(i10)).a.toString();
                        e2.z zVar2 = new e2.z();
                        e2.c0 c0Var4 = new e2.c0();
                        List list3 = Collections.EMPTY_LIST;
                        h9.s1 s1Var = h9.s1.e;
                        e2.e0 e0Var = new e2.e0();
                        e2.h0 h0Var3 = e2.h0.d;
                        Uri parse = uri4 == null ? uri : Uri.parse(uri4);
                        ja.p((c0Var4.b == null || c0Var4.a != null) ? z10 : z11 ? 1 : 0);
                        e2.g0 g0Var4 = parse != null ? new e2.g0(parse, null, c0Var4.a != null ? new e2.d0(c0Var4) : uri, null, list3, null, s1Var, -9223372036854775807L) : uri;
                        e2.l0 l0Var3 = new e2.l0("", new e2.b0(zVar2), g0Var4, new e2.f0(e0Var), e2.o0.L, h0Var3);
                        g0Var4.getClass();
                        aVarArr[i11] = new x0(l0Var3, bVar, z1Var, ld0Var.s(l0Var3), aVar, TLObject.FLAG_20, uVar2);
                    } else {
                        wf.b bVar2 = this.b;
                        bVar2.getClass();
                        aVarArr[i10 + 1] = new l1((e2.k0) i0Var3.get(i10), bVar2, new qb.a(4));
                    }
                }
                b10 = new n0(aVarArr);
            }
            e2.b0 b0Var3 = l0Var2.e;
            if (b0Var3.b != 0 || b0Var3.d != Long.MIN_VALUE || b0Var3.f) {
                e eVar = new e(b10);
                long j11 = b0Var3.b;
                if (j11 >= 0) {
                    z11 = z10;
                }
                ja.f(z11);
                ja.p(!eVar.h);
                eVar.b = j11;
                long j12 = b0Var3.d;
                ja.p(!eVar.h);
                eVar.c = j12;
                boolean z12 = !b0Var3.g;
                ja.p(!eVar.h);
                eVar.d = z12;
                boolean z13 = b0Var3.e;
                ja.p(!eVar.h);
                eVar.e = z13;
                boolean z14 = b0Var3.f;
                ja.p(!eVar.h);
                eVar.f = z14;
                boolean z15 = b0Var3.h;
                ja.p(!eVar.h);
                eVar.g = z15;
                ja.p(!eVar.h);
                eVar.h = z10;
                b10 = new h(eVar);
            }
            l0Var2.b.getClass();
            if (l0Var2.b.d == null) {
                return b10;
            }
            h2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return b10;
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // x2.e0
    public final e0 c(boolean z10) {
        this.i = z10;
        h5 h5Var = this.a;
        h5Var.a = z10;
        f3.m mVar = (f3.m) h5Var.c;
        synchronized (mVar) {
            mVar.b = z10;
        }
        Iterator it = ((HashMap) h5Var.e).values().iterator();
        while (it.hasNext()) {
            ((e0) it.next()).c(z10);
        }
        return this;
    }

    @Override // x2.e0
    public final e0 d(int i7) {
        h5 h5Var = this.a;
        h5Var.b = i7;
        f3.m mVar = (f3.m) h5Var.c;
        synchronized (mVar) {
            mVar.d = i7;
        }
        return this;
    }
}
