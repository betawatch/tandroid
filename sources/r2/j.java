package r2;

import a8.ga;
import a8.ia;
import a8.ja;
import a8.v9;
import android.net.Uri;
import android.text.TextUtils;
import c8.p0;
import e2.q0;
import e2.s0;
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
import m4.e0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class j extends y2.l {
    public static final AtomicInteger c0 = new AtomicInteger();
    public final boolean D;
    public final int E;
    public final j2.h F;
    public final j2.m G;
    public final b H;
    public final boolean I;
    public final boolean J;
    public final k0 K;
    public final c L;
    public final List M;
    public final e2.r N;
    public final t3.h O;
    public final x P;
    public final boolean Q;
    public final boolean R;
    public b S;
    public q T;
    public int U;
    public boolean V;
    public volatile boolean W;
    public boolean X;
    public i0 Y;
    public boolean Z;
    public long a0;
    public boolean b0;
    public final int w;
    public final int x;
    public final Uri y;

    public j(c cVar, j2.h hVar, j2.m mVar, u uVar, boolean z9, j2.h hVar2, j2.m mVar2, boolean z10, Uri uri, List list, int i7, Object obj, long j3, long j10, long j11, int i10, boolean z11, int i11, boolean z12, boolean z13, k0 k0Var, e2.r rVar, b bVar, t3.h hVar3, x xVar, boolean z14, boolean z15, m2.j jVar) {
        super(hVar, mVar, uVar, i7, obj, j3, j10, j11);
        this.Q = z9;
        this.E = i10;
        this.a0 = z11 ? j10 - j3 : -9223372036854775807L;
        this.x = i11;
        this.G = mVar2;
        this.F = hVar2;
        this.V = mVar2 != null;
        this.R = z10;
        this.y = uri;
        this.I = z13;
        this.K = k0Var;
        this.J = z12;
        this.L = cVar;
        this.M = list;
        this.N = rVar;
        this.H = bVar;
        this.O = hVar3;
        this.P = xVar;
        this.b0 = z14;
        this.D = z15;
        g0 g0Var = i0.b;
        this.Y = t1.e;
        this.w = c0.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (ga.c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // b3.l
    public final void a() {
        b bVar;
        this.T.getClass();
        if (this.S == null && (bVar = this.H) != null) {
            f3.o a10 = bVar.a.a();
            if ((a10 instanceof e0) || (a10 instanceof z3.h)) {
                this.S = this.H;
                this.V = false;
            }
        }
        j2.m mVar = this.G;
        j2.h hVar = this.F;
        if (this.V) {
            hVar.getClass();
            mVar.getClass();
            d(hVar, mVar, this.R);
            this.U = 0;
            this.V = false;
        }
        if (this.W) {
            return;
        }
        if (!this.J) {
            d(this.r, this.b, this.Q);
        }
        this.X = !this.W;
    }

    @Override // y2.l
    public final boolean c() {
        throw null;
    }

    public final void d(j2.h hVar, j2.m mVar, boolean z9) {
        j2.m b10;
        boolean z10;
        long j3;
        if (z9) {
            z10 = this.U != 0;
            b10 = mVar;
        } else {
            b10 = mVar.b(this.U);
            z10 = false;
        }
        try {
            f3.l h = h(hVar, b10);
            if (z10) {
                h.j(this.U, false);
            }
            do {
                try {
                    try {
                        if (this.W) {
                            break;
                        }
                    } catch (EOFException e10) {
                        if ((this.d.f & TLObject.FLAG_14) == 0) {
                            throw e10;
                        }
                        this.S.a.d(0L, 0L);
                        j3 = h.d;
                    }
                } catch (Throwable th2) {
                    this.U = (int) (h.d - mVar.e);
                    throw th2;
                }
            } while (this.S.a.f(h, b.f) == 0);
            j3 = h.d;
            this.U = (int) (j3 - mVar.e);
        } catch (Exception unused) {
        } catch (Throwable th3) {
            p0.a(hVar);
            throw th3;
        }
        p0.a(hVar);
    }

    public final int f(int i7) {
        ia.p(!this.b0);
        if (i7 >= this.Y.size()) {
            return 0;
        }
        return ((Integer) this.Y.get(i7)).intValue();
    }

    public final boolean g() {
        return this.a0 != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0098, code lost:
    
        if (((t3.m) r13).b.equals("com.apple.streaming.transportStreamTimestamp") != false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v18, types: [w7.s] */
    /* JADX WARN: Type inference failed for: r2v22, types: [w7.s] */
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
        boolean z9;
        nb.a aVar2;
        int i11;
        List singletonList;
        int i12;
        f3.o dVar;
        e2.p0 p0Var;
        long j12 = this.h;
        k0 k0Var2 = this.K;
        long open = hVar.open(mVar);
        try {
            k0Var2.h(j12, this.I);
            f3.l lVar = new f3.l(hVar, mVar.e, open);
            if (this.S == null) {
                x xVar = this.P;
                lVar.f = 0;
                try {
                    xVar.K(10);
                    lVar.k(xVar.a, 0, 10, false);
                } catch (EOFException unused) {
                    j3 = -9223372036854775807L;
                }
                if (xVar.D() != 4801587) {
                    j10 = -9223372036854775807L;
                    j3 = -9223372036854775807L;
                } else {
                    xVar.O(3);
                    int z10 = xVar.z();
                    int i13 = z10 + 10;
                    byte[] bArr = xVar.a;
                    j3 = -9223372036854775807L;
                    if (i13 > bArr.length) {
                        xVar.K(i13);
                        System.arraycopy(bArr, 0, xVar.a, 0, 10);
                    }
                    lVar.k(xVar.a, 10, z10, false);
                    q0 c10 = this.O.c(z10, xVar.a);
                    if (c10 != null) {
                        e2.p0[] p0VarArr = c10.a;
                        int length = p0VarArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                p0Var = null;
                                break;
                            }
                            e2.p0 p0Var2 = p0VarArr[i14];
                            if (t3.m.class.isAssignableFrom(p0Var2.getClass())) {
                                p0Var = (e2.p0) t3.m.class.cast(p0Var2);
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
                b bVar3 = this.H;
                if (bVar3 != null) {
                    f3.o oVar = bVar3.a;
                    f3.o a10 = oVar.a();
                    ia.p(!((a10 instanceof e0) || (a10 instanceof z3.h)));
                    ?? r11 = oVar.a() == oVar;
                    Class<?> cls = oVar.getClass();
                    if (r11 != true) {
                        throw new IllegalStateException(ja.a("Can't recreate wrapped extractors. Outer type: %s", cls));
                    }
                    if (oVar instanceof t) {
                        dVar = new t(bVar3.b.d, bVar3.c, bVar3.d, bVar3.e);
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
                    bVar2 = new b(dVar, bVar3.b, bVar3.c, bVar3.d, bVar3.e);
                    j11 = j12;
                    i7 = 0;
                } else {
                    Uri uri = mVar.a;
                    Map responseHeaders = hVar.getResponseHeaders();
                    c cVar = this.L;
                    cVar.getClass();
                    u uVar = this.d;
                    int a11 = v9.a(uVar.s);
                    List list = (List) responseHeaders.get("Content-Type");
                    int a12 = v9.a((list == null || list.isEmpty()) ? null : (String) list.get(0));
                    int b10 = v9.b(uri);
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
                        k0 k0Var3 = this.K;
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
                            List list2 = this.M;
                            nb.a aVar3 = c4.k.i;
                            if (intValue == 8) {
                                i10 = i17;
                                k0Var = k0Var3;
                                arrayList = arrayList2;
                                ?? r22 = cVar.a;
                                boolean z11 = cVar.b;
                                int i18 = cVar.c;
                                if (z11) {
                                    aVar2 = r22;
                                    i11 = 4;
                                } else {
                                    i11 = 36;
                                    aVar2 = aVar3;
                                }
                                aVar = new z3.h(aVar2, i11 | z3.h.g(i18), k0Var, list2 != null ? list2 : t1.e, null);
                            } else if (intValue == 11) {
                                i10 = i17;
                                arrayList = arrayList2;
                                ?? r23 = cVar.a;
                                boolean z12 = cVar.b;
                                if (list2 != null) {
                                    i12 = 48;
                                    singletonList = list2;
                                } else {
                                    e2.t tVar = new e2.t();
                                    tVar.r = s0.n("application/cea-608");
                                    singletonList = Collections.singletonList(new u(tVar));
                                    i12 = 16;
                                }
                                String str = uVar.k;
                                if (!TextUtils.isEmpty(str)) {
                                    if (s0.b(str, "audio/mp4a-latm") == null) {
                                        i12 |= 2;
                                    }
                                    if (s0.b(str, "video/avc") == null) {
                                        i12 |= 4;
                                    }
                                }
                                aVar = new e0(2, !z12 ? 1 : 0, !z12 ? aVar3 : r23, k0Var3, new m4.f(i12, singletonList));
                                k0Var = k0Var3;
                            } else if (intValue != 13) {
                                i10 = i17;
                                k0Var = k0Var3;
                                arrayList = arrayList2;
                                aVar = null;
                            } else {
                                i10 = i17;
                                arrayList = arrayList2;
                                aVar = new t(uVar.d, k0Var3, cVar.a, cVar.b);
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
                            z9 = aVar.b(lVar);
                            i7 = 0;
                            lVar.f = 0;
                        } catch (EOFException unused2) {
                            i7 = 0;
                            lVar.f = 0;
                            z9 = false;
                        } catch (Throwable th2) {
                            lVar.f = 0;
                            throw th2;
                        }
                        if (z9) {
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
                this.S = bVar2;
                f3.o a13 = bVar2.a.a();
                if ((((a13 instanceof m4.d) || (a13 instanceof m4.a) || (a13 instanceof m4.c) || (a13 instanceof y3.d)) ? 1 : i7) != 0) {
                    q qVar = this.T;
                    long b11 = j10 != j3 ? k0Var2.b(j10) : j11;
                    if (qVar.m0 != b11) {
                        qVar.m0 = b11;
                        p[] pVarArr = qVar.L;
                        int length2 = pVarArr.length;
                        for (int i19 = i7; i19 < length2; i19++) {
                            p pVar = pVarArr[i19];
                            if (pVar.H != b11) {
                                pVar.H = b11;
                                pVar.B = true;
                            }
                        }
                    }
                } else {
                    q qVar2 = this.T;
                    if (qVar2.m0 != 0) {
                        qVar2.m0 = 0L;
                        p[] pVarArr2 = qVar2.L;
                        int length3 = pVarArr2.length;
                        for (int i20 = i7; i20 < length3; i20++) {
                            p pVar2 = pVarArr2[i20];
                            if (pVar2.H != 0) {
                                pVar2.H = 0L;
                                pVar2.B = true;
                            }
                        }
                    }
                }
                this.T.N.clear();
                this.S.a.c(this.T);
            } else {
                i7 = 0;
            }
            q qVar3 = this.T;
            e2.r rVar = qVar3.n0;
            e2.r rVar2 = this.N;
            if (!Objects.equals(rVar, rVar2)) {
                qVar3.n0 = rVar2;
                int i21 = i7;
                while (true) {
                    p[] pVarArr3 = qVar3.L;
                    if (i21 >= pVarArr3.length) {
                        break;
                    }
                    if (qVar3.e0[i21]) {
                        p pVar3 = pVarArr3[i21];
                        pVar3.K = rVar2;
                        pVar3.B = true;
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

    @Override // b3.l
    public final void q0() {
        this.W = true;
    }
}
