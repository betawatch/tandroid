package x2;

import a8.ia;
import android.content.Context;
import android.net.Uri;
import h9.t1;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ly0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class p implements e0 {
    public final k5 a;
    public final j2.n b;
    public w7.s c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public p(Context context, f3.m mVar) {
        j2.n nVar = new j2.n(context);
        w7.s sVar = new w7.s(5, false);
        this.b = nVar;
        this.c = sVar;
        k5 k5Var = new k5(mVar, sVar);
        this.a = k5Var;
        if (nVar != ((j2.n) k5Var.f)) {
            k5Var.f = nVar;
            ((HashMap) k5Var.d).clear();
            ((HashMap) k5Var.e).clear();
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
    public final e0 a(w7.s sVar) {
        this.c = sVar;
        k5 k5Var = this.a;
        k5Var.h = sVar;
        f3.m mVar = (f3.m) k5Var.c;
        synchronized (mVar) {
            mVar.c = sVar;
        }
        Iterator it = ((HashMap) k5Var.e).values().iterator();
        while (it.hasNext()) {
            ((e0) it.next()).a(sVar);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x2.e0
    public final a b(e2.l0 l0Var) {
        Uri uri;
        boolean z9;
        boolean z10;
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
            String str3 = h2.m0.a;
            throw null;
        }
        e2.g0 g0Var = l0Var2.b;
        int K = h2.m0.K(g0Var.a, g0Var.b);
        if (l0Var2.b.h != -9223372036854775807L) {
            f3.m mVar = (f3.m) this.a.c;
            synchronized (mVar) {
                mVar.e = 1;
            }
            k5.c(this.a);
        }
        try {
            e0 h = this.a.h(K);
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
                z9 = true;
                z10 = false;
            } else {
                e2.c0 c0Var2 = new e2.c0();
                List list = Collections.EMPTY_LIST;
                h9.i0 i0Var = t1.e;
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
                        z10 = false;
                        e2.c0 c0Var3 = new e2.c0();
                        z9 = true;
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
                        z9 = true;
                        z10 = false;
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
                    z9 = true;
                    z10 = false;
                    j3 = -9223372036854775807L;
                    uri2 = null;
                    str = null;
                    yVar = null;
                    str2 = null;
                }
                List list2 = list;
                h9.i0 i0Var2 = i0Var;
                e2.e0 a11 = f0Var2.a();
                ia.p((c0Var2.b == null || c0Var2.a != null) ? z9 : z10 ? 1 : 0);
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
            a b10 = h.b(l0Var2);
            h9.i0 i0Var3 = l0Var2.b.g;
            if (!i0Var3.isEmpty()) {
                a[] aVarArr = new a[i0Var3.size() + 1];
                aVarArr[z10 ? 1 : 0] = b10;
                for (int i7 = z10 ? 1 : 0; i7 < i0Var3.size(); i7++) {
                    if (this.i) {
                        e2.t tVar = new e2.t();
                        tVar.r = e2.s0.n(((e2.k0) i0Var3.get(i7)).b);
                        tVar.d = ((e2.k0) i0Var3.get(i7)).c;
                        tVar.e = ((e2.k0) i0Var3.get(i7)).d;
                        tVar.f = ((e2.k0) i0Var3.get(i7)).e;
                        tVar.b = ((e2.k0) i0Var3.get(i7)).f;
                        tVar.a = ((e2.k0) i0Var3.get(i7)).g;
                        e2.u uVar = new e2.u(tVar);
                        org.telegram.ui.web.a0 a0Var = new org.telegram.ui.web.a0(23, this, uVar);
                        j2.n nVar = this.b;
                        u5.e eVar = new u5.e(a0Var, 10);
                        ly0 ly0Var = new ly0(6);
                        pb.b bVar = new pb.b(4);
                        if (this.c.w(uVar)) {
                            e2.t a12 = uVar.a();
                            a12.r = e2.s0.n("application/x-media3-cues");
                            a12.j = uVar.s;
                            a12.P = this.c.D(uVar);
                            uVar = new e2.u(a12);
                        }
                        e2.u uVar2 = uVar;
                        int i10 = i7 + 1;
                        String uri4 = ((e2.k0) i0Var3.get(i7)).a.toString();
                        e2.z zVar2 = new e2.z();
                        e2.c0 c0Var4 = new e2.c0();
                        List list3 = Collections.EMPTY_LIST;
                        t1 t1Var = t1.e;
                        e2.e0 e0Var = new e2.e0();
                        e2.h0 h0Var3 = e2.h0.d;
                        Uri parse = uri4 == null ? uri : Uri.parse(uri4);
                        ia.p((c0Var4.b == null || c0Var4.a != null) ? z9 : z10 ? 1 : 0);
                        e2.g0 g0Var4 = parse != null ? new e2.g0(parse, null, c0Var4.a != null ? new e2.d0(c0Var4) : uri, null, list3, null, t1Var, -9223372036854775807L) : uri;
                        e2.l0 l0Var3 = new e2.l0("", new e2.b0(zVar2), g0Var4, new e2.f0(e0Var), e2.o0.L, h0Var3);
                        g0Var4.getClass();
                        aVarArr[i10] = new x0(l0Var3, nVar, eVar, ly0Var.t(l0Var3), bVar, TLObject.FLAG_20, uVar2);
                    } else {
                        j2.n nVar2 = this.b;
                        nVar2.getClass();
                        aVarArr[i7 + 1] = new l1((e2.k0) i0Var3.get(i7), nVar2, new pb.b(4));
                    }
                }
                b10 = new n0(aVarArr);
            }
            e2.b0 b0Var3 = l0Var2.e;
            if (b0Var3.b != 0 || b0Var3.d != Long.MIN_VALUE || b0Var3.f) {
                e eVar2 = new e(b10);
                long j11 = b0Var3.b;
                if (j11 >= 0) {
                    z10 = z9;
                }
                ia.f(z10);
                ia.p(!eVar2.h);
                eVar2.b = j11;
                long j12 = b0Var3.d;
                ia.p(!eVar2.h);
                eVar2.c = j12;
                boolean z11 = !b0Var3.g;
                ia.p(!eVar2.h);
                eVar2.d = z11;
                boolean z12 = b0Var3.e;
                ia.p(!eVar2.h);
                eVar2.e = z12;
                boolean z13 = b0Var3.f;
                ia.p(!eVar2.h);
                eVar2.f = z13;
                boolean z14 = b0Var3.h;
                ia.p(!eVar2.h);
                eVar2.g = z14;
                ia.p(!eVar2.h);
                eVar2.h = z9;
                b10 = new h(eVar2);
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
    public final e0 c(boolean z9) {
        this.i = z9;
        k5 k5Var = this.a;
        k5Var.a = z9;
        f3.m mVar = (f3.m) k5Var.c;
        synchronized (mVar) {
            mVar.b = z9;
        }
        Iterator it = ((HashMap) k5Var.e).values().iterator();
        while (it.hasNext()) {
            ((e0) it.next()).c(z9);
        }
        return this;
    }

    @Override // x2.e0
    public final e0 d(int i7) {
        k5 k5Var = this.a;
        k5Var.b = i7;
        f3.m mVar = (f3.m) k5Var.c;
        synchronized (mVar) {
            mVar.d = i7;
        }
        return this;
    }
}
