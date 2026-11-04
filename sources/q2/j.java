package q2;

import android.net.Uri;
import android.text.TextUtils;
import b8.ac;
import b8.eb;
import b8.uc;
import b8.xb;
import b8.zb;
import d2.r0;
import d2.s0;
import d2.u;
import d2.u0;
import d2.v;
import g2.l0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
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
import l4.d0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j extends x2.l {
    public static final AtomicInteger d0 = new AtomicInteger();
    public final boolean E;
    public final int F;
    public final i2.h G;
    public final i2.n H;
    public final b I;
    public final boolean J;
    public final boolean K;
    public final l0 L;
    public final c M;
    public final List N;
    public final d2.s O;
    public final s3.h P;
    public final y Q;
    public final boolean R;
    public final boolean S;
    public b T;
    public q U;
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

    public j(c cVar, i2.h hVar, i2.n nVar, v vVar, boolean z10, i2.h hVar2, i2.n nVar2, boolean z11, Uri uri, List list, int i3, Object obj, long j10, long j11, long j12, int i10, boolean z12, int i11, boolean z13, boolean z14, l0 l0Var, d2.s sVar, b bVar, s3.h hVar3, y yVar, boolean z15, boolean z16, l2.k kVar) {
        super(hVar, nVar, vVar, i3, obj, j10, j11, j12);
        this.R = z10;
        this.F = i10;
        this.b0 = z12 ? j11 - j10 : -9223372036854775807L;
        this.x = i11;
        this.H = nVar2;
        this.G = hVar2;
        this.W = nVar2 != null;
        this.S = z11;
        this.y = uri;
        this.J = z14;
        this.L = l0Var;
        this.K = z13;
        this.M = cVar;
        this.N = list;
        this.O = sVar;
        this.I = bVar;
        this.P = hVar3;
        this.Q = yVar;
        this.c0 = z15;
        this.E = z16;
        g0 g0Var = i0.b;
        this.Z = s1.e;
        this.w = d0.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (xb.c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // a3.m
    public final void X1() {
        this.X = true;
    }

    @Override // a3.m
    public final void a() {
        b bVar;
        this.U.getClass();
        if (this.T == null && (bVar = this.I) != null) {
            e3.o a10 = bVar.a.a();
            if ((a10 instanceof d0) || (a10 instanceof y3.i)) {
                this.T = this.I;
                this.W = false;
            }
        }
        i2.n nVar = this.H;
        i2.h hVar = this.G;
        if (this.W) {
            hVar.getClass();
            nVar.getClass();
            d(hVar, nVar, this.S);
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

    @Override // x2.l
    public final boolean c() {
        throw null;
    }

    public final void d(i2.h hVar, i2.n nVar, boolean z10) {
        i2.n b10;
        boolean z11;
        long j10;
        if (z10) {
            z11 = this.V != 0;
            b10 = nVar;
        } else {
            b10 = nVar.b(this.V);
            z11 = false;
        }
        try {
            e3.l h = h(hVar, b10);
            if (z11) {
                h.g(this.V, false);
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
                        j10 = h.d;
                    }
                } catch (Throwable th2) {
                    this.V = (int) (h.d - nVar.e);
                    throw th2;
                }
            } while (this.T.a.f(h, b.f) == 0);
            j10 = h.d;
            this.V = (int) (j10 - nVar.e);
        } catch (Exception unused) {
        } catch (Throwable th3) {
            uc.a(hVar);
            throw th3;
        }
        uc.a(hVar);
    }

    public final int f(int i3) {
        zb.p(!this.c0);
        if (i3 >= this.Z.size()) {
            return 0;
        }
        return ((Integer) this.Z.get(i3)).intValue();
    }

    public final boolean g() {
        return this.b0 != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0098, code lost:
    
        if (((s3.m) r13).b.equals("com.apple.streaming.transportStreamTimestamp") != false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v18, types: [mb.b] */
    /* JADX WARN: Type inference failed for: r2v22, types: [mb.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e3.l h(i2.h hVar, i2.n nVar) {
        int i3;
        long j10;
        long j11;
        long j12;
        b bVar;
        b bVar2;
        int i10;
        l0 l0Var;
        ArrayList arrayList;
        e3.o aVar;
        boolean z10;
        nb.a aVar2;
        int i11;
        List singletonList;
        int i12;
        e3.o dVar;
        r0 r0Var;
        long j13 = this.h;
        l0 l0Var2 = this.L;
        long open = hVar.open(nVar);
        try {
            l0Var2.h(j13, this.J);
            e3.l lVar = new e3.l(hVar, nVar.e, open);
            if (this.T == null) {
                y yVar = this.Q;
                lVar.f = 0;
                try {
                    yVar.K(10);
                    lVar.h(yVar.a, 0, 10, false);
                } catch (EOFException unused) {
                    j10 = -9223372036854775807L;
                }
                if (yVar.D() != 4801587) {
                    j11 = -9223372036854775807L;
                    j10 = -9223372036854775807L;
                } else {
                    yVar.O(3);
                    int z11 = yVar.z();
                    int i13 = z11 + 10;
                    byte[] bArr = yVar.a;
                    j10 = -9223372036854775807L;
                    if (i13 > bArr.length) {
                        yVar.K(i13);
                        System.arraycopy(bArr, 0, yVar.a, 0, 10);
                    }
                    lVar.h(yVar.a, 10, z11, false);
                    s0 c2 = this.P.c(z11, yVar.a);
                    if (c2 != null) {
                        r0[] r0VarArr = c2.a;
                        int length = r0VarArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                r0Var = null;
                                break;
                            }
                            r0 r0Var2 = r0VarArr[i14];
                            if (s3.m.class.isAssignableFrom(r0Var2.getClass())) {
                                r0Var = (r0) s3.m.class.cast(r0Var2);
                            }
                            r0Var = null;
                            if (r0Var != null) {
                                break;
                            }
                            i14++;
                        }
                        s3.m mVar = (s3.m) r0Var;
                        if (mVar != null) {
                            System.arraycopy(mVar.c, 0, yVar.a, 0, 8);
                            yVar.N(0);
                            yVar.M(8);
                            j11 = yVar.u() & 8589934591L;
                        }
                    }
                    j11 = j10;
                }
                lVar.f = 0;
                b bVar3 = this.I;
                if (bVar3 != null) {
                    e3.o oVar = bVar3.a;
                    e3.o a10 = oVar.a();
                    zb.p(!((a10 instanceof d0) || (a10 instanceof y3.i)));
                    ?? r11 = oVar.a() == oVar;
                    Class<?> cls = oVar.getClass();
                    if (r11 != true) {
                        throw new IllegalStateException(ac.a("Can't recreate wrapped extractors. Outer type: %s", cls));
                    }
                    if (oVar instanceof t) {
                        dVar = new t(bVar3.b.d, bVar3.c, bVar3.d, bVar3.e);
                    } else if (oVar instanceof l4.d) {
                        dVar = new l4.d(0);
                    } else if (oVar instanceof l4.a) {
                        dVar = new l4.a();
                    } else if (oVar instanceof l4.c) {
                        dVar = new l4.c();
                    } else {
                        if (!(oVar instanceof x3.d)) {
                            throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(oVar.getClass().getSimpleName()));
                        }
                        dVar = new x3.d(0);
                    }
                    bVar2 = new b(dVar, bVar3.b, bVar3.c, bVar3.d, bVar3.e);
                    j12 = j13;
                    i3 = 0;
                } else {
                    Uri uri = nVar.a;
                    Map responseHeaders = hVar.getResponseHeaders();
                    c cVar = this.M;
                    cVar.getClass();
                    v vVar = this.d;
                    int a11 = eb.a(vVar.s);
                    List list = (List) responseHeaders.get("Content-Type");
                    int a12 = eb.a((list == null || list.isEmpty()) ? null : (String) list.get(0));
                    int b10 = eb.b(uri);
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
                    e3.o oVar2 = null;
                    while (true) {
                        int size = arrayList2.size();
                        l0 l0Var3 = this.L;
                        if (i17 >= size) {
                            j12 = j13;
                            i3 = 0;
                            oVar2.getClass();
                            bVar = new b(oVar2, vVar, l0Var3, cVar.a, cVar.b);
                            break;
                        }
                        int intValue = ((Integer) arrayList2.get(i17)).intValue();
                        j12 = j13;
                        if (intValue == 0) {
                            i10 = i17;
                            l0Var = l0Var3;
                            arrayList = arrayList2;
                            aVar = new l4.a();
                        } else if (intValue == 1) {
                            i10 = i17;
                            l0Var = l0Var3;
                            arrayList = arrayList2;
                            aVar = new l4.c();
                        } else if (intValue == 2) {
                            i10 = i17;
                            l0Var = l0Var3;
                            arrayList = arrayList2;
                            aVar = new l4.d(0);
                        } else if (intValue != 7) {
                            List list2 = this.N;
                            nb.a aVar3 = b4.k.g;
                            if (intValue == 8) {
                                i10 = i17;
                                l0Var = l0Var3;
                                arrayList = arrayList2;
                                ?? r22 = cVar.a;
                                boolean z12 = cVar.b;
                                int i18 = cVar.c;
                                if (z12) {
                                    aVar2 = r22;
                                    i11 = 4;
                                } else {
                                    i11 = 36;
                                    aVar2 = aVar3;
                                }
                                aVar = new y3.i(aVar2, i11 | y3.i.g(i18), l0Var, list2 != null ? list2 : s1.e, null);
                            } else if (intValue == 11) {
                                i10 = i17;
                                arrayList = arrayList2;
                                ?? r23 = cVar.a;
                                boolean z13 = cVar.b;
                                if (list2 != null) {
                                    i12 = 48;
                                    singletonList = list2;
                                } else {
                                    u uVar = new u();
                                    uVar.r = u0.n("application/cea-608");
                                    singletonList = Collections.singletonList(new v(uVar));
                                    i12 = 16;
                                }
                                String str = vVar.k;
                                if (!TextUtils.isEmpty(str)) {
                                    if (u0.b(str, "audio/mp4a-latm") == null) {
                                        i12 |= 2;
                                    }
                                    if (u0.b(str, "video/avc") == null) {
                                        i12 |= 4;
                                    }
                                }
                                aVar = new d0(2, !z13 ? 1 : 0, !z13 ? aVar3 : r23, l0Var3, new l4.f(i12, singletonList));
                                l0Var = l0Var3;
                            } else if (intValue != 13) {
                                i10 = i17;
                                l0Var = l0Var3;
                                arrayList = arrayList2;
                                aVar = null;
                            } else {
                                i10 = i17;
                                arrayList = arrayList2;
                                aVar = new t(vVar.d, l0Var3, cVar.a, cVar.b);
                                l0Var = l0Var3;
                            }
                        } else {
                            i10 = i17;
                            l0Var = l0Var3;
                            arrayList = arrayList2;
                            aVar = new x3.d(0, 0L);
                        }
                        aVar.getClass();
                        try {
                            z10 = aVar.b(lVar);
                            i3 = 0;
                            lVar.f = 0;
                        } catch (EOFException unused2) {
                            i3 = 0;
                            lVar.f = 0;
                            z10 = false;
                        } catch (Throwable th2) {
                            lVar.f = 0;
                            throw th2;
                        }
                        if (z10) {
                            bVar = new b(aVar, vVar, l0Var, cVar.a, cVar.b);
                            break;
                        }
                        v vVar2 = vVar;
                        if (oVar2 == null && (intValue == a11 || intValue == a12 || intValue == b10 || intValue == 11)) {
                            oVar2 = aVar;
                        }
                        vVar = vVar2;
                        arrayList2 = arrayList;
                        i17 = i10 + 1;
                        j13 = j12;
                    }
                    bVar2 = bVar;
                }
                this.T = bVar2;
                e3.o a13 = bVar2.a.a();
                if ((((a13 instanceof l4.d) || (a13 instanceof l4.a) || (a13 instanceof l4.c) || (a13 instanceof x3.d)) ? 1 : i3) != 0) {
                    q qVar = this.U;
                    long b11 = j11 != j10 ? l0Var2.b(j11) : j12;
                    if (qVar.n0 != b11) {
                        qVar.n0 = b11;
                        p[] pVarArr = qVar.M;
                        int length2 = pVarArr.length;
                        for (int i19 = i3; i19 < length2; i19++) {
                            p pVar = pVarArr[i19];
                            if (pVar.H != b11) {
                                pVar.H = b11;
                                pVar.B = true;
                            }
                        }
                    }
                } else {
                    q qVar2 = this.U;
                    if (qVar2.n0 != 0) {
                        qVar2.n0 = 0L;
                        p[] pVarArr2 = qVar2.M;
                        int length3 = pVarArr2.length;
                        for (int i20 = i3; i20 < length3; i20++) {
                            p pVar2 = pVarArr2[i20];
                            if (pVar2.H != 0) {
                                pVar2.H = 0L;
                                pVar2.B = true;
                            }
                        }
                    }
                }
                this.U.O.clear();
                this.T.a.c(this.U);
            } else {
                i3 = 0;
            }
            q qVar3 = this.U;
            d2.s sVar = qVar3.o0;
            d2.s sVar2 = this.O;
            if (!Objects.equals(sVar, sVar2)) {
                qVar3.o0 = sVar2;
                int i21 = i3;
                while (true) {
                    p[] pVarArr3 = qVar3.M;
                    if (i21 >= pVarArr3.length) {
                        break;
                    }
                    if (qVar3.f0[i21]) {
                        p pVar3 = pVarArr3[i21];
                        pVar3.K = sVar2;
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
}
