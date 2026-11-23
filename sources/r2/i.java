package r2;

import a8.ja;
import a8.la;
import a8.ma;
import a8.y9;
import android.net.Uri;
import android.text.TextUtils;
import c8.s0;
import e2.p0;
import e2.q0;
import e2.t;
import e2.u;
import h2.k0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import m4.d0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class i extends y2.l {
    public static final AtomicInteger d0 = new AtomicInteger();
    public final boolean E;
    public final int F;
    public final j2.h G;
    public final j2.m H;
    public final b I;
    public final boolean J;
    public final boolean K;
    public final k0 L;
    public final c M;
    public final List N;
    public final e2.r O;
    public final t3.h P;
    public final x Q;
    public final boolean R;
    public final boolean S;
    public b T;
    public p U;
    public int V;
    public boolean W;
    public volatile boolean X;
    public boolean Y;
    public i0 Z;
    public boolean a0;
    public long b0;
    public boolean c0;
    public final int w;
    public final int x;
    public final Uri y;

    public i(c cVar, j2.h hVar, j2.m mVar, u uVar, boolean z10, j2.h hVar2, j2.m mVar2, boolean z11, Uri uri, List list, int i7, Object obj, long j3, long j10, long j11, int i10, boolean z12, int i11, boolean z13, boolean z14, k0 k0Var, e2.r rVar, b bVar, t3.h hVar3, x xVar, boolean z15, boolean z16, m2.i iVar) {
        super(hVar, mVar, uVar, i7, obj, j3, j10, j11);
        this.R = z10;
        this.F = i10;
        this.b0 = z12 ? j10 - j3 : -9223372036854775807L;
        this.x = i11;
        this.H = mVar2;
        this.G = hVar2;
        this.W = mVar2 != null;
        this.S = z11;
        this.y = uri;
        this.J = z14;
        this.L = k0Var;
        this.K = z13;
        this.M = cVar;
        this.N = list;
        this.O = rVar;
        this.I = bVar;
        this.P = hVar3;
        this.Q = xVar;
        this.c0 = z15;
        this.E = z16;
        g0 g0Var = i0.b;
        this.Z = t1.e;
        this.w = d0.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (ja.c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // b3.m
    public final void A() {
        this.X = true;
    }

    @Override // b3.m
    public final void a() {
        b bVar;
        this.U.getClass();
        if (this.T == null && (bVar = this.I) != null) {
            f3.o a10 = bVar.a.a();
            if ((a10 instanceof d0) || (a10 instanceof z3.h)) {
                this.T = this.I;
                this.W = false;
            }
        }
        j2.m mVar = this.H;
        j2.h hVar = this.G;
        if (this.W) {
            hVar.getClass();
            mVar.getClass();
            d(hVar, mVar, this.S);
            this.V = 0;
            this.W = false;
        }
        if (this.X) {
            return;
        }
        if (!this.K) {
            d(this.r, this.b, this.R);
        }
        this.Y = !this.X;
    }

    @Override // y2.l
    public final boolean c() {
        throw null;
    }

    public final void d(j2.h hVar, j2.m mVar, boolean z10) {
        j2.m b10;
        boolean z11;
        long j3;
        if (z10) {
            z11 = this.V != 0;
            b10 = mVar;
        } else {
            b10 = mVar.b(this.V);
            z11 = false;
        }
        try {
            f3.l h = h(hVar, b10);
            if (z11) {
                h.f(this.V, false);
            }
            do {
                try {
                    try {
                        if (this.X) {
                            break;
                        }
                    } catch (EOFException e10) {
                        if ((this.d.f & TLObject.FLAG_14) == 0) {
                            throw e10;
                        }
                        this.T.a.d(0L, 0L);
                        j3 = h.d;
                    }
                } catch (Throwable th2) {
                    this.V = (int) (h.d - mVar.e);
                    throw th2;
                }
            } while (this.T.a.f(h, b.f) == 0);
            j3 = h.d;
            this.V = (int) (j3 - mVar.e);
        } catch (Exception unused) {
        } catch (Throwable th3) {
            s0.a(hVar);
            throw th3;
        }
        s0.a(hVar);
    }

    public final int f(int i7) {
        la.p(!this.c0);
        if (i7 >= this.Z.size()) {
            return 0;
        }
        return ((Integer) this.Z.get(i7)).intValue();
    }

    public final boolean g() {
        return this.b0 != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0098, code lost:
    
        if (((t3.m) r13).b.equals("com.apple.streaming.transportStreamTimestamp") != false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v18, types: [nb.a] */
    /* JADX WARN: Type inference failed for: r2v22, types: [nb.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f3.l h(j2.h hVar, j2.m mVar) {
        int i7;
        long j3;
        long j10;
        long j11;
        b bVar;
        b bVar2;
        int i10;
        k0 k0Var;
        ArrayList arrayList;
        f3.o aVar;
        boolean z10;
        pb.b bVar3;
        int i11;
        List singletonList;
        int i12;
        f3.o dVar;
        p0 p0Var;
        long j12 = this.h;
        k0 k0Var2 = this.L;
        long open = hVar.open(mVar);
        try {
            k0Var2.h(j12, this.J);
            f3.l lVar = new f3.l(hVar, mVar.e, open);
            if (this.T == null) {
                x xVar = this.Q;
                lVar.f = 0;
                try {
                    xVar.K(10);
                    lVar.g(xVar.a, 0, 10, false);
                } catch (EOFException unused) {
                    j3 = -9223372036854775807L;
                }
                if (xVar.D() != 4801587) {
                    j10 = -9223372036854775807L;
                    j3 = -9223372036854775807L;
                } else {
                    xVar.O(3);
                    int z11 = xVar.z();
                    int i13 = z11 + 10;
                    byte[] bArr = xVar.a;
                    j3 = -9223372036854775807L;
                    if (i13 > bArr.length) {
                        xVar.K(i13);
                        System.arraycopy(bArr, 0, xVar.a, 0, 10);
                    }
                    lVar.g(xVar.a, 10, z11, false);
                    q0 c10 = this.P.c(z11, xVar.a);
                    if (c10 != null) {
                        p0[] p0VarArr = c10.a;
                        int length = p0VarArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                p0Var = null;
                                break;
                            }
                            p0 p0Var2 = p0VarArr[i14];
                            if (t3.m.class.isAssignableFrom(p0Var2.getClass())) {
                                p0Var = (p0) t3.m.class.cast(p0Var2);
                            }
                            p0Var = null;
                            if (p0Var != null) {
                                break;
                            }
                            i14++;
                        }
                        t3.m mVar2 = (t3.m) p0Var;
                        if (mVar2 != null) {
                            System.arraycopy(mVar2.c, 0, xVar.a, 0, 8);
                            xVar.N(0);
                            xVar.M(8);
                            j10 = xVar.u() & 8589934591L;
                        }
                    }
                    j10 = j3;
                }
                lVar.f = 0;
                b bVar4 = this.I;
                if (bVar4 != null) {
                    f3.o oVar = bVar4.a;
                    f3.o a10 = oVar.a();
                    la.p(!((a10 instanceof d0) || (a10 instanceof z3.h)));
                    ?? r11 = oVar.a() == oVar;
                    Class<?> cls = oVar.getClass();
                    if (r11 != true) {
                        throw new IllegalStateException(ma.a("Can't recreate wrapped extractors. Outer type: %s", cls));
                    }
                    if (oVar instanceof s) {
                        dVar = new s(bVar4.b.d, bVar4.c, bVar4.d, bVar4.e);
                    } else if (oVar instanceof m4.d) {
                        dVar = new m4.d(0);
                    } else if (oVar instanceof m4.a) {
                        dVar = new m4.a();
                    } else if (oVar instanceof m4.c) {
                        dVar = new m4.c();
                    } else {
                        if (!(oVar instanceof y3.d)) {
                            throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(oVar.getClass().getSimpleName()));
                        }
                        dVar = new y3.d(0);
                    }
                    bVar2 = new b(dVar, bVar4.b, bVar4.c, bVar4.d, bVar4.e);
                    j11 = j12;
                    i7 = 0;
                } else {
                    Uri uri = mVar.a;
                    Map responseHeaders = hVar.getResponseHeaders();
                    c cVar = this.M;
                    cVar.getClass();
                    u uVar = this.d;
                    int a11 = y9.a(uVar.s);
                    List list = (List) responseHeaders.get("Content-Type");
                    int a12 = y9.a((list == null || list.isEmpty()) ? null : (String) list.get(0));
                    int b10 = y9.b(uri);
                    ArrayList arrayList2 = new ArrayList(7);
                    c.a(a11, arrayList2);
                    c.a(a12, arrayList2);
                    c.a(b10, arrayList2);
                    int i15 = 0;
                    for (int i16 = 7; i15 < i16; i16 = 7) {
                        c.a(c.d[i15], arrayList2);
                        i15++;
                    }
                    lVar.f = 0;
                    int i17 = 0;
                    f3.o oVar2 = null;
                    while (true) {
                        int size = arrayList2.size();
                        k0 k0Var3 = this.L;
                        if (i17 >= size) {
                            j11 = j12;
                            i7 = 0;
                            oVar2.getClass();
                            bVar = new b(oVar2, uVar, k0Var3, cVar.a, cVar.b);
                            break;
                        }
                        int intValue = ((Integer) arrayList2.get(i17)).intValue();
                        j11 = j12;
                        if (intValue == 0) {
                            i10 = i17;
                            k0Var = k0Var3;
                            arrayList = arrayList2;
                            aVar = new m4.a();
                        } else if (intValue == 1) {
                            i10 = i17;
                            k0Var = k0Var3;
                            arrayList = arrayList2;
                            aVar = new m4.c();
                        } else if (intValue == 2) {
                            i10 = i17;
                            k0Var = k0Var3;
                            arrayList = arrayList2;
                            aVar = new m4.d(0);
                        } else if (intValue != 7) {
                            List list2 = this.N;
                            pb.b bVar5 = c4.k.i;
                            if (intValue == 8) {
                                i10 = i17;
                                k0Var = k0Var3;
                                arrayList = arrayList2;
                                ?? r22 = cVar.a;
                                boolean z12 = cVar.b;
                                int i18 = cVar.c;
                                if (z12) {
                                    bVar3 = r22;
                                    i11 = 4;
                                } else {
                                    i11 = 36;
                                    bVar3 = bVar5;
                                }
                                aVar = new z3.h(bVar3, i11 | z3.h.g(i18), k0Var, list2 != null ? list2 : t1.e, null);
                            } else if (intValue == 11) {
                                i10 = i17;
                                arrayList = arrayList2;
                                ?? r23 = cVar.a;
                                boolean z13 = cVar.b;
                                if (list2 != null) {
                                    i12 = 48;
                                    singletonList = list2;
                                } else {
                                    t tVar = new t();
                                    tVar.r = e2.s0.n("application/cea-608");
                                    singletonList = Collections.singletonList(new u(tVar));
                                    i12 = 16;
                                }
                                String str = uVar.k;
                                if (!TextUtils.isEmpty(str)) {
                                    if (e2.s0.b(str, "audio/mp4a-latm") == null) {
                                        i12 |= 2;
                                    }
                                    if (e2.s0.b(str, "video/avc") == null) {
                                        i12 |= 4;
                                    }
                                }
                                aVar = new d0(2, !z13 ? 1 : 0, !z13 ? bVar5 : r23, k0Var3, new m4.f(i12, singletonList));
                                k0Var = k0Var3;
                            } else if (intValue != 13) {
                                i10 = i17;
                                k0Var = k0Var3;
                                arrayList = arrayList2;
                                aVar = null;
                            } else {
                                i10 = i17;
                                arrayList = arrayList2;
                                aVar = new s(uVar.d, k0Var3, cVar.a, cVar.b);
                                k0Var = k0Var3;
                            }
                        } else {
                            i10 = i17;
                            k0Var = k0Var3;
                            arrayList = arrayList2;
                            aVar = new y3.d(0, 0L);
                        }
                        aVar.getClass();
                        try {
                            z10 = aVar.b(lVar);
                            i7 = 0;
                            lVar.f = 0;
                        } catch (EOFException unused2) {
                            i7 = 0;
                            lVar.f = 0;
                            z10 = false;
                        } catch (Throwable th2) {
                            lVar.f = 0;
                            throw th2;
                        }
                        if (z10) {
                            bVar = new b(aVar, uVar, k0Var, cVar.a, cVar.b);
                            break;
                        }
                        u uVar2 = uVar;
                        if (oVar2 == null && (intValue == a11 || intValue == a12 || intValue == b10 || intValue == 11)) {
                            oVar2 = aVar;
                        }
                        uVar = uVar2;
                        arrayList2 = arrayList;
                        i17 = i10 + 1;
                        j12 = j11;
                    }
                    bVar2 = bVar;
                }
                this.T = bVar2;
                f3.o a13 = bVar2.a.a();
                if ((((a13 instanceof m4.d) || (a13 instanceof m4.a) || (a13 instanceof m4.c) || (a13 instanceof y3.d)) ? 1 : i7) != 0) {
                    p pVar = this.U;
                    long b11 = j10 != j3 ? k0Var2.b(j10) : j11;
                    if (pVar.n0 != b11) {
                        pVar.n0 = b11;
                        o[] oVarArr = pVar.M;
                        int length2 = oVarArr.length;
                        for (int i19 = i7; i19 < length2; i19++) {
                            o oVar3 = oVarArr[i19];
                            if (oVar3.H != b11) {
                                oVar3.H = b11;
                                oVar3.B = true;
                            }
                        }
                    }
                } else {
                    p pVar2 = this.U;
                    if (pVar2.n0 != 0) {
                        pVar2.n0 = 0L;
                        o[] oVarArr2 = pVar2.M;
                        int length3 = oVarArr2.length;
                        for (int i20 = i7; i20 < length3; i20++) {
                            o oVar4 = oVarArr2[i20];
                            if (oVar4.H != 0) {
                                oVar4.H = 0L;
                                oVar4.B = true;
                            }
                        }
                    }
                }
                this.U.O.clear();
                this.T.a.c(this.U);
            } else {
                i7 = 0;
            }
            p pVar3 = this.U;
            e2.r rVar = pVar3.o0;
            e2.r rVar2 = this.O;
            if (!Objects.equals(rVar, rVar2)) {
                pVar3.o0 = rVar2;
                int i21 = i7;
                while (true) {
                    o[] oVarArr3 = pVar3.M;
                    if (i21 >= oVarArr3.length) {
                        break;
                    }
                    if (pVar3.f0[i21]) {
                        o oVar5 = oVarArr3[i21];
                        oVar5.K = rVar2;
                        oVar5.B = true;
                    }
                    i21++;
                }
            }
            return lVar;
        } catch (InterruptedException unused3) {
            throw new InterruptedIOException();
        } catch (TimeoutException e10) {
            throw new IOException(e10);
        }
    }
}
